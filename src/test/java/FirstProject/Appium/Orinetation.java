package FirstProject.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Orinetation extends BaseTest{
	
	@Test
	public void RotationTest() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		DeviceRotation lanscape = new DeviceRotation(0,0,270);
		driver.rotate(lanscape);
		
		Thread.sleep(5000);
		
	}

}
