package steps;

import io.appium.java_client.MobileElement;
import io.cucumber.java.pt.Dado;
import pages.BasePage;
import utils.MobileProperties;

public class BaseSteps {
    public MobileProperties mobProp;

    private BasePage basePage = new BasePage();

    public BaseSteps() {
        this.mobProp = new MobileProperties();
    }


}
