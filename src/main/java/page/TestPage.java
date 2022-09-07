package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestPage {
    public TestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindAll({@FindBy(xpath = "//div[.='Pular anúncios']")})
    private List<WebElement> pularAnuncio;

    public List<WebElement> getPularAnuncio() {
        return pularAnuncio;
    }

    @FindBy(id = "make")
    private WebElement campoMake;

    public WebElement getCampoMake() {
        return campoMake;
    }

    @FindBy(id = "model")
    private WebElement modelo;

    public WebElement getModelo() {
        return modelo;
    }

    @FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-text']//input[@name='Cylinder Capacity']")
    private WebElement cilindro;

    public WebElement getCilindro() {
        return cilindro;
    }

    @FindBy(id = "engineperformance")
    private WebElement performance;

    public WebElement getPerformance() {
        return performance;
    }

    @FindBy(id = "dateofmanufacture")
    private WebElement dataFabricacao;

    public WebElement getDataFabricacao() {
        return dataFabricacao;
    }

    @FindBy(name = "Number of Seats")
    private WebElement numeroAssentos;

    public WebElement getNumeroAssentos() {
        return numeroAssentos;
    }

    @FindBy(id = "righthanddriveyes")
    private WebElement maoDireitaSim;

    public WebElement getMaoDireitaSim() {
        return maoDireitaSim;
    }

    @FindBy(id = "numberofseatsmotorcycle")
    private WebElement selectNumeroAssentos;

    public WebElement getSelectNumeroAssentos() {
        return selectNumeroAssentos;
    }

    @FindBy(id = "fuel")
    private WebElement combustivel;

    public WebElement getCombustivel() {
        return combustivel;
    }

    @FindBy(id = "payload")
    private WebElement cargaUtil;

    public WebElement getCargaUtil() {
        return cargaUtil;
    }

    @FindBy(xpath = "//input[@id='totalweight']")
    private WebElement pesoTotal;

    public WebElement getPesoTotal() {
        return pesoTotal;
    }

    @FindBy(name = "List Price")
    private WebElement PrecoTabela;

    public WebElement getPrecoTabela() {
        return PrecoTabela;
    }

    @FindBy(id = "licenseplatenumber")
    private WebElement numeroPlaca;

    public WebElement getNumeroPlaca() {
        return numeroPlaca;
    }

    @FindBy(id = "annualmileage")
    private WebElement quilometrageAnual;

    public WebElement getQuilometrageAnual() {
        return quilometrageAnual;
    }

    @FindBy(id = "nextenterinsurantdata")
    private WebElement botaoNext;

    public WebElement getBotaoNext() {
        return botaoNext;
    }

    @FindBy(id = "firstname")
    private WebElement nome;

    public WebElement getNome() {
        return nome;
    }

    @FindBy(id = "lastname")
    private WebElement sobreNome;

    public WebElement getSobreNome() {
        return sobreNome;
    }

    @FindBy(id = "birthdate")
    private WebElement dataNascimento;

    public WebElement getDataNascimento() {
        return dataNascimento;
    }

    @FindBy(id = "gendermale")
    private WebElement genero;

    public WebElement getGenero() {
        return genero;
    }

    @FindBy(id = "streetaddress")
    private WebElement endereco;
    public WebElement getEndereco() {
        return endereco;
    }
    @FindBy(id = "country")
    private WebElement pais;
    public WebElement getPais() {
        return pais;
    }

    @FindBy(id = "zipcode")
    private WebElement cep;

    public WebElement getCep() {
        return cep;
    }

    @FindBy(id = "city")
    private WebElement cidade;

    public WebElement getCidade() {
        return cidade;
    }

    @FindBy(id = "occupation")
    private WebElement ocupacao;

    public WebElement getOcupacao() {
        return ocupacao;
    }

    @FindAll({@FindBy(xpath = "//input[@name='Hobbies']")})
    private List<WebElement> hobies;

    public List<WebElement> getHobies() {
        return hobies;
    }

    @FindBy(id = "website")
    private WebElement site;

    public WebElement getSite() {
        return site;
    }

    @FindBy(name = "Picture")
    private WebElement arquivo;

    public WebElement getArquivo() {
        return arquivo;
    }

    @FindBy(id = "open")
    private WebElement abrirArquivo;

    public WebElement getAbrirArquivo() {
        return abrirArquivo;
    }

    @FindBy(id = "startdate")
    private WebElement dataInicial;

    public WebElement getDataInicial() {
        return dataInicial;
    }

    @FindBy(id = "insurancesum")
    private WebElement somaSeguro;

    public WebElement getSomaSeguro() {
        return somaSeguro;
    }

    @FindBy(id = "meritrating")
    private WebElement merito;

    public WebElement getMerito() {
        return merito;
    }

    @FindBy(id = "damageinsurance")
    private WebElement seguroDanos;

    public WebElement getSeguroDanos() {
        return seguroDanos;
    }

    @FindBy(id = "EuroProtection")
    private WebElement producaoEuro;

    public WebElement getProducaoEuro() {
        return producaoEuro;
    }

    @FindBy(id = "courtesycar")
    private WebElement cortesia;

    public WebElement getCortesia() {
        return cortesia;
    }

    @FindBy(id = "email")
    private WebElement email;

    public WebElement getEmail() {
        return email;
    }

    @FindBy(id = "username")
    private WebElement userName;

    public WebElement getUserName() {
        return userName;
    }

    @FindBy(id = "password")
    private WebElement passaword;

    public WebElement getPassaword() {
        return passaword;
    }

    @FindBy(id = "confirmpassword")
    private WebElement confirmePassword;

    public WebElement getConfirmePassword() {
        return confirmePassword;
    }

    @FindBy(id = "sendemail")
    private WebElement enviarEmail;

    public WebElement getEnviarEmail() {
        return enviarEmail;
    }

    @FindBy(xpath = "//h2[text()='Sending e-mail success!']")
    private WebElement menssagemSucesso;

    public WebElement getMenssagemSucesso() {
        return menssagemSucesso;
    }
}
