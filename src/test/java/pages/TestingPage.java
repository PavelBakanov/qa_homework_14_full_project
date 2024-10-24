package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TestingPage {

    private final SelenideElement textContainerLocator = $(".text.aos-init.aos-animate");
    private final SelenideElement blogButtonLocator = $(byText("Блог"));


    public TestingPage findCertainText() {
        textContainerLocator.shouldHave(text("Функциональное, интеграционное, приемочное"));
        return this;
    }

    public TestingPage checkTextInAboutCompanyMenu() {
        $(byText("О компании")).scrollTo();
        $(byText("О нас")).scrollTo();
        $(byText("Портфолио")).scrollTo();
        $(byText("Карьера")).scrollTo();
        $(byText("Для респондентов")).scrollTo();

        return this;
    }

    public TestingPage clickToBlogButton() {
        $(blogButtonLocator).scrollTo().click();
        return this;
    }
}
