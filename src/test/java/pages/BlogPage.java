package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BlogPage {
    private final SelenideElement inputFieldLocator = $("[name='stext']");
    private final SelenideElement plainLocator = $(".plain");

    public BlogPage typeTextToInputField() {
        inputFieldLocator.scrollTo().setValue("как получить").pressEnter();
        return this;
    }

    public BlogPage checkCertainTextInPlain() {
        plainLocator.scrollTo().shouldHave(text(
                "Как получить дополнительные бонусы за участие в проектах краудтестирования"));
        return this;
    }
}
