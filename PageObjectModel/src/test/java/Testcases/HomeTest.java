package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.HomePage;

public class HomeTest extends BaseClass {
	
	HomePage homepage;
	
	@Test
	public void VerifyHomeLogo(){
		homepage=new HomePage(driver);//driver get value on the runtime
		//System.out.println(driver.getTitle());
		homepage.printTitle();
		homepage.islogoDisplyed();
		Assert.assertTrue(homepage.islogoDisplyed());
	}

}
