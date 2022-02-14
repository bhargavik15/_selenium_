package google;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ValidatingTable2 {
    WebDriver driver;
    List<WebElement> actualStructureColumn;
    List<WebElement> cellsInEachRow;
    @BeforeTest
    void openURL(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
    }
    @AfterTest
    void closeBrowser(){
        driver.close();
    }@BeforeMethod
    void commonMethod(){
        actualStructureColumn=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
        cellsInEachRow=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td"));
    }
    @Test()
    void verifyBurgKhalifaHeight(){
        for (int i=1;i<=actualStructureColumn.size();i++){
            for (int j = 1; j <= cellsInEachRow.size(); j++) {
                if (driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText().equals("829m")){
                    System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th")).getText());
                    //Assert.assertEquals(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[\"+i+\"]/td[\"+j+\"]")).getText(),"829m")
                }
            }
        }
    }
    @Test
    void getAllValuesRow_Wise(){
        for (int i=1;i<=actualStructureColumn.size();i++){
            System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th[1]")).getText());
            for (int j=1;j<=cellsInEachRow.size();j++) {
                System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText());
            }
            System.out.println("/////////////////////////////////////");
        }
    }
    @Test
    void verify4StructureValues(){
        Assert.assertEquals(actualStructureColumn.size(),4);
    }
    @Test
    void verify6thRowHasTwoColumns() {
        List<WebElement> footerhead = driver.findElements(By.xpath("//table/tfoot/tr/th"));
        List<WebElement> footercells = driver.findElements(By.xpath("//table/tfoot/tr/td"));
        int sixthrowColumnCount = footerhead.size() + footercells.size();
        Assert.assertEquals(sixthrowColumnCount, 2);
    }
}





