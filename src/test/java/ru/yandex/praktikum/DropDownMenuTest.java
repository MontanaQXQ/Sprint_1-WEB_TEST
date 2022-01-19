package ru.yandex.praktikum;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class DropDownMenuTest {

    @Test
    public void testDropDownList() {
        Landing Landing = open("https://qa-scooter.praktikum-services.ru/", ru.yandex.praktikum.Landing.class);
        Landing.clickCookies();
        for (int i=0; i<8; i++) {
            Landing.clickArrowButton(i).TextShouldBeVisible(i);
        }
    }

}
