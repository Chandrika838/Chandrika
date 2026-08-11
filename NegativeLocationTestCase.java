package com.mypc.automation.admintestcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.pages.mypcpage.LoginPage;
import com.mypc.automation.pages.adminpage.LocationPage;


public class NegativeLocationTestCase extends BaseTest {

	
@Test 

public void VerifyBlankLocation() {
	
	// creating a login constructor 
	
	
LoginPage loginPage = new LoginPage(driver);

loginPage.enterEmail(config.getEmail());

loginPage.enterPassword(config.getPassword());

loginPage.clickLogin();
	
 
// creating a location constructor 


Location loc = new Location(driver);

loc.clickAdmin();

// Verify and click Location
Assert.assertTrue(loc.isLocationDisplayed(),
        "Location is not displayed");


loc.clickLocation();

loc.clickAddNew();

loc.enterLocatioName("  ");

loc.clickAdvancedOptions();

loc.selectParentLocation(config.getparentLocation());


loc.ClickSubmit();

Assert.assertEquals(loc.getValidationMessage(),"valid Message ");

}

@ Test 

public void VerifyInvalidCharacter() {
	
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword(config.getPassword());
	
	loginPage.clickLogin();
	
	
	
	// location 
	

	Location loc = new Location(driver);
	
	loc.clickAdmin();
	
	loc.clickLocation();
	
	loc.clickAddNew();
	
	loc.enterLocatioName("@@###");
	
	loc.clickAdvancedOptions();

	loc.selectParentLocation(config.getparentLocation());
	
	loc.ClickSubmit();
	
	Assert.assertEquals(loc.getErrorMessage(), "Invalid Message!","Error Message ");
}

}