package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public ChromeDriver driver;

    @Given("^El usuario se encuentra en la pantalla Home de I'm a Little Tester$")
    public void el_usuario_se_encuentra_en_la_pantalla_Home_de_I_m_a_Little_Tester() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver");
        //Iniciando objeto driver:
        driver=new ChromeDriver();

        //Entrando a la página:
        driver.get("https://imalittletester.com/");

        //Maximizando la página:
        driver.manage().window().maximize();

    }

    @When("^Hace clic en The Little Testers Comic$")
    public void hace_clic_en_The_Little_Testers_Comic() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        WebElement comicsLink = driver.findElement(By.id("menu-item-2008"));
        comicsLink.click();

    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

        WebElement comicsTitle = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirigió a la categoría Cómics",comicsTitle.isDisplayed());
        Assert.assertEquals("Category: comics",comicsTitle.getText());
        driver.close();
        driver.quit();

    }

}
