package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CasesPage {
    private final SelenideElement moreButtonLocator = $(".more");
    private final SelenideElement casesContainerLocator = $(".cases");

    @Step("Нажать на кнопку 'Показать еще'")
    public CasesPage clickToMoreButton() {
        moreButtonLocator.click();
        return this;
    }

    @Step("После нажатия кнопки найти и проверить определенный текст")
    public CasesPage checkOfCertainText(String text) {
        $(casesContainerLocator).shouldHave(text(text));
        return this;
    }
}
