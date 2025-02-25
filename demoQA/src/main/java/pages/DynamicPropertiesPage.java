package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicPropertiesPage {

    private WebDriver driver;

    // Locators for the dynamic elements
    private By colorChangeButton = By.id("colorChange");
    private By enableAfterButton = By.id("enableAfter");
    private By visibleAfterButton = By.id("visibleAfter");

    // Constructor
    public DynamicPropertiesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the color change button
    public void clickColorChangeButton() {
        WebElement button = driver.findElement(colorChangeButton);
        button.click();
    }

    // Method to click the enable button (after it becomes enabled)
    public void clickEnableAfterButton() {
        WebElement button = driver.findElement(enableAfterButton);
        button.click();
    }

    // Method to click the visible button (after it becomes visible)
    public void clickVisibleAfterButton() {
        WebElement button = driver.findElement(visibleAfterButton);
        button.click();
    }
}
