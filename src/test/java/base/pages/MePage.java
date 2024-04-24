package base.pages;
/* rizky.ashari created on 24/04/24 */

import base.common.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class MePage extends PageBase {
    public MePage(AppiumDriver myDriver) {
        super(myDriver);
    }
    public WebElement profileIcon() {
        return driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"profileView\"]/android.widget.ImageView"));
    }
    public WebElement loginButton() {
        return driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"buttonLogin\"]/android.view.ViewGroup"));
    }
}
