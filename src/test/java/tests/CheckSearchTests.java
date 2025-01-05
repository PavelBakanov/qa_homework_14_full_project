package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("crowdtesting")
public class CheckSearchTests extends TestBase {
    private final MainPage mainPage = new MainPage();
    private final BlogPage blogPage = new BlogPage();

    @Test
    @DisplayName("Проверка поиска")
    public void searchTest() {
        step("Открыть раздел 'Блог'", () -> {
            mainPage.openBlogPage();
        });
        step("Ввести определенный текст и нажать Enter", () -> {
            blogPage.typeTextToInputField();
        });
        step("Проверить нужный текст в самой первой выдаче результата", () -> {
            blogPage.checkCertainTextInPlain();
        });
    }

}
