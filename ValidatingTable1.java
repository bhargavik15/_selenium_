package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTable1 {
    static WebDriver driver;



    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        Thread.sleep(2000);


        WebElement elements= driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody"));
        System.out.println(elements.getText());


        //*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[1]/td[1]
        //*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[2]/td[1]


        //------------first column list--------------

        String beforeXpath = "//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath = "]/td[1]";
        for (int i = 1; i <= 4; i++) {
            String actualXpath = beforeXpath + i + afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());

            if (element.getText().equalsIgnoreCase("UAE")) {

                System.out.println("country name:" + element.getText() + "is found");


            }
        }


        //*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[1]/td[2]
        //*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[2]/td[2]

        //-----------------second column list-----------

        String beforeXpathContact = "//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpathContact = "]/td[2]";
        for (int i = 1; i <= 4; i++) {
            String actualXpath = beforeXpathContact + i + afterXpathContact;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
            if (element.getText().equalsIgnoreCase("Dubai")) {

                System.out.println("city name:" + element.getText() + "is found");


            }
        }


            //-----------------third column list---------------

            String beforeXpathContact1 = "//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
            String afterXpathContacts = "]/td[3]";
            for (int i = 1; i <= 4; i++) {
                String actualXpath = beforeXpathContact1 + i + afterXpathContacts;
                WebElement element = driver.findElement(By.xpath(actualXpath));
                System.out.println(element.getText());

                if (element.getText().equalsIgnoreCase("829m")) {

                    System.out.println("height:" + element.getText() + "is found");


                }
            }
        //-----------------fourth column list---------------
                String beforeXpathContact2 = "//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
                String afterXpathContacts2 = "]/td[4]";
                for (int i = 1; i <= 4; i++) {
                    String actualXpath2 = beforeXpathContact2 + i + afterXpathContacts2;
                    WebElement element2 = driver.findElement(By.xpath(actualXpath2));
                    System.out.println(element2.getText());
                    if (element2.getText().equalsIgnoreCase("2010")) {

                        System.out.println("built:" + element2.getText() + "is found");


                    }

                }


            }

        }






