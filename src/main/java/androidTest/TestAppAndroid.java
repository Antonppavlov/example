package androidTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import ru.test.example.AndroidDriversMethods;

import java.net.MalformedURLException;

public class TestAppAndroid {
    @Test
    public void Test() throws MalformedURLException {
        System.out.println("------------------------------------");
        System.out.println("Идет загрузка приложения");
        AndroidDriversMethods.AndroidLounchApp();
        System.out.println("Загрузка завершена");
        System.out.println("------------------------------------");
    }

    @AfterTest
    public void TearDown() {
        System.out.println("------------------------------------");
        System.out.println("Идет закрытие приложения");
        AndroidDriversMethods.CloseApp();
        System.out.println("Закрытие завершено");
        System.out.println("------------------------------------");
    }
}
