package com.mypc.automation.pages.adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.mypc.automation.pages.pages.mypcpage.BasePage;

public class DeskPage extends BasePage {

	public DeskPage (WebDriver driver) {
		super(driver);
		
		
	}


// locators 

private By admin = 
        By.xpath("//span[contains(text(),'Admin')]");

private By desk = 
        By.xpath("//span[normalize-space()='Desks']");

private By addnew = 
        By.xpath("//span[normalize-space()='Add New']");

private By deskname = 
        By.xpath("//input[@type='text']");

private By location = 
        By.id("locationId");

private By duration = 
        By.id("defaultDuration");

private By advanceoptions = 
        By.xpath("//button[normalize-space()='advanced options']");

private By prepartion = 
        By.id("preparationTime");

private By checkbox = 
        By.id("checkInRequired_");
	
// Add Button 

private By add = 
        By.xpath("//span[normalize-space()='Add']");


// Add Multiple button 

private By AddMultiple=
        By.xpath("//span[normalize-space()='Add Multiple']");


// Add Multiple fields 

private By StarIndex= 
        By.xpath("//input[@formcontrolname='startIndex']");


private By EndIndex= 
        By.xpath("//input[@formcontrolname='endIndex']");


private By suffixPattern =
        By.xpath("//input[@formcontrolname='suffixPattern']");

private By validationMessage =
       By.xpath("//p[contains(@class,'message-dialog') and normalize-space()='Invalid entry!']");


private By addNew =
        By.xpath("//button[@class='btn-dialog btn btn-default btn-form btn-main']");

// Methods 


public void ClickAdmin() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
		
}

public void ClickDesk() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(desk)).click();
	 
	
}
	
public void ClickAddNew() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(addnew)).click();
}
	

public boolean isDisplayedAddNew() {
	
	return isDisplayed(addnew);
}


public void enterDeskName(String deskName) {
	

    wait.until(ExpectedConditions.visibilityOfElementLocated(deskname))
        .sendKeys(deskName);
}

public void selectLocation(String value){

	Select select = new Select(getElement(location));
	select.selectByVisibleText(value);
	
	
}


public boolean isDisplayedLocation() {
	
	return isDisplayed(location);
}


public void enterDefaultDuration(String value) {
	
	enterText(duration,value);
	
	
}
	

public void  ClickAdvanceOption2() {
	
	wait.until(ExpectedConditions.elementToBeClickable(advanceoptions)).click();
}
	

public void selectPrepartion(String deskpreptime) {
	
WebElement element = driver.findElement(prepartion);
	Select select = new Select(getElement(prepartion));
	
	select.selectByVisibleText(deskpreptime);
}


public boolean isDisplayedPrepartion() {
	
	return isDisplayed(prepartion);
}


public void enableCheckBox(String id) {
	
	By locator = By.id(id);
	
	if(!getElement(locator).isSelected()) {
		
		click(locator);
	}

	}



public void enableCheckInRequired() {

    enableCheckBox("checkInRequired_");

}

public boolean isSelectedCheckbox() {
	
	return isSelected(checkbox);
}


public void ClickAdd() {

    WebElement addButton = wait.until(
            ExpectedConditions.elementToBeClickable(add)
    );

    addButton.click();



}

public boolean isAddDisplayed() {
	
	return isDisplayed(add);
}



public void Clickddmutiple() {

    WebElement addMultipleButton = wait.until(
            ExpectedConditions.elementToBeClickable(AddMultiple)
    );

    addMultipleButton.click();
}


public void enterstarindex(String value) {
	
	enterText(StarIndex,value);
	
	
}


public void enterendindex(String value) {
	
	enterText(EndIndex,value);
}

	
public void enterSuffixPattern(String suffixPatternValue) {

    WebElement element = wait.until(
            ExpectedConditions.visibilityOfElementLocated(suffixPattern)
    );

    element.clear();
    element.sendKeys(suffixPatternValue);
}

    

// Add Button Inside Popup


public void clickAdneww() {

    WebElement button = wait.until(
            ExpectedConditions.elementToBeClickable(addNew)
    );

    button.click();
}



public String getInvalidMessage() {
	
	 WebElement message = wait.until(
	           ExpectedConditions.visibilityOfElementLocated(validationMessage)
	    );

	    return message.getText().trim();
	}



}



