package Pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class OnlineProductsPage extends BrowserDriver {

    public  static String formalshoes_dropdown_class ="/html/body/div[2]/center/div/i[1]";

    public static String formalshoes_webtable = "/html/body/div[2]/table";

    public static String formalshoes_webtable_tr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalshoesdropdown() throws InterruptedException{

        driver.findElement(By.xpath(formalshoes_dropdown_class)).click();
    }


    public static void getText_formalshoes_firstvalue(){

        driver.findElement(By.xpath(formalshoes_webtable_tr)).getText();

    }


}
