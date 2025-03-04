package tests;

import base.BaseTest;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.LinksPage;
import pages.TextBoxPage;
import pages.WebTablesPage;
import pages.RadioButtonPage;
import pages.ButtonsPage;
import pages.CheckBoxPage;


import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ElementsTest extends BaseTest {
	private ElementsPage elementsPage;

    @BeforeMethod
    public void navigateToElementsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToElements();
        elementsPage = new ElementsPage(driver);
    }
   
    @Test
    public void testTextBoxForm() {
        
        elementsPage.goToTextBox();
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.fillTextBoxForm("Neha Sharma", "nehasharma.neha.ns@gmail.com", "123 Gurgaon", "456 India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();

        Assert.assertTrue(textBoxPage.isOutputNameDisplayed("Neha Sharma"), "Name is not displayed in output!");
    }
    
  @Test
    public void testRadioButton() {
        elementsPage.goToRadioButton();
        RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", radioButtonPage.getYesRadioButton());
        radioButtonPage.selectYesRadioButton();
        Assert.assertTrue(radioButtonPage.isYesSelected(), "Yes radio button is not selected!");
    } 
  
  @Test
  public void testCheckBox() {
	  elementsPage.goToCheckBox();
	  CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", checkBoxPage.getHomeDropdownElement());
	  checkBoxPage.openHomeDropdown();
	  checkBoxPage.openDesktopDropdown();
	  checkBoxPage.selectNotes(); 
  }
  @Test
  public void testAddWebTableEntry() {
	  elementsPage.goToWebTables();
	  WebTablesPage webTablesPage = new WebTablesPage(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", webTablesPage.getAddButtonElement());
	  webTablesPage.addButton();
	  webTablesPage.registrationForm_Fname();
	  webTablesPage.registrationForm_Lname();
	  webTablesPage.registrationForm_email();
	  webTablesPage.registrationForm_age();
	  webTablesPage.registrationForm_salary();
	  webTablesPage.registrationForm_department();
	  webTablesPage.registrationForm_submit();
  }
  @Test
  public void testSearchWebTableEntry() {
      elementsPage.goToWebTables();
      WebTablesPage webTablesPage = new WebTablesPage(driver);
      webTablesPage.searchForEntry("test"); 
      Assert.assertTrue(webTablesPage.isSearchResultPresent(), "No results found for the search!");
  }
  
  @Test
  public void testWebTableDelete() {
	  elementsPage.goToWebTables();
	  WebTablesPage webTablesPage = new WebTablesPage(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", webTablesPage.getAddButtonElement());
	  webTablesPage.deletebtn();
  }
  @Test
  public void testWebTableEdit() {
	  elementsPage.goToWebTables();
	  WebTablesPage webTablesPage = new WebTablesPage(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", webTablesPage.getAddButtonElement());
	  webTablesPage.editBtn();
	  webTablesPage.registrationForm_ageEdit("30");
  }
  @Test
  public void testdoubleClickOnBtnPage() {
	  elementsPage.goToButtons();
	  ButtonsPage buttonsPage = new ButtonsPage(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",buttonsPage.getDoubleClickBtnElement());
	  buttonsPage.doubleClickOnBtn();
	  buttonsPage.rightClickOnBtn();
	  buttonsPage.dynamicClickOnBtn();
  }
  @Test
  public void testrightClickOnBtnPage() {
	  elementsPage.goToButtons();
	  ButtonsPage buttonsPage = new ButtonsPage(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",buttonsPage.getDoubleClickBtnElement());
	  buttonsPage.rightClickOnBtn();
  }
  @Test
  public void testdynamicClickOnBtnPage() {
	  elementsPage.goToButtons();
	  ButtonsPage buttonsPage = new ButtonsPage(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",buttonsPage.getDoubleClickBtnElement());
	  buttonsPage.dynamicClickOnBtn();
  }
 
  @Test
  public void testNewTabOpenOnClick() {
	  try {
		    WebElement adBanner = driver.findElement(By.id("fixedban"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='none';", adBanner);
		    System.out.println("Ad banner hidden.");
		} catch (NoSuchElementException e) {
		    System.out.println("No ad banner found, continuing...");
		}
	  elementsPage.goToLinks();
	  LinksPage linksPage = new LinksPage(driver);
	  String mainWindow = driver.getWindowHandle();
	  linksPage.clickHomeLink();
	// Get all window handles
      Set<String> allWindows = driver.getWindowHandles();

      // Switch to the new tab
      for (String window : allWindows) {
          if (!window.equals(mainWindow)) {
              driver.switchTo().window(window);
              break;
          }
      }
      driver.close();
      driver.switchTo().window(mainWindow);
  }
  
}
