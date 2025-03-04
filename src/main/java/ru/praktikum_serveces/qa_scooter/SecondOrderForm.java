package ru.praktikum_serveces.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SecondOrderForm {
    private WebDriver driver;


    //локаторы
    private By date = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private By rentPeriodField = By.xpath(".//div[@class='Dropdown-control']");

    String rentPeriod = ".//div[@class='Dropdown-option' and text()='%s']";

    String scooterColor = ".//label[text()='%s']";

    private By comment = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private By orderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    private By confirmOrderButton = By.xpath(".//button[text() = 'Да']");
    private By orderInfo = By.xpath(".//button[text()='Посмотреть статус']");

    //создаем локатор для выбора срока аренды
    private By createRentPeriodLocator(String period) {
        return By.xpath(
                String.format
                        (rentPeriod, period));
    }

    //создаем локатор для выбора цвета
    private By createScooterColorLocator(String color) {
        return By.xpath(
                String.format
                        (scooterColor, color));
    }

    public SecondOrderForm(WebDriver driver) {
        this.driver = driver;
    }

    public void setDate (String dateRent) {
        driver.findElement(date).sendKeys(dateRent);
    }

    public void clickPeriodField () {
        driver.findElement(rentPeriodField).click();
    }

    public void setRentPeriod (String period) {
        driver.findElement(createRentPeriodLocator(period)).click();
    }

    public void setColor (String scooterColor) {
        driver.findElement(createScooterColorLocator(scooterColor)).click();
    }

    public void setComment (String commentText) {
        driver.findElement(comment).sendKeys(commentText);
    }

    public void clickOrderButton () {
        driver.findElement(orderButton).click();
    }

    public void clickConfirmButton () {
        driver.findElement(confirmOrderButton).click();
    }

    public boolean isOrderConfirmed() {
        return driver.findElement(orderInfo).isDisplayed();
    }

    public void fillSecondOrderForm(String date, String period, String color, String courierCommentText){
        clickPeriodField();
        setDate(date);
        setRentPeriod(period);
        setColor(color);
        setComment(courierCommentText);
        clickOrderButton();
        clickConfirmButton();
    }

}
