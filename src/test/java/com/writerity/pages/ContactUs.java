package com.writerity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUs {

    WebDriver driver;
    WebDriverWait wait;

    public ContactUs(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    By clickaboutus = By.id("menu-item-5276");
    By clickmission = By.id("menu-item-5277");
    By clickservice = By.id("menu-item-5279");
    By clicktechnology = By.id("menu-item-5280");
    By clickblog = By.id("menu-item-5281");
    By clickrecruit = By.id("menu-item-5278");
    By clickqanda = By.id("menu-item-5283");
    By clickservice1 = By.xpath("//*[@id=\"service\"]/div[2]/div/div/div/div[2]/div[1]/div[1]");
    By clickqainternship = By.xpath("//*[@id=\"recruit\"]/div/div/div/div/div/div/div[2]/div[2]/div[1]");
    By clickcontactus1 = By.xpath("//*[@id=\"recruit\"]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/a");

    By nameandlastname = By.name("your-name");
    By emailaddress = By.name("your-email");
    By phonenumber = By.name("your-subject");
    By sendmessage = By.xpath("//*[@id=\"wpcf7-f5344-p5200-o1\"]/form/div[2]/div[1]/div/div[2]/div/p/span/textarea");
    By clicksubmit = By.xpath("//*[@id=\"sendMessage\"]");



    public void type_sendmessage(String send_message) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sendmessage)).sendKeys(send_message);
    }

    public void type_phonenumber(String phone_number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phonenumber)).sendKeys(phone_number);
    }

    public void type_email_address(String email_address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailaddress)).sendKeys(email_address);
    }

    public void type_name_lastname(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameandlastname)).sendKeys(firstName);
    }

    public void click_qainternship() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickqainternship)).click();
    }
    public void click_service1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickservice1)).click();
    }

    public void click_submit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicksubmit)).click();
    }

    public void click_aboutus() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickaboutus)).click();
    }

    public void click_mission() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickmission)).click();
    }

    public void click_service() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickservice)).click();
    }

    public void click_technology() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicktechnology)).click();
    }

    public void click_blog() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickblog)).click();
    }

    public void click_recruit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickrecruit)).click();
    }

    public void click_qanda() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickqanda)).click();
    }

    public void click_contactus() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickcontactus1)).click();
    }

}
