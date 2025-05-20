package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By searchTextField = By.id("home-search-box");
    By optionsList = By.xpath("//ul[@class='select-options-container']");
    By options = By.xpath("//li[@class='select-options']");

    public void provideParkName(String parkName){
        driver.findElement(searchTextField).sendKeys();
    }

    public void selectingFromOptions(){
        List<WebElement> listOfOptions = driver.findElements(options);
        WebElement q;
        for (int i=0; i < listOfOptions.size(); i++){
            q =listOfOptions.get(i);
            System.out.println(q.getText());
        }

    }





}
