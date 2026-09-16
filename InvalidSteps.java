package Stepdefinitation;

import org.testng.Assert;

import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidSteps {

    private LoginPage loginPage;
    private ConfigReader config;

    // Initialize LoginPage and ConfigReader
    private void initLoginPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (loginPage == null) {
            loginPage = new LoginPage(HookClass.driver);
        }
    }


    // =====================================================
    // 1. I enter invalid email
    // =====================================================

    @When("I enter invalid email")
    public void i_enter_invalid_email() {

        initLoginPage();

        loginPage.enterEmail("Invalid emailid");
    }


    // =====================================================
    // 2. I enter invalid password
    // =====================================================

    @And("I enter invalid password")
    public void i_enter_invalid_password() {

        initLoginPage();

        loginPage.enterPassword("Wrong123");
    }


    // =====================================================
    // 3. I enter an invalid email
    // =====================================================

    @When("I enter an invalid email")
    public void i_enter_an_invalid_email() {

        initLoginPage();

        loginPage.enterEmail("test@123");
    }


    // =====================================================
    // 4. I enter wrong password
    // =====================================================

    @When("I enter wrong password")
    public void i_enter_wrong_password() {

        initLoginPage();

        loginPage.enterPassword("test1233");
    }


    // =====================================================
    // 5. I leave the email blank
    // =====================================================

    @When("I leave the email blank")
    public void i_leave_the_email_blank() {

        initLoginPage();

        loginPage.enterEmail(" ");
    }


    // =====================================================
    // 6. Invalid credentials error message
    // =====================================================

    @Then("invalid credentials error message should be displayed")
    public void invalid_credentials_error_message_should_be_displayed() {

        initLoginPage();

        Assert.assertTrue(
                loginPage.isInvalidMessageDisplayed(),
                "Invalid credentials message is not displayed"
        );
    }


    // =====================================================
    // 7. Invalid login message
    // =====================================================

    @Then("invalid login message should be displayed")
    public void invalid_login_message_should_be_displayed() {

        initLoginPage();

        Assert.assertTrue(
                loginPage.isInvalidMessageDisplayed(),
                "Invalid login message is not displayed"
        );
    }


    // =====================================================
    // 8. Invalid password message
    // =====================================================

    @Then("invalid password message should be displayed")
    public void invalid_password_message_should_be_displayed() {

        initLoginPage();

        Assert.assertTrue(
                loginPage.isInvalidPasswordDisplayed(),
                "Invalid password message is not displayed"
        );
    }


    // =====================================================
    // 9. Login error message
    // =====================================================

    @Then("login error message should be displayed")
    public void login_error_message_should_be_displayed() {

        initLoginPage();

        Assert.assertTrue(
                loginPage.isErrorMessageDisplayed(),
                "Login error message is not displayed"
        );
    }
}