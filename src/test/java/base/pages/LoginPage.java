package base.pages;
/* rizky.ashari created on 24/04/24 */

import base.common.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class LoginPage extends PageBase {
    public LoginPage(AppiumDriver myDriver) {
        super(myDriver);
    }
    public WebElement loginText() {
        return driver.findElement(AppiumBy.id("com.shopee.id.int:id/title_text"));
    }
}
