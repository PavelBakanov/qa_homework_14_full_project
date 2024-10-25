package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class CrowdtestingPage {

    private final SelenideElement sliderLocator = $(".slider.js-crowdtesting-new-feedbacks-slider .slick-track");

    public CrowdtestingPage tryToMoveSlider() {
        actions().dragAndDropBy(sliderLocator, 750, 0).perform();
        return this;
    }

    public CrowdtestingPage checkTextInCurrentSlide() {
        $(".item.slick-slide.slick-current.slick-active .txt").shouldHave(text("Мы положительно оцениваем" +
                " опыт совместных проектов, " +
                "высокое качество результатов " +
                "и четкую организацию самого процесса " +
                "выполнения проектов, а так же " +
                "профессионализм команды CrowdTesting."));
        return this;
    }
}
