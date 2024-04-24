package shopee.qa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {
    private URL appiumServer() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723");
    }
    public DesiredCapabilities setCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:platformVersion", "14");
        caps.setCapability("appium:deviceName", "vivo V2201 API 34");
        caps.setCapability("appium:app", System.getProperty("user.dir") + "/apps/shopee-indonesia-internal-play-3.23.13@regression.apk");
        return caps;
    }
    public AppiumDriver androidSetup() {
        try {
            return new AndroidDriver(appiumServer(), setCapabilities());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}