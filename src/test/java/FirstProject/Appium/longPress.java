package FirstProject.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class longPress extends BaseTest{
	
	@Test
	public void longPressTest()
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement  element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		/*((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",2000 ));*/
		
		longPressAction(element);
		
		String menuText = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='android:id/title'])[1]")).getText();
		Assert.assertEquals(menuText, "Sample menu");
		Assert.assertTrue(driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='android:id/title'])[1]")).isDisplayed());
		

	}

}
