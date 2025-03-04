
import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum_serveces.qa_scooter.ScooterHomePage;

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
        objHomePage.waitAnswerIsVisible(answer);
        String result = objHomePage.getAnswerText(answer);
        MatcherAssert.assertThat(answer, is(result));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
