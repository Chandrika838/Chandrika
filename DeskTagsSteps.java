package Stepdefinitation;

import org.testng.Assert;

import adminpage.Desk_Tags;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DeskTagsSteps {

	private Desk_Tags desk;
	
	private ConfigReader config;
	
	private void initDeskTagsPage() {
		
		// to check the null is there or not 
		
	if(config == null) {
		
		config = new ConfigReader();
		
	}

	if(desk ==null) {
		
		desk = new Desk_Tags(HookClass.driver);
	}
	
	}
	
@And("I navigate to Desk Tags")

public void i_navigate_to_desk_tags() {
	
	initDeskTagsPage();
	
	desk.ClickDesk();
	desk.ClickTags();
}

@And("I click Add New for Desk Tags")
public void i_click_add_new_for_desk_tags() {
	
	initDeskTagsPage();
	
	desk.ClickAddNew();
		
		
}

@And("I enter desk tag")

public void i_enter_desk_tag() {
	
	initDeskTagsPage();
	
	String tagName = config.getDeskTagName();
	
	desk.enterDeskTags(tagName);

}


@And("I click Add for Desk Tags")

public void i_click_Add_for_Desk_Tags() {
	
	initDeskTagsPage();
	
	desk.clickAdd();
}

@Then("the Desk Tags Submit button should be dispalyed")

public void the_desk_Tags_submit_button_should_be_displayed() {
	
	
	initDeskTagsPage();
	
	Assert.assertTrue(desk.isDisplayedSubmit(),"Submit button is not dispalyed");
}
		
	}

