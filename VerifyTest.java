package tests;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Verify;

import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class VerifyTest extends BaseTest {
    
public ProductPage verifyPage;


    @Test
    public void verifyFirstItemsByName(){
    
        String expected = "Sauce Labs Backpack";
        String standardUsername = "standard_user";
        String password = "secret_sauce";
        ProductPage verifyPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
         BasePage basePage = new BasePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        verifyPage.verifyFirstProductName(expected);
    }

 @Test 
    public void verifySecondItemsByName(){
    
        String expected = "Sauce Labs Bike Light";
        String standardUsername = "standard_user";
        String password = "secret_sauce";
        ProductPage verifyPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        verifyPage.verifySecondProductName(expected);
    }

 @Test 
    public void verifyTirthItemsByName(){
    
        String expected = "Sauce Labs Bolt T-Shirt";
        String standardUsername = "standard_user";
        String password = "secret_sauce";
        ProductPage verifyPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        verifyPage.verifyThirdProductName(expected);
    }

 @Test 
    public void verifyFourthItemsByName(){
    
        String expected = "Sauce Labs Fleece Jacket";
        String standardUsername = "standard_user";
        String password = "secret_sauce";
        ProductPage verifyPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        verifyPage.verifyFourthProductName(expected);
    }

 @Test 
    public void verifyFifthItemsByName(){
    
        String expected = "Sauce Labs Onesie";
        String standardUsername = "standard_user";
        String password = "secret_sauce";
        ProductPage verifyPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        verifyPage.verifyFifthProductName(expected);
    }

 @Test 
    public void verifySixthItemsByName(){
    
        String expected = "Test.allTheThings() T-Shirt (Red)";
        String standardUsername = "standard_user";
        String password = "secret_sauce";
        ProductPage verifyPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        verifyPage.verifySixthProductName(expected);
    }
  }


