package Admin_Policy_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Admin_Policy_Rules.Tags;
import POM.BaseTest;
import POM.LoginPage;
import Utilities.ConfigReader;

public class AutomationTags  extends BaseTest{

	ConfigReader config = new ConfigReader();
	
	@Test
	
	public void verifyAutomationTags() {
		


	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterEmail(config.getEmail());
	        loginPage.enterPassword(config.getPassword());
	        loginPage.clickLogin();

	        Tags tags = new Tags(driver);

	        tags.ClickAdmin();
	        tags.ClickTools();
	        tags.ClickUsersTools();
	        tags.ClickAdminPolicy();

	        tags.ClickAutomation();

	        // General Rules
	        tags.ClickGeneralRules();
	        tags.ClickUserReports();
	        tags.ClickToggle1();
	        
	        Assert.assertTrue(tags.isDisplayedToogle1(),"Toogle 1 is not displayed");

	        tags.ClickRoomReports();
	        tags.ClickToggle2();
	        
	        Assert.assertTrue(tags.isDisplayedToogle2(),"Toogle2 is not displayed");

	        tags.ClickDeskReports();
	        tags.ClickToggle3();
	        
	        Assert.assertTrue(tags.isDisplayedToogle3(),"Toogle3 is not displayed");

	        tags.ClickComputerReports();
	        tags.ClickToggle4();

	        // User Rules
	        tags.ClickUserRules();

	        tags.ClickInviteUsers();

	        tags.ClickImportUsers();

	        tags.ClickCreateUsers();
	        
	       tags.ClickToogle();

	        tags.ClickSuspendUsers();
	        tags.ClickToggle5();

	        tags.ClickUnlockUsers();
	        tags.ClickToggle6();

	        // Room Rules
	        tags.ClickRoomRules();
	        
	        tags.ClickMakeUnavailableRoom();

	        // Desk Rules
	        tags.ClickDeskRules();
	        
	        tags.ClickMakeUnavailableDesk();
	        
	        tags.ClickToggle7();

	        // Computer Rules
	        tags.ClickComputerRules();
	        
	        tags.ClickMakeUnavailableComputer();
	        
	        tags.ClickToggle8();
	        
	        Assert.assertTrue(tags.isDisplayedUpdated(),"Updaete is not Displayed");
	        
	        tags.ClickUpdate();
	    }
	
	}

