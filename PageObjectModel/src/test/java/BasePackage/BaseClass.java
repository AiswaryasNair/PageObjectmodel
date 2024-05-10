package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void launchbrowzer() {
		WebDriverManager.chromedriver().setup();// equalent to system.setproperty
		driver = new ChromeDriver();

		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}
	
}
