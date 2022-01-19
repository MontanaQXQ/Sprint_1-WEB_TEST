package ru.yandex.praktikum;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class OrderingScooterSecondStepTest {

    Landing homePage = new Landing();
    OrderingForWhoom orderPage = new OrderingForWhoom();
    OrderingFormAboutOrder trackPage = new OrderingFormAboutOrder();

    @Before
    public void testBefore() {
        homePage = open("https://qa-scooter.praktikum-services.ru/", Landing.class);
        orderPage = open("https://qa-scooter.praktikum-services.ru/", OrderingForWhoom.class);
        trackPage = open("https://qa-scooter.praktikum-services.ru/", OrderingFormAboutOrder.class);
    }


    @Test
    public void testOrderingScooterFirstStep() {
        homePage.clickHeaderButtonOrder();
        orderPage.orderingFullFirstForm("Питээр", "Питэров", "Куданибудь", "Первомайская", "89651643231");
        orderPage.clickButtonNext();
        String aboutArenda = $(byXpath(".//*[contains(text(),'Про аренду')]")).getText();
        System.out.println("перешли на следующую форму " + aboutArenda);//SOUT пишу везде чисто для себя, что бы посомтреть.
        String textMustBe = "Про аренду";
        Assert.assertEquals(textMustBe, aboutArenda);
        System.out.println(textMustBe.equals(aboutArenda));// Для себя написал посмотерть.
        trackPage.orderingFullSecondForm("05.11.2021", "Что то уже начинаю понимать.");
        trackPage.clickMakeOrder();
        trackPage.checkModalHeader();
        trackPage.clickMakeСonfirm();
        trackPage.ceckСonfirm();//Использовал в методе проверку локатора спомощью ShouldeBe(Visible); Я думаю этой рповерки достаточно, кнопка Да не нажалась и локатор не появился.

    }


    @Test
    public void testTwoOrderingScooterFirstStep() {
        homePage.clickHeaderButtonOrder();
        orderPage.orderingFullFirstForm("Артас", "Менетилов", "Нордскол", "Алтуфьево", "86669996699");
        orderPage.clickButtonNext();
        String aboutArenda = $(byXpath(".//*[contains(text(),'Про аренду')]")).getText();
        System.out.println("перешли на следующую форму " + aboutArenda);//SOUT пишу везде чисто для себя, что бы посомтреть.
        String textMustBe = "Про аренду";
        Assert.assertEquals(textMustBe, aboutArenda);
        System.out.println(textMustBe.equals(aboutArenda));// Для себя написал посмотерть.
        trackPage.orderingFullSecondForm("06.12.2021", "This Entire City Must Be Purged )");
        trackPage.clickMakeOrder();
        trackPage.checkModalHeader();
        trackPage.clickMakeСonfirm();
        trackPage.ceckСonfirm();//Использовал в методе проверку локатора спомощью ShouldeBe(Visible); Я думаю этой рповерки достаточно, кнопка Да не нажалась и локатор не появился.


        //Можно сделать через Assert вроде так, но текст локатора не находится и поэтмоу Expected = пустое значение а не Посмотреть статус.
        //Можно сделать Assert по локатору читсо, но локатор могут и поменять, а тут я до него не дохожу даже из за кнопки ДА поэтому до асерта не доходит проверка, код валится раньше

        //ВОТ ЧЕРЕЗ ASSERT//

        //String orderNumberCreate = $(byXpath(".//*[contains(text(),'Посмотреть статус')]")).getText();
        //System.out.println(orderNumberCreate);
        //String orderNumberCreateMustBe = "Посмотреть статус";
        //Assert.assertEquals(orderNumberCreateMustBe,orderNumberCreate);

    }


}



