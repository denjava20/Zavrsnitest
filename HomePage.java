package pages;

import static org.junit.Assert.assertEquals;

import java.security.spec.ECField;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import junit.framework.AssertionFailedError;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        super(driver);
    }

    By homePageTitleBy = By.className("title");
    By addToCartButton1By = By.id("add-to-cart-sauce-labs-backpack");
    By shoopingCartBadgeBy = By.className("shopping_cart_badge");
    By numberOfItems = By.className("inventory_item");
    By menuButtonBy = By.id("react-burger-menu-btn");
    By aboutButtonBy = By.id("about_sidebar_link");
    By p1 = By.xpath("//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/div");
    By p2 = By.xpath("//*[@id='inventory_container']/div/div[2]/div[2]/div[2]/div");
    By p3 = By.xpath("//*[@id='inventory_container']/div/div[3]/div[2]/div[2]/div");
    By p4 = By.xpath("//*[@id='inventory_container']/div/div[4]/div[2]/div[2]/div");
    By p5 = By.xpath("//*[@id='inventory_container']/div/div[5]/div[2]/div[2]/div");
    By p6 = By.xpath("//*[@id='inventory_container']/div/div[6]/div[2]/div[2]/div");
    By sortButtonBy = By.xpath("//*[@id='header_container']/div[2]/div/span/select");
    By lthButtonBy = By.xpath("//*[@id='header_container']/div[2]/div/span/select/option[3]");

    public HomePage verifySuccesfulLogin(String expectedText){
        String actualText = readText(homePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public HomePage verifyProductAddedToCart(){
        click(addToCartButton1By);
        waitVisability(shoopingCartBadgeBy);
        return this;
    }
    
    public HomePage numberOfProducts( int expectedNumberOfProducts){
        int actualNumbersOfProducts = countItems(numberOfItems);
        assertIntegerEquals(expectedNumberOfProducts, actualNumbersOfProducts);
        return this;
    }

    public HomePage clickOnMenuButton(){
        click(menuButtonBy);
        return this;
    }
    public HomePage verifyAboutLink(String expectedLink){
        String actualLink = readLink(aboutButtonBy);
        assertTextEquals(expectedLink, actualLink);
        return this;
    }

}
