package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
	private WebDriver driver;
	// Locators
    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By currentAddressField = By.id("currentAddress");
    private By permanentAddressField = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By outputName = By.id("name");

    // Constructor
    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with form elements
    public void fillTextBoxForm(String name, String email, String currentAddress, String permanentAddress) {
        driver.findElement(fullNameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
    }
    
    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit")); 
        }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isOutputNameDisplayed(String name) {
        return driver.findElement(outputName).getText().contains(name);
    }

}
