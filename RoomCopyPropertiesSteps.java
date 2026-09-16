package Stepdefinitation;

import adminpage.RoomCopyProperites;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class RoomCopyPropertiesSteps {

    private RoomCopyProperites copy;
    private ConfigReader config;

    private void initPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (copy == null) {
            copy = new RoomCopyProperites(HookClass.driver);
        }
    }

    @When("I navigate to Room Copy Properties")
    public void i_navigate_to_room_copy_properties() {

        initPage();

       
        copy.ClickRooms();
        copy.ClickCopyProperties();
    }

    @And("I select the source room")
    public void i_select_the_source_room() {

        initPage();

        copy.SelectSource(config.getTags());
    }

    @And("I select the location")
    public void i_select_the_location() {

        initPage();

        copy.SelectLocation(config.getLocations());
    }

    @And("I enable the Room option")
    public void i_enable_the_room_option() {

        initPage();

        copy.enableRoom();
    }

    @And("I enable the Test option")
    public void i_enable_the_test_option() {

        initPage();

        copy.enableTest();
    }

    @And("I enable the Setting option")
    public void i_enable_the_setting_option() {

        initPage();

        copy.enableSetting();
    }

    @And("I enable the Default option")
    public void i_enable_the_default_option() {

        initPage();

        copy.enableDefault();
    }

    @And("I enable the Capacity option")
    public void i_enable_the_capacity_option() {

        initPage();

        copy.enableCapacity();
    }

    @And("I enable the Equipment option")
    public void i_enable_the_equipment_option() {

        initPage();

        copy.enableEquipment();
    }

    @And("I enable the Preparation Time option")
    public void i_enable_the_preparation_time_option() {

        initPage();

        copy.enablePrepartionTime();
    }

    @And("I enable the Check-in Setting option")
    public void i_enable_the_check_in_setting_option() {

        initPage();

        copy.enableCheckinSetting();
    }

    @And("I enable the Check-in Tags option")
    public void i_enable_the_check_in_tags_option() {

        initPage();

        copy.enableCheckinTags1();
    }

    @When("I click the Copy button")
    public void i_click_the_copy_button() {

        initPage();

        copy.ClickCopy();
    }
}