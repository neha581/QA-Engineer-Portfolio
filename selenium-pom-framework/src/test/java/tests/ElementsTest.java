package tests;

import org.testng.Assert;
import base.BaseTest;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    @Test
    public void textBoxFormSubmission_shouldShowSubmittedData(){
            HomePage home = new HomePage(driver);
            ElementsPage elements = home.clickElementsPage();
            elements.expandElementsMenu();
            TextBoxPage textBox = elements.clickTextBox();
        

        String name = "Test Name";
        String email = "sample@example.com";

        textBox.enterFullName(name);
        textBox.enterEmail(email);
        textBox.enterCurrentAddress("123 Test Lane");
        textBox.enterPermanentAddress("456 Demo Ave");
        textBox.clickSubmit();

        String submittedName = textBox.getSubmittedName();
        String submittedEmail = textBox.getSubmittedEmail();

        Assert.assertTrue(submittedName.contains(name), "Submitted name not present");
        Assert.assertTrue(submittedEmail.contains(email), "Submitted email not present");
}
}

