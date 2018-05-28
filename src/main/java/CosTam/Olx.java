package CosTam;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)

public class Olx {

    WebDriver driver;

    @Given("^Data of site$")
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.olx.pl/");
    }

    @When("^Try to put annotation$")
    public void TypeSomeMessg() {
        System.out.println("Sialala, jestem na stronie olx");
    }

    @When("^Say about closing browser$")
    public void closeBrowsero() {
//        driver.close();
        System.out.println("zamykam");
    }

    @Then("^close browser$")
    public void closeBrowser(){
       driver.close();
    }
}
