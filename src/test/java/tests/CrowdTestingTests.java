package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BlogPage;
import pages.MainPage;
import pages.TestingPage;

import static io.qameta.allure.Allure.step;

@Tag("crowdtesting")
public class CrowdTestingTests extends TestBase {
    private final MainPage mainPage = new MainPage();
    private final TestingPage testingPage = new TestingPage();
    private final BlogPage blogPage = new BlogPage();

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
        step("Нажимаем на кнопку 'Блог'", () -> {
            blogPage.openBlogLink();
        });
        step("Вводим определенный текст и нажимаем Enter", () -> {
            blogPage.typeTextToInputField();
        });
        step("Проверяем нужный текст в самой первой выдаче результата", () -> {
            blogPage.checkCertainTextInPlain();
        });
    }
}
