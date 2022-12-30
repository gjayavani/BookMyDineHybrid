package DineProject.Pages;

import DineProject.Utils.BasePage;
import DineProject.Utils.UtilsPage;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(css = ".home-container")
    WebElement hometabs;
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    public boolean isUserOnHomepage()
    {
         return hometabs.isDisplayed();
    }
}
