package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class CrowdtestingPage {

    private final SelenideElement sliderLocator = $(".slider.js-crowdtesting-new-feedbacks-slider .slick-track");

    public CrowdtestingPage tryToMoveSlider() {
        String stringBrowserWidth = Configuration.browserSize;
        String[] arrayForSplit = stringBrowserWidth.split("x");
        int browserWidth = Integer.parseInt(arrayForSplit[1]);
        actions().dragAndDropBy(sliderLocator, -browserWidth / 6, 0).perform();
        return this;
    }

    public CrowdtestingPage checkTextInCurrentSlide() {
        if (Objects.equals(Configuration.browserSize, "800x600")) {
            $(".slider.js-crowdtesting-new-feedbacks-slider").$("[aria-hidden='false'] .txt").
                    shouldHave(text("Компания CrowdTesting за время нашего сотрудничества неоднократно " +
                            "продемонстрировала свой высокий профессионализм и компетентность в " +
                            "исследованиях юзабилити и клиентского опыта наших сервисов."));
        } else {
            $(".slider.js-crowdtesting-new-feedbacks-slider").$("[aria-hidden='false'] .txt").
                    shouldHave(text("Опыт сотрудничества с компанией CrowdTesting" +
                            " наша компания характеризует исключительно положительно. " +
                            "Все работы выполняются с высоким качеством, в установленные сроки."));
        }
        return this;
    }
}
