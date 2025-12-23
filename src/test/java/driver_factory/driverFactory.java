package driver_factory;

import org.openqa.selenium.WebDriver;

public class driverFactory {
    private static WebDriver driver=null;

    public static WebDriver getWebDriver(String browser) {
        if(driver==null){
            switch (browser.toLowerCase()){
                case "chrome":
                    driver=chromeDriver.getChromeDriver();
                    break;

                case "firefox":
                    driver=fireFoxDriver.getFireFoxDriver();
                    break;

                default:
                    driver=edgeDriver.getEdgeDriver();
                    break;
            }
            return driver;
        }9                                
        return driver;
    }
}
