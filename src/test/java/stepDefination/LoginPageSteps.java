package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SignInpage;

public class LoginPageSteps {

	SignInpage login = new SignInpage();

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String x, String y) {
		login.user_enter_username_and_password(x, y);
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		login.user_click_on_login_button();

	}

	@Then("validate successful login")
	public void validate_successful_login() {

	}

}
