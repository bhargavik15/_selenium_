package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fire_Fox {
    static WebDriver driver;
    @Test

   public void OpenUrl() {
        WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

    }
}
