package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.MobileDriverManager;

import java.io.IOException;

import static utils.MobileDriverManager.mobDriver;

public class Hooks {

    @Before
    public static void driverStart() {
        try {
            MobileDriverManager.createDriver();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public static void driverRefresh(Scenario scenario) {
        screenshot(scenario);
        MobileDriverManager.relaunchApp();
    }


    public static void screenshot(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) mobDriver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", ""); //stick it in the report
        }
    }
}
