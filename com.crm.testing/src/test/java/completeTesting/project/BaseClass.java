package completeTesting.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver= new ChromeDriver();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
