package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InicialPage  extends BasePage{

    @AndroidFindBy(xpath = "//*[@text=\"Formulário\"]")
    private MobileElement botaoFormulario;

    @AndroidFindBy(xpath = "//*[@text=\"SALVAR DEMORADO\"]")
    private MobileElement botaoAlertas;

    public MobileElement getBotaoFormulario() {
        return botaoFormulario;
    }

    public MobileElement getBotaoAlertas() {
        return botaoAlertas;
    }
}
