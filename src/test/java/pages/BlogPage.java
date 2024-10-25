package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BlogPage {
    public BlogPage openBlogLink() {
        open("/blog/");
        return this;
    }

    public BlogPage typeTextToInputField() {
        $("[name='stext']").setValue("как получить").pressEnter();
        return this;
    }

    public BlogPage checkCertainTextInPlain() {
        $(".plain").shouldHave(text(
                "Как получить дополнительные бонусы за участие в проектах краудтестирования"));
        return this;
    }

}
