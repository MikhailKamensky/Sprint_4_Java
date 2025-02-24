package ru.praktikum_serveces.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondOrderForm {
    private WebDriver driver;

    private By date = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private By rentPeriodField = By.xpath(".//div[@class='Dropdown-control']");
    private By rentPeriod = By.xpath(".//div[@class='Dropdown-control']");
    private By color = By.xpath(".//input[text()='* Срок аренды']");
    private By comment = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private By orderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    private By confirmOrderButton = By.xpath(".//button[text() = 'Да']");
    private By orderInfo = By.xpath(".//button[text()='Посмотреть статус']");


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
        driver.findElement(By.xpath(".//div[@class='Dropdown-option' and text()='"+period+"']")).click();
    }

    public void setColor (String scooterColor) {
        driver.findElement(By.xpath(".//label[text()='"+scooterColor+"']")).click();
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

}
