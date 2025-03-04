package ru.praktikum_serveces.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScooterHomePage {

    private WebDriver driver;

    public static final String answerPrice = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String answerFewScootersRent = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String answerRentTime = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String answerTodayRent = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String answerRentExtension = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String answerScooterCharge = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String answerOrderCancel = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String answerOuterOrder = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    // шаблон универсального локатора панели с вопросом
    String questionPanelTemplate = ".//div[@class='accordion']/div[%s]";

    //локатор панели с вопросами
    private By questionsBlockHeader = By.xpath(".//div[text() = 'Вопросы о важном']");

    // шаблон универсального локатора ответа
    String answerBlockTemplate = ".//p[text() = '%s']";

    // локаторы кнопок "Заказать" в верхней части и в середине страницы
    private By smallOrderButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    private By bigOrderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    public ScooterHomePage(WebDriver driver) {
        this.driver = driver;
    }

    //метод прокрутки до блока с вопросами
    public void scrollTOQuestions () {
        WebElement button = driver.findElement(questionsBlockHeader);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
    }


    //метод, создающий локатор для клика по панели с вопросом
    public By createQuestionPanelLocator(String questionNum) {
        return By.xpath(
                String.format
                        (questionPanelTemplate, questionNum));
    }

    //метод, создающий локатор для блока с ответом
    public By createAnswerPanelLocator(String answerText) {
        return By.xpath(
                String.format
                        (answerBlockTemplate, answerText));
    }


    //метод для клика по панели с вопросом
    public void clickQuestionPanel (String questionNum) {
        driver.findElement(createQuestionPanelLocator(questionNum)).click();
    }

    //метод для ожидания видимости ответа

    public void waitAnswerIsVisible  (String answer) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(createAnswerPanelLocator(answer)));
    }


    //метод для получения текста ответа
    public String getAnswerText (String answerText) {
        return driver.findElement(createAnswerPanelLocator(answerText)).getText();
    }

    // метод, прокручивающий экран до кнопки "Заказать" в центре страницы
    public void scrollTOBigOrderButton () {
        WebElement button = driver.findElement(bigOrderButton);
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
    }

    //методы клика по кнопкам "Заказать"
    public void clickSmallOrderButton () {
        driver.findElement(smallOrderButton).click();
    }
    public void clickBigOrderButton () {
        driver.findElement(bigOrderButton).click();
    }

}