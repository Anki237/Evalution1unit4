package nativeapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Api_demo_Capabilities {
public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
	DesiredCapabilities dc= new DesiredCapabilities();
	// i am using this dc object to give info about the emulator and app that i want to open
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Ankita");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
	//io.appium.android.apis.ApiDemos - API Demos
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
	AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	return driver;

}
}
