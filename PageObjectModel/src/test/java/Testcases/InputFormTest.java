package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.HomePage;
import PageClasses.InputFormPage;

public class InputFormTest extends BaseClass{

	InputFormPage inputFormPage;
	
	@Test
	public void verifyShowMsgtext() {
		inputFormPage=new InputFormPage(driver);
		inputFormPage.clickOnInputForm();
		String expected ="Show Message";
		String actual=inputFormPage.getShowMsgButtonlabel();		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void verifysingleinputtext() {
		inputFormPage=new InputFormPage(driver);
		inputFormPage.clickOnInputForm();
		String expected ="Single Input Field";
		String actual=inputFormPage.getTextSingleInputField();	
		Assert.assertEquals(expected, actual);
		
		
		boolean btnisenabled=inputFormPage.isEnabledshowMsgBtn();
		Assert.assertTrue(btnisenabled);
		
		String actualcolor=inputFormPage.getbgColor();
		String expectedcolor="rgba(0, 123, 255, 1)";
		Assert.assertEquals(actualcolor, expectedcolor);
		driver.quit();
	}
	
	
}
