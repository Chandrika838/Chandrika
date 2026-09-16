package Stepdefinitation;

import org.testng.Assert;

import adminpage.UsersTags;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserTagsSteps {

    private UsersTags usersTags;
    private ConfigReader config;

    private void initPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (usersTags == null) {
            usersTags = new UsersTags(HookClass.driver);
        }
    }

    @When("I navigate to User Tags")
    public void i_navigate_to_user_tags() {

        initPage();

 
        usersTags.ClickUsersTool();
        usersTags.ClickTags();
    }

    @And("I click Add New")
    public void i_click_add_new() {

        initPage();

        usersTags.ClickAddNew();
    }

    @And("I enter the user tag")
    public void i_enter_the_user_tag() {

        initPage();

        usersTags.enterUsersTag(
                config.getUsersTag()
        );
    }

    @When("I click the Add button")
    public void i_click_the_add_button() {

        initPage();

        usersTags.clickAdd();
    }

    @Then("the Submit button should be displayed")
    public void the_submit_button_should_be_displayed() {

        initPage();

        Assert.assertTrue(
                usersTags.isDisplayedAddSubmit(),
                "Submit is not Displayed"
        );
    }
}