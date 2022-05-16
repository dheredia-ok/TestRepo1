package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test {

    public ChromeDriver driver;


    @Given("^The user is in the Org Login Page$")
    public void the_user_is_in_the_Org_Login_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver");
        //Starting Driver Object:
        driver=new ChromeDriver();

        //Setting implicit wait time:
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        //Getting into the page:
        driver.get("https://teamorg2-dev-ed.lightning.force.com");

        //Maximizing the page:
        driver.manage().window().maximize();
    }

    @When("^the user fills in an email: \"([^\"]*)\"$")
    public void the_user_fills_in_an_email(String strUsername) throws Throwable {

        WebElement inputUsername=driver.findElement(By.id("username"));
        inputUsername.sendKeys(strUsername);

    }

    @When("^the password is correct: \"([^\"]*)\"$")
    public void the_password_is_correct(String strPass) throws Throwable {

        WebElement inputPass=driver.findElement(By.id("password"));
        WebElement acceptButton=driver.findElement(By.cssSelector("#Login"));

        inputPass.sendKeys(strPass);
        acceptButton.click();
    }

    @When("^the password is incorrect: \"([^\"]*)\"$")
    public void the_password_is_incorrect(String strPass) throws Throwable {

        WebElement inputPass=driver.findElement(By.id("password"));
        WebElement acceptButton=driver.findElement(By.cssSelector("#Login"));

        inputPass.sendKeys(strPass);
        acceptButton.click();
    }

    @Then("^the Setup Page should be shown to the user$")
    public void the_Setup_Page_should_be_shown_to_the_user() throws Throwable {

        WebElement searchBar = driver.findElement(By.cssSelector("#\\31 55\\:82\\;a"));
        Assert.assertTrue("Login Failed",searchBar.isDisplayed());
        driver.close();
        driver.quit();
    }



    @Then("^an error message should be shown to the user$")
    public void an_error_message_should_be_shown_to_the_user() throws Throwable {

        WebElement errorMessage = driver.findElement(By.cssSelector("#error"));
        Assert.assertTrue("Login Succeeded when it Shouldn't",errorMessage.isDisplayed());
        driver.close();
        driver.quit();
    }

}
