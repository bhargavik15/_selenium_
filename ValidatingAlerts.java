package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ValidatingAlerts {
    static WebDriver driver;


    public static void main(String[] args) throws InterruptedException, AWTException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println("Total links:" + linksList.size());
        for (int i = 0; i < linksList.size(); i++) {
            System.out.println("Links on page are:" + linksList.get(i).getAttribute("href"));

            System.out.println("Link Name :" + linksList.get(i).getText());
        }

            // Thread.sleep(2000);
             driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
            //Thread.sleep(2000);
            Alert alert = driver.switchTo().alert();
            String message = alert.getText();
            System.out.println("content in alert box:" + message);
            alert.accept();
            driver.close();
        }



    }

