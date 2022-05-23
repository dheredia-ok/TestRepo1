package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private String loginPageTitle="Login | Salesforce";

    private By acceptButton=By.cssSelector("#Login");

    private By loginErrorMessage = By.cssSelector("#error");

    private By inputUsername=By.id("username");

    private By inputPass=By.id("password");

    public String getLoginPageTitle() {
        return loginPageTitle;
    }

    public By getAcceptButton() {
        return acceptButton;
    }

    public By getLoginErrorMessage() {
        return loginErrorMessage;
    }

    public By getInputUsername() {
        return inputUsername;
    }

    public By getInputPass() {
        return inputPass;
    }
}
