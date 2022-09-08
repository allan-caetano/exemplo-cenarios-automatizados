package step;

import funcionalidade.TestFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class MyStepdefs  {
    TestFunc testFunc = new TestFunc();

    @Dado("que tenho acesso ao sistema")
    public void queTenhoAcessoAoSistema() throws Throwable {
        testFunc.acessarWeb();
    }

    @E("preecncho os campos do formulario da aba {string}")
    public void preecnchoOsCamposDoFormularioDaAba(String aba) throws Exception {
        testFunc.preencherFormularioAba(aba);
    }

    @Quando("clico no botao {string}")
    public void clicoNoBotao(String botao) {
        testFunc.clicarBotao(botao);
    }

    @Entao("Visualizo a mensage de sucesso {string}")
    public void visualizoAMensageDeSucesso(String menssagem) throws Exception {
        testFunc.validarMensagem(menssagem);
    }

    @Quando("preencho os campos obrigatorios do formulario de cotacao")
    public void preenchoOsCamposObrigatoriosDoFormularioDeCotacao() throws Exception {
        testFunc.preencherDadosObrigatorios();
    }

    @E("envio o formulario")
    public void envioOFormulario() {
        testFunc.enviarFormularios();
    }

    @Quando("preencho os campos do {string} obrigatorios do formulario de cotacao")
    public void preenchoOsCamposDoObrigatoriosDoFormularioDeCotacao(String campos) throws Exception {
        testFunc.validarCampos(campos);
    }
}
