package logic;

import Packaging.Action;
import Packaging.Findelement;
import org.openqa.selenium.By;

public class Order {
    public static void Booking(String station,String dest){
        Findelement.GetElement(By.id("com.ld.feijing:id/tv_order_city_start")).click();
        Findelement.GetElement(By.id("com.ld.feijing:id/et_city_list_search")).sendKeys(station);
        Findelement.GetElement(By.id("com.ld.feijing:id/tv_city_list_city")).click();
        Findelement.GetElement(By.id("com.ld.feijing:id/tv_order_city_arrive")).click();
        Findelement.GetElement(By.id("com.ld.feijing:id/et_city_list_search")).sendKeys(dest);
        Findelement.GetElement(By.id("com.ld.feijing:id/tv_city_list_city")).click();
        Findelement.GetElement(By.id("com.ld.feijing:id/tv_order_search")).click();
    }
    public static void Bookinginfo(String describe){
        Findelement.GetElement(By.className("android.widget.FrameLayout")).click();
        Findelement.GetElement(By.id("com.ld.feijing:id/cb_common_select")).click();
        Findelement.GetElement(By.id("com.ld.feijing:id/tv_dialog_select_confirm")).click();
        Findelement.GetElement(By.xpath("//*[@text=''请填写货物品名或辅助说明，限英文]")).sendKeys(describe);//ss
        

    }
}
