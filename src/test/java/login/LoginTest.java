package login;

import base.ScriptBase;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;

    @Test
    public void verifyInvalidLogin() {
        loginPage = new LoginPage(driver);
        loginPage.inValidSigning("futuregroup123@gmail.com", "12345");

    }

    @Test
    public void verifyInvalidLogin2() {
        loginPage = new LoginPage(driver);
        loginPage.inValidSigning("futuregroup123@gmail.com", "12345");

//    @AfterTest
//    public void closeBrowser(){
//        driver.close();
//        driver.quit();
//    }
//
//
    }
}
