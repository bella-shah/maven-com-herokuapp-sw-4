package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage  loginPage = new LoginPage();
    @Test
    public void userShouldLoginsuccessfullWithValidCredential() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage ="Secure Area";
        String actualErrorMessage  = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Error message Displyed");

    }@Test
    public void verifyTheUsernameErrorMeassge() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "your username is invalid!" + "x";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message Displyed");
    }
    @Test
    public void verifypasswordErrorMeassge() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "your password is invalid!" + "x";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message Displyed");
    }
    }
