package Stepdefinitation;

import java.time.LocalDate;

import org.testng.Assert;

import adminpage.Reserve_DeskPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReserveBookingDesk {

    private Reserve_DeskPage deskPage;
    private ConfigReader config;

    private void initReserveDeskPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (deskPage == null) {
            deskPage = new Reserve_DeskPage(HookClass.driver);
        }
    }

    @When("I open Reserve Desk")
    public void i_open_reserve_desk() {

        initReserveDeskPage();

        deskPage.ClickDesk();
    }

    @And("I select reserve desk location")
    public void i_select_reserve_desk_location() {

        initReserveDeskPage();

        deskPage.SelectLocation(config.getLocation());
    }

    @Then("Reserve desk location should be displayed")
    public void reserve_desk_location_should_be_displayed() {

        initReserveDeskPage();

        Assert.assertTrue(
                deskPage.isDisplayedLocation(),
                "Location is not displayed"
        );
    }

    @And("I select reserve desk date")
    public void i_select_reserve_desk_date() {

        initReserveDeskPage();

        deskPage.selectDate(
                LocalDate.now().plusDays(1)
        );
    }

    @And("I click reserve desk tooltip")
    public void i_click_reserve_desk_tooltip() {

        initReserveDeskPage();

        deskPage.ClickToolTip();
    }

    @Then("Reserve desk tooltip should be displayed")
    public void reserve_desk_tooltip_should_be_displayed() {

        initReserveDeskPage();

        Assert.assertTrue(
                deskPage.isDisplayedToolTip(),
                "Tool Tip is not displayed"
        );
    }

    @And("I select reserve desk start time")
    public void i_select_reserve_desk_start_time() {

        initReserveDeskPage();

        deskPage.SelectStartTime1(
                config.getStartTime1()
        );
    }

    @Then("Reserve desk start time should be displayed")
    public void reserve_desk_start_time_should_be_displayed() {

        initReserveDeskPage();

        Assert.assertTrue(
                deskPage.isDisplayedStartTime1(),
                "Start Time is not displayed"
        );
    }

    @And("I drag reserve desk slider")
    public void i_drag_reserve_desk_slider() {

        initReserveDeskPage();

        deskPage.ClickDragDrop();
    }

    @And("I enable reserve desk self booking")
    public void i_enable_reserve_desk_self_booking() {

        initReserveDeskPage();

        deskPage.enableSelfBooking();
    }

    @Then("Reserve desk self booking should be displayed")
    public void reserve_desk_self_booking_should_be_displayed() {

        initReserveDeskPage();

        Assert.assertTrue(
                deskPage.isDisplayedSelfBooking(),
                "Self Booking is not displayed"
        );
    }

    @And("I click reserve desk Book button")
    public void i_click_reserve_desk_book_button() {

        initReserveDeskPage();

        deskPage.ClickBook();
    }

    @Then("Reserve desk Book button should be displayed")
    public void reserve_desk_book_button_should_be_displayed() {

        initReserveDeskPage();

        Assert.assertTrue(
                deskPage.isDisplayedBook(),
                "Book button is not displayed"
        );
    }
}
