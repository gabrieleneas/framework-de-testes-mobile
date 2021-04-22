package pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AbasPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text = 'Este é o conteúdo da Aba 2']")
    private MobileElement conteudoAbaDois;

    public MobileElement getConteudoAbaDois() {
        return conteudoAbaDois;
    }
}
