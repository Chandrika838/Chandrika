package Stepdefinitation;

import adminpage.Room_BookingPage;
import hookclass.HookClass;

import io.cucumber.java.en.And;

public class RoomBookingRulesSteps {

    private Room_BookingPage bookingPage;

    // Initialize page object
    private void initBookingPage() {

        if (bookingPage == null) {
            bookingPage = new Room_BookingPage(HookClass.driver);
        }
    }


    @And("I navigate to Room Booking Rules")
    public void i_navigate_to_room_booking_rules() {

        initBookingPage();

        bookingPage.clickAdmin();
        bookingPage.clickTools();
        bookingPage.clickRooms();
        bookingPage.clickBookingRules();
    }


    @And("I click Add New for Room Booking")
    public void i_click_add_new_for_room_booking() {

        initBookingPage();

        bookingPage.clickAddNew();
    }


    @And("I select booking user tag {string}")
    public void i_select_booking_user_tag(String userTagName) {

        initBookingPage();

        bookingPage.selectUserTag(userTagName);
    }


    @And("I select booking room tag {string}")
    public void i_select_booking_room_tag(String roomTagName) {

        initBookingPage();

        bookingPage.selectRoomTag(roomTagName);
    }


    @And("I continue with the room booking rule")
    public void i_continue_with_the_room_booking_rule() {

        initBookingPage();

        bookingPage.clickContinue();
    }
}
