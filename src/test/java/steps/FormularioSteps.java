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
        inicialPage.clicarElemento(inicialPage.getBotaoFormulario());
    }

    @E("preenche os campos")
    public void preencheOsCampos() {
        formularioPage.digitarElemento(formularioPage.getCampoNome(), "gabriel")
                .clicarElemento(formularioPage.getBotaoConsole())
                .clicarElemento(formularioPage.getSelectOpcao())
                .moverSeekBar(formularioPage.getSeekBar())
                .clicarElemento(formularioPage.getBotaoSwitch())
                .clicarElemento(formularioPage.getCheckBox())
                .clicarElemento(formularioPage.getBotaoSalvar());
    }

    @Quando("toca no botão salvar")
    public void tocaNoBotãoSalvar() {
        formularioPage.clicarElemento(formularioPage.getBotaoSalvar());
    }

    @Entao("as informacoes salvas aparecem")
    public void asInformacoesSalvasAparecem() {
        Assert.assertTrue(formularioPage.getDisplay() != null);
    }


}
