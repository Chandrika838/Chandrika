package Stepdefinitation;

import adminpage.LocationPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;

public class LocationSteps {

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

    @And("I open the Location menu")
    public void i_open_the_location_menu() {

        initLocationPage();

        locationPage.ClickLocation();
    }

    @And("I click Location Add New")
    public void i_click_location_add_new() {

        initLocationPage();

        locationPage.ClickAddNew();
    }

    @And("I enter location name")
    public void i_enter_location_name() {

        initLocationPage();

        locationPage.enterLocationName(config.getLocation());
    }

    @And("I open Location Advanced Options")
    public void i_open_location_advanced_options() {

        initLocationPage();

        locationPage.ClickAdvanceOptions();
    }

    @And("I select parent location")
    public void i_select_parent_location() {

        initLocationPage();

        locationPage.SelectParentLocation(config.getparentLocation());
    }

    @And("I enable Location time zone")
    public void i_enable_location_time_zone() {

        initLocationPage();

        locationPage.enableTimeZone();
    }

    @And("I select inheritance from organisation")
    public void i_select_inheritance_from_organisation() {

        initLocationPage();

        locationPage.SelectInheritancefrorganisation(
                config.gettimeZone()
        );
    }

    @And("I open Location working hours")
    public void i_open_location_working_hours() {

        initLocationPage();

        locationPage.clickWorkingHours();
    }

    @And("I set Location working hours")
    public void i_set_location_working_hours() {

        initLocationPage();

        locationPage.setWorkingHours(
                config.getHour(),
                config.getMinute(),
                config.getendHour(),
                config.getendMinute()
        );
    }

    @And("I enable Location non working day")
    public void i_enable_location_non_working_day() {

        initLocationPage();

        locationPage.enableNonWorkingday();
    }

    @And("I click Location Custom Add")
    public void i_click_location_custom_add() {

        initLocationPage();

        locationPage.clickCustomAdd();
    }

    @And("I enter custom name")
    public void i_enter_custom_name() {

        initLocationPage();

        locationPage.enterCustomName(
                config.getCustomName()
        );
    }

    @And("I click Location date from")
    public void i_click_location_date_from() {

        initLocationPage();

        locationPage.clickDateFrom();
    }

    @And("I click Location date to")
    public void i_click_location_date_to() {

        initLocationPage();

        locationPage.clickDateTo();
    }

    @And("I click Location Add button")
    public void i_click_location_add_button() {

        initLocationPage();

        locationPage.ClickAdd();
    }
}