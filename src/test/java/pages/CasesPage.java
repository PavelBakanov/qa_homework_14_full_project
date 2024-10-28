package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CasesPage {
    private final SelenideElement moreButtonLocator = $(".more");
    private final SelenideElement casesContainerLocator = $(".cases");

    public CasesPage clickToMoreButton() {
        moreButtonLocator.click();
        return this;
    }
    public CasesPage checkOfCertainText() {
        $(casesContainerLocator).shouldHave(text("Одному из Операторов большой тройки" +
                " требуется обеспечить автоматизированное тестирование всего функционала биллинговой системы:"));
        return this;
    }
}
