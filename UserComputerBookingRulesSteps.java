package Stepdefinitation;

import org.testng.Assert;

import adminpage.UserComputerBookingRules;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserComputerBookingRulesSteps {

    private UserComputerBookingRules comp;
    private ConfigReader config;

    private void init() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (comp == null) {
            comp = new UserComputerBookingRules(HookClass.driver);
        }
    }

    @Given("I am on the User Computer Booking Rules page")
    public void i_am_on_the_user_computer_booking_rules_page() {

        init();

        comp.ClickAdmin();
        comp.ClickTools();
        comp.ClickUserTools();
        comp.ClickBookingRules();
        comp.ClickComputers();
        comp.clickAutomationTags();
    }


    @When("I enable computer access")
    public void i_enable_computer_access() {

        init();

        comp.ClickAccess();
    }


    @When("I enable computer access toggle")
    public void i_enable_computer_access_toggle() {

        init();

        comp.enableToogle();
    }



    @When("I enable maximum computer bookings per month")
    public void i_enable_maximum_computer_bookings_per_month() {

        init();

        comp.clickMaxmiumBookingPerMonth();
    }


    @When("I enter the maximum computer bookings per month")
    public void i_enter_the_maximum_computer_bookings_per_month() {

        init();

        comp.enableInput(config.getMaximumPerMonth());
    }


   
    @When("I enable maximum computer booking duration")
    public void i_enable_maximum_computer_booking_duration() {
        init();

        comp.ClickBookingDuration();
    }


    @When("I enter the maximum computer booking duration")
    public void i_enter_the_maximum_computer_booking_duration() {

        init();

        comp.enableInput1(config.getMaxiumBookingDuration());
    }


    @When("I enable computer bookings per day")
    public void i_enable_computer_bookings_per_day() {

        init();

        comp.ClickBookingPerDay();
    }


    @When("I enter the computer bookings per day")
    public void i_enter_the_computer_bookings_per_day() {

        init();

        comp.enableInput2(config.getBookingPerDay());
    }


    @When("I enable maximum allowed computer booking time per day")
    public void i_enable_maximum_allowed_computer_booking_time_per_day() {
        init();

        comp.ClickBookingAllowedPerDay();
    }


    @When("I enter the maximum allowed computer booking time per day")
    public void i_enter_the_maximum_allowed_computer_booking_time_per_day() {

        init();

        comp.enableInput3(config.getBookingAllowedPerDay());
    }


    @When("I enable maximum computer booking advance period")
    public void i_enable_maximum_computer_booking_advance_period() {

        init();

        comp.ClickMaxmiumPeriodToBookinAdvance();
    }


    @When("I enter the maximum computer booking advance period")
    public void i_enter_the_maximum_computer_booking_advance_period() {

        init();

        comp.enableInput4(
            config.getmaximumperiodtobookinadvance()
        );
    }


    @When("I enable computer booking extension")
    public void i_enable_computer_booking_extension() {

        init();

        comp.ClickExtend();
    }


    @When("I enable computer extension toggle")
    public void i_enable_computer_extension_toggle() {

        init();

        comp.enableToogle1();
    }

    @When("I enable automatic computer extension")
    public void i_enable_automatic_computer_extension() {

        init();

        comp.ClickAutoExtend();
    }


    @When("I enable automatic extension toggle")
    public void i_enable_automatic_extension_toggle() {

        init();

        comp.enableToogle2();
    }


    @When("I enable maximum computer extension time")
    public void i_enable_maximum_computer_extension_time() {

        init();

        comp.ClickMaxmiumExtendTime();
    }


    @When("I enable maximum extension time toggle")
    public void i_enable_maximum_extension_time_toggle() {

        init();

        comp.ClickToogle3();
    }

    @When("I enable number of computer extensions")
    public void i_enable_number_of_computer_extensions() {

        init();

        comp.clickNumberofExtension();
    }


    @When("I enable number of extensions toggle")
    public void i_enable_number_of_extensions_toggle() {

        init();

        comp.ClickToogle4();
    }

    @When("I submit the user computer booking rules")
    public void i_submit_the_user_computer_booking_rules() {

        init();

        comp.ClickSubmit();
    }
}
