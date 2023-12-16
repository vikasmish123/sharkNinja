package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.First;

public class DeleteCartPage extends First {
	
	public void deleteItem(){
		
		WebElement removeCart =driver.findElement(By.xpath("//*[@class='btn_secondary cart_button']"));
		clickOnElement(removeCart);
		
		
	}

}
