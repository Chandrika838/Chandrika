package Stepdefinitation;

import adminpage.LocationsCopyProperties;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocationCopyPropertiesSteps {

    private LocationsCopyProperties location;
    private ConfigReader config;

    private void initPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (location == null) {
            location = new LocationsCopyProperties(HookClass.driver);
        }
    }


    @Given("I am on the Location Copy Properties page")
    public void i_am_on_the_location_copy_properties_page() {

        initPage();

        location.clickAdmin();
        location.clickTools();
        location.clickLocationTool();
        location.clickCopy();
    }


    @When("I select the source location")
    public void i_select_the_source_location() {

        initPage();

        location.selectLocation(
                config.getLocation()
        );
    }


    @And("I enable the Target option")
    public void i_enable_the_target_option() {

        initPage();

        location.enableTarget();
    }


    @And("I enable the Parent Location option")
    public void i_enable_the_parent_location_option() {

        initPage();

        location.enableParentLocation();
    }


    @And("I enable the Time Zone option")
    public void i_enable_the_time_zone_option() {

        initPage();

        location.enableTimeZone();
    }


    @And("I enable the Working Hours option")
    public void i_enable_the_working_hours_option() {

        initPage();

        location.enableWorkingHours();
    }


    @Then("the location properties should be copied")
    public void the_location_properties_should_be_copied() {

        // Add verification here if your application
        // shows a success message after copying.
    }
}