import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum_serveces.qa_scooter.FirstOrderForm;
import ru.praktikum_serveces.qa_scooter.SecondOrderForm;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderFormTest {
    private WebDriver driver;

    private final String firstName;
    private final String lastName;
    private final String adress;
    private final String station;
    private final String phoneNumber;

    private final String date;
    private final String period;
    private final String color;
    private final String courierCommentText;

    public OrderFormTest(String firstName, String lastName, String adress, String station, String phoneNumber, String date, String period, String color, String courierCommentText) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.station = station;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.period = period;
        this.color = color;
        this.courierCommentText = courierCommentText;
    }

    @Parameterized.Parameters
    public  static Object[][] getOrderData() {
        return new Object[][] {
                {"Михаил", "Каменский", "Проспект Вернадского, 18", "Сокол", "+79889999999", "28.03.2025", "двое суток", "чёрный жемчуг", "без комментариев"},
                {"Бабар", "Бабарович", "Проспект Вернадского, 19", "Панфиловская", "+79889999998", "29.03.2025", "трое суток", "серая безысходность", "комментарий"},
        };
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void firstOrderFormTest() {

        driver.get("https://qa-scooter.praktikum-services.ru/order/");

        FirstOrderForm objFirstOrderPage = new FirstOrderForm(driver);
        SecondOrderForm objSecondOrderPage = new SecondOrderForm(driver);

        objFirstOrderPage.fillFirstOrderForm(firstName, lastName, adress, station, phoneNumber);


        //тестирование первой формы вводы
//        objFirstOrderPage.enterFirstName(firstName);
//        objFirstOrderPage.enterLastName(lastName);
//        objFirstOrderPage.enterAdress(adress);
//        objFirstOrderPage.setMetroStation();
//
//        WebElement element = driver.findElement(objFirstOrderPage.createStationLocator(station));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//
//        objFirstOrderPage.selectMetroStation(station);
//        objFirstOrderPage.enterPhoneNumber(phoneNumber);
//        objFirstOrderPage.clickNextButton();


        objSecondOrderPage.fillSecondOrderForm(date, period, color, courierCommentText);

//        objSecondOrderPage.clickPeriodField();
//        objSecondOrderPage.setDate(date);
//        objSecondOrderPage.setRentPeriod(period);
//        objSecondOrderPage.setColor(color);
//        objSecondOrderPage.setComment(courierCommentText);
//        objSecondOrderPage.clickOrderButton();
//        objSecondOrderPage.clickConfirmButton();



        assertTrue(objSecondOrderPage.isOrderConfirmed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
