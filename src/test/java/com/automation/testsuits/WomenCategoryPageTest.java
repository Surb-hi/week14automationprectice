package com.automation.testsuits;

import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        womenCategoryPage.getWomen();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(womenCategoryPage.getWomenText(), "WOMEN", "");
        softAssert.assertAll();
    }

    @Test(dataProvider = "ProcuctChoice", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour) throws InterruptedException {
        womenCategoryPage.getWomen();
        Thread.sleep(2000);
        womenCategoryPage.selectProduct(product);
        productPage.setClearProductQuantity();
        productPage.setProductQuantity(qty);
        productPage.setProductSize(size);
        Thread.sleep(2000);
        productPage.setProductcolour(colour);
        productPage.setAddToCardProduct();
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productPage.getProductAddedText(), "Product successfully added to your shopping cart");
        softAssert.assertAll();
        Thread.sleep(2000);
        productPage.canclecrossbutton();

    }

}
