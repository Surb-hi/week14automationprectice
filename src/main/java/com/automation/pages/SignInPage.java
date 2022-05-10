package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddressField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButtonField;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement accountbuttonField;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;

    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement errorMsg;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement registerEmail;

    public void setRegisterEmail(String email) {
        Reporter.log("Enter email"+email + " to  field "+ registerEmail.toString() + "<br>");
        sendTextToElement(registerEmail, email);
    }

    public void setEmailAddressField(String emailaddressfield) {
        Reporter.log("Enter email"+emailaddressfield + " to  field "+ emailAddressField.toString() + "<br>");
        sendTextToElement(emailAddressField, emailaddressfield);
    }

    public void setPasswordField(String passwordfield) {
        Reporter.log("Enter passwordfield"+passwordfield + " to  field "+ passwordField.toString() + "<br>");
        sendTextToElement(passwordField, passwordfield);
    }

    public void clickOnSignIn() {
        Reporter.log("Clicking on signInButtonField"+ signInButtonField.toString()+ "<br>");
        clickOnElement(signInButtonField);
    }

    public String clickOnSignInText(){
        Reporter.log("getting  text from signInButtonField"+signInButtonField.toString()+"<br>");
        return getTextFromElement(signInButtonField);
    }

    public void clickOnAccountButton() {
        Reporter.log("Clicking on accountbuttonField"+ accountbuttonField.toString()+ "<br>");
        clickOnElement(accountbuttonField);
    }

    public String getAuthenticationText1() {
        Reporter.log("getting  text from authenticationText"+authenticationText.toString()+"<br>");
        return getTextFromElement(authenticationText);
    }

    public String getCreateAcoountText() {
        Reporter.log("getting  text from createAnAccountText"+createAnAccountText.toString()+"<br>");
        return getTextFromElement(createAnAccountText);
    }

    public void sinInToApplication(String username, String password) {
        setEmailAddressField(username);
        setPasswordField(password);
        clickOnSignIn();
    }

    public String geterrorMsg() {
        Reporter.log("getting  text from errorMsg"+errorMsg.toString()+"<br>");
        return getTextFromElement(errorMsg);
    }


}
