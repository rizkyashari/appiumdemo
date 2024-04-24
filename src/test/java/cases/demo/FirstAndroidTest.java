package cases.demo;
/* rizky.ashari created on 02/04/24 */

 import base.common.TestCaseBase;
 import base.pages.HomePage;
 import base.pages.LoginPage;
 import base.pages.MePage;
 import data.ConstantTestData;
 import org.testng.Assert;
 import org.testng.annotations.AfterTest;
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;

 public class FirstAndroidTest extends TestCaseBase {
     private HomePage homePage;
     private MePage mePage;
     private LoginPage loginPage;

     @BeforeTest
     public synchronized void setup() {
        homePage = pages.getHomePage();
        mePage = pages.getMePage();
        loginPage = pages.getLoginPage();
     }

     @Test(priority = 1)
     public void clickStartButton() throws InterruptedException {
         Thread.sleep(3000);
         // click "Start" button
         homePage.startButton().click();
         Thread.sleep(3000);
         Assert.assertTrue(homePage.meButton().isDisplayed());
     }

     @Test(priority = 2)
     public void clickMeButton() throws InterruptedException {
         // click "Me" button
         homePage.meButton().click();
         Thread.sleep(1500);
         Assert.assertTrue(mePage.profileIcon().isDisplayed());
     }

     @Test(priority = 3)
     public void clickLoginButton() throws InterruptedException {
         Thread.sleep(3000);
         // click "Login" button
         mePage.loginButton().click();
         Thread.sleep(3000);
         String actualLoginText = loginPage.loginText().getText();
         Assert.assertEquals(actualLoginText, ConstantTestData.LOGIN);
     }

     @AfterTest
     public void tearDown() {
         if (null != driver) {
             driver.quit();
         }
     }
 }
