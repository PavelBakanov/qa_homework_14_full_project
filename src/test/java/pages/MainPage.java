package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement testingButtonLocator = $(byText("Тестировать"));
    private final SelenideElement researchButtonLocator = $(byText("Исследовать"));

    public MainPage openMainPage() {
        open("https://www.crowdtesting.ru/");
        return this;
    }

    public MainPage openBlogPage() {
        open("/blog/");
        return this;
    }

    public MainPage openCrowdTestingPage() {
        open("/crowdtesting/");
        return this;
    }
    public MainPage openCasesPage() {
        open("/company/cases/");
        return this;
    }

    public MainPage clickTestingButton() {
        testingButtonLocator.scrollTo().pressEnter();
        return this;
    }

    public MainPage clickResearchButton() {
        researchButtonLocator.scrollTo().pressEnter();
        return this;
    }
}
