package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class BOALoginPage {


    BOACheckingPage boaCheck = new BOACheckingPage();
    String expectedErrorMessage = "The information you entered doesn't match our records. You have a few more tries remaining.";
    String expectedOpenAccountText = "Open an Account";
    LoginPage loginPage = new LoginPage();


    @When("user enters incorrect username and password")
    public void user_enters_incorrect_username_and_password() {
        loginPage.enterUserName(boaCheck.driver, "asdfasdf12");
        loginPage.enterPassword(boaCheck.driver, "3443ioer");
    }

    @When("user clicks saveID button")
    public void user_clicks_save_id_button() {
        loginPage.clickSaveIdButton(boaCheck.driver);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton(boaCheck.driver);
    }

    @Then("user validate error message")
    public void user_validate_error_message() throws InterruptedException {
        Thread.sleep(2134);
        loginPage.validateErrorMessage(boaCheck.driver, expectedErrorMessage);
    }

    @Then("user validate open account link")
    public void user_validate_open_account_link() throws InterruptedException {
        loginPage.validateOpenAccountLink(boaCheck.driver, expectedOpenAccountText);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String user, String pass) {
        loginPage.enterUserName(boaCheck.driver, user);
        loginPage.enterPassword(boaCheck.driver, pass);
    }



}
