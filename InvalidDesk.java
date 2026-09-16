package Stepdefinitation;

import org.testng.Assert;

import adminpage.DeskPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidDesk {

    private DeskPage deskPage;
    private ConfigReader config;

    private void initDeskPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (deskPage == null) {
            deskPage = new DeskPage(HookClass.driver);
        }
    }

    @And("I enter blank desk name")
    public void i_enter_blank_desk_name() {

        initDeskPage();

        deskPage.enterDeskName("");
    }

    @And("I enter blank default duration")
    public void i_enter_blank_default_duration() {

        initDeskPage();

        deskPage.enterDefaultDuration("");
    }

    @Then("Invalid Desk message should be displayed")
    public void invalid_desk_message_should_be_displayed() {

        initDeskPage();

        String actualMessage = deskPage.getInvalidMessage();

        System.out.println("Actual Message: " + actualMessage);

        Assert.assertEquals(
                actualMessage,
                "Invalid entry!",
                "Validation message is incorrect."
        );
    }
}