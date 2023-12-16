package helper;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class First {
	public static Properties prop;
	public static WebDriver driver;

	static {

		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/rosource/env.properties");
			 prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Before

	public void setup() {
		String browserName = prop.getProperty("browser");
		switch (browserName) {
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	public void bootStrapDropDown(List<WebElement> list, String value) {

		for (WebElement ele : list) {

			String eleText = ele.getText();
			if (eleText.equals(value)) {
				ele.click();
				break;
			}
		}
	}

	public void handldAlert(String type) {
		waitForElement(10, "alet", null);
		Alert a = driver.switchTo().alert();
		switch (type) {
		case "select":
			a.accept();
			break;
		case "cancel":
			a.dismiss();
			break;
		}
	}

	public void waitForElement(int timeouts, String type, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		switch (type) {
		case "alert":
			wait.until(ExpectedConditions.alertIsPresent());
			break;
		case "clickable":
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			break;
		case "visible":
			wait.until(ExpectedConditions.visibilityOf(ele));
			break;

		}
	}

	public void clickOnElement(WebElement ele) {
		waitForElement(10, "clickable", ele);
		try {
			ele.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
		}
	}

	public void validateText(WebElement ele, String expected) {
		waitForElement(20, "visible", ele);
		String actualValue = ele.getText();
		assertEquals(actualValue, expected);

	}

	@After

	public void TearDown(Scenario s) throws IOException {

		if (s.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Screenshot/" + s.getName() + ".png"));

		}
		driver.quit();
	}

	public void switchFrames(String type, String value) {

		switch (type) {
		case "name":
			driver.switchTo().frame(value);
			break;
		case "index":
			driver.switchTo().frame(Integer.parseInt(value));
			break;
		}
	}

	public void switchwindow(String title) {
		Set<String> allwindow = driver.getWindowHandles();

		for (String s : allwindow) {
			driver.switchTo().window(s);
			String currentTitle = driver.getTitle();
			if (currentTitle.equals(title)) {
				break;
			}
		}

	}
}
