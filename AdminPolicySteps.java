package Stepdefinitation;

import org.testng.Assert;

import adminpage.AdminPolicy;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminPolicySteps {

    private AdminPolicy adminPolicy;
    private ConfigReader config;

    private void initAdminPolicyPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (adminPolicy == null) {
            adminPolicy = new AdminPolicy(HookClass.driver);
        }
    }
    
    @And("I open Admin Policy Rules")
    public void i_open_admin_policy_rules() {

        initAdminPolicyPage();

        adminPolicy.ClickAdminpolicy();
    }

    @And("I click Admin Policy Add New")
    public void i_click_admin_policy_add_new() {

        initAdminPolicyPage();

        adminPolicy.ClickAddnew();
    }

    @And("I select Admin Policy user tag")
    public void i_select_admin_policy_user_tag() {

        initAdminPolicyPage();

        adminPolicy.selectUserTag(config.getUserTag());
    }

    @And("I select Admin Policy resource tag")
    public void i_select_admin_policy_resource_tag() {

        initAdminPolicyPage();

        adminPolicy.SelectAdminPolicy(config.getAdminPolicy());
    }

    @Then("Admin Policy Submit button should be displayed")
    public void admin_policy_submit_button_should_be_displayed() {

        initAdminPolicyPage();

        Assert.assertTrue(
                adminPolicy.isSubmitDisplayed(),
                "Submit button is not displayed"
        );
    }

    @When("I click Admin Policy Submit button")
    public void i_click_admin_policy_submit_button() {

        initAdminPolicyPage();

        adminPolicy.ClickSubmit();
    }
}