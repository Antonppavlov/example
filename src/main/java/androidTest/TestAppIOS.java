package androidTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import ru.test.example.IOSDriversMethods;

import java.net.MalformedURLException;

public class TestAppIOS {
    IOSDriversMethods iosDriversMethods;
    @Test
    public void Test() throws MalformedURLException {
        System.out.println("------------------------------------");
        System.out.println("Идет загрузка приложения");
        iosDriversMethods = new IOSDriversMethods();
        iosDriversMethods.IOSLounchApp();
        System.out.println("Загрузка завершена");
        System.out.println("------------------------------------");


        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[1]");
        iosDriversMethods.driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[1]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[2]");
        iosDriversMethods.driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[2]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[3]");
        iosDriversMethods.driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[3]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент //XCUIElementTypeButton[@name=\"start\"]");
        iosDriversMethods.driver.findElementByXPath("//XCUIElementTypeButton[@name=\"start\"]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
    }

    @AfterTest
    public void TearDown() {
        System.out.println("------------------------------------");
        System.out.println("Идет закрытие приложения");
        iosDriversMethods.CloseApp();
        System.out.println("Закрытие завершено");
        System.out.println("------------------------------------");
    }
}
