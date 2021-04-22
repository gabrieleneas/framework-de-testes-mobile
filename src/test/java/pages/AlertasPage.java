package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;

public class AlertasPage extends BasePage{


    @AndroidFindBy(xpath = "//*[@text='ALERTA SIMPLES']")
    private MobileElement btnAlertaSimples;

    @AndroidFindBy(xpath = "//*[@text='ALERTA RESTRITIVO']")
    private MobileElement btnAlertaRestritivo;

    @AndroidFindBy(xpath = "//*[@text='ALERTA CONFIRM']")
    private MobileElement btnAlertaConfirm;

    @AndroidFindBy(xpath = "//*[@text='OK']")
    private MobileElement btnOk;

    @AndroidFindBy(xpath = "//*[@text='CONFIRMAR']")
    private MobileElement btnConfirmar;

    @AndroidFindBy(xpath = "//*[@text='Confirma a operação?']")
    private MobileElement txtMensagem;
    //Confirmado

    @AndroidFindBy(xpath = "//*[@text='Confirmado']")
    private MobileElement txtConfirmado;

    @AndroidFindBy(xpath = "//*[@text='SAIR']")
    private MobileElement btnSair;

    public MobileElement getBtnAlertaSimples() {
        return btnAlertaSimples;
    }

    public MobileElement getBtnAlertaRestritivo() {
        return btnAlertaRestritivo;
    }

    public MobileElement getBtnAlertaConfirm() {
        return btnAlertaConfirm;
    }

    public MobileElement getBtnOk() {
        return btnOk;
    }

    public MobileElement getBtnConfirmar() {
        return btnConfirmar;
    }

    public MobileElement getTxtMensagem() {
        return txtMensagem;
    }

    public MobileElement getTxtConfirmado() {
        return txtConfirmado;
    }

    public MobileElement getBtnSair() {
        return btnSair;
    }
}
