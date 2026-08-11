package com.mypc.automation.pages.adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.mypc.automation.pages.pages.mypcpage.BasePage;

public class LocationPage extends BasePage {

    
    public LocationPage(WebDriver driver) {
        super(driver);
    }


   
    private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By location =
    		By.xpath("//span[normalize-space()='Locations']");

    private By addnew =
            By.xpath("//span[normalize-space()='Add New']");

    private By locationname =
            By.cssSelector("input[formcontrolname='locationName']");

    private By advancedoptions =
            By.xpath("//button[normalize-space()='advanced options']");

   private By parentLocation = By.xpath("//select[@id='parentLocation']");
   
   
    // Inherit Time Zone checkbox
   
   //private By inheritancefromorganisation =
	       // By.cssSelector("input[formcontrolname='inheritTimeZone']");
    // Time Zone dropdown
   
   
   private By editIconsLocations = By.xpath("//select[@class='form-select form-control ng-pristine ng-valid ng-touched']");
   
    // Working hours
    private By workingHours =
            By.id("false");

    // Start/End time fields
    private By workingHoursAm = By.xpath("(//input[@aria-label='Hours'])[1]");
    
	private By workingMinutesAm = By.xpath("(//input[@aria-label='Minutes'])[1]");
	
	private By workingHoursPm = By.xpath("(//input[@aria-label='Hours'])[2]");
	
	private By workingMinutesPm = By.xpath("(//input[@aria-label='Minutes'])[2]");
	
    private By submit =
            By.xpath("//button[@type='submit']");


    // ==========================================
    // ADMIN
    // ==========================================

    public void clickAdmin() {

        wait.until(
                ExpectedConditions.elementToBeClickable(admin)
        ).click();
    }


    public boolean isAdminDisplayed() {

        return isDisplayed(admin);
    }


  
    public void clickLocation() {

        wait.until(
                ExpectedConditions.elementToBeClickable(location)
        ).click();
    }


    public boolean isLocationDisplayed() {

        return isDisplayed(location);
    }



    public void clickAddNew() {

        wait.until(
                ExpectedConditions.elementToBeClickable(addnew)
        ).click();
    }


  
    public void enterLocationName(String name) {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locationname)
        );

        element.clear();
        element.sendKeys(name);
    }


    public void clickAdvancedOptions() {

        wait.until(
                ExpectedConditions.elementToBeClickable(advancedoptions)
        ).click();
    }


   
    public void selectParentLocation(String value) {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(parentLocation)
        );

        Select select = new Select(element);

        select.selectByVisibleText(value);
    }


    // INHERIT FROM ORGANIZATION CHECKBOX


   // public void enableinheritfromorganisation() {

     //   WebElement inherit = wait.until(
               // ExpectedConditions.elementToBeClickable(inheritancefromorganisation)
        //);

       // if (!inherit.isSelected()) {
            //inherit.click();
        //}
  //  }
  
//
    public void selectInheritance(String value) {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(editIconsLocations)
        );

        Select select = new Select(element);

        select.selectByVisibleText(value);
    }
    
    
    


    // ==========================================
    // SET TIME
    // ==========================================

    public void setTime(
            String hour,
            String minute,
            String period) {

        // Hour

        WebElement hourField = wait.until(
                ExpectedConditions.elementToBeClickable(workingHoursAm)
        );

        hourField.click();
        hourField.clear();
        hourField.sendKeys(hour);


        // Minute

        WebElement minuteField = wait.until(
                ExpectedConditions.elementToBeClickable(workingMinutesAm)
        );

        minuteField.click();
        minuteField.clear();
        minuteField.sendKeys(minute);


        // AM / PM

        if (period.equalsIgnoreCase("AM")) {

            wait.until(
                    ExpectedConditions.elementToBeClickable(workingHoursPm)
            ).click();

        } else if (period.equalsIgnoreCase("PM")) {

            wait.until(
                    ExpectedConditions.elementToBeClickable(workingMinutesPm)
            ).click();

        } else {

            throw new IllegalArgumentException(
                    "Invalid period: " + period +
                    ". Please use AM or PM."
            );
        }
    }


    // ==========================================
    // SUBMIT
    // ==========================================

    public void clickSubmit() {

        wait.until(
                ExpectedConditions.elementToBeClickable(submit)
        ).click();
    }
}
