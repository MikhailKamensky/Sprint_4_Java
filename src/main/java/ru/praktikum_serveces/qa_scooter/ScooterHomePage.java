package ru.praktikum_serveces.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ScooterHomePage {

    private WebDriver driver;

    public final String answerText0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public final String answerText1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public final String answerText2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public final String answerText3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public final String answerText4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public final String answerText5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public final String answerText6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public final String answerText7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    private By accordionPanel0 = By.xpath(".//div[@class='accordion']/div[1]");
    private By accordionPanel1 = By.xpath(".//div[@class='accordion']/div[2]");
    private By accordionPanel2 = By.xpath(".//div[@class='accordion']/div[3]");
    private By accordionPanel3 = By.xpath(".//div[@class='accordion']/div[4]");
    private By accordionPanel4 = By.xpath(".//div[@class='accordion']/div[5]");
    private By accordionPanel5 = By.xpath(".//div[@class='accordion']/div[6]");
    private By accordionPanel6 = By.xpath(".//div[@class='accordion']/div[7]");
    private By accordionPanel7 = By.xpath(".//div[@class='accordion']/div[8]");

    private By accordionText0 = By.xpath(".//p[text() = '"+ answerText0 +"']");
    private By accordionText1 = By.xpath(".//p[text() = '"+ answerText1 +"']");
    private By accordionText2 = By.xpath(".//p[text() = '" + answerText2 + "']");
    private By accordionText3 = By.xpath(".//p[text() = '"+ answerText3 +"']");
    private By accordionText4 = By.xpath(".//p[text() = '"+ answerText4 +"']");
    private By accordionText5 = By.xpath(".//p[text() = '"+ answerText5 +"']");
    private By accordionText6 = By.xpath(".//p[text() = '"+ answerText6 +"']");
    private By accordionText7 = By.xpath(".//p[text() = '"+ answerText7 +"']");

    // локаторы кнопок "Заказать" в верхней части и в середине страницы

    private By smallOrderButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    private By bigOrderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    public ScooterHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // методы для клика по отдельным пунктам "Вопросов о главном"

    public void clickAccordionPanel0 () {
        driver.findElement(accordionPanel0).click();
    }

    public void clickAccordionPanel1 () {
        driver.findElement(accordionPanel1).click();
    }

    public void clickAccordionPanel2 () {
        driver.findElement(accordionPanel2).click();
    }

    public void clickAccordionPanel3 () {
        driver.findElement(accordionPanel3).click();
    }

    public void clickAccordionPanel4 () {
        driver.findElement(accordionPanel4).click();
    }

    public void clickAccordionPanel5 () {
        driver.findElement(accordionPanel5).click();
    }

    public void clickAccordionPanel6 () {
        driver.findElement(accordionPanel6).click();
    }

    public void clickAccordionPanel7 () {
        driver.findElement(accordionPanel7).click();
    }



    // Методы для получения текста отдельных пунктов "Вопросов о главном"

    public String getAccordionPanel0Text () {
        return driver.findElement(accordionText0).getText();
    }

    public String getAccordionPanel1Text () {
        return driver.findElement(accordionText1).getText();
    }

    public String getAccordionPanel2Text () {
        return driver.findElement(accordionText2).getText();
    }

    public String getAccordionPanel3Text () {
        return driver.findElement(accordionText3).getText();
    }

    public String getAccordionPanel4Text () {
        return driver.findElement(accordionText4).getText();
    }

    public String getAccordionPanel5Text () {
        return driver.findElement(accordionText5).getText();
    }

    public String getAccordionPanel6Text () {
        return driver.findElement(accordionText6).getText();
    }

    public String getAccordionPanel7Text () {
        return driver.findElement(accordionText7).getText();
    }

    //методы клика по кнопкам "Заказать"

    public void clickSmallOrderButton () {
        driver.findElement(smallOrderButton).click();
    }

    public void clickBigOrderButton () {
        driver.findElement(bigOrderButton).click();
    }

}