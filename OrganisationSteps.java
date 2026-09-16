
package Stepdefinitation;

import org.testng.Assert;

import adminpage.OrganisationPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrganisationSteps {

    private OrganisationPage organisationPage;
    private ConfigReader config;


    // =====================================================
    // Initialize Organisation Page
    // =====================================================

    private void initOrganisationPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (organisationPage == null) {
            organisationPage = new OrganisationPage(HookClass.driver);
        }
    }


    // =====================================================
    // Open Application
    // =====================================================

   


    // =====================================================
    // Open Admin Menu
    // =====================================================

    @When("I open the Admin menu")
    public void i_open_the_admin_menu() {

        initOrganisationPage();

        organisationPage.clickAdminMenu();
    }


    // =====================================================
    // Open Organisation
    // =====================================================

    @And("I open the Organisation page")
    public void i_open_the_organisation_page() {

        initOrganisationPage();

        organisationPage.clickOrganisation();
    }


    // =====================================================
    // Select Time Zone
    // =====================================================

    @And("I select the Organisation time zone")
    public void i_select_the_organisation_time_zone() {

        initOrganisationPage();

        organisationPage.selectTimeZone(
                config.gettimeZone()
        );
    }


    // =====================================================
    // Verify Time Zone
    // =====================================================

    @Then("Organisation time zone should be displayed")
    public void organisation_time_zone_should_be_displayed() {

        initOrganisationPage();

        Assert.assertTrue(
                organisationPage.isTimeZoneDisplayed(),
                "Organisation Time Zone is not displayed"
        );
    }


    // =====================================================
    // Open Advanced Options
    // =====================================================

    @When("I open Organisation Advanced Options")
    public void i_open_organisation_advanced_options() {

        initOrganisationPage();

        organisationPage.clickAdvancedOption();
    }


    // =====================================================
    // Authentication Options
    // =====================================================

    @And  ("I enable Organisation authentication options")    
    public void i_enable_organisation_authentication_options() {
    
   
    String[] checkBoxIds = {
  
    "allowAuthRezzervi",
    
    "allowAuthGoogle",
    
    "allowAuthMicrosoft",
    
    "allowAuthEntraID"
    
    };
    
    for (String id : checkBoxIds) {
    
    organisationPage.enableCheckBox(id);
   
    }
   
    }
    
  
    @And("I enable Organisation tooltip Options")
    
    public void i_enable_organisation_tooltip_options() {
    
    	 initOrganisationPage();
    organisationPage.enableCheckBox("showBookingTooltipForOthers");
   
    organisationPage.enableCheckBox("showUsername");
   
    }
   
   
    @And("I enable Organisation resource options")
    
    public void i_enable_organisation_resource_options() {
    
    	 initOrganisationPage();
   
    String[] resources = {
   
    "showRoom",
   
    "showDesk",
    
    "showPc"
    
    };
   
    for (String id : resources) {
    
    organisationPage.enableCheckBox(id);
  
    }
   
    }
    
  
    @Then("Organisation Submit button should be displayed")
   
    public void organisation_submit_button_should_be_displayed() {
 
    	 initOrganisationPage();
    Assert.assertTrue(
  
    organisationPage.isDisplayedSubmit(),
   
    "Submit button is not displayed");
   
    }
    
    @When("I click the Organisation Submit button")
    
    public void i_click_the_organisation_submit_button() {
    
    	 initOrganisationPage();
    	 
    organisationPage.clickSubmit();
   
    }
    
    }