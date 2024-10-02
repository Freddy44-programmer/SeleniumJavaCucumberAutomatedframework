package Pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public  static String username_text_id ="usr";
    public  static String password_text_id ="pwd";
    public  static String login_btn_xpath ="//*[@id=\"second_form\"]/input";

    public static void sendkeys_username() throws InterruptedException{
        driver.findElement(By.id(username_text_id)).sendKeys("test@gmail.com");
    }
    public static void sendkeys_password() throws InterruptedException{
        driver.findElement(By.id(password_text_id)).sendKeys("12345");
    }

    public static void Click_login_btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

}
