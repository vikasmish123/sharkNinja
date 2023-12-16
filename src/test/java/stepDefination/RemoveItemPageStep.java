package stepDefination;

import io.cucumber.java.en.Then;
import page.DeleteCartPage;

public class RemoveItemPageStep {

	DeleteCartPage remove = new DeleteCartPage();

	@Then("click on remove button")
	public void remove_item() {
		remove.deleteItem();

	}

}
