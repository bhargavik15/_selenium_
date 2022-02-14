package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.nio.charset.StandardCharsets;

public class Alerts {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, AWTException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        System.out.println(message);
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //button[contains(text(),'Confirm Box')]")).click();
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.mouseMove(400, 5);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        driver.close();
    }


}
