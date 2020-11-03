package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base2;
import com.pom.prac.pages.CalenderUIPage2;

public class CalenderUITest2 {
	
	@Test
	public void testSelectingSpecificDate() {
		WebDriver driver = Base2.setupDriver(9);
		CalenderUIPage2 calenderUIPage2 = new CalenderUIPage2(driver);
		calenderUIPage2.clickingTravelDateField();
		calenderUIPage2.selectAnSpecificDate();
	}
	
	@Test
	public void testSelectingSpecificMonthAndDay() {
		WebDriver driver = Base2.setupDriver(9);
		CalenderUIPage2 calenderUIPage2 = new CalenderUIPage2(driver);
		calenderUIPage2.clickingTravelDateField();
		calenderUIPage2.movingToSpecificMonthInFuture();
		calenderUIPage2.selectAnSpecificDate();
	}

}
