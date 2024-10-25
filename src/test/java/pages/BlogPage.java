package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BlogPage {
    public BlogPage typeTextToInputField() {
        $("[name='stext']").scrollTo().setValue("как получить").pressEnter();
        return this;
    }

    public BlogPage checkCertainTextInPlain() {
        $(".plain").scrollTo().shouldHave(text(
                "Как получить дополнительные бонусы за участие в проектах краудтестирования"));
        return this;
    }
}
