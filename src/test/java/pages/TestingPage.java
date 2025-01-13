package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestingPage {

    private final SelenideElement textContainerLocator = $(".text.aos-init.aos-animate");
    private final SelenideElement aboutCompanyLocator = $$("a").findBy(text("О компании"));
    private final SelenideElement burgerMenuLocator = $ ("a.open-nav");
    private final ElementsCollection menuItemsLocator = $("ul.sub").$$("li a");  


    public TestingPage findCertainText(String text) {
        textContainerLocator.shouldHave(text(text));
        return this;
    }

    public TestingPage checkTextInAboutCompanyMenu(String... listMenuText) {

        if (burgerMenuLocator.exists()){
            burgerMenuLocator.click();
        }
        
        aboutCompanyLocator.hover();

        for(int i = 0; i < listMenuText.length; i++) {
            menuItemsLocator.get(i).shouldHave(text(listMenuText[i]));
        }
        return this;
    }
}
