package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResearchPage {

    public ResearchPage scrollToCertainTitle() {
        $(byText("Количественные исследования")).scrollTo();
        return this;
    }

    public ResearchPage checkContentOfAnimatedText() {
        $(".block-2-2").shouldHave(text(
                "выбрать наиболее важный функционал продукта, определить лучший вариант UI и др."));
        return this;
    }

}
