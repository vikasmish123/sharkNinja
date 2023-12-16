package stepDefination;

import io.cucumber.java.en.And;
import page.BasketPage;

public class BasketPageStep {

	BasketPage basket = new BasketPage();

	@And("add product from product page")

	public void add_product() {

		basket.addProduct();

	}

	@And("click on add cart option")

	public void addcart_option() {

	
      basket.clickOnAddCartButton();
	}

	

}
