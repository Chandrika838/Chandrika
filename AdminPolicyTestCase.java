package Admin_Policy_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Admin_Policy_Rules.AdminPolicy;

import POM.BaseTest;
import POM.LoginPage;
import Utilities.ConfigReader;

public class AdminPolicyTestCase extends BaseTest{
	
	ConfigReader config = new ConfigReader();
	
	@ Test
	
	public void verifyAddTestCase() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		
		loginPage.enterEmail(config.getEmail());
		loginPage.enterPassword(config.getPassword());
		
		loginPage.clickLogin();
		
		
		// creating a constructor for Test Case 
		
	AdminPolicy Admin = new  AdminPolicy(driver);
	
	Admin.ClickAdmin();
	
	Admin.clickTools();
	
	Admin.ClickUsersTools();
	
	Admin.ClickAdminpolicy();
	
	Admin.ClickAddnew();
	
	Admin.selectUserTag(config.getUserTag());
	
	Admin.SelectAdminPolicy(config.getAdminPolicy());
	
	//Admin.ClickCancel();
	
	Assert.assertTrue(Admin.isSubmitDisplayed(),"Submit is not displayed");
	Admin.ClickSubmit();
	

	}


}
