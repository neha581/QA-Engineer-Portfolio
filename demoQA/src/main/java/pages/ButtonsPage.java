package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {
	private WebDriver driver;
	private By doubleClickButton = By.xpath("//button[@id='doubleClickBtn']");
	private By rightClickButton =  By.xpath("//button[@id='rightClickBtn']");
	private By dynamicClickButton = By.xpath("//button[@class=\"btn btn-primary\"]");
	
	
	public ButtonsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doubleClickOnBtn() {
		Actions actions = new Actions(driver); 
		WebElement button = driver.findElement(doubleClickButton);
        actions.doubleClick(button).perform();
	}
	
	public void rightClickOnBtn() {
		Actions actions = new Actions(driver);
        WebElement button = driver.findElement(rightClickButton);
        actions.contextClick(button).perform();
	}
	
	public void dynamicClickOnBtn() {
        driver.findElement(dynamicClickButton).click();
	}

}
