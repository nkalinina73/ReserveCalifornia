package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SearchParkTest extends BaseTest {

    @Test
    public void searchForSunsetSB () throws InterruptedException {

        loginPage.clickLoginbutton();
        loginPage.provideEmail("arnatashakalinina@gmail.com");
        loginPage.providePassword("RCparks25%");
        //loginPage.recaptchaUpeared();
        Thread.sleep(3000);
        loginPage.clickSignInButton();
        Assert.assertTrue(loginPage.verifyIfLoggedIn().isDisplayed());

        homePage.provideParkName("sunset");
        homePage.selectTheSunsetSB();
        //homePage.selectingFromOptions();
    }

}
