package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	private By elementButton = By.xpath("//div[@class='card-body']//h5[text()='Elements']");
	private By formsButton = By.xpath("//div[@class='card mt-4 top-card'][.//h5[text()='Form']]");
	private By alertsFrameAndWindows = By.xpath("//div[@class='card mt-4 top-card'][.//h5[text()=''Alerts, Frame & Windows]]");
	private By widgets = By.xpath("//div[@class='card mt-4 top-card'][.//h5[text()='Widgets']]");
	private By interactions = By.xpath("//div[@class='card mt-4 top-card'][.//h5[text()='Interactions']]");
	
	public HomePage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void goToElements() {
        driver.findElement(elementButton).click();
    }
	public void goToForms() {
		driver.findElement(formsButton).click();
	}
	public void goToAlertsFrameAndWindows() {
		driver.findElement(alertsFrameAndWindows).click();
	}
	public void goToWidgets() {
		driver.findElement(widgets).click();
	}
	public void goToInteractions() {
		driver.findElement(interactions).click();
	}

}
