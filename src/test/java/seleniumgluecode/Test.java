package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Test extends TestBase{

    @Given("^The user is in the Org Login Page$")
    public void the_user_is_in_the_Org_Login_Page() throws Throwable {
        Assert.assertEquals(loginPage.getLoginPageTitle(), driver.getTitle());

    }

    @When("^the user fills in an email: \"([^\"]*)\"$")
    public void the_user_fills_in_an_email(String strUsername) throws Throwable {
        WebElement inputUsername=driver.findElement(loginPage.getInputUsername());
        inputUsername.sendKeys(strUsername);


    }

    @Then("^the Setup Page should be shown to the user$")
    public void the_Setup_Page_should_be_shown_to_the_user() throws Throwable {

        WebElement searchBar = driver.findElement(setupPage.getSearchBar());
        Assert.assertTrue("Login Failed",searchBar.isDisplayed());
    }

    @Then("^an error message should be shown to the user$")
    public void an_error_message_should_be_shown_to_the_user() throws Throwable {

        WebElement loginErrorMessage = driver.findElement(loginPage.getLoginErrorMessage());
        Assert.assertTrue("Login Succeeded when it Shouldn't",loginErrorMessage.isDisplayed());
    }

    @And("^writes a password: \"([^\"]*)\"$")
    public void writesAPassword(String strPass) throws Throwable {
        WebElement inputPass=driver.findElement(loginPage.getInputPass());
        WebElement acceptButton=driver.findElement(loginPage.getAcceptButton());

        inputPass.sendKeys(strPass);
        acceptButton.click();
    }
}
