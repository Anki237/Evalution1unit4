package nativeapp;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;


import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class Evaluation1 extends Api_demo_Capabilities{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void setup() throws MalformedURLException {
		driver= capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test(enabled = false)
	public void fDroid() throws InterruptedException {
		driver.activateApp("org.fdroid.fdroid");
		//app switch
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"TermuC A simple C/C++ IDE backed on Termux\")")).click();
		//click operation performed
		
	}
	@Test
	public void fDroidnotification() throws InterruptedException {
		driver.activateApp("org.fdroid.fdroid");
		//notification
		driver.openNotifications();
		//click on battery
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		driver.openNotifications();
		//click on battery
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		driver.hideKeyboard();
		//if you want to navigate back to prev page
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		
		
	}
	@Test(enabled = false)
	public void scrollupanddown() {
		driver.findElement(MobileBy.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]/android.widget.FrameLayout/android.widget.ImageView")).click();	
		//scroll into the privacy
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Privacy\"))").click();
		//back operation
		 driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	@Test(alwaysRun = false)
	public void  tap() {
		driver.activateApp("org.fdroid.fdroid");
		driver.findElement(MobileBy.xpath("//android.widget.FrameLayout[@content-desc=\"Latest\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		
		//another way using text 
		AndroidElement fresh= driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Fennec F-Droid Browse the web\")"));
		//this is longpress method
		TouchAction ta = new TouchAction(driver);
		ta.longPress(longPressOptions().withElement(element(fresh)).withDuration(ofSeconds(3))).release().perform();
		
		
	}
}
