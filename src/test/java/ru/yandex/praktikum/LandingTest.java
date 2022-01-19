package ru.yandex.praktikum;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class LandingTest {

    Landing homePage = new Landing();

    @Before
    public void testBefore() {
        homePage = open("https://qa-scooter.praktikum-services.ru/", Landing.class);
    }
/*
    @Test
    public void testCookies () {
        homePage.clickCookies();
    }
*/

    @Test
    public void testplaceHolder() {
        homePage.clickPlaceHolder();
    }

    @Test
    public void testStatusOrderButton() {
        homePage.clickStatusOrderButton();

    }

    @Test
    public void testHeaderButtonOrder() {
        homePage.clickHeaderButtonOrder();
    }

    @Test
    public void testButtonGoOrder() {
        homePage.clickGoButton();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        String url = "https://qa-scooter.praktikum-services.ru/track?t=123456";
        Assert.assertEquals(url, currentUrl);
    }

    @Test
    public void testImageScooter() {
        homePage.findeImgScooter();
    }

    @Test
    public void testImageScooterTwo() {
        homePage.findeImgScooterTwo();
    }

    @Test
    public void testSamokatTwoDays() {
        homePage.findeSamokatTwoDays();
    }

    @Test
    public void testSamokatTwoDaysSubText() {
        homePage.findeSamokatTwoDaysSubText();
    }

    @Test
    public void testSamokatTwoDaysSubTextTwo() {
        homePage.findeSamokatTwoDaysSubTextTwo();
    }

    @Test
    public void testSamokatModel() {
        homePage.findeSamokatModel();
    }

    @Test
    public void testSamokatMaxSpeedText () {
        homePage.findeSamokatMaxSpeedText();
    }

    @Test
    public void testSamokatMaxSpeed () {
        homePage.findeSamokatMaxSpeed();
    }

    @Test
    public void testSamokatMileageWithoutChardge () {
        homePage.findeSamokatMileageWithouCharge();
    }

    @Test
    public void testSamokatWeightText () {
        homePage.findeSamokatWeightStrengthText();
    }

    @Test
    public void testSamokatWeight () {
        homePage.findeSamokatWeightStrength();
    }

    @Test
    public void testHowItWork() {
        homePage.findeHowItWork();
    }

    @Test
    public void testStatusOrderOne() {
        homePage.findeCircleOrderOne();

    }

    @Test
    public void testStatusOrderTwo() {
        homePage.findeCircleOrderTwo();

    }
    @Test
    public void testStatusOrderThree() {
        homePage.findeCircleOrderThree();

    }

    @Test
    public void testStatusOrderFoure() {
        homePage.findeCircleOrderFoure();
        // нужна проверка
    }

    @Test
    public void testMakeOrderText() {
        homePage.findeMakeOrderText();
    }

    @Test
    public void testMakeOrderSubText() {
        homePage.findeMakeOrderSubText();
    }

    @Test
    public void testDeliverText() {
        homePage.findeDeliverText();
    }

    @Test
    public void testDeliverSubText() {
        homePage.findeDeliverSubText();
    }

    @Test
    public void testDeriveText() {
        homePage.findeDriveText();
    }

    @Test
    public void testDeriveSubText() {
        homePage.findeDriveSubText();
    }

    @Test
    public void testCourierReturnsamokatText() {
        homePage.findeCourierReturnSamokatText();
    }

    @Test
    public void testCourierReturnsamokatSubText() {
        homePage.findeCourierReturnSamokatSubText();
    }

    @Test
    public void testFooterOrder() {
        homePage.findeFooterOrder();
    }

    @Test
    public void testQuestionsAboutSamokat() {
        homePage.findeQuestionsAboutSamokat();
    }




}


