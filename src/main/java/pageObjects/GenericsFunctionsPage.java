package pageObjects;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericsFunctionsPage {

	WebDriver driver;

	public GenericsFunctionsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void checkElementVisibleByElement(WebElement element) {
		try {
			Thread.sleep(3000);
			element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Not found this element " + element);
		}
	}

	// Click functions by Identifier

	public void clickElement(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		element.click();
	}

	// send value functions by Identifier
	public void sendDataToElement(WebElement element, String value) throws InterruptedException {
		Thread.sleep(3000);
		element.sendKeys(value);
	}

	public int getSizeList(List<WebElement> elements) throws InterruptedException {
		Thread.sleep(3000);
		int result = elements.size();
		return result;
	}	
	
	public void closeSessionDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
