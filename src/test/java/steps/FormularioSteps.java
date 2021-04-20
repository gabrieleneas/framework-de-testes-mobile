package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.FormularioPage;
import pages.InicialPage;

public class FormularioSteps {

    InicialPage inicialPage = new InicialPage();
    FormularioPage formularioPage = new FormularioPage();

    @Dado("que o usuário esta na pagina Formulario")
    public void queOUsuárioEstaNaPaginaFormulario() {
        inicialPage.tap(inicialPage.getBtnFormulario());
    }

    @E("preenche os campos")
    public void preencheOsCampos() {
        formularioPage.sendKeys(formularioPage.getCampoNome(), "gabriel")
                .tap(formularioPage.getBotaoConsole())
                .tap(formularioPage.getSelectOpcao())
                .moveSeekBar(formularioPage.getSeekBar())
                .tap(formularioPage.getBotaoSwitch())
                .tap(formularioPage.getCheckBox())
                .tap(formularioPage.getBotaoSalvar());
    }

    @Quando("toca no botão salvar")
    public void tocaNoBotãoSalvar() {
        formularioPage.tap(formularioPage.getBotaoSalvar());
    }

    @Entao("as informacoes salvas aparecem")
    public void asInformacoesSalvasAparecem() {
        Assert.assertTrue(formularioPage.getDisplay().isDisplayed());
    }


}
