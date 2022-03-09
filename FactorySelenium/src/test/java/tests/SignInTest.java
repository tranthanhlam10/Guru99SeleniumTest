package tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import utils.ExcelFileReader;
import utils.PropertiesFileReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.SignInPage;




public class SignInTest extends BaseTest {

    SignInPage objSignInPage = new SignInPage();
//    SignInPageFactory objSignInPagefactory = new SignInPageFactory();
//    ExcelFileReader excel = new ExcelFileReader();


    @Test(priority = 1)
    @Description("Kiem ta nhap ten tai khoan")
    public void enterUserNameAndPassWord()  {
        Assert.assertEquals(objSignInPage.testLoginFail("mngr390689","dEnuzup"),"https://demo.guru99.com/V4/manager/Managerhomepage.php");
    }
    @Test(priority = 2)
    @Description("Kiem tra title sau khi dang nhap")
    public void getTitleAfterLogin(){
        Assert.assertEquals( objSignInPage.getPageTitle(),"Guru99 Bank Manager HomePage");
    }

    @DataProvider(name = "Login-info")
    public Object[][] dpMethod(){
        return new Object[][]{{"tranlam", "123"}, {"tranlong","1234"}, {"thongsoaica", "12345"}};
    }
    @Test(priority = 1, dataProvider = "Login-info")
    @Description("Kiem tra cac tai khoan khong hop le")
    public void testLoginWithDifferenceInfo(String user, String pass) {

        String expectedURL = "https://demo.guru99.com/V4/";
        Assert.assertEquals( objSignInPage.testLoginFail(user,pass),expectedURL);
    }




//    @Test
//    @Description("Kiem tra nhap mat khau")
//    public void testEnterPassWord()  {
//
//        objSignInPage.enterPassWord("1234");
//    }

//    @Test
//    @Description("Kiem tra doc du lieu tu file properties")
//    public void enterUserAndPassByPropertiesFile(){
//        objSignInPage.enterUserName(PropertiesFileReader.getPropValue("email"));
//        objSignInPage.enterPassWord(PropertiesFileReader.getPropValue("password"));
//    }
    // login thanh cong
    // login khong thanh cong ( thu voi data provider )
    // moi test case deu phai co assert va verify

//    @Test
//    @Description("Kiem tra doc du lieu tu file excel")
//    public void enterUserAndPassByExcelFile() throws Exception {
//        excel.setExcelFile("src/test/Book1.xlsx", "Sheet1");
//        objSignInPage.enterUserName(excel.getCellData("username", 2));
//    }

//    @Test
//    @Description("Kiem tra nhap thong tin Page Factory")
//    public void enterUserAndPassPageFactory() {
//        objSignInPagefactory.enterUserAndPass("lamthanh", "1");
//    }

}
