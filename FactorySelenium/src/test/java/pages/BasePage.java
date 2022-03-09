package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertiesFileReader;
import utils.RecordVideo;


public class BasePage {

    public static WebDriver driver;

    public void  setDriver()  {
        System.out.println("Launching Chrome browser...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/V4/");
        try {
            RecordVideo.startRecord("ManageDocument");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tearDown() {
        driver.quit();
    }
//    public void createPropertiesSetup() {
//        PropertiesFileReader.setPropertiesFile();
//    }

}
