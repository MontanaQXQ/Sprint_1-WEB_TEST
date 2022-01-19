package ru.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;


public class OrderingForWhoom {

    //локатор для поля Имя
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Имя']")
    private SelenideElement nameField;

    //локатор для поля Фамилия
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement surnameField;

    //локатор для поля Адресс
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement adressField;


    //локатор для поля метро
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Станция метро']")
    private SelenideElement metroField;

    //локатор для поля Телефон
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberfield;

    //Локатор кнопки Далее
    @FindBy(how = How.XPATH,using =".//div[@class='Order_NextButton__1_rCA']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonNext;



    //Метод заполнения Имени
    public void setName(String name){
        nameField.setValue(name);
    }

    //Метод заполнения Фамилии
    public void setSurName(String surname){
        surnameField.setValue(surname);
    }

    //Метод заполнения Адресса
    public void setAdress(String adress){
        adressField.setValue(adress);
    }

    //Метод заполнения Метро
    public void setMetro(String metro){
        metroField.setValue(metro);
        metroField.sendKeys(Keys.DOWN);
        metroField.sendKeys(Keys.ENTER);
    }

    //Метод заполнения Номера
    public void setNumberPhone(String number){
        phoneNumberfield.setValue(number);
    }
    // метод заполнения данных
    public void  orderingFullFirstForm(String name,String surname, String adress, String metro, String number) {
        setName(name);
        setSurName(surname);
        setAdress(adress);
        setMetro(metro);
        setNumberPhone(number);

    }

    //Метод нажатия кнопки далее

    public void clickButtonNext() {
        buttonNext.shouldBe(visible).click();
    }



}



