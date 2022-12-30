package DineProject.Utils;

import org.openqa.selenium.WebElement;

public class UtilsPage extends BasePage
{
    public static boolean isElementDisplayed(WebElement element)
    {
        return element.isDisplayed();
    }
    public static String getPageTitle()
    {
        return driver.getTitle();
    }
    public static void sleep(int sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

