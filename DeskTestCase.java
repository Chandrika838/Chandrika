package com.mypc.automation.admintestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.adminpage.DeskPage;
import com.mypc.automation.pages.pages.mypcpage.LoginPage;
import com.mypc.automation.pages.utils.ConfigReader;

public class DeskTestCase extends BaseTest {

	ConfigReader config = new ConfigReader();
	
	@Test
	
	public void VerifyAddDeskTestCase() {
		
		
		// creating a constructor for login page 
		

	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword(config.getPassword());
	
	loginPage.clickLogin();
	
	
	// creating a constructor for deskTestcase 
	
	DeskPage desk = new DeskPage(driver);
	
	desk.ClickAdmin();
	
	desk.ClickDesk();
	
	desk.ClickAddNew();
	
	Assert.assertTrue(desk.isDisplayedAddNew(), "AddNew is not displayed");
	
	desk.enterDeskName(config.getDeskName());
	
	desk.selectLocation(config.getLocation());
	
	Assert.assertTrue(desk.isDisplayedLocation(), " Location is not displayed");
	
	
	desk.enterDefaultDuration(config.getDuration());
	
	
	desk.ClickAdvanceOption2();
	
	desk.selectPrepartion(config.getPrepration());
	
	
	desk.enableCheckInRequired();
	
	Assert.assertTrue(desk.isSelectedCheckbox(), "Checkbox is not Selected");

	
	desk.ClickAdd();
	
	Assert.assertTrue(desk.isAddDisplayed(), "Add is not displayed ");
	
	desk.Clickddmutiple();
	
	desk.enterstarindex(config.getstarttime());
	
	desk.enterendindex(config.getendtime());

   desk.enterSuffixPattern(config.getsuffprefix());
   
   desk.clickAdneww();
	}
	
}
