package com.pom.prac.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class CalenderUIPage2 {

	WebDriver driver;

	public CalenderUIPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "travel_date")
	WebElement travelDate;

	@FindBy(className = "day")
	List<WebElement> days;

	@FindBy(css = "div[class='datepicker-days'] th[class='datepicker-switch']")
	WebElement nextPicker;

	@FindBy(css = "div[class='datepicker-days'] th[class='next']")
	WebElement nextPickerButton;

	public void clickingTravelDateField() {
		Utilities.waitForClick(travelDate);
		travelDate.click();
	}

	public void selectAnSpecificDate() {
		Utilities.waitForClick(travelDate);
		travelDate.click();
		for (WebElement day : days) {
			if (day.getText().equalsIgnoreCase("23")) {
				day.click();
				break;
			}
		}
	}

	public void movingToSpecificMonthInFuture() {
		Utilities.waitForVisibilityOf(nextPicker);
		while (!nextPicker.getText().contains("April")) {
			Utilities.waitForClick(nextPickerButton);
			nextPickerButton.click();
		}
	}
}
