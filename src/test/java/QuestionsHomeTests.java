
import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum_serveces.qa_scooter.ScooterHomePage;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class QuestionsHomeTests {

    private WebDriver driver;

    private final String questionNum;
    private final String answer;

    public QuestionsHomeTests(String questionNum, String answer) {
        this.questionNum = questionNum;
        this.answer = answer;
    }

    @Parameterized.Parameters
    public  static Object[][] getOrderData() {
        return new Object[][] {
                {"1", ScooterHomePage.answerPrice},
                {"2", ScooterHomePage.answerFewScootersRent },
                {"3", ScooterHomePage.answerRentTime },
                {"4", ScooterHomePage.answerTodayRent },
                {"5", ScooterHomePage.answerRentExtension },
                {"6", ScooterHomePage.answerScooterCharge },
                {"7", ScooterHomePage.answerOrderCancel },
                {"8", ScooterHomePage.answerOuterOrder },
        };
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void checkAccordionPanel0() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);

        objHomePage.scrollTOQuestions();

        objHomePage.clickQuestionPanel(questionNum);
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(objHomePage.createAnswerPanelLocator(answer)));

        String result = objHomePage.getAnswerText(answer);

        MatcherAssert.assertThat(answer, is(result));
    }



//    @Test
//    public void checkAccordionPanel0() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickPriceQestionPanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text() = '"+ objHomePage.answerPrice +"']")));
//
//        String result = objHomePage.getAccordionPanel0Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerPrice, is(result));
//
//    }
//
//    @Test
//    public void checkAccordionPanel1() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickFewScootersRentPanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text() = '"+ objHomePage.answerFewScootersRent +"']")));
//
//        String result = objHomePage.getAccordionPanel1Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerFewScootersRent, is(result));
//
//    }
//
//    @Test
//    public void checkAccordionPanel2() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickRentTimePanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerRentTime + "']")));
//
//        String result = objHomePage.getAccordionPanel2Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerRentTime, is(result));
//
//    }
//
//    @Test
//    public void checkAccordionPanel3() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickTodayRentPanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerTodayRent + "']")));
//
//        String result = objHomePage.getAccordionPanel3Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerTodayRent, is(result));
//
//    }
//
//    @Test
//    public void checkAccordionPanel4() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickRentExtensionPanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerRentExtension + "']")));
//
//        String result = objHomePage.getAccordionPanel4Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerRentExtension, is(result));
//
//    }
//
//    @Test
//    public void checkAccordionPanel5() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickScooterChargePanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerScooterCharge + "']")));
//
//        String result = objHomePage.getAccordionPanel5Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerScooterCharge, is(result));
//
//    }
//
//    @Test
//    public void checkAccordionPanel6() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickOrderCancelPanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerOrderCancel + "']")));
//
//        String result = objHomePage.getAccordionPanel6Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerOrderCancel, is(result));
//
//    }
//
//    @Test
//    public void checkAccordionPanel7() {
//
//        driver.get("https://qa-scooter.praktikum-services.ru/");
//
//        ScooterHomePage objHomePage = new ScooterHomePage(driver);
//
//
//        WebElement element = driver.findElement(By.className("accordion"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objHomePage.clickOuterOrderPanel();
//
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerOuterOrder + "']")));
//
//        String result = objHomePage.getAccordionPanel7Text();
//
//        MatcherAssert.assertThat(ScooterHomePage.answerOuterOrder, is(result));
//
//    }



    @After
    public void tearDown() {
        driver.quit();
    }

}
