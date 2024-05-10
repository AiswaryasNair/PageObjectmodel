package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	By logo=By.xpath("(//img[@alt='logo'])[1]");
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void printTitle() {

		System.out.println(driver.getTitle());
		
	}

	public boolean islogoDisplyed() {
		
		WebElement logopath=driver.findElement(logo);
		return logopath.isDisplayed();
	}
}
