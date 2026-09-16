package Stepdefinitation;

import adminpage.ComputerPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;

public class ComputerSteps {

    private ComputerPage computerPage;
    private ConfigReader config;

    private void initComputerPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (computerPage == null) {
            computerPage = new ComputerPage(HookClass.driver);
        }
    }

    @And("I open the Computers menu")
    public void i_open_the_computers_menu() {

        initComputerPage();

        computerPage.ClickComputers();
    }

    @And("I click Computer Add New")
    public void i_click_computer_add_new() {

        initComputerPage();

        computerPage.ClickAddNew();
    }

    @And("I enter computer name")
    public void i_enter_computer_name() {

        initComputerPage();

        computerPage.enterComputerName(config.getComputerName());
    }

    @And("I enter computer ID")
    public void i_enter_computer_id() {

        initComputerPage();

        computerPage.enterComputerID(config.getComputerID());
    }

    @And("I select computer location")
    public void i_select_computer_location() {

        initComputerPage();

        computerPage.selectLocation(config.getLocation());
    }

    @And("I open Computer Advanced Options")
    public void i_open_computer_advanced_options() {

        initComputerPage();

        computerPage.ClickAdvancedOption();
    }

    @And("I enter No Show Wait Time")
    public void i_enter_no_show_wait_time() {

        initComputerPage();

        computerPage.enterNoShowWaitTime(config.getnoshowwaitTime());
    }

    @And("I enter Level 1 Warning")
    public void i_enter_level_1_warning() {

        initComputerPage();

        computerPage.enterLevel1Warning(config.getLevelWarnining());
    }

    @And("I enter Level 2 Warning")
    public void i_enter_level_2_warning() {

        initComputerPage();

        computerPage.enterLevel2Warning(config.getLevelWarning2());
    }

    @And("I enter Level 3 Warning")
    public void i_enter_level_3_warning() {

        initComputerPage();

        computerPage.enterLevel3Warning(config.getLevelLevelWarning3());
    }

    @And("I select Computer Logging Level")
    public void i_select_computer_logging_level() {

        initComputerPage();

        computerPage.clickLoggingLevel();
    }

    @And("I enable Computer Welcome Message")
    public void i_enable_computer_welcome_message() {

        initComputerPage();

        computerPage.enableShowWelcomeMessage();
    }

    @And("I enable Computer AUP Message")
    public void i_enable_computer_aup_message() {

        initComputerPage();

        computerPage.enableShowAUPMessage();
    }

    @And("I enter Computer Inactivity Timeout")
    public void i_enter_computer_inactivity_timeout() {

        initComputerPage();

        computerPage.enterInactivityTimeout(config.getInactivityTimeout());
    }

    @And("I enter Computer Lock Timeout")
    public void i_enter_computer_lock_timeout() {

        initComputerPage();

        computerPage.enterLockTimeout(config.getLockTime());
    }

    @And("I enable Computer Auto Reboot")
    public void i_enable_computer_auto_reboot() {

        initComputerPage();

        computerPage.ClickAutoReboot();
    }

    @And("I enable Computer Auto Shutdown")
    public void i_enable_computer_auto_shutdown() {

        initComputerPage();

        computerPage.ClickAutoShutdown();
    }

    @And("I open Computer Tags and Booking Rules")
    public void i_open_computer_tags_and_booking_rules() {

        initComputerPage();

        computerPage.clickTagsandBooking();
    }

    @And("I click Computer Tags Add")
    public void i_click_computer_tags_add() {

        initComputerPage();

        computerPage.clickTagsAdd();
    }

    @And("I select Computer tag")
    public void i_select_computer_tag() {

        initComputerPage();

        computerPage.selectTags(config.getComputerTags());
    }

    @And("I click Computer Add button")
    public void i_click_computer_add_button() {

        initComputerPage();

        computerPage.clickAdd();
    }
}
