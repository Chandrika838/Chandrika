package Stepdefinitation;

import adminpage.DeskCopyProperties;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;

public class DeskCopyPropertiesSteps {

	private DeskCopyProperties desk;
	
	private ConfigReader config;
	
	private void initDeskPage() {
		
		if(config ==null) {
			
			config = new ConfigReader();
				
		}
		
	if(desk ==null) {
		
		desk = new DeskCopyProperties(HookClass.driver);
	}
	}
	
	

    @And("I navigate to Desk Copy Properties")
    public void i_navigate_to_desk_copy_properties() {

        initDeskPage();
        desk.ClickDesk();
        desk.ClickCopyProperties();
    }


    @And("I select the desk copy source")
    public void i_select_the_desk_copy_source() {

        initDeskPage();

        desk.SelectSource(config.getDeskName());
    }


    @And("I select the desk copy location")
    public void i_select_the_desk_copy_location() {

        initDeskPage();

        desk.SelectLocations(config.getLocations());
    }


    @And("I enable desk tags")
    public void i_enable_desk_tags() {

        initDeskPage();

        desk.enableCheckbox();
    }


    @And("I enable desk location setting")
    public void i_enable_desk_location_setting() {

        initDeskPage();

        desk.enableSetting();
    }


    @And("I enable desk default duration")
    public void i_enable_desk_default_duration() {

        initDeskPage();

        desk.enableDefault();
    }


    @And("I enable desk preparation time")
    public void i_enable_desk_preparation_time() {

        initDeskPage();

        desk.enablePrepartionTime();
    }


    @And("I enable desk check in setting")
    public void i_enable_desk_check_in_setting() {

        initDeskPage();

        desk.enableCheckinSetting();
    }


    @And("I enable desk check in tags")
    public void i_enable_desk_check_in_tags() {

        initDeskPage();

        desk.enableCheckinTags1();
    }


    @And("I click the desk Copy button")
    public void i_click_the_desk_copy_button() {

        initDeskPage();

        desk.ClickCopy();
    }
}

