package Stepdefinitation;

import org.testng.Assert;

import adminpage.DashboardPage;
import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private ConfigReader config;

    // Initialize objects
    private void initLoginPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (loginPage == null) {
            loginPage = new LoginPage(HookClass.driver);
        }
    }

    // =====================================================
    // Open Application
    // =====================================================

    @Given("I open the application")
    public void i_open_the_application() {

        initLoginPage();

        HookClass.driver.get(config.getUrl());
    }

    // =====================================================
    // Enter Valid Email
    // =====================================================

    @When("I enter valid email")
    public void i_enter_valid_email() {

        initLoginPage();

        loginPage.enterEmail(config.getEmail());
    }

    // =====================================================
    // Enter Valid Password
    // =====================================================

    @When("I enter valid password")
    public void i_enter_valid_password() {

        initLoginPage();

        loginPage.enterPassword(config.getPassword());
    }

    // =====================================================
    // Enable High Contrast
    // =====================================================

    @When("I enable high contrast")
    public void i_enable_high_contrast() {

        initLoginPage();

        loginPage.enableHighContrast();
    }

    // =====================================================
    // Verify High Contrast
    // =====================================================

    @Then("high contrast should be enabled")
    public void high_contrast_should_be_enabled() {

        initLoginPage();

        Assert.assertTrue(
                loginPage.isHighContrastEnabled(),
                "High contrast is not enabled"
        );
    }

    // =====================================================
    // Click Login Button
    // =====================================================

    @When("I click the login button")
    public void i_click_the_login_button() {

        initLoginPage();

        loginPage.clickLogin();
    }

    // =====================================================
    // Verify Logged-in Username
    // =====================================================

    @Then("the logged in username should be displayed")
    public void the_logged_in_username_should_be_displayed() {

        dashboardPage = new DashboardPage(HookClass.driver);

        Assert.assertTrue(
                dashboardPage.isLoggedInUserNameDisplayed(),
                "Logged-in user name is not displayed on the dashboard"
        );
    }

    // =====================================================
    // Verify Logged-in Username is not Empty
    // =====================================================

    @Then("the logged in username should not be empty")
    public void the_logged_in_username_should_not_be_empty() {

        Assert.assertNotNull(
                dashboardPage,
                "DashboardPage is not initialized"
        );

        Assert.assertFalse(
                dashboardPage.getLoggedInUserName().isEmpty(),
                "Logged-in user name is empty"
        );
    }
}