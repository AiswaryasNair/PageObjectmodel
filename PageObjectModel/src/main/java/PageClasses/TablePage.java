package PageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.UtilityClass;

public class TablePage {

	WebDriver driver;
	UtilityClass utilityclass=new UtilityClass();
	@FindBy(xpath ="(//a[contains(text(),'Table')])[1]" )
	WebElement tablelink;
	
	@FindBy(xpath ="(//div[@class='card-header'])[2]" )
	WebElement tableheader;
	
	@FindBy(xpath ="//a[text()='Table with Pagination']")
	WebElement tablepaginationlink;
	
	@FindBy(xpath ="//a[@class='nav-link']")
	List<WebElement> listnames;
	
	@FindBy(xpath="//tbody//tr//td[1]")
	List<WebElement> listnameelement;
	
	public TablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//initelements- static and initialize webelement and for all webelements
		
	}
	
	public void clickOnTableLink() {
		tablelink.click();
		
	}
	public String getTableHeaderText() {
		String tableheadertext=tableheader.getText();
		return tableheadertext;
	}
	public String getheaderattribute() {
		return utilityclass.get_attribute(tableheader, "class");
	}
	public String gettablepaginationlink() {
		return utilityclass.get_attribute(tablepaginationlink, "href");
	}
	public void pringallnames() {
		List<String> namesData = new ArrayList<String>();
		namesData=utilityclass.gettextofeleemnts(listnames);
		System.out.println(namesData);
	}
	//dynamic gettable data
	public String getOfficeOfPerson(String name) {
		int index=0;
		List<String> nameData = new ArrayList<String>();
		nameData=utilityclass.gettextofeleemnts(listnameelement);
		for(index=0;index<listnameelement.size();index++) {
			if(name.equals(listnameelement.get(index))) {
				index++;
				break;
			}
		}
		WebElement offcelement=driver.findElement(By.xpath("//table//tr["+index+"]//td[3]"));
		return offcelement.getText();
	}
}
