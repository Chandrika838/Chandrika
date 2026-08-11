package com.mypc.automation.admintestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.adminpage.OrganisationPage;
import com.mypc.automation.pages.pages.mypcpage.LoginPage;

public class NegativeOrganisationTestCase extends BaseTest {

    @Test
    public void verifyOrganisationMandatoryValidation() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail(config.getEmail());
        loginPage.enterPassword(config.getPassword());
        
        loginPage.clickLogin();

        // Login
        // Use your existing login method here
        // loginPage.clickLogin();


        // Organisation page
        OrganisationPage organisationPage =
                new OrganisationPage(driver);

        // Open Admin
        organisationPage.clickAdminMenu();

        // Open Organization
        organisationPage.clickOrganisation();
        
        
        organisationPage.SelectLanguage("");
        
        organisationPage.selectTimeZone("");

        // Open Advanced Options if required
        organisationPage.clickAdvancedOption();

        // DON'T enter/select required values

        // Click Submit
        organisationPage.clickSubmit();

        // Get validation message
        
    
        String actualMessage =
                organisationPage.getValidationMessage();

        System.out.println(
                "Actual Message: " + actualMessage
        );

        Assert.assertEquals(
                actualMessage,
                "Invalid entry!",
                "Expected validation message was not displayed."
        );   
        
        
        
    }
    
}
        
        
        
        
        