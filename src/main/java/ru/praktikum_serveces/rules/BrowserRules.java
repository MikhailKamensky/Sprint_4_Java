package ru.praktikum_serveces.rules;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserRules extends ExternalResource {

    private WebDriver driver;

    @Override
    protected void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Override
    protected void after() {
        driver.quit();
    }

}
