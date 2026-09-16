package Stepdefinitation;

import org.testng.Assert;

import adminpage.UserDeskBookingRules;
import hookclass.HookClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDeskBookingRuleSteps {

    private UserDeskBookingRules users;

    private void init() {

        if (users == null) {
            users = new UserDeskBookingRules(HookClass.driver);
        }
    }


    // Navigate to User Desk Booking Rules page

    @Given("I am on the User Desk Booking Rules page")
    public void i_am_on_the_user_desk_booking_rules_page() {

        init();

        users.clickBookingRules();
        users.clickDeskPage();
        users.ClickAutomationTags();
    }


    // Access

    @When("I enable user desk access")
    public void i_enable_user_desk_access() {

        init();

        users.clickAccess();
    }

    @Then("user desk access should be selected")
    public void user_desk_access_should_be_selected() {

        init();

        Assert.assertTrue(
                users.isAccessSelected(),
                "User desk access is not selected"
        );
    }


    // Maximum Per Month

    @When("I enable user maximum bookings per month")
    public void i_enable_user_maximum_bookings_per_month() {

        init();

        users.clickMaximumPerMonth();
    }

    @Then("user maximum bookings per month should be selected")
    public void user_maximum_bookings_per_month_should_be_selected() {

        init();

        Assert.assertTrue(
                users.isMaximumPerMonthSelected(),
                "User maximum bookings per month is not selected"
        );
    }


    // Maximum Booking Duration

    @When("I enable user maximum booking duration")
    public void i_enable_user_maximum_booking_duration() {

        init();

        users.clickMaximumBookingDuration();
    }

    @Then("user maximum booking duration should be selected")
    public void user_maximum_booking_duration_should_be_selected() {

        init();

        Assert.assertTrue(
                users.isMaximumBookingDurationSelected(),
                "User maximum booking duration is not selected"
        );
    }


    // Booking Per Day

    @When("I enable user bookings per day")
    public void i_enable_user_bookings_per_day() {

        init();

        users.clickBookingPerDay();
    }

    @Then("user bookings per day should be selected")
    public void user_bookings_per_day_should_be_selected() {

        init();

        Assert.assertTrue(
                users.isBookingPerDaySelected(),
                "User bookings per day is not selected"
        );
    }


    // Maximum Allowed Per Day

    @When("I enable user maximum allowed time per day")
    public void i_enable_user_maximum_allowed_time_per_day() {

        init();

        users.clickMaximumAllowedPerDay();
    }

    @Then("user maximum allowed time per day should be selected")
    public void user_maximum_allowed_time_per_day_should_be_selected() {

        init();

        Assert.assertTrue(
                users.isMaximumAllowedPerDaySelected(),
                "User maximum allowed time per day is not selected"
        );
    }


    // Maximum Period Advance

    @When("I enable user maximum advance booking period")
    public void i_enable_user_maximum_advance_booking_period() {

        init();

        users.clickMaximumPeriodAdvance();
    }

    @Then("user maximum advance booking period should be selected")
    public void user_maximum_advance_booking_period_should_be_selected() {

        init();

        Assert.assertTrue(
                users.isMaximumPeriodAdvanceSelected(),
                "User maximum advance booking period is not selected"
        );
    }


    // Submit

    @Then("the user desk booking submit button should be displayed")
    public void the_user_desk_booking_submit_button_should_be_displayed() {

        init();

        Assert.assertTrue(
                users.isSubmitDisplayed(),
                "Submit button is not displayed"
        );
    }

    @When("I submit the user desk booking rules")
    public void i_submit_the_user_desk_booking_rules() {

        init();

        users.clickSubmit();
    }
}