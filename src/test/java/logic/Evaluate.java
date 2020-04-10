package logic;

import Packaging.Findelement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Evaluate {
    public static void EvaluateOrder(String remake){
     Findelement.GetElement(By.className("android.widget.TextView")).click();
     Findelement.GetElement(By.id("com.ld.feijing:id/tv_select_feedback_click")).click();
     Findelement.GetElement(By.xpath("//*[@resource-id='com.ld.feijing:id/rb_main']/android.widget.RelativeLayout[4]")).click();
     String evaluate =Findelement.GetElement(By.id("com.ld.feijing:id/tv_feedback_write_main")).getText();
     Assert.assertEquals(evaluate,"满意");
     Findelement.GetElement(By.xpath("//*[@resource-id='com.ld.feijing:id/rv_feedback_write']/android.support.v7.widget.LinearLayoutCompat[1]/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.RelativeLayout[3]")).click();
     Findelement.GetElement(By.xpath("//*[@resource-id='com.ld.feijing:id/rv_feedback_write']/android.support.v7.widget.LinearLayoutCompat[2]/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.RelativeLayout[3]")).click();
     Findelement.GetElement(By.xpath("//*[@resource-id='com.ld.feijing:id/rv_feedback_write']/android.support.v7.widget.LinearLayoutCompat[3]/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.RelativeLayout[3]")).click();
     Findelement.GetElement(By.xpath("//*[@text='期待您的宝贵意见哦']")).sendKeys(remake);
     Findelement.GetElement(By.xpath("//*[@text='提交评价']")).click();
     String succeed= Findelement.GetElement(By.id("com.ld.feijing:id/tv_feedback_success_txt")).getText();
     Assert.assertEquals(succeed,"评价成功");
     String thanks=Findelement.GetElement(By.id("com.ld.feijing:id/tv_feedback_success_toast")).getText();
     Assert.assertEquals(thanks,"感谢您的评价，我们将为您带来更好的服务～");
     String share=Findelement.GetElement(By.id("com.ld.feijing:id/tv_feedback_success_share")).getText();
     Assert.assertEquals(share,"立即分享");
}}
