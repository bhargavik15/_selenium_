package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class ValidatingTables {
    static WebDriver driver;


    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window();
        driver.get("https://www.w3schools.com/html/html_tables.asp");


        //*[@id="customers"]/tbody/tr[1]/td[1]
        //*[@id="customers"]/tbody/tr[2]/td[1]
        //*[@id="customers"]/tbody/tr[3]/td[1]
        //*[@id="customers"]/tbody/tr[4]/td[1]

        //*[@id="customers"]/tbody/tr[1]

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        int rowsCount=rows.size();
        System.out.println("the total number of row count in a table :"+rowsCount);



        //------------first column list--------------

        String beforeXpath="//*[@id='customers']/tbody/tr[";
        String afterXpath="]/td[1]";
        for(int i=2;i<=rowsCount;i++)
        {
            String actualXpath=beforeXpath+i+afterXpath;
            WebElement element=driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
            if(element.getText().equalsIgnoreCase("Island Trading"))
            {

                System.out.println("company name:"+element.getText()+"is found");



            }
        }
        //*[@id="customers"]/tbody/tr[1]/th[2]
        //*[@id="customers"]/tbody/tr[2]/td[2]

        //-----------------second column list-----------

        String beforeXpathContact="//*[@id='customers']/tbody/tr[";
        String afterXpathContact="]/td[2]";
        for(int i=2;i<=rowsCount;i++)
        {
            String actualXpath=beforeXpathContact+i+afterXpathContact;
            WebElement element=driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
            if(element.getText().equalsIgnoreCase("Maria Anders"))
            {

                System.out.println("contact person name:"+element.getText()+"is found");


            }
        }

        //-----------------third column list---------------

        String beforeXpathContact1="//*[@id='customers']/tbody/tr[";
        String afterXpathContacts="]/td[3]";
        for(int i=2;i<=rowsCount;i++)
        {
            String actualXpath=beforeXpathContact1+i+afterXpathContacts;
            WebElement element=driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
            if(element.getText().equalsIgnoreCase("Germany"))
            {

                System.out.println("country name:"+element.getText()+"is found");


            }
        }







        //-----------------handle web table columns----------------------

        //*[@id="customers"]/tbody/tr[1]/th[1]
        //*[@id="customers"]/tbody/tr[1]/th[2]
        //*[@id="customers"]/tbody/tr[1]/th[3]
        String colBeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
        String colAfterXpath="]";

        List<WebElement> coloumn=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
        int colCount=coloumn.size();
        System.out.println("the total number of col count in a table :"+colCount);




        for(int i=1;i<=colCount;i++)
        {

            String colActualXpath=colBeforeXpath+i+colAfterXpath;
            WebElement element=driver.findElement(By.xpath(colActualXpath));

            System.out.println(element.getText());

            //System.out.println("company:"+element.getText());

        }




    }
}


