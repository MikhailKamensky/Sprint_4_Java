package ru.praktikum_serveces.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class FirstOrderForm {

    private WebDriver driver;

    //локаторы

    private By firstOrderPage = By.xpath(".//div[@class='Order_Content__bmtHS']");
    private By firstName = By.xpath(".//input[@placeholder = '* Имя']");
    private By lasttName = By.xpath(".//input[@placeholder = '* Фамилия']");
    private By adress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private By metroStationSelect = By.xpath(".//input[@placeholder = '* Станция метро']");
    private By phoneNumber = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath(".//button[text()='Далее']");

    public FirstOrderForm(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName (String text) {
        driver.findElement(firstName).sendKeys(text);
    }

    public void enterLastName (String text) {
        driver.findElement(lasttName).sendKeys(text);
    }

    public void enterAdress (String text) {
        driver.findElement(adress).sendKeys(text);
    }


    public void setMetroStation () {
        driver.findElement(metroStationSelect).click();
    }


    public void selectMetroStation (String stationName) {
        driver.findElement(By.xpath(".//div[text()='"+stationName+"']")).click();
    }


    public void enterPhoneNumber (String phone) {
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void clickNextButton () {
        driver.findElement(nextButton).click();
    }

}

