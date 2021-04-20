package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.InicialPage;
import pages.SwipeListPage;

public class SwipeListSteps {

    InicialPage inicialPage = new InicialPage();
    SwipeListPage swipeListPage = new SwipeListPage();

    @Dado("que o usuário esta na pagina Swipe List")
    public void queOUsuárioEstaNaPaginaSwipeList() {
        inicialPage.tap(inicialPage.getBtnSwipeList());
    }

    @E("desliza um botao para esquerda")
    public void deslizaUmBotaoParaEsquerda() {
        swipeListPage.swipeElement("ESQUERDA", swipeListPage.getBtnOpcaoUm());
    }

    @Quando("clica no botao")
    public void clicaNoBotao() {
        swipeListPage.tap(swipeListPage.getBtnMinus());
    }

    @Entao("o texto do elemento muda")
    public void oTextoDoElementoMuda() {
        Assert.assertTrue(swipeListPage.getBtnOpcaoUmMinus().isDisplayed());
    }
}
