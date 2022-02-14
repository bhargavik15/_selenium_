package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice {
    static  WebDriver driver;
    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        String URL="http://automationpractice.com/index.php";

                // Open URL and Maximize browser window
                driver.get(URL);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);



                //Click on Women
                driver.findElement(By.linkText("WOMEN")).click();

                WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
                WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
                Actions actions=new Actions(driver);
                actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();

                //Change quantity by 2
                driver.findElement(By.id("quantity_wanted")).clear();
                driver.findElement(By.id("quantity_wanted")).sendKeys("2");

                //Select size as L
                WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id='group_1']"));
                Select oSelect=new Select(Sizedrpdwn);
                oSelect.selectByVisibleText("M");

                //Select Color
                driver.findElement(By.id("color_11")).click();

                //Click on add to cart
                driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

                //Click on proceed
                driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
                //Checkout page Proceed
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
                //Agree terms&Conditions
                driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

                //Click on Payby Check
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
                //Confirm the order
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

                //Get Text
                String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();

                // Verify that Product is ordered
                if(ConfirmationText.contains("complete")) {
                    System.out.println("Order Completed: Test Case Passed");
                }
                else {
                    System.out.println("Order Not Successfull: Test Case Failed");
                }

            }
        }


