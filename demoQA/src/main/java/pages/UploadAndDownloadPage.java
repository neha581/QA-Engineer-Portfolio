package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownloadPage {

    private WebDriver driver;

    // Locators
    private By uploadButton = By.id("uploadFile");
    private By downloadLink = By.id("downloadButton");

    // Constructor
    public UploadAndDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to upload a file
    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath); // Sending the file path to the input
    }

    // Method to click the download link
    public void clickDownload() {
        WebElement downloadElement = driver.findElement(downloadLink);
        downloadElement.click(); // Clicking the download link
    }
}
