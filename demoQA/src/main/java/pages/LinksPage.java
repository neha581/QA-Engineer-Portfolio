package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {
    private WebDriver driver;

    // Locators for links on the page
    private By homeLink = By.id("simpleLink");
    private By createdLink = By.id("created");
    private By noContentLink = By.id("no-content");
    private By movedLink = By.id("moved");
    private By badRequestLink = By.id("bad-request");
    private By unauthorizedLink = By.id("unauthorized");
    private By forbiddenLink = By.id("forbidden");
    private By notFoundLink = By.id("invalid-url");

    // Constructor
    public LinksPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with each link
    public void clickHomeLink() {
        driver.findElement(homeLink).click();
    }

    public void clickCreatedLink() {
        driver.findElement(createdLink).click();
    }

    public void clickNoContentLink() {
        driver.findElement(noContentLink).click();
    }

    public void clickMovedLink() {
        driver.findElement(movedLink).click();
    }

    public void clickBadRequestLink() {
        driver.findElement(badRequestLink).click();
    }

    public void clickUnauthorizedLink() {
        driver.findElement(unauthorizedLink).click();
    }

    public void clickForbiddenLink() {
        driver.findElement(forbiddenLink).click();
    }

    public void clickNotFoundLink() {
        driver.findElement(notFoundLink).click();
    }

    // Example method to get the text of a link (for assertions)
    public String getHomeLinkText() {
        WebElement link = driver.findElement(homeLink);
        return link.getText();
    }
} 
