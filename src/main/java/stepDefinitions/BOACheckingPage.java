package stepDefinitions;

import driver.InvokeWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CheckingPage;
import utils.CommonMethods;

public class BOACheckingPage extends InvokeWebDriver {
    CommonMethods commonMethods = new CommonMethods();
    CheckingPage checkingPage = new CheckingPage();
    WebDriver driver = null;
    String expectedIntroTextOne = "Stay flexible with Bank of";
    String expectedIntroTextTwo = "America Advantage Banking";
    String expectedExploreCheckingText = "Explore checking solutions";
    String expectedStudentBanking = "Student Banking";
    String expectedBusinessChecking = "Business Checking";


    //    @Given("user opens chrome browser")
//    public void user_opens_chrome_browser() {
//        driver = initiateWebDriver();
//    }
//    @When("user enters url")
//    public void user_enters_url() {
//        commonMethods.getBOAUrl(driver);
//    }
    @Before
    public void setUp() {
        driver = initiateWebDriver();
        commonMethods.getBOAUrl(driver);
    }


    @Given("user clicks checking link")
    public void user_clicks_checking_link() throws InterruptedException {
        checkingPage.clickCheckingLink(driver);
        Thread.sleep(2000);
    }

    @When("user validates text on checking page")
    public void user_validates_text_on_checking_page() {
        checkingPage.validateIntroText(driver, expectedIntroTextOne, expectedIntroTextTwo);
    }

    @When("user validates explore checking solutions button")
    public void user_validates_explore_checking_solutions_button() {
        checkingPage.validateExploreCheckingSolutions(driver, expectedExploreCheckingText);
    }

    @When("user validates student banking link")
    public void user_validates_student_banking_link() {
        checkingPage.validateStudentBanking(driver, expectedStudentBanking);
    }

    @Then("user validates business checking link")
    public void user_validates_business_checking_link() {
        checkingPage.validateBusinessChecking(driver, expectedBusinessChecking);
    }

    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
