package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import pages.BasePage;
import pages.CartPage;
import pages.CheckoutInfoPage;
import pages.CheckoutOverwievPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class VerifyMessageTest extends BaseTest {



    @Test
    public void DidPopUpMessageAppear() {

    LoginPage loginPage = new LoginPage(driver);
    ProductPage productPage = new ProductPage(driver);
    BasePage basePage = new BasePage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);
    CheckoutOverwievPage checkoutOverwievPage = new CheckoutOverwievPage(driver);

    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String expectedPopUpMessage = "Thank you for your order!";

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
         checkoutOverwievPage.clickFinishButton();
         basePage.assertTextEquals(expectedPopUpMessage, checkoutOverwievPage.getTextFromPopUpMessage());
    }

}
