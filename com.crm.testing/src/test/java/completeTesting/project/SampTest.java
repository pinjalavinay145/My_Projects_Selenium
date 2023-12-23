package completeTesting.project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampTest extends BaseClass {
@Test
public void testCase2() {
	driver.get("https://www.amazon.in/");
	Reporter.log("opened Amazon application",true);
	
}
}
