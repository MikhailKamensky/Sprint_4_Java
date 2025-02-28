package ru.praktikum_serveces.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ScooterHomePage {

    private WebDriver driver;

    public final String answerPrice = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public final String answerFewScootersRent = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public final String answerRentTime = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public final String answerTodayRent = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public final String answerRentExtension = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public final String answerScooterCharge = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public final String answerOrderCancel = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public final String answerOuterOrder = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    private By priceQestionPanel = By.xpath(".//div[@class='accordion']/div[1]");
    private By FewScootersRentPanel = By.xpath(".//div[@class='accordion']/div[2]");
    private By RentTimePanel = By.xpath(".//div[@class='accordion']/div[3]");
    private By TodayRentPanel = By.xpath(".//div[@class='accordion']/div[4]");
    private By RentExtensionPanel = By.xpath(".//div[@class='accordion']/div[5]");
    private By ScooterChargePanel = By.xpath(".//div[@class='accordion']/div[6]");
    private By OrderCancelPanel = By.xpath(".//div[@class='accordion']/div[7]");
    private By OuterOrderPanel = By.xpath(".//div[@class='accordion']/div[8]");

    private By answerPriceText = By.xpath(".//p[text() = '"+ answerPrice +"']");
    private By answerFewScootersRentText = By.xpath(".//p[text() = '"+ answerFewScootersRent +"']");
    private By answerRentTimeText = By.xpath(".//p[text() = '" + answerRentTime + "']");
    private By TodayRentText = By.xpath(".//p[text() = '"+ answerTodayRent +"']");
    private By answerRentExtensionText = By.xpath(".//p[text() = '"+ answerRentExtension +"']");
    private By answerScooterChargeText = By.xpath(".//p[text() = '"+ answerScooterCharge +"']");
    private By answerOrderCancelText = By.xpath(".//p[text() = '"+ answerOrderCancel +"']");
    private By answerOuterOrderText = By.xpath(".//p[text() = '"+ answerOuterOrder +"']");

    // локаторы кнопок "Заказать" в верхней части и в середине страницы

    private By smallOrderButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    private By bigOrderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    public ScooterHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // методы для клика по отдельным пунктам "Вопросов о главном"

    public void clickAccordionPanel0 () {
        driver.findElement(priceQestionPanel).click();
    }

    public void clickAccordionPanel1 () {
        driver.findElement(FewScootersRentPanel).click();
    }

    public void clickAccordionPanel2 () {
        driver.findElement(RentTimePanel).click();
    }

    public void clickAccordionPanel3 () {
        driver.findElement(TodayRentPanel).click();
    }

    public void clickAccordionPanel4 () {
        driver.findElement(RentExtensionPanel).click();
    }

    public void clickAccordionPanel5 () {
        driver.findElement(ScooterChargePanel).click();
    }

    public void clickAccordionPanel6 () {
        driver.findElement(OrderCancelPanel).click();
    }

    public void clickAccordionPanel7 () {
        driver.findElement(OuterOrderPanel).click();
    }



    // Методы для получения текста отдельных пунктов "Вопросов о главном"

    public String getAccordionPanel0Text () {
        return driver.findElement(answerPriceText).getText();
    }

    public String getAccordionPanel1Text () {
        return driver.findElement(answerFewScootersRentText).getText();
    }

    public String getAccordionPanel2Text () {
        return driver.findElement(answerRentTimeText).getText();
    }

    public String getAccordionPanel3Text () {
        return driver.findElement(TodayRentText).getText();
    }

    public String getAccordionPanel4Text () {
        return driver.findElement(answerRentExtensionText).getText();
    }

    public String getAccordionPanel5Text () {
        return driver.findElement(answerScooterChargeText).getText();
    }

    public String getAccordionPanel6Text () {
        return driver.findElement(answerOrderCancelText).getText();
    }

    public String getAccordionPanel7Text () {
        return driver.findElement(answerOuterOrderText).getText();
    }

    //методы клика по кнопкам "Заказать"

    public void clickSmallOrderButton () {
        driver.findElement(smallOrderButton).click();
    }

    public void clickBigOrderButton () {
        driver.findElement(bigOrderButton).click();
    }

}