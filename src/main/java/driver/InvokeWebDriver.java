package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class InvokeWebDriver {


    public WebDriver initiateWebDriver () {
//        WebDriver driver = null;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }


}
