package Stepdefinitation;

import org.testng.Assert;

import adminpage.ComputersTags;
import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ComputerTagsStepDefination {

	private LoginPage loginPage;

	private ComputersTags computerTags;
	private ConfigReader config;
	
private void init() {
	
	if(config ==null) {
		config = new ConfigReader();
		
	}
	
if(loginPage == null) {
	
	loginPage = new LoginPage(HookClass.driver);
}

if(computerTags == null) {
	
	computerTags = new ComputersTags(HookClass.driver);
		
}
}

@And("I open Computer Tags")
public void i_open_computer_Tags() {
	init();
	
	computerTags.ClickTags();
}

@And("I click Add New in Computer Tags")
public void i_click_Add_New_in_Computer_Tags() {
	
	init();
	
	computerTags.ClickAddNew();
		
}

@And("I enter the ComputerTags")
public void i_enter_the_computer_tags() {
	
	init();
	
	computerTags.enterComputerTags(config.getComputerTags());
}

@And("I Submit the new Computer tag")

public void i_submit_the_new_Computer_tag() {
	
	init();
	
	computerTags.clickAdd();
}

@Then("I submit the new Computer should be displayed")
public void i_submit_the_new_computer_should_be_displayed() {
	
	init();
	
	Assert.assertTrue(computerTags.isDisplayedSubmit());
}
	
}
