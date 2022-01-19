package ru.yandex.praktikum;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class YandexSamokatLogoTest {


    Landing homePage = new Landing();

    @Before
    public void testBefore() {
        Configuration.browserSize = "1980x1200";
        homePage = open("https://qa-scooter.praktikum-services.ru/", Landing.class);
    }


    @Test
    public void testClickScooterLogo() {
        homePage.clickScooterLogo();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        String url = "https://qa-scooter.praktikum-services.ru/";
        Assert.assertEquals(url, currentUrl);
        Selenide.closeWindow();
    }

    @Test
    public void testYaLogo () {
        homePage.clickYandexLogo();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        String url = "https://yandex.ru/";
        Assert.assertEquals(url, currentUrl);
    }

}
