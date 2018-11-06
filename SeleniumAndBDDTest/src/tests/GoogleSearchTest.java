import pageObjects.GoogleSearchPage;

public class GoogleSearchTest extends DriverInitialization {

	   public static void main(String[] args) throws InterruptedException {
		   DriverInitialization initDriver = new DriverInitialization();
		   initDriver.initializeDriver();
		   driver.get("https://www.google.com");
		   Thread.sleep(4000);
		   GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
		   googleSearchPage.searchInput("Selenium Test");
		   googleSearchPage.totalNoOfResultsIdentified();
		   initDriver.tearDown();
		}
}
