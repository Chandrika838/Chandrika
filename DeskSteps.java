package Stepdefinitation;

import org.testng.Assert;

import adminpage.DeskPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeskSteps {

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

    @And("I open the Desk menu")
    public void i_open_the_desk_menu() {

        initDeskPage();

        deskPage.ClickDesk();
    }

    @And("I click Desk Add New")
    public void i_click_desk_add_new() {

        initDeskPage();

        deskPage.ClickAddNew();
    }

    @And("I enter desk name")
    public void i_enter_desk_name() {

        initDeskPage();

        deskPage.enterDeskName(config.getDeskName());
    }

    @And("I select desk location")
    public void i_select_desk_location() {

        initDeskPage();

        deskPage.selectLocation(config.getLocation());
    }

    @And("I enter default duration")
    public void i_enter_default_duration() {

        initDeskPage();

        deskPage.enterDefaultDuration(config.getDuration());
    }

    @Then("Desk location should be displayed")
    public void desk_location_should_be_displayed() {

        initDeskPage();

        Assert.assertTrue(
                deskPage.isDisplayedLocation(),
                "Desk location is not displayed"
        );
    }

    @When("I open Desk Advanced Options")
    public void i_open_desk_advanced_options() {

        initDeskPage();

        deskPage.ClickAdvanceOption2();
    }

    @And("I select Desk preparation time")
    public void i_select_desk_preparation_time() {

        initDeskPage();

        deskPage.selectPrepartion(config.getPrepration());
    }

    @Then("Desk preparation time should be displayed")
    public void desk_preparation_time_should_be_displayed() {

        initDeskPage();

        Assert.assertTrue(
                deskPage.isDisplayedPrepartion(),
                "Desk preparation time is not displayed"
        );
    }

    @When("I enable Desk check in required")
    public void i_enable_desk_check_in_required() {

        initDeskPage();

        deskPage.enableCheckInRequired();
    }

    @Then("Desk check in required should be selected")
    public void desk_check_in_required_should_be_selected() {

        initDeskPage();

        Assert.assertTrue(
                deskPage.isSelectedCheckbox(),
                "Desk check in required checkbox is not selected"
        );
    }

    @When("I open Tags and Booking Rules")
    public void i_open_tags_and_booking_rules() {

        initDeskPage();

        deskPage.clickTagsandBooking();
    }

    @And("I click Tags Add")
    public void i_click_tags_add() {

        initDeskPage();

        deskPage.clickTagsAdd();
    }

    @And("I select Desk tag")
    public void i_select_desk_tag() {

        initDeskPage();

        deskPage.selectTags(config.getDeskTagName());
    }

    @And("I click Desk Add button")
    public void i_click_desk_add_button() {

        initDeskPage();

        deskPage.ClickAdd();
    }

    @Then("Desk Add button should be displayed")
    public void desk_add_button_should_be_displayed() {

        initDeskPage();

        Assert.assertTrue(
                deskPage.isAddDisplayed(),
                "Desk Add button is not displayed"
        );
    }
}