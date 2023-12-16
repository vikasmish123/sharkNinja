package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.DeleteProductPage;

public class RemoveProductStep {
	
	
DeleteProductPage delete = new DeleteProductPage();
	
	@And("click on product option")
	
	public void product_option(){
		
		delete.click_Product();
		
	}
	
	@Then("click on remove button option")
	
    public void remove_button_option(){
		
		delete.reomve_Product();
		
	}

}
