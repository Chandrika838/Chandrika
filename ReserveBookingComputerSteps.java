package Stepdefinitation;

import org.testng.Assert;

import adminpage.Reserve_Computer_Page;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReserveBookingComputerSteps {

    private Reserve_Computer_Page reservePage;
    private ConfigReader config;

    private void initReserveComputerPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (reservePage == null) {
            reservePage = new Reserve_Computer_Page(HookClass.driver);
        }
    }

    @When("I open Reserve Computer")
    public void i_open_reserve_computer() {

        initReserveComputerPage();

        reservePage.ClickComputer();
    }

    @And("I select reserve computer location {string}")
    
    public void i_select_reserve_computer_location(String location) {
    
        initReserveComputerPage();
    	
    reservePage.SelectLocation(location);
    
    }

    
    @Then("Reserve computer location should be displayed")
    public void reserve_computer_location_should_be_displayed() {

        initReserveComputerPage();

        Assert.assertTrue(
                reservePage.isDisplayedLocation(),
                "Location is not displayed"
        );
    }

    @And("I select reserve computer booking date")
    public void i_select_reserve_computer_booking_date() {

        initReserveComputerPage();

        reservePage.selectDate(
                config.getReserveBookingDate()
        );
    }

    @And("I click reserve computer tooltip")
    public void i_click_reserve_computer_tooltip() {

        initReserveComputerPage();

        reservePage.ClickTooltips();
    }

    @Then("Reserve computer tooltip should be displayed")
    public void reserve_computer_tooltip_should_be_displayed() {

        initReserveComputerPage();

        Assert.assertTrue(
                reservePage.isDisplayedTooltips(),
                "Tooltips is not displayed"
        );
    }

    @And("I select reserve computer start time")
    public void i_select_reserve_computer_start_time() {

        initReserveComputerPage();

        reservePage.SelectStartTime2(
                config.getStartTime2()
        );
    }

    @And("I enable reserve computer self booking")
    public void i_enable_reserve_computer_self_booking() {

        initReserveComputerPage();

        reservePage.EnableSelfBookings();
    }

    @Then("Reserve computer self booking should be selected")
    public void reserve_computer_self_booking_should_be_selected() {

        initReserveComputerPage();

        Assert.assertTrue(
                reservePage.isSelectedSelfBooking(),
                "Self Booking is not selected"
        );
    }

    @And("I click reserve computer Book button")
    public void i_click_reserve_computer_book_button() {

        initReserveComputerPage();

        reservePage.ClickBooks();
    }

    @Then("Reserve computer Book button should be displayed")
    public void reserve_computer_book_button_should_be_displayed() {

        initReserveComputerPage();

        Assert.assertTrue(
                reservePage.isDisplayedBooks(),
                "Book button is not displayed"
        );
    }
}
