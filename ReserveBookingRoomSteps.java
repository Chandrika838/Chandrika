package Stepdefinitation;

import java.time.LocalDate;

import org.testng.Assert;

import adminpage.Reserve_RoomPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReserveBookingRoomSteps {

    private Reserve_RoomPage reserveRoomPage;
    private ConfigReader config;

    private void initReserveRoomPage() {

        if (reserveRoomPage == null) {
            reserveRoomPage =
                    new Reserve_RoomPage(HookClass.driver);
        }

        if (config == null) {
            config = new ConfigReader();
        }
    }

    @And("I select Room")
    public void i_select_room() {

        initReserveRoomPage();

        reserveRoomPage.clickRoom();
    }

    @And("I select the Room location")
    public void i_select_the_room_location() {

        initReserveRoomPage();

        reserveRoomPage.selectLocation(
                config.getLocation()
        );
    }

    @And("I select the Room booking date")
    public void i_select_the_booking_date() {

        initReserveRoomPage();

        reserveRoomPage.selectDate(config.getReserveBookingDate());

    }

    @And("I select the Room start time")
    public void i_select_the_room_start_time() {

        initReserveRoomPage();

        reserveRoomPage.selectStartime(
                config.getstarttime()
        );
    }

    @And("I enable Room self booking")
    public void i_enable_room_self_booking() {

        initReserveRoomPage();

        reserveRoomPage.enableSelfBooking();
    }

    @Then("Room self booking should be enabled")
    public void room_self_booking_should_be_enabled() {

        initReserveRoomPage();

        Assert.assertTrue(
                reserveRoomPage.isSelectedSelfBooking(),
                "Room self booking is not enabled"
        );
    }

    @When("I click Room Book button")
    public void i_click_room_book_button() {

        initReserveRoomPage();

        reserveRoomPage.clickSubmit();
    }
}