package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement testingButtonLocator = $(byText("Тестировать"));
    private final SelenideElement researchButtonLocator = $(byText("Исследовать"));

    @Step("Открываем главную страницу")
    public MainPage openMainPage() {
        open("https://www.crowdtesting.ru/");
        return this;
    }

    @Step("Открыть раздел 'Блог'")
    public MainPage openBlogPage() {
        open("/blog/");
        return this;
    }

    @Step("Открыть раздел 'Краудтестинг'")
    public MainPage openCrowdTestingPage() {
        open("/crowdtesting/");
        return this;
    }

    @Step("Открыть раздел 'Кейсы'")
    public MainPage openCasesPage() {
        open("/company/cases/");
        return this;
    }

    @Step("Нажать на кнопку 'Тестировать'")
    public MainPage clickTestingButton() {
        testingButtonLocator.scrollTo().pressEnter();
        return this;
    }

    @Step("Нажать на кнопку 'Исследовать'")
    public MainPage clickResearchButton() {
        researchButtonLocator.scrollTo().pressEnter();
        return this;
    }
}
