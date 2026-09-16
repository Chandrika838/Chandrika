package Stepdefinitation;

import org.testng.Assert;

import adminpage.UserPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {

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

    @And("I open the Users menu")
    public void i_open_the_users_menu() {

        initUserPage();
        userPage.clickUserMenu();
    }

    @And("I click Invite Users")
    public void i_click_invite_users() {

        initUserPage();
        userPage.clickInviteUsers();
    }

    @And("I enter first name")
    public void i_enter_first_name() {

        initUserPage();
        userPage.enterFirstName(config.getFirstName());
    }

    @And("I enter last name")
    public void i_enter_last_name() {

        initUserPage();
        userPage.enterLastName(config.getLastName());
    }

    @Then("User Submit button should be displayed")
    public void user_submit_button_should_be_displayed() {

        initUserPage();

        Assert.assertTrue(
                userPage.isDisplayed(),
                "Submit button is not displayed"
        );
    }

    @When("I click User Submit button")
    public void i_click_user_submit_button() {

        initUserPage();
        userPage.clickSubmit();
    }
}
