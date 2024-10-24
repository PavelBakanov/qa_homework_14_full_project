package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {

    private final SelenideElement testingButtonLocator = $(byText("Тестировать"));

    public MainPage openMainPage() {
        open("https://www.crowdtesting.ru/");
        return this;
    }

    public MainPage clickTestingButton() {
        $(".col2.nav-2").scrollTo().$(byText("Блог")).pressEnter();

        return this;
    }
}
