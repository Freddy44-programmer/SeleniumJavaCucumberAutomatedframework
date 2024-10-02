package stepDefinition;

import io.cucumber.java.en.Given;
import static Pages.HomePage.*;

public class HomePage {

    @Given("^User navigates to the login page$")
    public void User_navigates_to_the_login_page() throws InterruptedException {

        Click_hamburger_menu();
        Click_signIn_link();

    }

}
