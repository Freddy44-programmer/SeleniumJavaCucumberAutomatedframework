package Pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {


    public  static String productCategory_formalshoes ="//*[text()='Formal Shoes']";

    public  static String productCategory_sportsshoes ="//*[text()='Sports']";

    public  static String productCategory_sneakers="//*[text()='Sneakers']";

    public  static String login_btn_xpath ="//*[@id=\"second_form\"]/input";

    public static void visibility_productCategory_formalshoes() throws InterruptedException{
       String actualproductcategory_fs = driver.findElement(By.xpath(productCategory_formalshoes)).getText();
       assertEquals(actualproductcategory_fs,"Formal Shoes");
    }

    public static void visibility_productCategory_sportsshoes() throws InterruptedException{
        String actualproductcategory_ss = driver.findElement(By.xpath(productCategory_sportsshoes)).getText();
        assertEquals(actualproductcategory_ss,"Sports");
    }

    public static void visibility_productCategory_sneakershoes() throws InterruptedException{
        String actualproductcategory_s = driver.findElement(By.xpath(productCategory_sneakers)).getText();
        assertEquals(actualproductcategory_s,"Sneakers");
    }

}
