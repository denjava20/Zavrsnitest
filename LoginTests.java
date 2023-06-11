package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    public LoginPage loginPage;
    public HomePage hoHomePage;

    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String homePageTitle = "Products";

    String suspendeduser = "locked_out_user";
    String suspendedUserError = "Epic sadface: Sorry, this user has been locked out.";

    String emptyUsername = "";
    String emptyUsernameError = "Epic sadface: Username is required";

    String emptyPassword = "";
    String emptyPasswordError = "Epic sadface: Password is required";

    @Test
    public void verifySuccesfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        homePage.verifySuccesfulLogin(homePageTitle);

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void verifySuspendedUser(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(suspendeduser, password);
        loginPage.verifyUnsucessfullLogin(suspendedUserError);

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test 
    public void verifyUnsucessfullUsernameLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emptyUsername, password);
        loginPage.verifyUnsucessfullLogin(emptyUsernameError);

try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test 
    public void verifyUnsucessfullEmptyPasswordLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, emptyPassword);
        loginPage.verifyUnsucessfullLogin(emptyPasswordError);

try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
}
}