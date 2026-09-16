package Stepdefinitation;

import adminpage.UserCopyProperties;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;

public class UserCopyPropertiesSteps {

    private UserCopyProperties users;
    private ConfigReader config;

    private void initUserCopyPropertiesPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (users == null) {
            users = new UserCopyProperties(HookClass.driver);
        }
    }


    @And("I open Tools")
    public void i_open_tools() {

        initUserCopyPropertiesPage();

        users.clickTools();
    }


    @And("I open Users from Tools")
    public void i_open_users_from_tools() {

        initUserCopyPropertiesPage();

        users.clickUsers();
    }


    @And("I click Copy Properties")
    public void i_click_copy_properties() {

        initUserCopyPropertiesPage();

        users.clickCopyProperties();
    }


    @And("I enter source user")
    public void i_enter_source_user() {

        initUserCopyPropertiesPage();

        users.enterSource(config.getsourceuser());
    }


    @And("I enable user copy property checkboxes")
    public void i_enable_user_copy_property_checkboxes() {

        initUserCopyPropertiesPage();

        users.enableTags();
        users.enableTags1();
        users.enableTags2();
        users.enableTags3();
        users.enableUserRole();
        users.enableTagsSetting();
        users.enableReplace();
    }


    @And("I click Copy button")
    public void i_click_copy_button() {

        initUserCopyPropertiesPage();

        users.clickCopy();
    }
}