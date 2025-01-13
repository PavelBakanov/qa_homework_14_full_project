package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BlogPage;
import pages.MainPage;

@Owner(value = "bakanovpb")
@Tag("crowdtesting")
@DisplayName("Тесты на проверку поиска")
public class CheckSearchTests extends TestBase {
    private final MainPage mainPage = new MainPage();
    private final BlogPage blogPage = new BlogPage();

    @Test
    @DisplayName("Проверка поиска")
    public void searchTest() {
        mainPage.openMainPage();
        mainPage.openBlogPage();
        blogPage.typeTextToInputField("как получить");
        blogPage.checkCertainTextInPlain("Как получить дополнительные бонусы" +
                " за участие в проектах краудтестирования");
    }
}
