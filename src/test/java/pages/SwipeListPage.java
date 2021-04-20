package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class SwipeListPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text = 'Opção 1']")
    private MobileElement btnOpcaoUm;

    @AndroidFindBy(xpath = "//*[@text = '(+)']")
    private MobileElement btnPlus;

    @AndroidFindBy(xpath = "//*[@text = '(-)']")
    private MobileElement btnMinus;

    @AndroidFindBy(xpath = "//*[@text = 'Opção 1 (-)']")
    private MobileElement btnOpcaoUmMinus;

    public MobileElement getBtnOpcaoUmMinus() {
        return btnOpcaoUmMinus;
    }


    public MobileElement getBtnMinus() {
        return btnMinus;
    }

    public MobileElement getBtnPlus() {
        return btnPlus;
    }

    public MobileElement getBtnOpcaoUm() {
        return btnOpcaoUm;
    }
}
