package FirstProject.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTest {

	
	@Test
	public void AppiumTest() throws MalformedURLException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("DemoAPP");
		options.setApp("C:\\Users\\skane\\Documents\\IMBAppiumTraining\\Appium\\src\\test\\java\\MobileApp\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.0.9:4723"),options);
		
		driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
		
		
	}
}
