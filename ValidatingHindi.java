package google;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatingHindi {
   WebDriver driver;
   @BeforeTest
   void openUrl(){
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.get("https://www.google.com/");
   }
   @Test(priority = 1)
   void validateHindi(){
      driver.findElement(By.id("SIvCob")).click();
   }
   @Test(priority = 2)
   void validateEnglish(){
      driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
   }
   @AfterTest
   void closeBrowser(){
      driver.quit();
   }
}
