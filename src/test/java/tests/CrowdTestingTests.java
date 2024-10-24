package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.TestingPage;

import static io.qameta.allure.Allure.step;

@Tag("crowdtesting")
public class CrowdTestingTests extends TestBase {
    MainPage mainPage = new MainPage();
    TestingPage testingPage = new TestingPage();

    @Test
    @DisplayName("Поиск на странице текста 'Функциональное, интеграционное, приемочное'")
    public void findSomeTextText() {
        step("На главной странице нажимаем на кнопку 'Тестировать'", () -> {
            mainPage.clickTestingButton();
        });

        step("Ищем на странице текст в определенном месте", () -> {
            testingPage.findCertainText();
        });

    }
}
