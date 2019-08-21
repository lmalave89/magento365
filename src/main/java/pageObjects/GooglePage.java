package pageObjects;
 
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import DataFeatures.DataUserGmail;
import managers.FileReaderManager;

public class GooglePage {
	
	WebDriver driver;
	FileReaderManager fileReaderManager; 
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.NAME, using = "q") 
	public  WebElement txt_search;
	
	@FindBy(how = How.ID, using = "fprsl") 
	public WebElement suggest_text;
	
	@FindBy(how = How.CLASS_NAME, using = "ellip") 
	public List <WebElement> resultsSearch;		
	
	public void navigateTo_googlePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}	
}
	