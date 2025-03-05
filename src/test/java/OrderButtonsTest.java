import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum_serveces.qa_scooter.FirstOrderForm;
import ru.praktikum_serveces.qa_scooter.ScooterHomePage;

import static org.junit.Assert.assertTrue;

public class OrderButtonsTest {

    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void checkSmallOrderButton() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        FirstOrderForm  objFirstOrderPage = new FirstOrderForm(driver);

        objHomePage.clickSmallOrderButton();
        assertTrue(objFirstOrderPage.isOrderFormDisplayed());

    }

    @Test
    public void checkBigOrderButton() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        FirstOrderForm objFirstOrderPage = new FirstOrderForm(driver);
        objHomePage.scrollTOBigOrderButton();
        objHomePage.clickBigOrderButton();
        assertTrue(objFirstOrderPage.isOrderFormDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }



}