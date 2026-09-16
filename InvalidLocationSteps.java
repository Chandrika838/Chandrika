package Stepdefinitation;

import org.testng.Assert;

import adminpage.LocationPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidLocationSteps {

    private LocationPage locationPage;
    private ConfigReader config;

    private void initLocationPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (locationPage == null) {
            locationPage = new LocationPage(HookClass.driver);
        }
    }

    @And("I enter blank location name")
    public void i_enter_blank_location_name() {

        initLocationPage();

        locationPage.enterLocationName("");
    }

    @Then("invalid blank location message should be displayed")
    public void invalid_blank_location_message_should_be_displayed() {

        initLocationPage();

        Assert.assertTrue(
            locationPage.InvalidBlankDisplayed(),
            "Invalid Blank Displayed"
        );
    }
}