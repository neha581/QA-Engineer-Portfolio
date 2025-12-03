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
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ConfigReader.getProperty("url"));
	}
	
	@AfterMethod
	
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	

}
