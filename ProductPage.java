package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    
    public ProductPage (WebDriver driver){
        super(driver);
    }


By FirstProdictName = By.xpath("//*[@id=\"item_4_title_link\"]/div");
By SecondProdictName = By.xpath("//*[@id=\"item_0_title_link\"]/div");
By ThirdProdictName = By.xpath("//*[@id=\"item_1_title_link\"]/div");
By FourthProdictName = By.xpath("//*[@id=\"item_5_title_link\"]/div");
By FifthrodictName = By.xpath("//*[@id=\"item_2_title_link\"]/div");
By SixthProdictName = By.xpath("//*[@id=\"item_3_title_link\"]/div");
By firstProductButton = By.id("add-to-cart-sauce-labs-backpack");
By secondProductButton = By.id("add-to-cart-sauce-labs-bike-light");
By BasketButton = By.id("shopping_cart_container");


    public ProductPage verifyFirstProductName(String expectedText){
        String axtualText = readText(FirstProdictName);
        assertTextEquals(expectedText, axtualText);
        return this;
    }
        public ProductPage verifySecondProductName(String expectedText){
        String axtualText = readText(SecondProdictName);
        assertTextEquals(expectedText, axtualText);
        return this;
    }
            public ProductPage verifyThirdProductName(String expectedText){
        String axtualText = readText(ThirdProdictName);
        assertTextEquals(expectedText, axtualText);
        return this;
    }
            public ProductPage verifyFourthProductName(String expectedText){
        String axtualText = readText(FourthProdictName);
        assertTextEquals(expectedText, axtualText);
        return this;
    }
            public ProductPage verifyFifthProductName(String expectedText){
        String axtualText = readText(FifthrodictName);
        assertTextEquals(expectedText, axtualText);
        return this;
    }
            public ProductPage verifySixthProductName(String expectedText){
        String axtualText = readText(SixthProdictName);
        assertTextEquals(expectedText, axtualText);
        return this;
    }

            public ProductPage clickOnFirstProductButton(){
        click(firstProductButton);
                        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }  
      public ProductPage clickOnSecondProductButton(){
        click(secondProductButton);
                        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }
    public ProductPage clickBasketButton() {
        click(BasketButton);
                        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }
}
