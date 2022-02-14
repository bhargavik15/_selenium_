package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws AWTException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open facebook
        driver.get("http://www.facebook.com");

        // Enter Username
        driver.findElement(By.id("email")).sendKeys("bhsargsavi");

        // Enter password
        driver.findElement(By.id("pass")).sendKeys("Bhargavi123");

        // Create object of Robot class
        Robot r=new Robot();

        // Press Enter
        r.keyPress(KeyEvent.VK_ENTER);

        // Release Enter
        r.keyRelease(KeyEvent.VK_ENTER);

    }

}

