package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;
import pages.RadioButtonPage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class ElementsTest extends BaseTest {

   
    
   @Test
    public void testTextBoxForm() {
        HomePage homePage = new HomePage(driver);
        homePage.goToElements();
        ElementsPage elementsPage = new ElementsPage(driver);
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
	  HomePage homePage = new HomePage(driver);
      homePage.goToElements();
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.goToRadioButton();

        RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
        radioButtonPage.selectYesRadioButton();

        Assert.assertTrue(radioButtonPage.isYesSelected(), "Yes radio button is not selected!");
    } 
}
