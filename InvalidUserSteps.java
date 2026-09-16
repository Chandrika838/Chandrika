package Stepdefinitation;

import org.testng.Assert;

import adminpage.UserPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidUserSteps {

    private UserPage userPage;
    private ConfigReader config;

    private void initUserPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (userPage == null) {
            userPage = new UserPage(HookClass.driver);
        }
    }

    @And("I enter blank first name")
    public void i_enter_blank_first_name() {

        initUserPage();
        userPage.enterFirstName("  ");
    }

    @And("I enter blank last name")
    public void i_enter_blank_last_name() {

        initUserPage();
        userPage.enterLastName(" ");
    }

    @And("I enter invalid characters in first name")
    public void i_enter_invalid_characters_in_first_name() {

        initUserPage();
        userPage.enterFirstName("@#@@");
    }

    @Then("invalid first name message should be displayed")
    public void invalid_first_name_message_should_be_displayed() {

        initUserPage();

        Assert.assertTrue(
            userPage.FirstNameisDisplayedInvalid(),
            "Invalid first name message is not displayed"
        );
    }

    @Then("invalid last name message should be displayed")
    public void invalid_last_name_message_should_be_displayed() {

        initUserPage();

        Assert.assertTrue(
            userPage.LastNameisDisplayedInvalid(),
            "Invalid last name message is not displayed"
        );
    }

    @Then("invalid character message should be displayed")
    public void invalid_character_message_should_be_displayed() {

        initUserPage();

        Assert.assertTrue(
            userPage.InvalidCharacterisDisplayed(),
            "Invalid character message is not displayed"
        );
    }
}
