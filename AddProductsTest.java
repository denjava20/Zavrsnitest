package tests;

import org.junit.Test;

import pages.BasePage;
import pages.CartPage;
import pages.CheckoutInfoPage;
import pages.CheckoutOverwievPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddProductsTest extends BaseTest {

    @Test
    public void AddProductsInBasket() {
    LoginPage loginPage = new LoginPage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    
        String standardUsername = "standard_user";
        String password = "secret_sauce";

         loginPage.basePage();
         loginPage.login(standardUsername, password);
         productPage.clickOnFirstProductButton();
         productPage.clickOnSecondProductButton();
         cartPage.numberOfOrpudcts();
         productPage.clickBasketButton();  

    }
}
