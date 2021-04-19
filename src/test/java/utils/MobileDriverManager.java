package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileDriverManager {

    public static AppiumDriver<MobileElement> mobDriver;
    public static WebDriverWait wait;

    public static void createDriver() throws IOException {
        String os = System.getProperty("os.name").toLowerCase();
        DesiredCapabilities cap = new DesiredCapabilities();
        if (mobDriver == null) {
            if (os.contains("windows")) {
                File appAndroid = new File("apks/app-curso.apk");
                cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-23");
                cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                cap.setCapability(MobileCapabilityType.APP, appAndroid.getAbsolutePath());
                cap.setCapability("autoGrantPermissions", true);
                mobDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                wait = new WebDriverWait(mobDriver, 10);
            } else if (os.contains("mac")) {
                File appIOS = new File("apks/app-universal-debug.ipa");
                cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
                cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                cap.setCapability(MobileCapabilityType.VERSION, "11.2");
                cap.setCapability(MobileCapabilityType.APP, appIOS.getAbsolutePath());
                mobDriver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            }
        }

        mobDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public static void closeDriver() {
        mobDriver.close();

    }

    public static void relaunchApp() {
        mobDriver.launchApp();
    }


}
