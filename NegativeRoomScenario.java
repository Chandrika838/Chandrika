package com.mypc.automation.admintestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypc.automation.base.BaseTest;
import com.mypc.automation.pages.adminpage.RoomPage;
import com.mypc.automation.pages.pages.mypcpage.LoginPage;

public class NegativeRoomScenario  extends BaseTest{

	
@Test
public void VerifyBlankRoom() {
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword(config.getPassword());
	
	
	loginPage.clickLogin();
	
	// Room 
	
	RoomPage room = new RoomPage(driver);
	
	room.ClickAdmin();
	
	room.ClickRoom();
	
	room.ClickAddNew();
	
	// Mandatory field left blank 
	
	
	room.enterRoomName("");
	
	room.selectLocation(config.getLocation());
	
	room.enterDefaultDUration(config.getDuration());
	
	room.enterCapacityvalue("null");
	
	
	room.ClickAdvanceOption1();
	
	room.checkRoomCamera();
	
	room.checkRoomMonitor();
	
	room.checkRoomProjector();
	
	room.clickSubmit();
	
	
	String actualMessage = room.getInvalidMessage();

	System.out.println("Actual Message: " + actualMessage);

	Assert.assertEquals(
	        actualMessage,
	        "Invalid entry!",
	        "Validation message is incorrect."
	);

}




@Test


public void verifyRoomInvalidCerdentials() {
	
	
	// login usersa 
	
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	
	loginPage.enterPassword(config.getPassword());
	
	
	loginPage.clickLogin();
	
	
	// room usera 
	
	
	RoomPage room = new RoomPage(driver);
	
	room.ClickAdmin();
	
	room.ClickRoom();
	
	room.ClickAddNew();
	
	room.enterRoomName(config.getRoomName());
	
	room.selectLocation(config.getLocation());
	
	room.enterDefaultDUration(config.getDuration());
	
	room.enterCapacityvalue("-10");
	
	room.ClickAdvanceOption1();
	
	room.checkRoomCamera();
	
	room.checkRoomMonitor();
	
	room.checkRoomProjector();
	
	room.selectPrepartion(config.getPrepration());
	
	room.selectCheckBox();
	
	room.clickSubmit();
	
	
	String actualMessage = room.getInvalidMessage();
	
	
	System.out.println("Actual Message: " + actualMessage);

	Assert.assertEquals(
	        actualMessage,
	        "Invalid entry!",
	        "Validation message is incorrect."
	);

}


@Test

public void VerifyInvalidDuration() {
	
	
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.enterEmail(config.getEmail());
	
	loginPage.enterPassword(config.getPassword());
	
	loginPage.clickLogin();
	
	// room users a
	
	
	RoomPage room = new RoomPage(driver);
	
	room.ClickAdmin();
	
	room.ClickRoom();
	
	room.ClickAddNew();
	
	room.enterRoomName(config.getRoomName());
	
	room.selectLocation(config.getLocation());
	
	room.enterDefaultDUration("-25");
	
	room.enterCapacityvalue(config.getCapacity());
	
	room.ClickAdvanceOption1();
	
	room.checkRoomCamera();
	
	room.checkRoomMonitor();
	
	room.checkRoomProjector();
	
	room.clickSubmit();
	
	
}

}
