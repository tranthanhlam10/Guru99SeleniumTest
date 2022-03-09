package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

public class HomePageTest extends BaseTest{

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Test(priority = 2)
    @Description("Kiem thu chuc nang tao khach hang moi")
    public void testCreateNewCustomer(){
      signInPage.enterUserName("mngr390689","dEnuzup"); // that ra cai nay khong can de ben nay, chi can khoi tao cung flie xml cho cai dang nhap chay truoc
      homePage.createNewCustomer("Tran Thanh Lam","18/07/2000", "Thu Thua", "Tan An", "Long An", "1234567", "0984657443","tranthanhlam85.TT@gmail.com", "1");
    }
}
