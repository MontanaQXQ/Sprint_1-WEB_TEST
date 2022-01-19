package ru.yandex.praktikum;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderingScooterFirstStepTest {


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
      orderPage.orderingFullFirstForm("Питээр","Питэров","Куданибудь","Первомайская","89651643231");
      orderPage.clickButtonNext();
       String aboutArenda = $(byXpath(".//*[contains(text(),'Про аренду')]")).getText();
       System.out.println(aboutArenda);//SOUT пишу везде чисто для себя, что бы посомтреть , что там находиться. Это  я не считаю за проверку
       String mustBe = "Про аренду";
       Assert.assertEquals(mustBe,aboutArenda);

   }

}

