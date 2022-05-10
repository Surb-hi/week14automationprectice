package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenTab;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement dressesTab;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirtTab;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement sinInTab;

    @FindBy(xpath = "//img[@class='logo img-responsive']")
    WebElement logoTab;

    public void clickOnWomenTab() {
        Reporter.log("Clicking on womenTab" + womenTab.toString() + "<br>");
        clickOnElement(womenTab);
    }

    public void clickOnDressesTab() {
        Reporter.log("Clicking on dressesTab " + dressesTab.toString() + "<br>");
        clickOnElement(dressesTab);
    }

    public void clickOnTshirtTab() {
        Reporter.log("Clicking on tshirtTab " + tshirtTab.toString() + "<br>");
        clickOnElement(tshirtTab);
    }

    public void clickOnSinInTab() {
        Reporter.log("Clicking on sinInTab" + sinInTab.toString() + "<br>");
        clickOnElement(sinInTab);
    }

    public void clickOnLogoTab() {
        Reporter.log("Clicking on logoTab " + logoTab.toString() + "<br>");
        clickOnElement(logoTab);
    }
}
