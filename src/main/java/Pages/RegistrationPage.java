package Pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public  static String user_registration_xpath ="/html/body/center/h1";


    public static void visibility_user_Registration_page() throws InterruptedException{
        String actualproductcategory_fs = driver.findElement(By.xpath(user_registration_xpath)).getText();
        assertEquals("User Registration Page",actualproductcategory_fs);
    }
}
