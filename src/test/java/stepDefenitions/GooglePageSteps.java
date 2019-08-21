package stepDefenitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataFeature.GoogleData;
import injectionDependenciesManager.TestContext;
import pageObjects.GooglePage;


public class GooglePageSteps{

	TestContext testContext;
	GooglePage googlePage;	
	GoogleData googleData = new GoogleData(); 
	
	public GooglePageSteps(TestContext context) {
		testContext = context;
		googlePage = testContext.getPageObjectManager().getGooglePage();	
		googlePage.navigateTo_googlePage();
	}

	@Given("^search the information$")
	public void search_the_information() throws InterruptedException{
		testContext.getGenericsFunctionsPage().checkElementVisibleByElement(googlePage.txt_search);
		testContext.getGenericsFunctionsPage().sendDataToElement(googlePage.txt_search, googleData.getTextTest());
		googlePage.txt_search.sendKeys(Keys.ENTER);
		assertEquals(googlePage.suggest_text.getText(), googleData.getTextSuggestByGoogle());		
	}
	
	@When("^select the information suggested by google$")
	public void select_the_information_suggested_by_google() throws InterruptedException{
		testContext.getGenericsFunctionsPage().checkElementVisibleByElement(googlePage.suggest_text);
		testContext.getGenericsFunctionsPage().clickElement(googlePage.suggest_text);
	}
	
	@Then("^validate bussiness suggested by magento 365$")
	public void validate_bussiness_suggested_by_magento_365() throws InterruptedException{
		int result = testContext.getGenericsFunctionsPage().getSizeList(googlePage.resultsSearch);
		assertTrue(result > googleData.getRegisterExpected());
	}
}
