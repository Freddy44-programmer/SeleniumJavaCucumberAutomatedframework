package stepDefinition;

import io.cucumber.java.en.Given;
import static Pages.HomePage.*;

public class HomePage {


    @Given("User navigates to the login page")
    public void User_navigates_to_the_login_page() throws InterruptedException {

        Click_hamburger_menu();
        Click_signIn_link();

    }


    @Given("User navigates to the Online products page")
    public void User_navigates_to_the_Online_products_page() throws InterruptedException {

        Click_hamburger_menu();
       Click_OnlineProducts_link();

    }

}
