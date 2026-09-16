package Stepdefinitation;

import org.testng.Assert;

import adminpage.ComputerPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidComputerSteps {

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

    @And("I enter blank computer name")
    public void i_enter_blank_computer_name() {

        initComputerPage();

        computerPage.enterComputerName("");
    }

    @And("I enter blank computer ID")
    public void i_enter_blank_computer_id() {

        initComputerPage();

        computerPage.enterComputerID("");
    }

    @And("I enter blank Level 1 Warning")
    public void i_enter_blank_level_1_warning() {

        initComputerPage();

        computerPage.enterLevel1Warning("");
    }

    @And("I enter Level 2 Warning as invalid character")
    public void i_enter_level_2_warning_as_invalid_character() {

        initComputerPage();

        computerPage.enterLevel2Warning("@");
    }

    @And("I enter blank Level 2 Warning")
    public void i_enter_blank_level_2_warning() {

        initComputerPage();

        computerPage.enterLevel2Warning("");
    }

    @And("I enter blank Level 3 Warning")
    public void i_enter_blank_level_3_warning() {

        initComputerPage();

        computerPage.enterLevel3Warning("");
    }

    @And("I enter blank Computer Inactivity Timeout")
    public void i_enter_blank_computer_inactivity_timeout() {

        initComputerPage();

        computerPage.enterInactivityTimeout("");
    }

    @And("I enter blank Computer Lock Timeout")
    public void i_enter_blank_computer_lock_timeout() {

        initComputerPage();

        computerPage.enterLockTimeout("");
    }

    @Then("Invalid Computer entry message should be displayed")
    public void invalid_computer_entry_message_should_be_displayed() {

        initComputerPage();

        String actualMessage = computerPage.getInvalidEntry();

        System.out.println("Actual Message: " + actualMessage);

        Assert.assertEquals(
                actualMessage,
                "Invalid entry!",
                "validation Message is incorrect."
        );
    }
}