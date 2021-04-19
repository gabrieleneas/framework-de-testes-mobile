package pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.aspectj.apache.bcel.ExceptionConstants;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.MobileDriverManager;

public class BasePage  extends MobileDriverManager {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(mobDriver), this);
    }



    public BasePage clicarElemento(MobileElement element){
        element.click();
        return new BasePage();
    }

    public BasePage clicarSegurarElemento(MobileElement element){
        TouchAction action = new TouchAction((MobileDriver) mobDriver);
        action.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(element)))
                .perform();

        return new BasePage();
    }

    public BasePage digitarElemento(MobileElement element, String value){
        element.sendKeys(value);
        return new BasePage();
    }

    public BasePage moverSeekBar(MobileElement element){


        TouchAction action = new TouchAction((MobileDriver) mobDriver);
        action.longPress(ElementOption.element(element))
                .moveTo(ElementOption.element(element, 1000, 1000))
                .release()
                .perform();

        return new BasePage();
    }

    public BasePage closeKeyboard() {
        mobDriver.hideKeyboard();
        return new BasePage();
    }


}
