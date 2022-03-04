package com.sdetfasttrack.pages;

import com.github.javafaker.Faker;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JavaFakerPractice {

    public JavaFakerPractice(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Login
    //4. Click on Order
    //5. Select familyAlbum from product, set quantity to 5
    //6. Click to "Calculate" button
    //7. Fill address Info with JavaFaker
    //8. Click on "visa" radio button
    //9. Generate card number using JavaFaker
    //10Enter expiration date
    //11. Click on "Process"
    //12.Verify success message "New order has been successfully added." is displayed.

    @FindBy(xpath="//input[@id='ctl00_MainContent_username']")
    public WebElement userName;

    @FindBy(xpath="//input[@id='ctl00_MainContent_password']")
    public WebElement password;

    @FindBy(xpath="//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginBtn;

    @FindBy(xpath="//a[@href='Process.aspx']")
    public WebElement orderBtn;

    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement dropDown;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(xpath="//input[@value='Calculate']")
    public WebElement calculateBtn;

    @FindBy(name="ctl00$MainContent$fmwOrder$txtName")
    public WebElement name;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement streetAdr;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zip;

    @FindBy(xpath="//input[@value='Visa']")
    public WebElement visaBtn;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement creditCard;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expireDate;

    @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement process;

    @FindBy(xpath="//strong[contains(.,'New order has bee')]")
    public WebElement message;


}
