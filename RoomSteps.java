package Stepdefinitation;

import org.testng.Assert;

import adminpage.AdminRoomPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RoomSteps {

    private AdminRoomPage roomPage;
    private ConfigReader config;

    private void initRoomPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (roomPage == null) {
            roomPage = new AdminRoomPage(HookClass.driver);
        }
    }

    @And("I open the Room menu")
    public void i_open_the_room_menu() {

        initRoomPage();

        Assert.assertTrue(
                roomPage.isRoomDisplayed(),
                "Room is not displayed"
        );

        roomPage.ClickRoom();
    }

    @And("I click Room Add New")
    public void i_click_room_add_new() {

        initRoomPage();

        Assert.assertTrue(
                roomPage.isAddNewDisplayed(),
                "Add New button is not displayed"
        );

        roomPage.ClickAddNew();
    }

    @And("I enter room name")
    public void i_enter_room_name() {

        initRoomPage();

        Assert.assertTrue(
                roomPage.isRoomNameDisplayed(),
                "Room Name field is not displayed"
        );

        roomPage.enterRoomName(config.getRoomName());
    }

    @And("I select room location")
    public void i_select_room_location() {

        initRoomPage();

        Assert.assertTrue(
                roomPage.isLocationDisplayed(),
                "Location dropdown is not displayed"
        );

        roomPage.selectLocation(config.getLocation());
    }

    @And("I open Room Advanced Options")
    public void i_open_room_advanced_options() {

        initRoomPage();

        roomPage.ClickAdvanceOption1();
    }

    @And("I enable Room camera")
    public void i_enable_room_camera() {

        initRoomPage();

        roomPage.enablecheckRoomCamera();
    }

    @And("I enable Room monitor")
    public void i_enable_room_monitor() {

        initRoomPage();

        roomPage.enablecheckRoomMonitor();
    }

    @And("I enable Room projector")
    public void i_enable_room_projector() {

        initRoomPage();

        roomPage.enablecheckRoomProjector();
    }

    @Then("Room preparation dropdown should be displayed")
    public void room_preparation_dropdown_should_be_displayed() {

        initRoomPage();

        Assert.assertTrue(
                roomPage.isPrepartionDisplayed(),
                "Preparation dropdown is not displayed"
        );
    }

    @And("I select Room preparation")
    public void i_select_room_preparation() {

        initRoomPage();

        roomPage.selectPrepartion(config.getPrepration());
    }

    @And("I select Room check box")
    public void i_select_room_check_box() {

        initRoomPage();

        roomPage.selectCheckBox();
    }

    @And("I open Room Tags and Booking Rules")
    public void i_open_room_tags_and_booking_rules() {

        initRoomPage();

        roomPage.clickTagsandBooking();
    }

    @And("I click Room Tags Add")
    public void i_click_room_tags_add() {

        initRoomPage();

        roomPage.clickTagsAdd();
    }

    @And("I select Room tag")
    public void i_select_room_tag() {

        initRoomPage();

        roomPage.selectTags(config.getRoomTags());
    }

    @Then("Room Submit button should be displayed")
    public void room_submit_button_should_be_displayed() {

        initRoomPage();

        Assert.assertTrue(
                roomPage.isSubmitDisplayed(),
                "Submit button is not displayed"
        );
    }

    @When("I click Room Submit button")
    public void i_click_room_submit_button() {

        initRoomPage();

        roomPage.clickSubmit();
    }
}