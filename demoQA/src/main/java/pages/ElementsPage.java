package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

	private WebDriver driver;

    // Locators
    private By textBoxMenu = By.xpath("//span[text()='Text Box']");
    private By radioButtonMenu = By.xpath("//*[@id=\"item-2\"]/span");
    private By checkBoxMenu = By.xpath("//*[@id='item-1']");
    private By webTablesMenu = By.xpath("//*[@id='item-3']");
    private By buttonsMenu = By.xpath("//*[@id='item-4']");
    private By linksMenu = By.xpath("//*[@id='item-5']");
    private By brokenLinksImages = By.xpath("//*[@id='item-6']");
    private By uploadAndDownload = By.xpath("//*[@id='item-7']");
    private By dynamicProperties = By.xpath("//*[@id='item-7']");

    // Constructor
    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with page elements
    public void goToTextBox() {
        driver.findElement(textBoxMenu).click();
    }

    public void goToRadioButton() {
        driver.findElement(radioButtonMenu).click();
    }
    
    public void goToCheckBox() {
    	driver.findElement(checkBoxMenu).click();
    }
    public void goToWebTables() {
    	driver.findElement(webTablesMenu).click();
    }
    public void goToButtons() {
    	driver.findElement(buttonsMenu).click();
    }
    public void goToLinks() {
    	driver.findElement(linksMenu).click();
    }
    public void goToBrokenLinksImages() {
    	driver.findElement(brokenLinksImages).click();
    }
    public void goToUploadAndDownload() {
    	driver.findElement(uploadAndDownload).click();
    }
    public void goToDynamicProperties() {
    	driver.findElement(dynamicProperties).click();
    }
}
