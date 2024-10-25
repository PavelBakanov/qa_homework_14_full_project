package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class CrowdtestingPage {

    private final SelenideElement sliderLocator = $(".slider.js-crowdtesting-new-feedbacks-slider .slick-track");

    public CrowdtestingPage tryToMoveSlider() {
        actions().dragAndDropBy(sliderLocator, 750, 0).perform();
        return this;
    }
}
