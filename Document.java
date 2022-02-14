package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Document {
    WebDriver driver;
    @Test
    public void main(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        //getPageSource() is used to get all the entire view of the html page for the given url

        String document_Webpage=driver.getPageSource();
        System.out.println("The document of web page is------>"+document_Webpage);

        //Mostly we use body tag so
        //Here i call tagName body
        //Here i get whatever the content is there in the body (HTML)

        WebElement document= driver.findElement(By.tagName("body"));
        System.out.println("Document context is:"+document.getText());

    }
}
