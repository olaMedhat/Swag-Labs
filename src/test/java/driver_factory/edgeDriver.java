package driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;
import java.util.Map;

public class edgeDriver {
    public static WebDriver getEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }

}
