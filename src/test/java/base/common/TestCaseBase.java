package base.common;
/* rizky.ashari created on 24/04/24 */

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeTest;
import shopee.qa.AppiumAndroidDriver;

public abstract class TestCaseBase {
    protected AppiumDriver driver;
    protected DefinePages pages;

    @BeforeTest
    public synchronized void setupBeforeSubClass() {
        driver = new AppiumAndroidDriver().androidSetup();
        pages = new DefinePages(driver);
    }

}
