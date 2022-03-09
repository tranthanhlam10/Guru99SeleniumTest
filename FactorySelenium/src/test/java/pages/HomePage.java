package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class HomePage extends BasePage {
    By liManager = By.xpath("//a[normalize-space()='New Customer']");
    By inputCustomerName = By.xpath("//input[@name='name']");
    By rdbMale = By.xpath("//input[@value='m']");
    By rdbFemale = By.xpath("//input[@value='f']");
    By dtpDay = By.xpath("//input[@id='dob']");
    By inputAddress = By.xpath("//textarea[@name='addr']");
    By inputCity = By.xpath("//input[@name='city']");
    By inputState = By.xpath("//input[@name='state']");
    By inputPin = By.xpath("//input[@name='pinno']");
    By inputMobile = By.xpath("//input[@name='telephoneno']");
    By inputEmail= By.xpath("//input[@name='emailid']");
    By inputPassWord = By.xpath("//input[@name='password']");
    By btnSubmit = By.xpath("//input[@name='sub']");




    public void createNewCustomer (String username, String date, String address, String city, String state, String pin, String mobi, String email, String pass ) {
        //chon muc them khach hang moi
        driver.findElement(liManager).click();
        //nhap ten khach hang
        driver.findElement(inputCustomerName).sendKeys(username);
        //chon gioi tinh cho khach hang
        if (driver.findElement(rdbMale).isSelected() == true){
            System.out.println("Khach hang la nam");
            //chon ngay sinh
            driver.findElement(dtpDay).sendKeys(date);
            //nhap dia chi
            driver.findElement(inputAddress).sendKeys(address);
            //nhap thanh pho
            driver.findElement(inputCity).sendKeys(city);
            //nhap quoc gia
            driver.findElement(inputState).sendKeys(state);
            //nhap pin
            if (pin.length() <= 6)
            {
                System.out.println("ma pin khong hop le");
            }
            else {
                driver.findElement(inputPin).sendKeys(pin);
            }
            //nhap so dien thoai
            driver.findElement(inputMobile).sendKeys(mobi);
            //nhap email
            driver.findElement(inputEmail).sendKeys(email);
            //nhap password
            driver.findElement(inputPassWord).sendKeys(pass);
        }
       // driver.findElement(btnSubmit).submit();

    }


}
