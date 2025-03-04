package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebTablesPage {
	
	private WebDriver driver;
	
	private By addButton = By.xpath("//button[@id='addNewRecordButton']");
	private By searchBox =  By.xpath("//input[@id='searchBox']");
	private By tableRows = By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']");
	private By editButton = By.xpath("//span[@id='edit-record-1']");
	private By deleteButton = By.xpath("//span[@id='delete-record-1']");
	private By registrationForm_Fname = By.xpath("//input[@id='firstName']");
	private By registrationForm_Lname = By.xpath("//input[@id='lastName']");
	private By registrationForm_email = By.xpath("//input[@id='userEmail']");
	private By registrationForm_age = By.xpath("//input[@id='age']");
	private By registrationForm_salary = By.xpath("//input[@id='salary']");
	private By registrationForm_department = By.xpath("//input[@id='department']");
	private By registrationForm_submit = By.xpath("//button[@id='submit']");
	private By registrationForm_cancel = By.xpath("//button[@class='close']");
	
	public WebTablesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addButton() {
		driver.findElement(addButton).click();  
	}
	public void registrationForm_Fname() {
		driver.findElement(registrationForm_Fname).sendKeys("Neha");;
	}
	public void registrationForm_Lname() {
		driver.findElement(registrationForm_Lname).sendKeys("Sharma");;
	}
	public void registrationForm_age() {
		driver.findElement(registrationForm_email).sendKeys("nehasharma.neha.ns@gmail.com");;
	}
	public void registrationForm_email() {
		driver.findElement(registrationForm_age).sendKeys("25");;
	}
	public void registrationForm_salary() {
		driver.findElement(registrationForm_salary).sendKeys("25000");;
	}
	public void registrationForm_department() {
		driver.findElement(registrationForm_department).sendKeys("IT");;
	}
	public void registrationForm_submit() {
		driver.findElement(registrationForm_submit);
	}
	public void editBtn() {
        driver.findElement(editButton).click();
	}
	public void deletebtn() {
		driver.findElement(deleteButton).click();
	}
    public void searchForEntry(String searchText) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(searchText);
    }
    public boolean isSearchResultPresent() {
        List<WebElement> rows = driver.findElements(tableRows);
        return rows.size() > 0;
    }
	public Object getAddButtonElement() {
		return driver.findElement(addButton);
	}

	public void registrationForm_ageEdit(String string) {
		// TODO Auto-generated method stub
		
	}
}
