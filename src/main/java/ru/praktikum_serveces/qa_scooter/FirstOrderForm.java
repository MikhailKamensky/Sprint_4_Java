package ru.praktikum_serveces.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class FirstOrderForm {

    private WebDriver driver;

//    private String stationName;

    //локаторы

    private By firstOrderPage = By.xpath(".//div[@class='Order_Content__bmtHS']");
    private By firstName = By.xpath(".//input[@placeholder = '* Имя']");
    private By lasttName = By.xpath(".//input[@placeholder = '* Фамилия']");
    private By adress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private By metroStationSelect = By.xpath(".//input[@placeholder = '* Станция метро']");

//    private By metroStationClick = By.xpath(".//div[text()='"+stationName+"']");

    String metroStationClick = ".//div[text()='%s']";

    private By phoneNumber = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath(".//button[text()='Далее']");

    public FirstOrderForm(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName (String textName) {
        driver.findElement(firstName).sendKeys(textName);
    }

    public void enterLastName (String textSurname) {
        driver.findElement(lasttName).sendKeys(textSurname);
    }


    // создаем локатор для клика по станции
    public By createStationLocator(String stationName) {
        return By.xpath(
                String.format
                        (metroStationClick, stationName));
    }


    public void enterAdress (String textAdress) {
        driver.findElement(adress).sendKeys(textAdress);
    }

    public void setMetroStation () {
        driver.findElement(metroStationSelect).click();
    }


    public void selectMetroStation (String stationName) {
        driver.findElement(createStationLocator(stationName)).click();
    }


    public void enterPhoneNumber (String phone) {
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void clickNextButton () {
        driver.findElement(nextButton).click();
    }

    public boolean isOrderFormDisplayed() {
        return driver.findElement(firstOrderPage).isDisplayed();
    }


    public void fillFirstOrderForm (String textName, String textSurname, String textAdress, String stationName, String phone) {
        enterFirstName(textName);
        enterLastName(textSurname);
        enterAdress(textAdress);
        setMetroStation();
        selectMetroStation(stationName);
        enterPhoneNumber(phone);
        clickNextButton();
        isOrderFormDisplayed();
    }

}

