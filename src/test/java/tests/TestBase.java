package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.MainPage;

import java.util.Map;

import static io.qameta.allure.Allure.step;

public class TestBase {
    private final MainPage mainPage = new MainPage();

    @BeforeAll
    static void setUp() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        Configuration.browserSize = webConfig.getBrowserSize();//System.getProperty("browserSize");
        Configuration.browser = webConfig.getBrowserName();//System.getProperty("browser");
        Configuration.browserVersion = webConfig.getBrowserVersion();//System.getProperty("browserVersion");
        Configuration.baseUrl = webConfig.getBaseUrl();//System.getProperty("baseURL");
        Configuration.remote = webConfig.getRemoteUrl();
        //Configuration.remote = "https://" + System.getProperty("login") + "@" + System.getProperty("remoteURL");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeEach
    protected void doBeforeEach() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });

    }

    @AfterEach
    protected void tearDown() {
        Attach.screenshotAs("Последний скриншот");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }

}
