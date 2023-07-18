package FirstProject.Appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
public class BrowserTest extends BaseTestForBrowser{

	@Test
	public void Test()
	{
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		driver.pressKey(new KeyEvent (AndroidKey.ENTER));
	}
}
