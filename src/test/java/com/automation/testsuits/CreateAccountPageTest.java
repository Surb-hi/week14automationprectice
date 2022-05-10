package com.automation.testsuits;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    CreateAccountPage createAccountPage;
    SignInPage signInPage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;
    MyAccount myAccount;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        createAccountPage=new CreateAccountPage();
        signInPage=new SignInPage();
        womenCategoryPage=new WomenCategoryPage();
        productPage=new ProductPage();
        myAccount=new MyAccount();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnSinInTab();
        signInPage.setRegisterEmail("prime0@gmail.com");
        signInPage.clickOnAccountButton();
        createAccountPage.setTitle();
        createAccountPage.setFirstname("prime");
        createAccountPage.setLastname("patel");
        createAccountPage.setpassword("prime1005");
        createAccountPage.selectBirthDate("1");
        createAccountPage.selectBirthMonth("9");
        createAccountPage.selectBirthYear("1997");
        createAccountPage.clicknewnewsletter();
        createAccountPage.clickonspecialoffer();
        createAccountPage.setAddressFirstname("prime");
        createAccountPage.setAddressLastname("patel");
        createAccountPage.setAddress("334 portland");
        createAccountPage.setCity("pune");
        createAccountPage.setState("westmiddlamd");
        createAccountPage.setZipPostalCode("30060");
        createAccountPage.setCountry("United States");
        createAccountPage.setMobilePhone("9898989898");
        createAccountPage.setAssignAnAddressaLiasForFutureReference("334 portland LONDON");
        createAccountPage.clickOnRegister();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(myAccount.getMyAccountText(),"MY ACCOUNT","");
        softAssert.assertAll();
    }

}
