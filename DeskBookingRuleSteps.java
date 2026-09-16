package Stepdefinitation;

import org.testng.Assert;

import adminpage.DeskBookingRules;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class DeskBookingRuleSteps {

    private DeskBookingRules desk;
    private ConfigReader config;

    private void init() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (desk == null) {
            desk = new DeskBookingRules(HookClass.driver);
        }
    }


    @Given("I am on the Desk Booking Rules page")
    public void i_am_on_the_desk_booking_rules_page() {

        init();

        desk.ClickBookingRules();
        desk.ClickDeskPage();
    }


    @When("I enable desk access")
    public void i_enable_desk_access() {

        init();

        desk.clickAccess();
    }


    @Then("desk access should be selected")
    public void desk_access_should_be_selected() {

        init();

        Assert.assertTrue(
                desk.isAccessSelected(),
                "Access is not selected"
        );
    }


    @When("I enable maximum bookings per month")
    public void i_enable_maximum_bookings_per_month() {

        init();

        desk.ClickMaximumPerMonth();
    }


    @Then("maximum bookings per month should be selected")
    public void maximum_bookings_per_month_should_be_selected() {

        init();

        Assert.assertTrue(
                desk.isMaximumPerMonthSelected(),
                "Maximum bookings per month is not selected"
        );
    }


    @When("I enable maximum booking duration")
    public void i_enable_maximum_booking_duration() {

        init();

        desk.ClickMaxiumBookingDuration();
    }


    @Then("maximum booking duration should be selected")
    public void maximum_booking_duration_should_be_selected() {

        init();

        Assert.assertTrue(
                desk.isSelectedMaxiumBookingDuration(),
                "Maximum booking duration is not selected"
        );
    }


    @When("I enable bookings per day")
    public void i_enable_bookings_per_day() {

        init();

        desk.ClickBookingPerDay();
    }


    @Then("bookings per day should be selected")
    public void bookings_per_day_should_be_selected() {

        init();

        Assert.assertTrue(
                desk.isSelectedBookingPerDay(),
                "Bookings per day is not selected"
        );
    }


    @When("I enable maximum allowed time per day")
    public void i_enable_maximum_allowed_time_per_day() {

        init();

        desk.ClickMaximumAllowedPerDay();
    }


    @Then("maximum allowed time per day should be selected")
    public void maximum_allowed_time_per_day_should_be_selected() {

        init();

        Assert.assertTrue(
                desk.isSelectedMaxiumAllowedPPerDay(),
                "Maximum allowed time per day is not selected"
        );
    }


    @When("I enable maximum advance booking period")
    public void i_enable_maximum_advance_booking_period() {

        init();

        desk.ClickMaxiumperiodAdvance();
    }


    @Then("maximum advance booking period should be selected")
    public void maximum_advance_booking_period_should_be_selected() {

        init();

        Assert.assertTrue(
                desk.isSelectedMaxiumperiodAdvance(),
                "Maximum advance booking period is not selected"
        );
    }


    @When("I submit the desk booking rules")
    public void i_submit_the_desk_booking_rules() {

        init();

        desk.ClickSubmit();
    }


    @Then("the submit button should be displayed")
    public void the_submit_button_should_be_displayed() {

        init();

        Assert.assertTrue(
                desk.isSubmitDisplayed(),
                "Submit button is not displayed"
        );
    }
}
