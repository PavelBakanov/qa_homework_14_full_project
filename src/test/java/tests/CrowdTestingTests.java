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
    public void findSomeTextTest() {
        step("На главной странице нажимаем на кнопку 'Тестировать'", () -> {
            mainPage.clickTestingButton();
        });

        step("Ищем на странице текст в определенном месте", () -> {
            testingPage.findCertainText();
        });

    }

    @Test
    @DisplayName("Проверка текста в меню 'О компании', находящемся в хэдере сайта")
    public void checkAboutCompanyMenuTest() {
        step("На главной странице нажимаем на кнопку 'Тестировать'", () -> {
            mainPage.clickTestingButton();
        });

        step("Проверяем по тексту всё меню 'О компании'", () -> {
            testingPage.checkTextInAboutCompanyMenu();
        });

    }

    @Test
    @DisplayName("Проверка поиска")
    public void searchTest() {
        step("На главной странице нажимаем на кнопку 'Тестировать'", () -> {
            mainPage.clickTestingButton();
        });

        step("Нажимаем на кнопку 'Блог'", () -> {
            testingPage.clickToBlogButton();
        });

    }
}
