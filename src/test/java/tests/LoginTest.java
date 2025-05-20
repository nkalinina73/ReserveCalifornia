package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginValidEmailPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver); // created loginPage object and passed the WebDriver object 'driver' which was created in the BaseTest

        loginPage.clickLoginbutton();
        loginPage.provideEmail("nkalinina73@gmail.com");
        loginPage.providePassword("RCparks25%");
        //loginPage.recaptchaUpeared();
        Thread.sleep(3000);
        loginPage.clickSignInButton();
        Assert.assertTrue(loginPage.verifyIfLoggedIn().isDisplayed());


    }

}
