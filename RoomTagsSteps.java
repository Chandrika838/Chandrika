package Stepdefinitation;

import adminpage.RoomTags;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RoomTagsSteps {

private RoomTags roomTags;
private ConfigReader config;

// Initialize RoomTags page only when needed
private void initRoomTagsPage() {

    if (config == null) {
        config = new ConfigReader();
    }

    if (roomTags == null) {
        roomTags = new RoomTags(HookClass.driver);
    }
}


@And("I click Room Tools")
public void i_click_room_tools() {

    initRoomTagsPage();

    roomTags.ClickRoom();
}


@And("I click Tags")
public void i_click_tags() {

    initRoomTagsPage();

    roomTags.ClickTags();
}


@And("I click RoomTags Add New")
public void i_click_add_RoomTags_add_new() {

    initRoomTagsPage();

    roomTags.ClickAddNew();
}


@And("I enter the room tag name")
public void i_enter_the_room_tag_name() {

    initRoomTagsPage();

    String tagName = config.getRoomTags();

    System.out.println("Room Tag Name = " + tagName);

    roomTags.enterRoomTags(tagName);
}


@And("I click Add")
public void i_click_add() {

    initRoomTagsPage();

    roomTags.clickAdd();
}


@Then("the room tag should be created")
public void the_room_tag_should_be_created() {

    initRoomTagsPage();

    System.out.println("Room tag creation completed.");
}


}
