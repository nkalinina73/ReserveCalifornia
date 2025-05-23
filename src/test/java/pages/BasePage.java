package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    Actions actions;

    public BasePage (WebDriver givenDriver){// this is a constructor
        driver = givenDriver; // need explanation
        actions = new Actions(driver);
    }
/*    public WebElement findElement(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void doubleClick(By locator){
        actions.doubleClick(findElement(locator)).perform();
    }*/
}
