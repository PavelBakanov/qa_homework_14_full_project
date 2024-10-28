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
        step("На главной странице нажать на кнопку 'Тестировать'", () -> {
            mainPage.clickTestingButton();
        });
        step("Искать на странице текст в определенном месте", () -> {
            testingPage.findCertainText();
        });
    }

    @Test
    @DisplayName("Проверка текста в меню 'О компании', находящемся в хэдере сайта")
    public void checkAboutCompanyMenuTest() {
        step("На главной странице нажать на кнопку 'Тестировать'", () -> {
            mainPage.clickTestingButton();
        });
        step("Проверить по тексту всё меню 'О компании'", () -> {
            testingPage.checkTextInAboutCompanyMenu();
        });
    }

    @Test
    @DisplayName("Проверка поиска")
    public void searchTest() {
        step("Открыть раздел 'Блог'", () -> {
            mainPage.openBlogPage();
        });
        step("Ввести определенный текст и нажать Enter", () -> {
            blogPage.typeTextToInputField();
        });
        step("Проверить нужный текст в самой первой выдаче результата", () -> {
            blogPage.checkCertainTextInPlain();
        });
    }

    @Test
    @DisplayName("Проверка содержания анимированного текста в разделе 'Исследования'")
    public void animatedTextTest() {
        step("На главной странице нажать на кнопку 'Исследовать'", () -> {
            mainPage.clickResearchButton();
        });
        step("Скроллить к определенному заголовку, что-бы анимированный текст появился", () -> {
            researchPage.scrollToCertainTitle();
        });
        step("Проверить содержание анимированного текста", () -> {
            researchPage.checkContentOfAnimatedText();
        });
    }

    @Test
    @DisplayName("Проверка шторки в разделе 'Краудтестинг'")
    public void sliderTest() {
        step("Открыть раздел 'Краудтестинг'", () -> {
            mainPage.openCrowdTestingPage();
        });
        step("Найти шторку и двигать ее", () -> {
            crowdtestingPage.tryToMoveSlider();
        });
        step("После прокрутки шторки проверить, что текст в ней поменялся на другой", () -> {
            crowdtestingPage.checkTextInCurrentSlide();
        });
    }

    @Test
    @DisplayName("Проверка невидимого изначально текста в разделе 'Кейсы'")
    public void invisibleTextTest() {
        step("Открыть раздел 'Кейсы'", () -> {
            mainPage.openCasesPage();
        });
        step("Нажать на кнопку 'Показать еще'", () -> {
            casesPage.clickToMoreButton();
        });
        step("После нажатия кнопки найти и проверить определенный текст", () -> {
            casesPage.checkOfCertainText();//
        });
    }
}
