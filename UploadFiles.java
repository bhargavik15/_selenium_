package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFiles {
    static WebDriver driver;
    @Test

    public void Upload(){


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\bhargavi.kallagunta\\Desktop\\tasks\\Selenium Grid.txt");
    }
}
