package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement productQuantity;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement productSize;

    @FindBy(xpath = "//label[contains(text(),'Color')]")
    WebElement productcolour;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCardProduct;

    public void  setClearProductQuantity(){
       sendTextToElementclear(productQuantity);
    }
    public void setProductQuantity(String qty){
        sendTextToElement(productQuantity,"2");
    }
    public void setProductSize(String size){
        selectByVisibleTextFromDropDown(productSize,size);

    }
    @FindBy(xpath = "//a[@title='White']")
    WebElement blousecolorWhite;

    @FindBy(xpath = "//a[@title='Orange']")
    WebElement printedDrescolorOrange;

    @FindBy(xpath = "//a[@title='Green']")
    WebElement PrintedChiffonDresscolorGreen;

    @FindBy(xpath = "//a[@title='Blue']")
    WebElement  PrintedSummerDresswithPrice$2898colorBlue;

    public void setProductcolour(String colour) {
        if (colour == "White") {
            Reporter.log("Clicking on White"+ blousecolorWhite.toString()+ "<br>");
            clickOnElement(blousecolorWhite);
        } else if (colour == "Orange") {
            Reporter.log("Clicking on Orange"+ printedDrescolorOrange.toString()+ "<br>");
            clickOnElement(printedDrescolorOrange);
        } else if (colour == "Green") {
            Reporter.log("Clicking on Green"+ PrintedChiffonDresscolorGreen.toString()+ "<br>");
            clickOnElement(PrintedChiffonDresscolorGreen);
        } else if (colour == "Blue") {
            Reporter.log("Clicking on Blue"+ PrintedSummerDresswithPrice$2898colorBlue.toString()+ "<br>");
            clickOnElement(PrintedSummerDresswithPrice$2898colorBlue);
        }
    }
    public void setAddToCardProduct(){
        Reporter.log("Clicking on addToCardProduct"+ addToCardProduct.toString()+ "<br>");
        clickOnElement(addToCardProduct);
    }

    @FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")//"/div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement productAdded;

    public String getProductAddedText(){
        Reporter.log("getting  text from productAdded"+productAdded.toString()+"<br>");
        return getTextFromElement(productAdded);
    }

    @FindBy(xpath ="//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement crossbutton;

    public void canclecrossbutton(){
        Reporter.log("Clicking on crossbutton"+ crossbutton.toString()+ "<br>");
        clickOnElement(crossbutton);
    }

}
