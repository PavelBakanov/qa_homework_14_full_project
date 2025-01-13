package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BlogPage {
    private final SelenideElement inputFieldLocator = $("[name='stext']");
    private final SelenideElement plainLocator = $(".plain");

    @Step("Ввести определенный текст и нажать Enter")
    public BlogPage typeTextToInputField(String text) {
        inputFieldLocator.scrollTo().setValue(text).pressEnter();
        return this;
    }

    @Step("Проверить нужный текст в самой первой выдаче результата")
    public BlogPage checkCertainTextInPlain(String text) {
        plainLocator.scrollTo().shouldHave(text(text));
        return this;
    }
}
