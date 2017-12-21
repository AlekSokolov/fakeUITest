import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by macbook on 11/14/17.
 */

public class LoginTest {

    WebDriver driver = null;

    // выполниться прежде чем методы с аннотацией @Test
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alex\\Desktop\\Alex\\TestHomeWork\\geckodriver.exe");
        driver = new FirefoxDriver(); // выбираем с каким браузером запуститься всем тестам в этом класса
    }

    // отделяем обычный метод в Java от метода, которые будет содержать проверки
    // так же помогает библиотеке формировать отчеты отделя методы, которые просто выполнились
    // от методов, которые будут отображать результат прохождения тестов
    @Test
    public void successfulLoginTest() {
        driver.navigate().to("http://lingualeo.com/ru"); // переходим на сайт
        String appTitle = driver.getTitle();
        System.out.println("Application title is :: " + appTitle);

        String expectedTitle = "Google";

        assertEquals(appTitle, expectedTitle); // с помощью библиотеки TestNG выполняем сравнение занчений.
        // Если значения совпадут, то тесты буду зелеными
        // Если значения не совпадут, то тесты буду красными/оранжевыми

        driver.close();// закрываем окно браузера!. Add new change
    }

    @Test
    public void failedTest() {

    }

}
