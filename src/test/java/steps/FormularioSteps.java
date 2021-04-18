package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.FormularioPage;

public class FormularioSteps {

    FormularioPage formularioPage = new FormularioPage();

    @Dado("que o usuário esta na pagina {string}")
    public void queOUsuárioEstaNaPagina(String arg0) {
        formularioPage.clicarElemento(formularioPage.getElementoFormulario());
    }

    @E("preenche os campos")
    public void preencheOsCampos() {
        formularioPage.digitarElemento(formularioPage.getCampoNome(), "gabriel")
                .clicarElemento(formularioPage.getBotaoConsole())
                .clicarElemento(formularioPage.getSelectOpcao())
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
