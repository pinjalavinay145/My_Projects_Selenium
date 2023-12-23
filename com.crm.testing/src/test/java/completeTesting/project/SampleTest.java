package completeTesting.project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {
	
	@Test
	public void testCase() {
		driver.get("https://www.flipkart.com/");
		Reporter.log("opened flipcart application",true);
	}

}
