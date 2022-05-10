package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement Title;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement Firstname;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement Lastname;

    @FindBy(xpath = "//input[@id='email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement Password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement DateofBirth;

    @FindBy(xpath = "//select[@id='months']")
    WebElement MonthofBirth;

    @FindBy(xpath = "//select[@id='years']")
    WebElement YearofBirth;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterBox;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialOffersBox;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastName;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateField;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipPostalCodeField;

    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryField;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhoneField;

    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAnAddressaLiasForFutureReference;

    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerbutton;

    public void setTitle() {
        Reporter.log("Clicking on Title" + Title.toString() + "<br>");
        clickOnElement(Title);
    }

    public void setFirstname(String firstname) {
        Reporter.log("Enter firstname" + firstname + " to firstname field " + Firstname.toString() + "<br>");
        sendTextToElement(Firstname, firstname);
    }

    public void setLastname(String lastname) {
        Reporter.log("Enter lastname " + lastname + " to lastname  field " + Lastname.toString() + "<br>");
        sendTextToElement(Lastname, lastname);
    }

    public void setEmailAddress(String emailAddress) {
        Reporter.log("Enter emailAddress" + emailAddress + " to emailAddress field " + Email.toString() + "<br>");
        sendTextToElement(Email, emailAddress);
    }

    public void setpassword(String passwordfield) {
        Reporter.log("Enter passwordfield" + passwordfield + " to  field " + Password.toString() + "<br>");
        sendTextToElement(Password, passwordfield);
    }

    public void selectBirthDate(String birthDate) {
        Reporter.log("Selecting birthDate " + birthDate + " from dropdown " + DateofBirth.toString() + "<br>");
        selectByValueFromDropDown(DateofBirth, birthDate);
    }

    public void selectBirthMonth(String birthMonth1) {
        Reporter.log("Selecting birthMonth" + birthMonth1 + " from dropdown " + MonthofBirth.toString() + "<br>");
        selectByValueFromDropDown(MonthofBirth, birthMonth1);
    }

    public void selectBirthYear(String birthYear) {
        Reporter.log("Selecting birthYear" + birthYear + " from dropdown " + YearofBirth.toString() + "<br>");
        selectByValueFromDropDown(YearofBirth, birthYear);
    }

    public void clicknewnewsletter() {

        Reporter.log("Clicking on newsletterBox" + newsletterBox.toString() + "<br>");
        clickOnElement(newsletterBox);
    }

    public void clickonspecialoffer() {

        Reporter.log("Clicking on specialOffersBox" + specialOffersBox.toString() + "<br>");
        clickOnElement(specialOffersBox);
    }

    public void setAddressFirstname(String addressfirstname) {
        Reporter.log("Enter addressfirstname" + addressfirstname + " to  field " + addressFirstName.toString() + "<br>");
        sendTextToElement(addressFirstName, addressfirstname);
    }

    public void setAddressLastname(String addresslastname) {
        Reporter.log("Enter addresslastname " + addresslastname + " to  field " + addressLastName.toString() + "<br>");
        sendTextToElement(addressLastName, addresslastname);
    }

    public void setAddress(String address) {
        Reporter.log("Enter address" + address + " to  field " + addressField.toString() + "<br>");
        sendTextToElement(addressField, address);
    }

    public void setCity(String City) {
        Reporter.log("Enter City" + City + " to  field " + cityField.toString() + "<br>");
        sendTextToElement(cityField, City);
    }

    public void setState(String state) {
        Reporter.log("Enter state " + state + " to  field " + stateField.toString() + "<br>");
        sendTextToElement(stateField, state);
    }

    public void setZipPostalCode(String zipPostalCode) {
        Reporter.log("Enter zipPostalCode" + zipPostalCode + " to  field " + zipPostalCodeField.toString() + "<br>");
        sendTextToElement(zipPostalCodeField, zipPostalCode);
    }

    public void setCountry(String country) {
        Reporter.log("Selecting country" + country + " from dropdown " + countryField.toString() + "<br>");
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void setMobilePhone(String mobilePhone) {
        Reporter.log("Enter mobilePhone " + mobilePhone + " to  field " + mobilePhoneField.toString() + "<br>");
        sendTextToElement(mobilePhoneField, mobilePhone);
    }

    public void setAssignAnAddressaLiasForFutureReference(String referenceAddress) {
        Reporter.log("Enter referenceAddress" + referenceAddress + " to  field " + assignAnAddressaLiasForFutureReference.toString() + "<br>");
        sendTextToElement(assignAnAddressaLiasForFutureReference, referenceAddress);
    }

    public void clickOnRegister() {
        Reporter.log("Clicking on registerbutton " + registerbutton.toString() + "<br>");
        clickOnElement(registerbutton);
    }
}
