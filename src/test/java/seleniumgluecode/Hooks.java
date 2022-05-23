package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static ChromeDriver driver;

    @Before
    public void setUp(){
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

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }


}
