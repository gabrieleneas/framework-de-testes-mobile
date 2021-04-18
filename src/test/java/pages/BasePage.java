package pages;

import io.appium.java_client.MobileElement;
import utils.MobileDriverManager;

public class BasePage  extends MobileDriverManager {



    public BasePage clicarElemento(MobileElement element){
        element.click();
        return new BasePage();
    }

    public BasePage digitarElemento(MobileElement element, String value){
        element.sendKeys(value);
        return new BasePage();
    }

    public BasePage closeKeyboard() {
        mobDriver.hideKeyboard();
        return new BasePage();
    }


}
