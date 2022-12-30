package DineProject.Pages;

import DineProject.Utils.BasePage;
import DineProject.Utils.UtilsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static DineProject.Utils.BasePage.driver;

public class LoginPage extends BasePage
    {
        @FindBy(css=".login-pan") WebElement login;
        @FindBy(xpath="//span[text()='Login']") WebElement Logintab;
        @FindBy(css = ".login-block-main") WebElement loginwindow;
        @FindBy(css = "#email") WebElement emailtab;
        @FindBy(css = "#password") WebElement passwordtab;
        @FindBy(css = "#login-btn") WebElement signintab;
        @FindBy(css = ".user-pan") WebElement signinpage;
        @FindBy(css = "#login-message") WebElement loginerrormessage;
        @FindBy(css = "div.login-block.active div#login-message") WebElement loginerrormessage2;

        public LoginPage() {
            PageFactory.initElements(driver,this);
        }
        public void selectLoginTab()
        {
            Logintab.click();
        }
        public boolean isUserOnLoginWindow()
        {
            return loginwindow.isDisplayed();
        }
        public void userEntersCredentials(String username,String password)
        {
            emailtab.sendKeys(username);
            passwordtab.sendKeys(password);
        }
        public void userSelectSignin()
        {
             signintab.click();
        }
        public boolean verifySignin()
        {
            return signinpage.isDisplayed();
        }
        public String errorMessage()
        {
           return loginerrormessage.getText();
        }
        public boolean errorMessage2()
        {
            return loginerrormessage2.isEnabled();
        }
}
