package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.First;

public class DeleteProductPage extends First {

	public void click_Product() {
		
		WebElement addItem  = driver.findElement(By.xpath("//*[@class='inventory_item_name']"));
		clickOnElement(addItem);
	}

	public void reomve_Product() {
		WebElement deleteItem  = driver.findElement(By.xpath("//*[@class='btn_secondary btn_inventory']"));
		clickOnElement(deleteItem);
		
	}

	
	
	
   
	

}
