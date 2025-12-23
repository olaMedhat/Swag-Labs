import driver_factory.driverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utilities.configLoader;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public  void SetUp(){
        driver= driverFactory.getWebDriver("firefox");
        driver.get("https://www.saucedemo.com/");
    }
    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }
}
