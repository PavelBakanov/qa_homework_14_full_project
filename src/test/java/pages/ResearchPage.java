package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResearchPage {

    private final SelenideElement block22Locator = $(".block-2-2");
    public ResearchPage scrollToCertainTitle(String title) {
        $(byText(title)).scrollTo();
        return this;
    }

    public ResearchPage checkContentOfAnimatedText(String text) {
        block22Locator.shouldHave(text(text));
        return this;
    }

}
