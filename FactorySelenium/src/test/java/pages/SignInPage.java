package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage  {

     By username = By.xpath("//input[@name='uid']");
     By password = By.xpath("//input[@name='password']");
     By btnLogin = By.xpath("//input[@name='btnLogin']");


     public String enterUserName (String user, String pass)  {

         driver.findElement(username).sendKeys(user);
         driver.findElement(password).sendKeys(pass);
         driver.findElement(btnLogin).click();

         return "True";
     }

     public String getPageTitle(){
         return driver.getTitle();
     }

     public String testLoginFail(String user, String pass) {
         driver.findElement(username).sendKeys(user);
         driver.findElement(password).sendKeys(pass);
         driver.findElement(btnLogin).click();
         return driver.getCurrentUrl(); // cho nay la do mat khau voi tai khoan khong dung, nen sever tra ve thong tin not valid
//         String expectedURL = "https://demo.guru99.com/V4/manager/Managerhomepage.php";
//         String expectedURL2 = "https://demo.guru99.com/V4/";
//         String actualURL = driver.getCurrentUrl();
//         if (expectedURL2.equalsIgnoreCase(actualURL)) {
//             System.out.println("Login successfully");
//         } else
//             System.out.println("Login fail");
     }
}
