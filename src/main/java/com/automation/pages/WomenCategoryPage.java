package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenTab;

    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenText;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topsLink;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;

    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortBydropdown;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElement productsList;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[7]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedChiffonDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDresswithPrice$28;

    public void getWomen() {
        clickOnElement(womenTab);
    }

    public String getWomenText() {
        return getTextFromElement(womenText);
    }

    public void clickOnTops() {
        clickOnElement(topsLink);
    }

    public void clickOnDresses() {
        clickOnElement(dressesLink);
    }

    public void selectFromDropDown(String option) {
        selectByValueFromDropDown(sortBydropdown, option);
    }

    public void clickOnProductList() {
        clickOnElement(productsList);
    }

    public void selectProduct(String text) {

        if (text == "Blouse") {
            Reporter.log("Clicking on Blouse " + blouse.toString());
            clickOnElement(blouse);
        }

        if (text == "Printed Dress") {
            Reporter.log("Clicking on Printed Dress " + printedDress.toString());
            clickOnElement(printedDress);
        }
        if (text == "Printed Chiffon Dress") {
            Reporter.log("Clicking on Printed Chiffon Dress " + printedChiffonDress.toString());
            clickOnElement(printedChiffonDress);
        }
        if (text == "Printed Summer Dress with Price $28.98") {
            Reporter.log("Clicking on Printed Summer Dress with Price tag $28.98 " + printedSummerDresswithPrice$28.toString());
            clickOnElement(printedSummerDresswithPrice$28);
        }
    }
}
