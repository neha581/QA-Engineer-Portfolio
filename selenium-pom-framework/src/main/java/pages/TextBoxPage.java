package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TextBoxPage {
    private WebDriver driver;

    @FindBy(id = "userName")
    private WebElement fullNameInput;
     
    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "name")
    private WebElement outputName;

    @FindBy(id = "email")
    private WebElement outputEmail;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFullName(String name){
        fullNameInput.clear();
        fullNameInput.sendKeys(name);
    }

    public void enterEmail(String email){
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterCurrentAddress(String address){
        currentAddressInput.clear();
        currentAddressInput.sendKeys(address);
    }

    public void enterPermanentAddress(String address){
        permanentAddressInput.clear();
        permanentAddressInput.sendKeys(address);
    }

    public void clickSubmit(){
        submitButton.click();
    }

        public String getSubmittedName() {
        return outputName.getText();
    }

    public String getSubmittedEmail() {
        return outputEmail.getText();
    }
}

