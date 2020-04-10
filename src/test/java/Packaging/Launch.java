package Packaging;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Launch {
    public static AndroidDriver<WebElement> dr;
    public static void start(String deviceName,String appPackage,String ppActivity ,String platformName) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName",deviceName);
        desiredCapabilities.setCapability("appPackage",appPackage);
        desiredCapabilities.setCapability("appActivity",ppActivity);
        desiredCapabilities.setCapability("platformName",platformName);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        dr=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

    }
}
