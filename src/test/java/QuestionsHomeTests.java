
import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum_serveces.qa_scooter.ScooterHomePage;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;

public class QuestionsHomeTests {

    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkAccordionPanel0() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel0();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text() = '"+ objHomePage.answerText0 +"']")));

        String result = objHomePage.getAccordionPanel0Text();

        MatcherAssert.assertThat(objHomePage.answerText0, is(result));

    }

    @Test
    public void checkAccordionPanel1() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel1();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text() = '"+ objHomePage.answerText1 +"']")));

        String result = objHomePage.getAccordionPanel1Text();

        MatcherAssert.assertThat(objHomePage.answerText1, is(result));

    }

    @Test
    public void checkAccordionPanel2() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel2();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerText2 + "']")));

        String result = objHomePage.getAccordionPanel2Text();

        MatcherAssert.assertThat(objHomePage.answerText2, is(result));

    }

    @Test
    public void checkAccordionPanel3() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel3();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerText3 + "']")));

        String result = objHomePage.getAccordionPanel3Text();

        MatcherAssert.assertThat(objHomePage.answerText3, is(result));

    }

    @Test
    public void checkAccordionPanel4() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel4();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerText4 + "']")));

        String result = objHomePage.getAccordionPanel4Text();

        MatcherAssert.assertThat(objHomePage.answerText4, is(result));

    }

    @Test
    public void checkAccordionPanel5() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel5();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerText5 + "']")));

        String result = objHomePage.getAccordionPanel5Text();

        MatcherAssert.assertThat(objHomePage.answerText5, is(result));

    }

    @Test
    public void checkAccordionPanel6() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel6();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerText6 + "']")));

        String result = objHomePage.getAccordionPanel6Text();

        MatcherAssert.assertThat(objHomePage.answerText6, is(result));

    }

    @Test
    public void checkAccordionPanel7() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);


        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickAccordionPanel7();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+ objHomePage.answerText7 + "']")));

        String result = objHomePage.getAccordionPanel7Text();

        MatcherAssert.assertThat(objHomePage.answerText7, is(result));

    }


    @After
    public void tearDown() {
        driver.quit();
    }

}
