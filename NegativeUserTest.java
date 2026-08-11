package com.mypc.automation.admintestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.adminpage.UserPage;
import com.mypc.automation.pages.pages.mypcpage.BasePage;
import com.mypc.automation.pages.pages.mypcpage.LoginPage;

public class NegativeUserTest extends BaseTest {

	@Test
	
	public void VerifyBlankFirst() {
		
	// creating a constructor 
		
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword(config.getPassword());
	
	loginPage.clickLogin();
	
	
	// constructor for User
	
	UserPage user = new UserPage(driver);
	
	user.clickAdmnMenu();
	
	user.clickUserMenu();
	
	user.clickInviteUsers();
	
	
	user.enterFirstName("  ");
	
	user.enterLastName(config.getLastName());
	
	user.clickSubmit();
		
	
	Assert.assertTrue(user.FirstNameisDisplayedInvalid(), "Invalid message is not displayed ");
	
	}
	
	
	
	@Test
	
	public void VerifyBlankLastName() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterEmail(config.getEmail());
		
		loginPage.enterPassword(config.getPassword());
		
		loginPage.clickLogin();
		

		UserPage user = new UserPage(driver);
		
		user.clickAdmnMenu();
		
		user.clickUserMenu();
		
		user.clickInviteUsers();
		
		user.enterFirstName(config.getFirstName());
		
		user.enterLastName(" "	);
		
		user.clickSubmit();
		
	Assert.assertTrue(user.LastNameisDisplayedInvalid(),"Last Name is not Dispalyed ");
	
	}
	@Test
	
	public void VerifyInvalidCharacter() {
		
		LoginPage loginPage = new LoginPage(driver);
		
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword(config.getPassword());
	
	loginPage.clickLogin();
	
	
	// User constructor 
	
	
	UserPage user = new UserPage(driver);
	
	user.clickAdmnMenu();
	
	user.clickUserMenu();
	
	user.clickInviteUsers();
	
	user.enterFirstName("@#@@");
	
	user.enterLastName(config.getLastName());
	
	user.clickSubmit();
	

	}
}
