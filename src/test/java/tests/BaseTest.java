package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    public String baseUrl = "https://reservecalifornia.com/Web/";


    @Parameters({"browser"}) // supply with browsers info to the xml file
    @BeforeClass // setup before test
    public void setup(String browserName){
        // Setting up web drivers to different browsers
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
        driver.manage().deleteAllCookies();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void open(){
        driver.get(baseUrl);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);


    }
    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}

