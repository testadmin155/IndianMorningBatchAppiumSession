package FirstProject.Appium;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

public class eCommerShopping extends BaseTestHybridApp{
	
	@Test
	public void  eshopping() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Testing");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Belgium\").instance(0))")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		//to get text of the toast message
		/*String toastmessage=driver.findElement(By.xpath("/hierarchy/android.widget.Toast[1]")).getAttribute("text");
		System.out.println(toastmessage);
		Assert.assertEquals(toastmessage, "Please enter your name");
		*/
		Thread.sleep(5000);
		//driver.hideKeyboard();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		
		int productcount=driver.findElements(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productName']")).size();
		System.out.println(productcount);
		
		for(int i=0; i<productcount; i++)
		{
			String productname=driver.findElements(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productName']")).get(i).getText();
			System.out.println(productname);
			if(productname.equals("Jordan 6 Rings"))
			{
				driver.findElements(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productAddCart']")).get(i).click();
				Thread.sleep(5000);
				break;
			}
		
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
		
		Set<String>contexts1=driver.getContextHandles();
		for(String contextName1:contexts1)
		{
			System.out.println("App current context before webpage : " +contextName1);
		}
		
		String currentcontext=driver.getContext();
		System.out.println("App current context : " +currentcontext);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(10000);
		
		Set<String>contexts=driver.getContextHandles();
		for(String contextName:contexts)
		{
			System.out.println("App current context after opening webpage : " +contextName);
		}
		String currentcontext1=driver.getContext();
		System.out.println("App current context after opening webpage : " +currentcontext1);
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		
		String currentcontext2=driver.getContext();
		System.out.println("App current context after changing the context : " +currentcontext2);
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Alles accepteren\").instance(0))")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("Testing");
		
	}

}
