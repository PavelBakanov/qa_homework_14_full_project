package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("crowdtesting")
public class CrowdTestingTests extends TestBase {
    private final MainPage mainPage = new MainPage();
    private final TestingPage testingPage = new TestingPage();
    private final BlogPage blogPage = new BlogPage();
    private final ResearchPage researchPage = new ResearchPage();
    private final CrowdtestingPage crowdtestingPage = new CrowdtestingPage();
    private final CasesPage casesPage = new CasesPage();

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
        step("Открываем раздел 'Блог'", () -> {
            mainPage.openBlogPage();
        });
        step("Вводим определенный текст и нажимаем Enter", () -> {
            blogPage.typeTextToInputField();
        });
        step("Проверяем нужный текст в самой первой выдаче результата", () -> {
            blogPage.checkCertainTextInPlain();
        });
    }

    @Test
    @DisplayName("Проверка содержания анимированного текста в разделе 'Исследования'")
    public void animatedTextTest() {
        step("На главной странице наживаем на кнопку 'Исследовать'", () -> {
            mainPage.clickResearchButton();
        });
        step("Скроллим к определенному заголовку, что-бы анимированный текст появился", () -> {
            researchPage.scrollToCertainTitle();
        });
        step("Проверяем содержание анимированного текста", () -> {
            researchPage.checkContentOfAnimatedText();
        });
    }

    @Test
    @DisplayName("Проверка шторки в разделе 'Краудтестинг'")
    public void sliderTest() {
        step("Открываем раздел 'Краудтестинг'", () -> {
            mainPage.openCrowdTestingPage();
        });
        step("Находим шторку и двигаем ее", () -> {
            crowdtestingPage.tryToMoveSlider();
        });
        step("После прокрутки шторки проверяем, что текст в ней поменялся на другой", () -> {
            crowdtestingPage.checkTextInCurrentSlide();
        });
    }

    @Test
    @DisplayName("Проверка невидимого изначально текста в разделе 'Кейсы'")
    public void invisibleTextTest() {
        step("Открываем раздел 'Кейсы'", () -> {
            mainPage.openCasesPage();
        });
        step("Жмем кнопку 'Показать еще'", () -> {
            casesPage.clickToMoreButton();
        });
        step("После нажатия кнопки проверяется определенный текст. Ищем его на странице", () -> {
            casesPage.checkOfCertainText();
        });
    }
}
