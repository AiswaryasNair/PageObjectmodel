package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataPickersPage {

	WebDriver driver;
	@FindBy(xpath = "(//a[@class='nav-link'])[3]")
	WebElement datepickertab;
	@FindBy(xpath = "//input[@id='single-input-field']")
	WebElement datepickerfield;

	@FindBy(xpath = "//table[@class='table-condensed']//thead//tr[2]//th[1]")
	WebElement prev;

	@FindBy(xpath = "(//th[@class='next'])[1]")
	WebElement next;

	@FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
	WebElement middle;

	@FindBy(xpath = "//tbody//td[text()='3' and @class='active day']")
	WebElement date;

	public DataPickersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// initelements- static and initialize webelement and for all webelements

	}

	public void clickOnDataPickers() {
		datepickertab.click();

	}

	public void clickDatePickerField() {
		datepickerfield.click();
	}

	public void choosedate() {
		String date = "11-02-2028";
		String split[] = date.split("-");
		String year = split[2];
		String day = split[0];
		String monthIndex = split[1];
		int monthNumber = Integer.parseInt(monthIndex);
		int yearNumber = Integer.parseInt(year);
		String month = "";
		switch (monthNumber) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
		}
		String month_year = month + " " + year;
		while (true) {
			// String currentmonth_year = middleelemenet.getText();
			String currentmonth_year =middle.getText();
			//System.out.println(currentmonth_year);
			if (month_year.equals(currentmonth_year)) {
				break;
			} else if (yearNumber> 2024 || yearNumber==2024 && monthNumber > 5) {
				next.click();
			} else {
				prev.click();		
			}			
		}
		
		WebElement caldayelement = driver
				.findElement(By.xpath("//tbody//td[text()='" + day.replace("0", "") + "' and @class='day']"));
		caldayelement.click();
		driver.quit();
	}

	public void chooseDateUsingSendkeys() {
		datepickerfield.sendKeys("05/02/2024");
	}

}
