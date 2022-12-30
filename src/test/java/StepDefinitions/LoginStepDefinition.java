package StepDefinitions;
import DineProject.Pages.HomePage;
import DineProject.Pages.LoginPage;
import DineProject.Utils.BasePage;
import DineProject.Utils.UtilsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class LoginStepDefinition {
        public static WebDriver driver;
        LoginPage loginPage = new LoginPage();
        HomePage homepage = new HomePage();

        @Given("^User on the homepage$")
        public void verifyUserIsOnHomePage() {
            UtilsPage.sleep(5000);
            Assert.assertTrue(homepage.isUserOnHomepage());
        }

        @When("^User selects login tab$")
        public void verifyLoginTab() {
            UtilsPage.sleep(5000);
            loginPage.selectLoginTab();
        }

        @Then("^User should be on the login window$")
        public void verifyUserIsOnLoginWindow() {
            UtilsPage.sleep(5000);
            Assert.assertTrue(loginPage.isUserOnLoginWindow());
        }

        @When("^User enters username as (.*) & password as (.*)$")
        public void enterLoginCredentials(String username, String password) {
            UtilsPage.sleep(5000);
            loginPage.userEntersCredentials(username, password);
        }

        @And("User selects signin link")
        public void verifyUserSelectSignin() {
            UtilsPage.sleep(5000);
            loginPage.userSelectSignin();
        }

        @Then("^User should be logged in$")
        public void verifyUserSignin() {
            UtilsPage.sleep(5000);
            Assert.assertTrue(loginPage.verifySignin());
        }

        @Then("^User should see the message (.*)$")
        public void verifyErrorMessage(String errormsg) {
            UtilsPage.sleep(5000);
            Assert.assertEquals(errormsg, loginPage.errorMessage());
        }

        @Then("^User should see the error message$")
        public void validateErrorMessage() {
            UtilsPage.sleep(5000);
            Assert.assertTrue(loginPage.errorMessage2());
        }
    }



