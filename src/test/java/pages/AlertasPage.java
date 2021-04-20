package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class AlertasPage extends BasePage{


    public MobileElement getBotaoAlertaSimples() {
        return botaoAlertaSimples;
    }

    public MobileElement getBotaoAlertaRestritivo() {
        return botaoAlertaRestritivo;
    }

    public MobileElement getBotaoAlertaConfirm() {
        return botaoAlertaConfirm;
    }



    @AndroidFindBy(xpath = "//*[@text='ALERTA SIMPLES']")
    private MobileElement botaoAlertaSimples;

    @AndroidFindBy(xpath = "//*[@text='ALERTA RESTRITIVO']")
    private MobileElement botaoAlertaRestritivo;

    @AndroidFindBy(xpath = "//*[@text='ALERTA CONFIRM']")
    private MobileElement botaoAlertaConfirm;

    @AndroidFindBy(xpath = "//*[@text='OK'")
    private MobileElement botaoOk;

    public MobileElement getBotaoOk() {
        return botaoOk;
    }

    public boolean alertaEstaPresente() throws NoSuchElementException{
        try {
            return mobDriver.findElementByXPath("//*[@text=\"Info\"]").isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

}
