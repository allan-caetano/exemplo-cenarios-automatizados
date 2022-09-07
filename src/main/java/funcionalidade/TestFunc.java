package funcionalidade;

import core.DriverFactory;
import core.Propiedades;
import core.utils.ActionsUtils;
import core.utils.DateUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.TestPage;
import java.io.File;
import static core.DriverFactory.getDriver;

public class TestFunc extends Propiedades {
    WebDriverWait wait = new WebDriverWait(getDriver(), 20);
    TestPage testPage = new TestPage(getDriver());

    public void acessarWeb() throws Throwable {
        initialCreate();
        addEvidencie();
    }

    public void tempo(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void preencherDadosObrigatorios() throws Exception {
        preencherFormularioAba("Enter Vehicle Data");
        clicarBotao("Next");
        preencherFormularioAba("Enter Insurant Data");
        clicarBotao("Next");
        preencherFormularioAba("Enter Product Data");
        clicarBotao("Next");
        preencherFormularioAba("Send Quote");
    }

    public void preencherFormularioAba(String aba) throws Exception {
        if (aba.equals("Enter Vehicle Data")) {
            tempo(2);
            Select selectMake = new Select(testPage.getCampoMake());
            selectMake.selectByVisibleText("BMW");
            Select selectModel = new Select(testPage.getModelo());
            selectModel.selectByVisibleText("Motorcycle");

            testPage.getCilindro().sendKeys("1000");
            wait.until(ExpectedConditions.visibilityOf(testPage.getPerformance()));
            testPage.getPerformance().sendKeys("200");
            testPage.getDataFabricacao().sendKeys(DateUtils.dataAtualMMDDYYY());
            testPage.getNumeroAssentos().sendKeys("2");

            ActionsUtils.clickJavaScript(testPage.getMaoDireitaSim(), getDriver());
            Select selectAssento = new Select(testPage.getSelectNumeroAssentos());
            selectAssento.selectByIndex(2);
            Select selectCombustivel = new Select(testPage.getCombustivel());
            selectCombustivel.selectByIndex(3);

            testPage.getCargaUtil().sendKeys("500");
            testPage.getPesoTotal().sendKeys("2000");
            testPage.getPrecoTabela().sendKeys("50000");
            testPage.getNumeroPlaca().sendKeys("007XPTO");
            testPage.getQuilometrageAnual().sendKeys("1500");
            addEvidencie();
        } else if (aba.equals("Enter Insurant Data")) {
            wait.until(ExpectedConditions.visibilityOf(testPage.getNome()));
            testPage.getNome().sendKeys("James");
            testPage.getSobreNome().sendKeys("Bond");
            testPage.getDataNascimento().sendKeys("10/10/2000");

            ActionsUtils.clickJavaScript(testPage.getGenero(), getDriver());
            testPage.getEndereco().sendKeys("Rua Perdida");

            Select selectPais = new Select(testPage.getPais());
            selectPais.selectByVisibleText("Portugal");
            testPage.getCep().sendKeys("99555544");
            testPage.getCidade().sendKeys("SmalCity");

            Select selectOcuapacao = new Select(testPage.getOcupacao());
            selectOcuapacao.selectByValue("Public Official");

            ActionsUtils.clickJavaScript(testPage.getHobies().get(2), getDriver());

            testPage.getSite().sendKeys("www.xpto.com");

            String _caminho;
            _caminho = "banner.jpg";
            File path = new File(_caminho);
            testPage.getAbrirArquivo().sendKeys(path.getAbsolutePath());
            addEvidencie();
        } else if (aba.equals("Enter Product Data")) {
            testPage.getDataInicial().sendKeys("10/10/2022");
            Select selectSeguro = new Select(testPage.getSomaSeguro());
            selectSeguro.selectByIndex(4);

            Select selectMerito = new Select(testPage.getMerito());
            selectMerito.selectByIndex(8);

            Select selectDanos = new Select(testPage.getSeguroDanos());
            selectDanos.selectByIndex(2);

            ActionsUtils.clicarComJS(testPage.getProducaoEuro());

            Select selectCortesia = new Select(testPage.getCortesia());
            selectCortesia.selectByIndex(2);

            WebElement element = getDriver().findElement(By.id("selectgold"));
            ActionsUtils.clicarComJS(element);
            addEvidencie();
            ActionsUtils.clickJavaScript(testPage.getBotaoNext(), DriverFactory.getDriver());
        }else if(aba.equalsIgnoreCase("Send Quote")){
            testPage.getEmail().sendKeys("test-auto@email.com");
            testPage.getUserName().sendKeys("Albert");
            testPage.getPassaword().sendKeys("Omega10@");
            testPage.getConfirmePassword().sendKeys("Omega10@");
        }
    }

    public void enviarFormularios(){
        clicarBotao("Send");
    }
    public void clicarBotao(String botao) {
        if (botao.compareTo("Next") == 0) {
            ActionsUtils.clickJavaScript(testPage.getBotaoNext(), DriverFactory.getDriver());
        }else if(botao.equals("Send")){
            ActionsUtils.clicarComJS(testPage.getEnviarEmail());
        }
    }
    public void validarMensagem(String mensagem) throws Exception {
        switch (mensagem){
            case "Sending e-mail success!":
                wait.until(ExpectedConditions.visibilityOf(testPage.getMenssagemSucesso()));
                String mensage = testPage.getMenssagemSucesso().getText();
                Assert.assertEquals(mensagem, mensage);
                addEvidencie();
                break;
            default:
                throw new IllegalArgumentException("Mensagem não encontrada");
        }
    }
}
