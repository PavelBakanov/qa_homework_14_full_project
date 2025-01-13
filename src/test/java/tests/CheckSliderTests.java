package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Owner(value = "bakanovpb")
@Tag("crowdtesting")
@DisplayName("Тесты на проверку слайдеров")
public class CheckSliderTests extends TestBase{
    private final MainPage mainPage = new MainPage();
    private final CrowdtestingPage crowdtestingPage = new CrowdtestingPage();

    @Test
    @DisplayName("Проверка шторки в разделе 'Краудтестинг'")
    public void sliderTest() {
        mainPage.openMainPage();
        mainPage.openCrowdTestingPage();
        crowdtestingPage.tryToMoveSlider();
        crowdtestingPage.checkTextInCurrentSlide("Опыт сотрудничества" +
                    " с компанией CrowdTesting" +
                    " наша компания характеризует исключительно положительно. " +
                    "Все работы выполняются с высоким качеством, в установленные сроки.");
    }
}
