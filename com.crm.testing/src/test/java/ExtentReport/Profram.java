package ExtentReport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Profram {
	@Test
	public void report() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	String screenShot = driver.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter esp=new ExtentSparkReporter("C:\\Users\\Vinay kumar\\eclipse-workspace\\com.crm.testing\\ExtentReport\\AttachReport");
		ExtentReports er= new ExtentReports();
		er.attachReporter(esp);
		ExtentTest test = er.createTest("Proform");
		test.log(Status.INFO, "Test Case attached with extent report");
		test.addScreenCaptureFromBase64String(screenShot);
		er.flush();
		
	}
}
