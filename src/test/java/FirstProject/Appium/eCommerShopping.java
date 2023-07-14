package FirstProject.Appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

public class eCommerShopping extends BaseTestHybridApp{
	
	@Test
	public void  eshopping() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Testing");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"India\").instance(0))")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		Thread.sleep(5000);
	}

}
