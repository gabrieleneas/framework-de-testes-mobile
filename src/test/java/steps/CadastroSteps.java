package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroPage;
import pages.InicialPage;
import pages.LoginPage;

public class CadastroSteps {

    InicialPage inicialPage = new InicialPage();
    LoginPage loginPage = new LoginPage();
    CadastroPage cadastroPage = new CadastroPage();


    @Dado("que o usuário esta na pagina de login")
    public void queOUsuárioEstaNaPaginaDeLogin() {
        inicialPage.tap(inicialPage.getBtnSeuBarrigaHibrido());
    }

    @E("clica no botao Novo Usuario")
    public void clicaNoBotaoNovoUsuario() {
        loginPage.tap(loginPage.getAbaNovoUsuario());
    }

    @E("preenche o formulario")
    public void preencheOFormulario() {
        cadastroPage.sendKeys(cadastroPage.getCampoNome(), "gabrieu")
                .sendKeys(cadastroPage.getCampoEmail(), "gabrieu@email.com")
                .sendKeys(cadastroPage.getCampoSenha(), "1234");

    }

    @Quando("clica no botao Cadastrar")
    public void clicaNoBotaoCadastrar() {
        cadastroPage.tap(cadastroPage.getBotaoCadastrar());
    }

    @Entao("a mensagem de sucesso aparece")
    public void aMensagemDeSucessoAparece() {
        Assert.assertTrue(cadastroPage.getMensagemDeSucesso().isDisplayed());
    }
}
