package base.pages;
/* rizky.ashari created on 24/04/24 */

import base.common.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class HomePage extends PageBase {

    public HomePage(AppiumDriver myDriver) {
        super(myDriver);
    }
    public WebElement startButton() {
        return driver.findElement(AppiumBy.accessibilityId("tutorial_0_button"));
    }
    public WebElement meButton() {
       return driver.findElement(AppiumBy.accessibilityId("tab_bar_button_me"));
    }
}
