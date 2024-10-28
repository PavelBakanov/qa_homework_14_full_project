package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class CrowdtestingPage {

    private final SelenideElement sliderLocator = $(".slider.js-crowdtesting-new-feedbacks-slider .slick-track");

    public CrowdtestingPage tryToMoveSlider() {
        String stringBrowserWidth = Configuration.browserSize;
        String[] arrayForSplit = stringBrowserWidth.split("x");
        int browserWidth = Integer.parseInt(arrayForSplit[1]);
        actions().dragAndDropBy(sliderLocator, browserWidth / 3, 0).perform();
        return this;
    }

    public CrowdtestingPage checkTextInCurrentSlide() {
        $(".new-feedbacks .item.slick-slide.slick-current.slick-active .txt").
                shouldHave(text("Опыт сотрудничества с компанией CrowdTesting" +
                        " наша компания характеризует исключительно положительно. " +
                        "Все работы выполняются с высоким качеством, в установленные сроки."));
        return this;
    }
}
