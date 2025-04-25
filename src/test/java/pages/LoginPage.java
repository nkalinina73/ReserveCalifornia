package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver givenDriver){
        super(givenDriver); //constructor
    }
    // locators
    By loginButton = By.id("login-btn-mobile");
    By emailField = By.id("txtEmail");
    By pswdField = By.id("txtPassword");
    By signInButton = By.id("divOnlyLogin");
    By natalia = By.xpath("//button[@id='account-select-listbox-button']//span[contains(text(),'NATALIA')]");

    public void clickLoginbutton(){findElement(loginButton).click();}
    public void provideEmail (String email){findElement(emailField).sendKeys(email);}
    public void providePassword (String password){findElement(pswdField).sendKeys(password);}
    public void clickSignInButton (){findElement(signInButton).click();}
    public WebElement verifyIfLoggedIn(){return findElement(natalia);}
}
