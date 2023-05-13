package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.CommonMethods;

public class CheckingPage {

    CommonMethods commonMethods = new CommonMethods();
    By checkingTab = By.cssSelector("#navChecking");
    By introText = By.xpath("//*[@id='navCheckingContent']/div[2]/div[1]/div[1]/div[1]/div[1]/div/p");
    By exploreCheckingSolutions = By.cssSelector("#exploreCheckingSolutions");

    By linkAdvantageBanking = By.cssSelector("#advantageBanking");
    By linkStudentBanking = By.cssSelector("#studentBanking");
    By linkBusinessChecking = By.cssSelector("#businessChecking");

    public void clickCheckingLink(WebDriver driver) {
        commonMethods.clickElement(driver, checkingTab);
    }

    public void validateIntroText(WebDriver driver, String expectedTextOne, String expectedTextTwo) {
        String actualText = commonMethods.getTextMethod(driver, introText);
        System.out.println(actualText);
        boolean validateTextOne = actualText.contains(expectedTextOne);
        boolean validateTextTwo = actualText.contains(expectedTextTwo);
        Assert.assertTrue(validateTextOne, "Intro text One do not match with expected intro text");
        Assert.assertTrue(validateTextTwo, "Intro text Two do not match with expected intro text");
    }

    public void validateExploreCheckingSolutions (WebDriver driver, String expectedText ) {
        boolean isOpenAccountButtonDisplayed = driver.findElement(exploreCheckingSolutions).isDisplayed();
        String actualText = commonMethods.getTextMethod(driver, exploreCheckingSolutions);
        boolean validateText = actualText.contains(expectedText);
        Assert.assertTrue(isOpenAccountButtonDisplayed, "Explore Checking Solutions is not displayed");
        Assert.assertTrue(validateText, "Explore Checking text is not displayed");
    }

    public void validateStudentBanking (WebDriver driver, String expectedText ) {
        boolean isOpenAccountButtonDisplayed = driver.findElement(linkStudentBanking).isDisplayed();
        String actualText = commonMethods.getTextMethod(driver, linkStudentBanking);
        boolean validateText = actualText.contains(expectedText);
        Assert.assertTrue(isOpenAccountButtonDisplayed, "Student banking is not displayed");
        Assert.assertTrue(validateText, "Student banking text is not displayed");
    }
    public void validateBusinessChecking (WebDriver driver, String expectedText ) {
        boolean isOpenAccountButtonDisplayed = driver.findElement(linkBusinessChecking).isDisplayed();
        String actualText = commonMethods.getTextMethod(driver, linkBusinessChecking);
        boolean validateText = actualText.contains(expectedText);
        Assert.assertTrue(isOpenAccountButtonDisplayed, "Business checking is not displayed");
        Assert.assertTrue(validateText, "Business checking text is not displayed");
    }

}
