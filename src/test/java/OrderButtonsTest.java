import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum_serveces.qa_scooter.FirstOrderForm;
import ru.praktikum_serveces.qa_scooter.ScooterHomePage;

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
        WebElement element = driver.findElement(By.className("Order_Content__bmtHS"));

    }

    @Test
    public void checkBigOrderButton() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        FirstOrderForm objFirstOrderPage = new FirstOrderForm(driver);

        WebElement button = driver.findElement(By.className("Home_FinishButton__1_cWm"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);


        objHomePage.clickSmallOrderButton();
        WebElement element = driver.findElement(By.className("Order_Content__bmtHS"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }



}