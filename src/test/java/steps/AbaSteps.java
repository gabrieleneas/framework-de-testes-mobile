package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.AbasPage;
import pages.InicialPage;

public class AbaSteps {

    InicialPage inicialPage = new InicialPage();
    AbasPage abasPage = new AbasPage();

    @Dado("que o usuário esta na pagina Abas")
    public void queOUsuárioEstaNaPaginaAbas() {
        inicialPage.tap(inicialPage.getBtnAbas());

    }

    @Quando("desliza para esquerda")
    public void deslizaParaEsquerda() {
      abasPage.swipeScreen("ESQUERDA");
    }

    @Entao("a tela muda de aba")
    public void aTelaMudaDeAba() {
       Assert.assertTrue(abasPage.getConteudoAbaDois().isDisplayed());
    }
}
