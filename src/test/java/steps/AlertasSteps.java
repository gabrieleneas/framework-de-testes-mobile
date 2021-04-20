package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.AlertasPage;
import pages.InicialPage;

public class AlertasSteps {

    InicialPage inicialPage = new InicialPage();
    AlertasPage alertasPage = new AlertasPage();

    @Dado("que o usuário esta na pagina Alertas")
    public void queOUsuárioEstaNaPaginaAlertas() {
        inicialPage.tap(inicialPage.getBtnAlertas());
    }

    @Quando("toca em um alerta")
    public void tocaEmUmAlerta() {
        alertasPage.tap(alertasPage.getBotaoAlertaSimples());

    }

    @E("toca no botao confirmar")
    public void tocaNoBotaoConfirmar() {
        alertasPage.tap(alertasPage.getBotaoOk());
    }

    @Entao("o alerta some")
    public void oAlertaSome() {
        Assert.assertFalse(alertasPage.getBotaoAlertaConfirm().isDisplayed());
    }
}
