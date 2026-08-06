package com.mypc.automation.reports.tests.mypc;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.pages.LoginPage;
import com.mypc.automation.pages.utils.ConfigReader;

public class negativelogintestcase extends BaseTest{



@Test 

public void verifyInvalidLogin() {
	
	LoginPage loginPage = new LoginPage(driver);
	
	// Enter invalid email 
	
	loginPage.enterEmail("Invalid emailid");
	
	loginPage.enterPassword("Wrong123");
	
	// click login 
	
	loginPage.clickLogin();
	
	// verify error message 
	
	Assert.assertTrue(loginPage.isInvalidLoginMessageDisplayed(), "Invalid credentails message ");

}


@Test

public void verifyLoginwithInvalidEmail() {
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail("test@123");
	loginPage.enterPassword(config.getPassword());
	loginPage.clickLogin();
	
	Assert.assertTrue(loginPage.isInvalidLoginMessageDisplayed(),"Invalid Login message is not Displayed");
}

@Test

public void verifyLoginwithInvalidPassword() {
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword("test1233");
	loginPage.clickLogin();
	
	Assert.assertTrue(loginPage.isInvalidPasswordDisplayed(), "Invalid Password is not Displayed");
	
}


@Test

public void verifyLoginBlankEmailID() {
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(" ");
	
	loginPage.enterPassword(config.getPassword());
	
	loginPage.clickLogin();
	
	Assert.assertTrue(loginPage.isBlankEmailDisplayed(), "Blank Email is not Displayed");
}


}
	