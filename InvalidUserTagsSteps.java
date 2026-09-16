package Stepdefinitation;

import org.testng.Assert;

import adminpage.UsersTags;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidUserTagsSteps {

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
    
    @And("I enter a blank user tag")
    public void i_enter_a_blank_user_tag() {
        initPage();
        usersTags.enterUsersTag("");
    }

  
    @Then("the invalid message should be displayed")
    public void the_invalid_message_should_be_displayed() {
        initPage();

        Assert.assertTrue(
            usersTags.isInvalidMessageDisplayed(),
            "Invalid Message is not Displayed"
        );
    }

    @Then("the invalid message should be {string}")
    public void the_invalid_message_should_be(String expectedMessage) {
        initPage();

        Assert.assertEquals(
            usersTags.getInvalidMessage(),
            expectedMessage,
            "Validation message is incorrect."
        );
    }
}
