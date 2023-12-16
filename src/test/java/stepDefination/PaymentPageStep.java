package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PaymentPage;

public class PaymentPageStep {

	PaymentPage payment = new PaymentPage();

	@When("click on checkout button")

	public void checkOut() {

		payment.checkout_Button();
	}

	@Then("user enter Firstname {string} and Lastname {string} and zipcode {string}")

	public void user_enter_Firstname_and_Lastname_and_zipcode(String f, String l, String d) {
		payment.user_enter_Firstname_and_Lastname_and_zipcode(f, l, d);

	}

	@And("user click on continue button")

	public void user_click_on_continue_button() {

		payment.user_clickon_continue_button();

	}

	@And("click on finish button")

	public void click_on_finish() {
		payment.user_clickon_finish_button();
	}

	@Then("order successful messgae")
	public void successfull() {
		payment.match_text();
	}
}
