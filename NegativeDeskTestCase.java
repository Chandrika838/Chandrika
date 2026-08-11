package com.mypc.automation.admintestcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.adminpage.DeskPage;

import com.mypc.automation.pages.pages.mypcpage.LoginPage;

public class NegativeDeskTestCase extends BaseTest {

	@Test
	
	public void VerifyBlankName() {
				
        // Login
        LoginPage loginPage = new LoginPage(driver);
	
	   loginPage.enterEmail(config.getEmail());
	   
	   loginPage.enterPassword(config.getPassword());
	   
	   loginPage.clickLogin();
	   
	 
	   // Desk Users 
	   
	   DeskPage desk = new DeskPage(driver);
	   
	   
	   desk.ClickAdmin();
	   
	   desk.ClickDesk();
	   
	   desk.ClickAddNew();
	   
	   desk.enterDeskName("");
	   
	   desk.selectLocation(config.getLocation());
	   
	   desk.ClickAdvanceOption2();
	   
	   desk.enterDefaultDuration(config.getDuration());
	   
	   desk.selectPrepartion(config.getPrepration());
	   
	   desk.enableCheckInRequired();
	   
	   desk.ClickAdd();
	   

	// Validation
       String actualMessage = desk.getInvalidMessage();

       System.out.println("Actual Message: " + actualMessage);

       Assert.assertEquals(
               actualMessage,
               "Invalid entry!",
               "Validation message is incorrect."
       );
   }

	   

@Test 

public void VerfiyInvalidCerdentials() {
	
	// Login Users 
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword(config.getPassword());
	
	loginPage.clickLogin();
	
	
	// Room Users 
	
	DeskPage desk = new DeskPage(driver);
	
	desk.ClickAdmin();
	   
	   desk.ClickDesk();
	   
	   desk.ClickAddNew();
	   
	   desk.enterDeskName("");
	   
	   desk.selectLocation(config.getLocation());
	   
	   desk.ClickAdvanceOption2();
	   
	   desk.enterDefaultDuration("");
	   
	   desk.selectPrepartion(config.getPrepration());
	   
	   desk.enableCheckInRequired();
	   
	   desk.ClickAdd();
	   

	   String actualMessage = desk.getInvalidMessage();

       System.out.println("Actual Message: " + actualMessage);

       Assert.assertEquals(
               actualMessage,
               "Invalid entry!",
               "Validation message is incorrect."
       );
   }
	
	
	
@Test 

public void VerifyPrepartion() {
	
	// Login Users
	
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	
	loginPage.enterPassword(config.getPassword());
	
	
	loginPage.clickLogin();
	
	// Desk Users
	
	
	DeskPage desk = new DeskPage(driver);
	
	desk.ClickAdmin();
	
	desk.ClickDesk();
	
	desk.ClickAddNew();
	
	desk.enterDeskName("");
	   
	   desk.selectLocation(config.getLocation());
	   
	   desk.ClickAdvanceOption2();
	   
	   desk.enterDefaultDuration(config.getDuration());
	   
	   desk.selectPrepartion("-10");
	   
	   desk.enableCheckInRequired();
	   
	   desk.ClickAdd();
	   

	   String actualMessage = desk.getInvalidMessage();

    System.out.println("Actual Message: " + actualMessage);

    Assert.assertEquals(
            actualMessage,
            "Invalid entry!",
            "Validation message is incorrect."
    );
}
	
	
	
}


