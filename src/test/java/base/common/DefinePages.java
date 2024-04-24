package base.common;
/* rizky.ashari created on 24/04/24 */

import base.pages.HomePage;
import base.pages.LoginPage;
import base.pages.MePage;
import io.appium.java_client.AppiumDriver;
import lombok.Getter;

@Getter
public class DefinePages {

    private final HomePage homePage;
    private final MePage mePage;
    private final LoginPage loginPage;

    public DefinePages(AppiumDriver myDriver) {
        homePage = new HomePage(myDriver);
        mePage = new MePage(myDriver);
        loginPage = new LoginPage(myDriver);
    }
}
