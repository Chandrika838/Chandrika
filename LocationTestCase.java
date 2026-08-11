package com.mypc.automation.admintestcase;

import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.adminpage.LocationPage;
import com.mypc.automation.pages.pages.mypcpage.LoginPage;
import com.mypc.automation.pages.utils.ConfigReader;

public class LocationTestCase extends BaseTest {

    ConfigReader config = new ConfigReader();


    @Test
    public void VerifyAddLocation() {

       
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail(config.getEmail());
        
        loginPage.enterPassword(config.getPassword());
        
        loginPage.clickLogin();

      // Users 
        
        LocationPage locationPage =
                new LocationPage(driver);

        locationPage.clickAdmin();

        locationPage.clickLocation();

        locationPage.clickAddNew();

        locationPage.enterLocationName(
                config.getLocation()
        );


        locationPage.clickAdvancedOptions();

  
        locationPage.selectParentLocation(config.getparentLocation());
    
      // locationPage.enableinheritfromorganisation();
       
       locationPage.selectInheritance(config.gettimeZone());

        
        locationPage.setTime(
                config.getstartTime(),
                config.getstartTime(),
                config.getstartTime()
        );


        locationPage.clickSubmit();
    }
}
