package base.common;
/* rizky.ashari created on 24/04/24 */

import io.appium.java_client.AppiumDriver;
import lombok.Getter;

@Getter
public abstract class PageBase {

    protected AppiumDriver driver;
    protected PageBase(AppiumDriver myDriver) {
        this.driver = myDriver;
    }
}
