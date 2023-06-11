package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    
        public CartPage (WebDriver driver){
        super(driver);
    }

     By CheckOutButton = By.id("checkout");
     By NumberOfProductInBasket = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

         public CartPage clickCheckOutButton() {
        click(CheckOutButton);
                        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;

    }

        public CartPage numberOfOrpudcts() {
        String number = readText(NumberOfProductInBasket);
        assertTextEquals("2", number);
        return this;
    }
}
