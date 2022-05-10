package com.automation.testsuits;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {
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
    public void userShouldNavigateToSignInPageSuccessFully(){
        SoftAssert softAssert=new SoftAssert();
        homePage.clickOnSinInTab();
        softAssert.assertEquals(signInPage.getAuthenticationText1(),"AUTHENTICATION","");
        softAssert.assertAll();
    }
    @Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                            String message){
        homePage.clickOnSinInTab();
        signInPage.sinInToApplication(username,password);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(signInPage.geterrorMsg(),message,"sinIn Unsucessfully");
        softAssert.assertAll();
    }
    @Test(groups = "regression")
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnSinInTab();
        signInPage.setEmailAddressField("prime0@gmail.com");
        signInPage.setPasswordField("prime1005");
        signInPage.clickOnSignIn();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(myAccount.clickOnsinOutText(),"Sign out","");
        softAssert.assertAll();
    }
    @Test(groups = "regression")
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSinInTab();
        signInPage.setEmailAddressField("prime0@gmail.com");
        signInPage.setPasswordField("prime1005");
        signInPage.clickOnSignIn();
        myAccount.clickOnSinOut();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(signInPage.clickOnSignInText(),"Sign in","");
        softAssert.assertAll();
    }
}
