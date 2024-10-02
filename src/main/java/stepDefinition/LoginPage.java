package stepDefinition;

import io.cucumber.java.en.When;
import static Pages.LoginPage.*;

public class LoginPage {

    @When("User successfully enters log in credentials")
    public void user_successfully_enters_log_in_credentials() throws InterruptedException{

        sendkeys_username();
        sendkeys_password();
        Click_login_btn();

    }

}
