package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.Objects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class CrowdtestingPage {

    private final SelenideElement sliderLocator = $(".slider.js-crowdtesting-new-feedbacks-slider .slick-track");
    private final SelenideElement feedbacksSliderLocator = $(".slider.js-crowdtesting-new-feedbacks-slider");

    @Step("Найти шторку и двигать ее")
    public CrowdtestingPage tryToMoveSlider() {
        String stringBrowserWidth = Configuration.browserSize;
        String[] arrayForSplit = stringBrowserWidth.split("x");
        int browserWidth = Integer.parseInt(arrayForSplit[1]);
        actions().dragAndDropBy(sliderLocator, -browserWidth / 2, 0).perform();
        return this;
    }

    @Step("После прокрутки шторки проверить, что текст в ней поменялся на другой")
    public CrowdtestingPage checkTextInCurrentSlide(String text, String alternativeText) {
        if (Objects.equals(Configuration.browserSize, "800x600")) {
            feedbacksSliderLocator.$("[aria-hidden='false'] .txt").
                    shouldHave(text(text));
        } else {
            feedbacksSliderLocator.$("[aria-hidden='false'] .txt").
                    shouldHave(text(alternativeText));
        }
        return this;
    }
}
