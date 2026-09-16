package Stepdefinitation;

import org.testng.Assert;

import adminpage.ComputerLocationProperties;
import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class ComputerCopyPropertiesStepDefination {

    private LoginPage loginPage;
    private ComputerLocationProperties computerPage;
    private ConfigReader config;

    private void init() {
        if (config == null) {
            config = new ConfigReader();
        }

        if (loginPage == null) {
            loginPage = new LoginPage(HookClass.driver);
        }

        if (computerPage == null) {
            computerPage = new ComputerLocationProperties(HookClass.driver);
        }
    }


    @When("I open Computer Copy Properties")
    public void i_open_computer_copy_properties() {

        init();

        computerPage.ClickAdmin();
        computerPage.ClickTools();
        computerPage.ClickComputerTools();
        computerPage.clickCopyProperties();

        Assert.assertTrue(
                computerPage.CopyPropertiesisDisplayed(),
                "Computer Copy Properties page is not displayed"
        );
    }

    @When("I select the configured computer as the source")
    public void i_select_the_configured_computer_as_the_source() {

        init();

        computerPage.SelectSource(config.getComputerName());
    }

    @And("I select the configured location as the target")
    public void i_select_the_configured_location_as_the_target() {

        init();

        computerPage.SelectLocation(config.getLocations());
    }

    @And("I enable the computer tag option")
    public void i_enable_the_computer_tag_option() {

        init();

        computerPage.enableTags();
    }

    @And("I enable the second computer tag option")
    public void i_enable_the_second_computer_tag_option() {

        init();

        computerPage.enableTags1();
    }

    @And("I enable the computer location option")
    public void i_enable_the_computer_location_option() {

        init();

        computerPage.enableLocation();
    }

    @And("I enable the computer default duration option")
    public void i_enable_the_computer_default_duration_option() {

        init();

        computerPage.enabledfaulttime();
    }

    @And("I enable the allowed booking method option")
    public void i_enable_the_allowed_booking_method_option() {

        init();

        computerPage.enableallowedBookingMethod();
    }

    @And("I enable the computer preparation time option")
    public void i_enable_the_computer_preparation_time_option() {

        init();

        computerPage.enableprepartime();
    }

    @And("I enable the computer check-in option")
    public void i_enable_the_computer_check_in_option() {

        init();

        computerPage.enablecheckinsetting();
    }

    @And("I enable computer level one warning time")
    public void i_enable_computer_level_one_warning_time() {

        init();

        computerPage.enablelevel1time();
    }

    @And("I enable computer level two warning time")
    public void i_enable_computer_level_two_warning_time() {

        init();

        computerPage.enablelevel2time();
    }

    @And("I enable computer level three warning time")
    public void i_enable_computer_level_three_warning_time() {

        init();

        computerPage.enablelevel3time();
    }

    @And("I enable the computer logging level option")
    public void i_enable_the_computer_logging_level_option() {

        init();

        computerPage.enablelogginglevel();
    }

    @And("I enable the computer welcome message option")
    public void i_enable_the_computer_welcome_message_option() {

        init();

        computerPage.enableWlecomeMessage();
    }

    @And("I enable the computer AUP message option")
    public void i_enable_the_computer_aup_message_option() {

        init();

        computerPage.enableaupMessage();
    }

    @And("I enable the computer automatic reboot option")
    public void i_enable_the_computer_automatic_reboot_option() {

        init();

        computerPage.enableAllowautoRebot();
    }

    @And("I enable the computer automatic shutdown option")
    public void i_enable_the_computer_automatic_shutdown_option() {

        init();

        computerPage.enableallowAutoShutdown();
    }

    @And("I enable the computer inactivity timeout option")
    public void i_enable_the_computer_inactivity_timeout_option() {

        init();

        computerPage.enableincativitytimenout();
    }

    @And("I enable the computer lock timeout option")
    public void i_enable_the_computer_lock_timeout_option() {

        init();

        computerPage.enablelocktimeout();
    }

    @When("I copy the computer properties")
    public void i_copy_the_computer_properties() {

        init();

        computerPage.ClickCopy();
    }

    @Then("the computer copy properties page should be displayed")
    public void the_computer_copy_properties_page_should_be_displayed() {

        init();

        Assert.assertTrue(
                computerPage.isDisplayed(),
                "Computer Copy Properties page is not displayed"
        );
    }
}
