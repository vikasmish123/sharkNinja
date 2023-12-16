package page;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helper.First;

public class DropDownPage extends First {

	public void DropdownSize() {

		String expected[] = { "Name (A to Z)", "Name (Z to A)", "Price (low to high)", "Price (high to low)"};

		WebElement field = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		Select ele = new Select(field);

		List<WebElement> options = ele.getOptions();

		for (int i = 0; i < options.size(); i++) {

			assertEquals(options.get(i).getText(),expected[i]);
		}

	}
}
