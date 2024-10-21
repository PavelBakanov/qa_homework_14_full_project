package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TestingPage {

    private final SelenideElement textContainerLocator = $(".text.aos-init.aos-animate");

    public TestingPage findSomeText() {
        textContainerLocator.shouldHave(text("Функциональное, интеграционное, приемочное"));
        return this;
    }
}
