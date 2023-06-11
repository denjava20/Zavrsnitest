package tests;

import org.junit.Test;

import pages.BasePage;
import pages.CartPage;
import pages.CheckoutInfoPage;
import pages.CheckoutOverwievPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class VerifyTotalPriceTest extends BaseTest {
    
@Test
public void TotalPrices() {
 
    LoginPage loginPage = new LoginPage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);
    CheckoutOverwievPage checkoutOverwievPage = new CheckoutOverwievPage(driver);
    
    String standardUsername = "standard_user";
    String password = "secret_sauce";

         loginPage.basePage();
         loginPage.login(standardUsername, password);
         productPage.clickOnFirstProductButton();
         productPage.clickOnSecondProductButton();
         productPage.clickBasketButton();
         cartPage.clickCheckOutButton();
         checkoutInfoPage.addFirstName();
         checkoutInfoPage.addSecondName();
         checkoutInfoPage.addZipCode();
         checkoutInfoPage.clickContinueButton();
         checkoutOverwievPage.getTotalAndTaxPrice();
}
}
