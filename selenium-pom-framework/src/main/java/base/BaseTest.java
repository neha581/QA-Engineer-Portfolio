package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		try{
			WebDriverManager.chromedriver().setup();
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--start-maximized");
		    driver = new ChromeDriver(options);
			int waitTime = Integer.parseInt(ConfigReader.getProperty("implicitWait"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
			String url = ConfigReader.getProperty("url");
            driver.get(url);

		}catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize the browser setup!");
        }

	}
	
	@AfterMethod
	
    public void tearDown() {
		try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Exception during tearDown: " + e.getMessage());
        }
       
    }
	

}
