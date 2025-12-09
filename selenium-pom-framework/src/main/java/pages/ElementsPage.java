package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.TextBoxPage;

public class ElementsPage {
    WebDriver driver;
    @FindBy(xpath = "//div[contains(@class,'header-text') and text()='Elements']")
    private WebElement elementsMainMenu;

    @FindBy(xpath = "//li[@id='item-0']")
    private WebElement textBoxMenu;

    @FindBy(xpath = "//li[@id='item-2']")
    private WebElement checkBoxMenu;

    @FindBy(xpath = "//li[@id='item-2']")
    private WebElement radioButtonMenu;

    @FindBy(xpath = "//li[@id='item-3']")
    private WebElement webTablesMenu;

    @FindBy(xpath = "//li[@id='item-4']")
    private WebElement buttonsMenu;

    @FindBy(xpath = "//li[@id='item-5']")
    private WebElement links;

    @FindBy(xpath = "//li[@id='item-6']")
    private WebElement brokenLinksImages;

    @FindBy(xpath = "//li[@id='item-7']")
    private WebElement uploadAndDownload;

    @FindBy(xpath = "//li[@id='item-8']")
    private WebElement dynamicProperties;

    public ElementsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void expandElementsMenu() {
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementsMainMenu);
    elementsMainMenu.click();
    }

    public TextBoxPage clickTextBox() {
        expandElementsMenu();
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textBoxMenu);
    textBoxMenu.click();
    return new TextBoxPage(driver);
     }


}
