import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginValidEmailPassword() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickLoginbutton();
        Thread.sleep(2000);
        loginPage.provideEmail("nkalinina73@gmail.com");
        loginPage.providePassword("RCparks25%");
        Thread.sleep(3000);
        loginPage.clickSignInButton();
        Assert.assertTrue(loginPage.verifyIfLoggedIn().isDisplayed());


/*      driver.findElement(By.id("login-btn-mobile")).click();
        driver.findElement(By.id("txtEmail")).sendKeys("nkalinina73@gmail.com");
        driver.findElement(By.id("txtPassword")).sendKeys("RCparks25%");
        //Thread.sleep(5000);
        driver.findElement(By.id("divOnlyLogin")).click();*/

    }

}
