
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
    private WebDriver driver;

    // Locators
    private By yesRadioButton = By.xpath("//label[text()='Yes']"); //'//input[@type='radio' and @id='yesRadio']'
    private By outputMessage = By.className("text-success");

    // Constructor
    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with radio buttons
    public void selectYesRadioButton() {
        driver.findElement(yesRadioButton).click();
    }

    public boolean isYesSelected() {
        return driver.findElement(outputMessage).getText().equalsIgnoreCase("Yes");
    }
}
