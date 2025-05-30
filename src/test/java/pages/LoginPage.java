package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver givenDriver){
        super(givenDriver); //constructor
    }

    // locators
    By loginButton = By.id("login-btn-mobile");
    By emailField = By.id("txtEmail");
    By pswdField = By.id("txtPassword");
    By reCAPTCHA = By.id("divGoogleCaptch");
    By signInButton = By.id("responsive_buttons");
    By natalia = By.xpath("//button[@id='account-select-listbox-button']//span[contains(text(),'NATALIA')]");

    public void clickLoginbutton(){driver.findElement(loginButton).click();}
    public void provideEmail (String email){driver.findElement(emailField).sendKeys(email);}
    public void providePassword (String password){driver.findElement(pswdField).sendKeys(password);}
/*    public void recaptchaUpeared (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(reCAPTCHA)).isDisplayed();
    }*/
    public void clickSignInButton (){
        driver.findElement(signInButton).click();
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();*/
    }
    public WebElement verifyIfLoggedIn(){return driver.findElement(natalia);}
}
