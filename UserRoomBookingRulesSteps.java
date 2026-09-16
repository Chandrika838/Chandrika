package Stepdefinitation;

import org.testng.Assert;

import adminpage.UsersRoomPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRoomBookingRulesSteps {

    private UsersRoomPage users;
    private ConfigReader config;

    private void initUsersBookingRulesPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (users == null) {
            users = new UsersRoomPage(HookClass.driver);
        }
    }


   

    @And("I open Booking Rules")
    public void i_open_booking_rules() {

        initUsersBookingRulesPage();

        users.ClickBookingRules();
    }


    @And("I open Rooms")
    public void i_open_rooms() {

        initUsersBookingRulesPage();

        users.ClickRooms();
    }


    @And("I select All Users")
    public void i_select_all_users() {

        initUsersBookingRulesPage();

        users.ClickAllusers();
    }


    @And("I select Access")
    public void i_select_access() {

        initUsersBookingRulesPage();

        users.ClickAccess();
    }


    @Then("Access should be selected")
    public void access_should_be_selected() {

        initUsersBookingRulesPage();

        Assert.assertTrue(
                users.isAccessSelected(),
                "Access is Not Selected"
        );
    }


    @When("I enter Maximum Booking Per Month")
    public void i_enter_maximum_booking_per_month() {

        initUsersBookingRulesPage();

        users.enablemaxiumBookingPerMonth(
                config.getMaximumPerMonth()
        );
    }


    @Then("Maximum Booking Per Month should be displayed")
    public void maximum_booking_per_month_should_be_displayed() {

        initUsersBookingRulesPage();

        Assert.assertTrue(
                users.isMaxiumBookingperMonthDisplayed(),
                "Maximum Booking per Month is not displayed"
        );
    }


    @When("I enter Maximum Booking By Duration")
    public void i_enter_maximum_booking_by_duration() {

        initUsersBookingRulesPage();

        users.enablemaxiumByDuration(
                config.getMaxiumBookingDuration()
        );
    }


    @Then("Maximum Booking By Duration should be displayed")
    public void maximum_booking_by_duration_should_be_displayed() {

        initUsersBookingRulesPage();

        Assert.assertTrue(
                users.isMaxiumByDurationDisplayed(),
                "Maximum Booking By Duration is not displayed"
        );
    }


    @When("I enter Number Of Booking")
    public void i_enter_number_of_booking() {

        initUsersBookingRulesPage();

        users.enableNumberofbooking(
                config.getMaxiumBookingDuration()
        );
    }


    @Then("Number Of Booking should be displayed")
    public void number_of_booking_should_be_displayed() {

        initUsersBookingRulesPage();

        Assert.assertTrue(
                users.isNumberofBookingDisplayed(),
                "Number of Booking is not displayed"
        );
    }


    @When("I enter Maximum Allowed Per Day")
    public void i_enter_maximum_allowed_per_day() {

        initUsersBookingRulesPage();

        users.enableMaximumallowedperday(
                config.getMaximumAllowedPerDay()
        );
    }


    @Then("Maximum Allowed Per Day should be displayed")
    public void maximum_allowed_per_day_should_be_displayed() {

        initUsersBookingRulesPage();

        Assert.assertTrue(
                users.MaxiumallowedperdayDisplayed(),
                "Maximum Allowed Per Day is not displayed"
        );
    }


    @And("I enter Maximum Period To Book In Advance")
    public void i_enter_maximum_period_to_book_in_advance() {

        initUsersBookingRulesPage();

        users.enableMaximunPeriodadvance(
                config.getmaximumperiodtobookinadvance()
        );
    }


    @And("I click Cancel")
    public void i_click_cancel() {

        initUsersBookingRulesPage();

        users.ClickCancel();
    }


    @And("I click Submit")
    public void i_click_submit() {

        initUsersBookingRulesPage();

        users.ClickSubmit();
    }
}