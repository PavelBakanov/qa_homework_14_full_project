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
    private final ElementsCollection menuItemsLocator = $("ul.sub).$$("li a");  


    public TestingPage findCertainText(String text) {
        textContainerLocator.shouldHave(text(text));
        return this;
    }

    public TestingPage checkTextInAboutCompanyMenu(String... listMenuText) {
        aboutCompanyLocator.hover();

        for(int i = 0; i < listMenuText.size(); i++) {
            menuItemsLocator.get(i).shouldHave(text(listMenuText.get(i)))
        }

        
        /*menuItemsLocator.get(0).shouldHave(text("О нас"))
        menuItemsLocator.get(1).shouldHave(text("Портфолио"))
        menuItemsLocator.get(2).shouldHave(text("Карьера"))
        menuItemsLocator.get(3).shouldHave(text("Для респондентов"))*/
        
        
        
        /*$(byText("О компании")).scrollTo();
        $(byText("О нас")).scrollTo();
        $(byText("Портфолио")).scrollTo();
        $(byText("Карьера")).scrollTo();
        $(byText("Для респондентов")).scrollTo();*/

        return this;
    }
}
