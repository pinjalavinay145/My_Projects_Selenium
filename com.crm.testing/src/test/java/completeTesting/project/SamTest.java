package completeTesting.project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SamTest extends BaseClass {
	@Test
	public void testCase2() {
		driver.get("https://www.facebook.com/");
		Reporter.log("opened facebook application",true);
		
	}

}
