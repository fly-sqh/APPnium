package APPniumTest;

import Packaging.Action;
import Packaging.Findelement;
import Packaging.Launch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import logic.Evaluate;
import logic.Login;
import logic.Order;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Profession {
    @Test
    public static void LoginTest() throws MalformedURLException, InterruptedException {
        Launch.start("192.168.1.3","com.ld.feijing","com.ld.feijing.ui.activity.main.SplashActivity","Android");
        Thread.sleep(5000);
        //点击坐标（620，992）位置的元素
        Action.Touch(740,1380);
        Thread.sleep(2000);
        Action.Touch(951,2141);
        Login.login("17855837030","shen420281");
        //String remake=Action.Random(300);
        //Evaluate.EvaluateOrder(remake);
        Order.Booking("PEK","ADD");
    }
}
