package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;

import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import utils.MobileDriverManager;
import java.time.Duration;


public class BasePage  extends MobileDriverManager {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(mobDriver), this);
    }

    public BasePage tap(MobileElement element){
        element.click();
        return new BasePage();
    }

    public BasePage longPress(MobileElement element){
        TouchAction action = new TouchAction((MobileDriver) mobDriver);
        action.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(element)))
                .perform();

        return new BasePage();
    }

    public BasePage sendKeys(MobileElement element, String value){
        element.sendKeys(value);
        return new BasePage();
    }

    public BasePage moveSeekBar(MobileElement element){

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

    public BasePage swipeElement(String dir, MobileElement element) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        Point elementCenter = element.getCenter();
        System.out.println(elementCenter);
        // init screen variables
        Dimension dims = mobDriver.manage().window().getSize();

        // init start point = center of element
        pointOptionStart = PointOption.point(elementCenter);

        switch (dir) {
            case "BAIXO": // center of footer
                pointOptionEnd = PointOption.point(elementCenter.x, dims.height - edgeBorder);
                break;
            case "CIMA": // center of header
                pointOptionEnd = PointOption.point(elementCenter.x, edgeBorder);
                break;
            case "ESQUERDA": // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, elementCenter.y);
                break;
            case "DIREITA": // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, elementCenter.y);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
            new TouchAction(mobDriver)
                    .press(pointOptionStart)
                    .release().perform();

            new TouchAction(mobDriver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }

        return new BasePage();
    }

    public BasePage swipeScreen(String dir) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = mobDriver.manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case "BAIXO": // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case "CIMA": // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case "ESQUERDA": // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case "DIREITA": // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {

            new TouchAction(mobDriver)
                    .press(pointOptionStart)
                    .release().perform();

            new TouchAction(mobDriver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());

        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }

        return new BasePage();
    }



}
