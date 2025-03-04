package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import utils.ConfigReader;
import java.net.MalformedURLException;
import java.net.URL;
//import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() throws MalformedURLException{
		String hubURL = "http://localhost:4444/wd/hub"; // Connect to Selenium Grid
		
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(hubURL), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(ConfigReader.getProperty("url"));
        
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(ConfigReader.getProperty("url"));*/
        
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 800)");
	}
	
	@AfterMethod
	
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	

}
