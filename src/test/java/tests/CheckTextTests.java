package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("crowdtesting")
public class CheckTextTests extends TestBase {
    private final MainPage mainPage = new MainPage();
    private final TestingPage testingPage = new TestingPage();
    private final ResearchPage researchPage = new ResearchPage();
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
    @DisplayName("Проверка невидимого изначально текста в разделе 'Кейсы'")
    public void invisibleTextTest() {
        step("Открыть раздел 'Кейсы'", () -> {
            mainPage.openCasesPage();
        });
        step("Нажать на кнопку 'Показать еще'", () -> {
            casesPage.clickToMoreButton();
        });
        step("После нажатия кнопки найти и проверить определенный текст", () -> {
            casesPage.checkOfCertainText("Одному из Операторов большой тройки" +
                    " требуется обеспечить автоматизированное тестирование всего функционала биллинговой системы:");
        });
    }

    @Test
    @DisplayName("Проверка еще одного невидимого изначально текста в разделе 'Кейсы'")
    public void anotherInvisibleTextTest() {
        step("Открыть раздел 'Кейсы'", () -> {
            mainPage.openCasesPage();
        });
        step("Нажать на кнопку 'Показать еще'", () -> {
            casesPage.clickToMoreButton();
        });
        step("После нажатия кнопки найти и проверить определенный текст", () -> {
            casesPage.checkOfCertainText("Большая доля пользователей перестают пользоваться приложением после" +
                    " установки и регистрации. Необходимо понять, почему приложением не пользуются, несмотря на то," +
                    " что по данным других исследований целевая аудитория высоко оценивает саму идею такого рода" +
                    " приложения.");
        });
    }
}