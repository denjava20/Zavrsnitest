package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverwievPage extends BasePage {
    
            public CheckoutOverwievPage (WebDriver driver){
        super(driver);
    }

    By FinishButton = By.id("finish");
    By PopUpMessage = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    By totalPrice = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]");
    By itemPrice = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]");
    By taxPrice = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]");

        public CheckoutOverwievPage getTotalAndTaxPrice() {
        double t1 = Double.parseDouble(readText(itemPrice).substring(13));
        double t2 = Double.parseDouble(readText(taxPrice).substring(6));
        double t3 = t1 + t2;
        double p1 = Double.parseDouble(readText(totalPrice).substring(8));
        assertEquals(t3, p1, 0);
        return this;
    }

        public CheckoutOverwievPage clickFinishButton() {
        click(FinishButton);
                        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;
}

public String getTextFromPopUpMessage() {
    String textFromPopUp = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
    return textFromPopUp;
}
}
