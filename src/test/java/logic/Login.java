package logic;

import Packaging.Findelement;
import org.openqa.selenium.By;

public class Login {
    public static void login(String mobile,String password){
        Findelement.GetElement(By.id("com.ld.feijing:id/tv_login_password")).click();
        String info= Findelement.GetElement(By.id("com.ld.feijing:id/et_phone")).getText();
        System.out.println(info);
        Findelement.GetElement(By.id("com.ld.feijing:id/et_phone")).sendKeys(mobile);
        Findelement.GetElement(By.id("com.ld.feijing:id/et_password")).sendKeys(password);
        Findelement.GetElement(By.id("com.ld.feijing:id/btn_login")).click();
    }
}
