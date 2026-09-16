package Stepdefinitation;

import org.testng.Assert;

import adminpage.Guestuserpage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuestUserSteps {

    private Guestuserpage guestUserPage;
    private ConfigReader config;

    private void initGuestUserPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (guestUserPage == null) {
            guestUserPage = new Guestuserpage(HookClass.driver);
        }
    }


    @And("I open Guest User Templates")
    public void i_open_guest_user_templates() {

        initGuestUserPage();

        guestUserPage.ClickGuestUsers();
    }

    @And("I click Guest User Add New")
    public void i_click_guest_user_add_new() {

        initGuestUserPage();

        guestUserPage.ClickAddNew();
    }

    @And("I enter guest user name")
    public void i_enter_guest_user_name() {

        initGuestUserPage();

        guestUserPage.enterName(config.getName());
    }

    @And("I enter guest user prefix")
    public void i_enter_guest_user_prefix() {

        initGuestUserPage();

        guestUserPage.enterPrefix(config.getUserprefix());
    }

    @And("I enter guest user number of figures")
    public void i_enter_guest_user_number_of_figures() {

        initGuestUserPage();

        guestUserPage.enterNumberofFigures(
                config.getNumberoffigure()
        );
    }

    @And("I select guest user character")
    public void i_select_guest_user_character() {

        initGuestUserPage();

        guestUserPage.SelectCharacter("alphanumeric");
    }

    @And("I enter guest user length")
    public void i_enter_guest_user_length() {

        initGuestUserPage();

        guestUserPage.enterLength(
                config.getLength()
        );
    }

    @And("I select guest user expiry period")
    public void i_select_guest_user_expiry_period() {

        initGuestUserPage();

        guestUserPage.SelectExpired("hours");
    }

    @And("I enable guest user expiry information")
    public void i_enable_guest_user_expiry_information() {

        initGuestUserPage();

        guestUserPage.ClickCheckbox();
    }

    @Then("guest user expiry information should be selected")
    public void guest_user_expiry_information_should_be_selected() {

        initGuestUserPage();

        Assert.assertTrue(
                guestUserPage.isSelectedChedckbox(),
                "Guest User expiry information checkbox is not selected"
        );
    }

    @And("I select guest user activation")
    public void i_select_guest_user_activation() {

        initGuestUserPage();

        guestUserPage.SelectActivation(
                config.getActivation()
        );
    }

    @Then("Guest User Submit button should be displayed")
    public void guest_user_submit_button_should_be_displayed() {

        initGuestUserPage();

        Assert.assertTrue(
                guestUserPage.isDisplayedSubmit(),
                "Guest User Submit button is not displayed"
        );
    }

    @When("I click Guest User Submit button")
    public void i_click_guest_user_submit_button() {

        initGuestUserPage();

        guestUserPage.ClickSubmit();
    }
}
