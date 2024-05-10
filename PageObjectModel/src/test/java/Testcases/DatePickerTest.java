package Testcases;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.DataPickersPage;

public class DatePickerTest extends BaseClass {

	DataPickersPage datepickerpage;
	
	@Test
	
	public void verifyDateSelection(){
		datepickerpage = new DataPickersPage(driver);
		datepickerpage.clickOnDataPickers();
		datepickerpage.clickDatePickerField();
		datepickerpage.choosedate();
	}
}
