package pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
	
	private WebDriver driver;
	
	private By homeDropDown = By.xpath("//span[text()='Home']/ancestor::label/preceding-sibling::button");
	private By desktopDropDown = By.xpath("//span[text()='Desktop']/ancestor::label/preceding-sibling::button");
	private By NotesCheckBox = By.xpath("//span[text()='Notes']/preceding-sibling::span[@class='rct-checkbox']");
	
	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openHomeDropdown() {
		driver.findElement(homeDropDown).click();
	}
	public void openDesktopDropdown() {
		driver.findElement(desktopDropDown).click();
	}
	public void selectNotes() {
		driver.findElement(NotesCheckBox).click();
	}

	public Object getHomeDropdownElement() {
		return driver.findElement(homeDropDown);
	}

}
