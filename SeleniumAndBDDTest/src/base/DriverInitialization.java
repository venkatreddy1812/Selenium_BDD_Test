import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialization {

	public static WebDriver driver;

	public static WebDriver initChromeDriver() {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.gecko.driver" ,"\\D:\\Users\\diness\\Music\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void initializeDriver() {
		try {
			initChromeDriver();

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public void tearDown() {
		driver.quit();
	}
}