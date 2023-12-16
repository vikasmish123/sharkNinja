package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.First;

public class SignInpage extends First {

	public void user_enter_username_and_password(String u, String p) {
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys(u);

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(p);

	}

	public void user_click_on_login_button() {
		WebElement loginBtn = driver.findElement(By.cssSelector("#login-button"));
		clickOnElement(loginBtn);

	}

	public void validate_successful_login() {

	}

}
