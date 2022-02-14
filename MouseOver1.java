package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class MouseOver1 {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/");
        driver.getTitle();
        driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a")).click();
        WebElement element = driver.findElement(By.xpath("/html/body/div/main/div[4]/div/div/p[2]/a"));
        element.click();
        driver.quit();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

}



