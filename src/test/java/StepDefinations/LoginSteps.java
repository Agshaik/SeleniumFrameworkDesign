package StepDefinations;

import Keywords.LoginKeywordsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is an login page")
    public void user_is_an_login_page() {
        LoginKeywordsPage.LAUNCH_BROWSER();
    }
    @When("User clicks with submit with user1 and pass1")
    public void user_clicks_with_submit_with_user1_and_pass1() {
       LoginKeywordsPage.LOGIN_CREDENTIALS();
    }
    @Then("user login is successfully")
    public void user_login_is_successfull() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
}
