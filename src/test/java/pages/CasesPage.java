package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CasesPage {
    private final SelenideElement moreButtonLocator = $(".more");
    private final SelenideElement casesContainerLocator = $(".cases");

    public CasesPage clickToMoreButton() {
        moreButtonLocator.click();
        return this;
    }
    public CasesPage checkOfCertainText(String text) {
        $(casesContainerLocator).shouldHave(text(text));
        return this;
    }
}
