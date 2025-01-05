package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("crowdtesting")
public class CheckSliderTests extends TestBase{
    private final MainPage mainPage = new MainPage();
    private final CrowdtestingPage crowdtestingPage = new CrowdtestingPage();

    @Test
    @DisplayName("Проверка шторки в разделе 'Краудтестинг'")
    public void sliderTest() {
        step("Открыть раздел 'Краудтестинг'", () -> {
            mainPage.openCrowdTestingPage();
        });
        step("Найти шторку и двигать ее", () -> {
            crowdtestingPage.tryToMoveSlider();
        });
        step("После прокрутки шторки проверить, что текст в ней поменялся на другой", () -> {
            crowdtestingPage.checkTextInCurrentSlide();
        });
    }
}
