package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;


    @Parameters({"browser"}) // supply with browsers info to the xml file
    @BeforeTest // setup before test
    public void setup(String browserName){

        switch (browserName){

            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("please pass the right browser...");
        }
        driver.get("https://reservecalifornia.com/Web/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

