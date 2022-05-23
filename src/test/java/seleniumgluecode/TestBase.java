package seleniumgluecode;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.LoginPage;
import pom.SetupPage;

public class TestBase {
    protected ChromeDriver driver=Hooks.getDriver();
    protected LoginPage loginPage=new LoginPage();
    protected SetupPage setupPage=new SetupPage();

}
