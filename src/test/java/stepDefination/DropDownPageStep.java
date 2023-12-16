package stepDefination;

import io.cucumber.java.en.Then;
import page.DropDownPage;

public class DropDownPageStep {

	DropDownPage validate = new DropDownPage();

	@Then("click on dropdown option")
	public void DropDownValidateSize() {
		validate.DropdownSize();
	}
//	@Then("validate dropdown text")
//	public void ValidateOption(){
//		
//		
//		
//	}
}
