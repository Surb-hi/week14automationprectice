package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccount extends Utility {

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement sinout;

    public String clickOnsinOutText() {

        Reporter.log("getting  text from sinout" + sinout.toString() + "<br>");

        return getTextFromElement(sinout);
    }

    public void clickOnSinOut() {
        Reporter.log("Clicking on sinout" + sinout.toString() + "<br>");

        clickOnElement(sinout);
    }

    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myaccountText;

    public String getMyAccountText() {
        Reporter.log("getting  text from myaccountText " + myaccountText.toString() + "<br>");

        return getTextFromElement(myaccountText);
    }
}
