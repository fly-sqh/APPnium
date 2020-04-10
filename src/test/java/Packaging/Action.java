package Packaging;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Action extends Launch {
//通过坐标点击屏幕位置
    public static void Touch(int X,int Y){
        TouchAction action=new TouchAction(dr);
        PointOption option1=new PointOption();
        option1.withCoordinates(X,Y);
        action.tap(option1).perform();
    }
    //随机数
    public static String Random(int length){
       String val="";
       Random random=new Random();
       for(int i =0;i<length;i++){
           String a=random.nextInt(10)%2==0?"char" : "num";
           if(a.equals("char")){
               int b=random.nextInt(10)%2==0?10000 :15000 ;
               val+=(char)(random.nextInt(26)+b);
           }
           if (a.equals("num")){
               val+=random.nextInt(10);
           }

        }
       System.out.println(val);
       return val;
    }
    //屏幕向上滑动
    public static void upglide(){
        int width=dr.manage().window().getSize().width;
        int height=dr.manage().window().getSize().height;
        TouchAction touch=new TouchAction(dr);
        touch.press(PointOption.point(width/2,height/3))
                .moveTo(PointOption.point(width/2,height*(2/3))).release().perform();

    }
    //屏幕向下滑动
    public static void glide(){
        int width=dr.manage().window().getSize().width;
        int height=dr.manage().window().getSize().height;
        TouchAction touch=new TouchAction(dr);
        touch.press(PointOption.point(width/2,height*(2/3)))
                .moveTo(PointOption.point(width/2,height/3)).release().perform();

    }
}
