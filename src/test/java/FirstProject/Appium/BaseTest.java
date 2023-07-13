package FirstProject.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.BeforeSuite;

import com.google.common.collect.ImmutableMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
	
	@BeforeSuite	
	public  void configureAppium() throws MalformedURLException
	{
		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\skane\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
				withIPAddress("192.168.0.9").usingPort(4723).build();
		
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 6 Pro API 34");
		options.setApp("C:\\Users\\skane\\Documents\\IMBAppiumTraining\\Appium\\src\\test\\java\\MobileApp\\ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URL("http://192.168.0.9:4723"),options);
	}
	
	public void longPressAction(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",2000 ));
		
	}
	
	@AfterSuite
	public void teardown() {
      driver.quit();
      service.stop();
	
	}
	

}
