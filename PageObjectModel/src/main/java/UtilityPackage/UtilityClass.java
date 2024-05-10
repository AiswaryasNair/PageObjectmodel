package UtilityPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class UtilityClass {

	public String get_attribute(WebElement element,String attribute) {
		
		
		return element.getAttribute(attribute);
		
	}
	
	public List<String> gettextofeleemnts(List<WebElement> elements){
		List<String> data=new ArrayList<String>();
		for(WebElement element:elements) {
			data.add(element.getText());
		}
		return data;
	}
}
