package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebTablesPage {
	
	private WebDriver driver;
	
	private By addButton = By.xpath("//button[@id='addNewRecordButton']");
	private By searchField =  By.xpath("//input[@id='searchBox']");
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
		driver.findElement(registrationForm_Fname);
	}
	public void registrationForm_Lname() {
		driver.findElement(registrationForm_Lname);
	}
	public void registrationForm_email() {
		driver.findElement(registrationForm_age);
	}
	public void registrationForm_age() {
		driver.findElement(registrationForm_email);
	}
	public void registrationForm_salary() {
		driver.findElement(registrationForm_salary);
	}
	public void registrationForm_department() {
		driver.findElement(registrationForm_department);
	}
	public void registrationForm_submit() {
		driver.findElement(registrationForm_submit);
	}
	public void searchField() {
		driver.findElement(searchField).sendKeys("test");;
	}
	public void editBtn() {
        driver.findElement(editButton).click();
	}
	public void registrationForm_ageEdit(String newAge) {
		driver.findElement(registrationForm_age).clear();
		driver.findElement(registrationForm_age).sendKeys(newAge);	
	}
	
	public void deletebtn() {
		driver.findElement(deleteButton).click();
	}

}
