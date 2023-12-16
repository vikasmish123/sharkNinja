package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helper.First;

public class PaymentPage extends First {

	
	public void checkout_Button() {

		WebElement checkoutButton = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
		clickOnElement(checkoutButton);

	}
	
	 public void user_enter_Firstname_and_Lastname_and_zipcode(String q, String r, String s) {
		WebElement firstname = driver.findElement(By.cssSelector("#first-name"));
		firstname.sendKeys(q);

		WebElement password = driver.findElement(By.cssSelector("#last-name"));
		password.sendKeys(r);

		WebElement zipcode = driver.findElement(By.cssSelector("#postal-code"));

		zipcode.sendKeys(r);

	}

	public void user_clickon_continue_button() {
		WebElement continueBtn = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
		clickOnElement(continueBtn);

	}

	public void user_clickon_finish_button() {
		WebElement checkoutBtn = driver.findElement(By.xpath("//a[text()='FINISH']"));
		clickOnElement(checkoutBtn);

	}

	public void match_text() {

		String text = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']")).getText();
		 assertEquals(text,"THANK YOU FOR YOUR ORDER" );
		
	}


}