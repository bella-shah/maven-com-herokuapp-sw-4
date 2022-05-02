package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernamefield = By.xpath("//input[@id='username']");
    By passwordField = By.xpath("//input[@='password']");
    By loginButton = By.xpath("//[contains(text(),'London']");
    By verifyText = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By invalidVerifyText = By.xpath("//div[@id='flash");

    public void enterUserName(String username) {
        sendTextToElement(usernamefield, username);
    }

    public void enterpassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(verifyText);
    }

    public String getErrorMessageInvalid() {
        return getTextFromElement(invalidVerifyText);
    }
}
