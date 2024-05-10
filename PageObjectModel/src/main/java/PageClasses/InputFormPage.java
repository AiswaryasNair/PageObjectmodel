package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	
	WebDriver driver;
	By inputform = By.xpath("//a[contains(text(),'Input Form')]");
	By showMsgBtnLabel = By.xpath("//button[@id='button-one']");
	By singleinputtext = By.xpath("(//div[@class='card-header'])[2]");
	By showmsgenabled = By.xpath("//button[@id='button-one']");

	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnInputForm() {

		WebElement inputFormtab = driver.findElement(inputform);
		inputFormtab.click();

	}

	public String getShowMsgButtonlabel() {
		WebElement showmsgbtn = driver.findElement(showMsgBtnLabel);

		return showmsgbtn.getText();
	}

	public String getTextSingleInputField() {
		WebElement singleinputfieldtext = driver.findElement(singleinputtext);
		String text = singleinputfieldtext.getText();
		return text;
	}

	public boolean isEnabledshowMsgBtn() {
		WebElement singleinputfieldtext = driver.findElement(showmsgenabled);
		return singleinputfieldtext.isEnabled();

	}

	public String getbgColor() {
		WebElement singleinputfieldtext = driver.findElement(showmsgenabled);
		String color = singleinputfieldtext.getCssValue("background-color");
		return color;
	}
}
