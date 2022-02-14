package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

            /*The purpose of this test script for download the file
               1.First I created a class like DownloadFiles
               2.created a method DownloadFile
               3.Here I used testNG
               4.I used url like StudentRegistration form
               5.I copy the chromeOptions for download a file within the project instead of Download
             */

public class DownloadFiles {
    WebDriver driver;
    @Test
    public void DownloadFile() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);

        String downloadFilePath=System.getProperty("user.dir");
        chromePrefs.put("download.default_directory", downloadFilePath);

        option.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.linkText("Download")).click();
        Thread.sleep(2000);
        File file=new File(downloadFilePath+"\\sampleFile.jpeg");
        if(file.exists()){
            System.out.println("file got successfully downloaded");
        }
        else {
            System.out.println("file is not downloaded");
        }

    }
}
