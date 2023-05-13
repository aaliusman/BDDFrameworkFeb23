package driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.CommonMethods;

public class InvokeWebDriver {

    WebDriver driver = null;
    CommonMethods commonMethods = new CommonMethods();
    public WebDriver initiateWebDriver () {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("window-size=1400,800");
//        options.addArguments("headless");
//        WebDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        return driver;
    }


}
