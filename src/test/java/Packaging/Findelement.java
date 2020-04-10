package Packaging;

import org.aspectj.asm.IElementHandleProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Findelement extends Launch {
    public static WebElement GetElement(By by){
        try {
            WebDriverWait wait = new WebDriverWait(dr, 10);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("元素"+by+"查找超时" );
        }return dr.findElement(by);
    }
    public static List<WebElement> GetElements(By by){
        List<WebElement> list=null;
        try {
            WebDriverWait wait = new WebDriverWait(dr, 10);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("元素"+by+"查找超时" );

    }return list;
    }
}
