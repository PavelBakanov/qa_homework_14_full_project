package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Owner(value = "bakanovpb")
@Tag("crowdtesting")
@DisplayName("Тесты на проверку текста на страницах")
public class CheckTextTests extends TestBase {
    private final MainPage mainPage = new MainPage();
    private final TestingPage testingPage = new TestingPage();
    private final ResearchPage researchPage = new ResearchPage();
    private final CasesPage casesPage = new CasesPage();

    @Test
    @DisplayName("Поиск на странице текста 'Функциональное, интеграционное, приемочное'")
    public void findSomeTextTest() {
        mainPage.openMainPage();
        mainPage.clickTestingButton();
        testingPage.findCertainText("Функциональное, интеграционное, приемочное");
    }

    @Test
    @DisplayName("Проверка текста в меню 'О компании', находящемся в хэдере сайта")
    public void checkAboutCompanyMenuTest() {
        mainPage.openMainPage();
        mainPage.clickTestingButton();
        testingPage.checkTextInAboutCompanyMenu("О нас", "Портфолио", "Карьера", "Для респондентов");
    }

    @Test
    @DisplayName("Проверка содержания анимированного текста в разделе 'Исследования'")
    public void animatedTextTest() {
        mainPage.openMainPage();
        mainPage.clickResearchButton();
        researchPage.scrollToCertainTitle("Количественные исследования");
        researchPage.checkContentOfAnimatedText("выбрать наиболее важный функционал продукта, " +
                    "определить лучший вариант UI и др.");
    }

    @Test
    @DisplayName("Проверка невидимого изначально текста в разделе 'Кейсы'")
    public void invisibleTextTest() {
        mainPage.openMainPage();
        mainPage.openCasesPage();
        casesPage.clickToMoreButton();
        casesPage.checkOfCertainText("Одному из Операторов большой тройки" +
                    " требуется обеспечить автоматизированное тестирование всего функционала биллинговой системы:");
    }

    @Test
    @DisplayName("Проверка еще одного невидимого изначально текста в разделе 'Кейсы'")
    public void anotherInvisibleTextTest() {
        mainPage.openMainPage();
        mainPage.openCasesPage();
        casesPage.clickToMoreButton();
        casesPage.checkOfCertainText("Большая доля пользователей перестают пользоваться приложением после" +
                    " установки и регистрации. Необходимо понять, почему приложением не пользуются, несмотря на то," +
                    " что по данным других исследований целевая аудитория высоко оценивает саму идею такого рода" +
                    " приложения.");
    }
}
