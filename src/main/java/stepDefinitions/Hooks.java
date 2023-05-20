package stepDefinitions;

import driver.InvokeWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.CommonMethods;

import java.io.ByteArrayInputStream;

public class Hooks {

//    public static WebDriver driver = null;
//    CommonMethods commonMethods = new CommonMethods();
//    InvokeWebDriver invokeWebDriver = new InvokeWebDriver();
//    @Before
//    public void setUp() {
//        driver = invokeWebDriver.initiateWebDriver();
//        commonMethods.getBOAUrl(driver);
//    }
//    @After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            Allure.addAttachment("Failed screenshot", new ByteArrayInputStream(screenshot));
//        }
//        driver.close();
//    }

}
