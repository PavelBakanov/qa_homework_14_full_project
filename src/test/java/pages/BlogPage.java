package pages;

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
}
