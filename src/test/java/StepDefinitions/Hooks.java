package StepDefinitions;

import DineProject.Utils.BasePage;
import DineProject.Utils.UtilsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BasePage {
    @Before
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        UtilsPage.sleep(5000);
        driver.findElement(By.xpath("//a[@class='fltlft location-yes-btn']")).click();
    }
   /* @After
    public void closeBrowser()
    {
        UtilsPage.sleep(5000);
        driver.navigate().refresh();
    }*/


}
