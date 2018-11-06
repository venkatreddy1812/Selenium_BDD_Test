 package pageObjects;
 
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class GoogleSearchPage {
 
	@FindBy(xpath="//input[@title='Search']")
	private WebElement searchInput;
	
	@FindBy(xpath="//div[@class='sbqs_c']")
	private List<WebElement> noOfidentifiedResults;
	
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void searchInput(String input) {
		searchInput.sendKeys(input);
	}

	public void totalNoOfResultsIdentified() throws InterruptedException {
		Thread.sleep(4000);
		int count = noOfidentifiedResults.size();
		System.out.println("No.Of Identified Results count : " + count);
		System.out.println("No.Of Identified Results  are : ");
		for(WebElement results : noOfidentifiedResults) {
			String list = results.getText();
			System.out.println(list);
		}
	}
}