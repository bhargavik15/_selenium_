package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPractice {
   static WebDriver driver;

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement female_radio_button=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));
       // female_radio_button.click();

        boolean status=female_radio_button.isDisplayed();

        System.out.println("female radio button is Displayed >>"+status);

        boolean enabled_status=female_radio_button.isEnabled();

        System.out.println("female radio button is Enabled >>"+enabled_status);

        boolean selected_status=female_radio_button.isSelected();

        System.out.println("female radio button is Selected >>"+selected_status);

        female_radio_button.click();

        boolean selected_status_new=female_radio_button.isSelected();

        System.out.println("female radio button is Selected >>"+selected_status_new);

    }



}
