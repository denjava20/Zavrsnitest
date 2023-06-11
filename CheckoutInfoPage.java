package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage extends BasePage {
    
            public CheckoutInfoPage (WebDriver driver){
        super(driver);
    }

    By FirstNameImput = By.id("first-name");
    By SecondNameImput = By.id("last-name");
    By ZipCodeImput = By.id("postal-code");
    By ContinueButton = By.id("continue");

    public CheckoutInfoPage addFirstName() {
        driver.findElement(FirstNameImput).sendKeys("50");
                try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

        public CheckoutInfoPage addSecondName() {
        driver.findElement(SecondNameImput).sendKeys("Cent");
                try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

        public CheckoutInfoPage addZipCode() {
        driver.findElement(ZipCodeImput).sendKeys("12345");
                try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }


    public CheckoutInfoPage clickContinueButton() {
        click(ContinueButton);
                        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return this;

}

}
