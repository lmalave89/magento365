package injectionDependenciesManager;
import managers.WebDriverManager;
import pageObjects.GenericsFunctionsPage;
import managers.PageObjectManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	private GenericsFunctionsPage genericFunctionsPage;
	
	public TestContext() {
		// TODO Auto-generated constructor stub
		
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		genericFunctionsPage = new GenericsFunctionsPage(getWebDriverManager().getDriver());	
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public GenericsFunctionsPage getGenericsFunctionsPage() {
		return genericFunctionsPage;
	}
}
