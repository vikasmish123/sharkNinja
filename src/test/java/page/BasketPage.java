package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.First;

public class BasketPage extends First {

	public void addProduct() {
		WebElement addCart = driver.findElement(By.xpath("(//*[text()=\"ADD TO CART\"])[1]"));
		clickOnElement(addCart);
	}

	public void clickOnAddCartButton() {

		WebElement addCartButton = driver.findElement(By.cssSelector("#shopping_cart_container"));
		clickOnElement(addCartButton);

	}

	

}
