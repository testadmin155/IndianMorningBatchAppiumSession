package FirstProject.Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

public class Scroll extends BaseTest{

	@Test
	public void scrollTest()
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new uiSelector().scrollable(true).instance(0)).scrollIntoView (new UiSelector ().textMatches(\"WebView\").instance (0))"));
		
	};
}
