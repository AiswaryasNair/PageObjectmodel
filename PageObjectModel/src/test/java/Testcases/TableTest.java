package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.TablePage;

public class TableTest extends BaseClass{
	
	TablePage tablepage;
	
	@Test
	
	public void verifytableheader() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTableLink();
		String actual=tablepage.getTableHeaderText();
		String expected ="Table with Pagination Example";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verifyClassattributeHeader() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTableLink();
		String actualtableheaderclassattribute=tablepage.getheaderattribute();
		String expectedtableattribute="card-header";
		Assert.assertEquals(actualtableheaderclassattribute, expectedtableattribute);
		
	}
	@Test
	public void verifytablepaginationlink() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTableLink();
		String actuallink=tablepage.gettablepaginationlink();
		String expectedlink="https://selenium.qabible.in/table-pagination.php";
		Assert.assertEquals(actuallink, expectedlink);
	}
	@Test
	public void verifytablenames() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTableLink();
		tablepage.pringallnames();
	}
	@Test
	public void verifyofficename() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTableLink();
		System.out.println(tablepage.getOfficeOfPerson("Cedric Kelly"));
		
	}
}
