package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void loginValidEmailPassword() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickLoginbutton();
        loginPage.provideEmail("nkalinina73@gmail.com");
        loginPage.providePassword("RCparks25%");
        loginPage.recaptchaUpeared();
        Thread.sleep(3000);
        loginPage.clickSignInButton();
        Assert.assertTrue(loginPage.verifyIfLoggedIn().isDisplayed());


    }

}
