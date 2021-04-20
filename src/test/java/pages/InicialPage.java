package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InicialPage  extends BasePage{

    @AndroidFindBy(xpath = "//*[@text='Formulário']")
    private MobileElement btnFormulario;

    @AndroidFindBy(xpath = "//*[@text='Alertas']")
    private MobileElement btnAlertas;

    @AndroidFindBy(xpath = "//*[@text='SeuBarriga Híbrido']")
    private MobileElement btnSeuBarrigaHibrido;

    @AndroidFindBy(xpath = "//*[@text='Abas']")
    private MobileElement btnAbas;

    @AndroidFindBy(xpath = "//*[@text='Swipe List']")
    private MobileElement btnSwipeList;



    public MobileElement getBtnAbas() {
        return btnAbas;
    }
    public MobileElement getBtnSeuBarrigaHibrido() {
        return btnSeuBarrigaHibrido;
    }

    public MobileElement getBtnFormulario() {
        return btnFormulario;
    }

    public MobileElement getBtnAlertas() {
        return btnAlertas;
    }

    public MobileElement getBtnSwipeList() {
        return btnSwipeList;
    }
}
