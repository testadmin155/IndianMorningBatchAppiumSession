package FirstProject.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipe extends BaseTest{
	
	@Test
	public void swipeTest() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement element = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		Assert.assertEquals(element.getAttribute("focusable"), "true");

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "direction", "left",
		    "percent", 0.75
		));
		
		Thread.sleep(5000);
		Assert.assertEquals(element.getAttribute("focusable"), "true");
		
		
		
	}
	

}
