package ru.yandex.praktikum;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class OrderingFormAboutOrder {


    //локатор для поля  Когда привезти самокат
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement dateField;

    //локатор для выбора срока аренды
    @FindBy(how = How.CLASS_NAME,using = "Dropdown-control")
    private SelenideElement arendaDay;

    //локатор для выбора срока аренды в выпадающем меню
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'трое суток')]")
    private SelenideElement setArendaDay;

    //локатор для кнопки цвет самоката
    @FindBy(how = How.XPATH,using = "//*[@id=\"black\"]")
    private SelenideElement colorField;

    //локатор для поля Коментарий для курьера
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement commentField;


    //локатор для кнопки Заказать в конце заполнения форм
    @FindBy(how = How.XPATH,using = "//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement makeOrder;

    //Локатор всплывающего меню подтверждения заказа с кнопками "ДА" "НЕТ"
    @FindBy(how = How.CLASS_NAME,using ="Order_ModalHeader__3FDaJ")
    private SelenideElement modalHeader;

    //локатор для кнопки Да " Хотите оформить заказ?"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Да')]")
    private SelenideElement makeOrderСonfirm;


    //Локатор кнопки Посмотреть заказ
    @FindBy(how = How.XPATH,using ="//div[@class='Order_NextButton__1_rCA']/button[text()='Посмотреть статус']")
    private SelenideElement showOrderButton;




    // метод клика кнопки заказать в конце заполнения форм
    public void clickMakeOrder(){
        makeOrder.shouldBe(Condition.visible).click();

    }

    //Метод Проверки всплывающего окна подтверждения заказа
    public void checkModalHeader(){
        modalHeader.should(Condition.visible);
    }

    // метод клика кнопки для кнопки Да " Хотите оформить заказ?"
    public void clickMakeСonfirm(){
       makeOrderСonfirm.shouldBe(Condition.visible).click();
     }

    // метод проверки кнопки "Посмотреть статус"
    public void ceckСonfirm(){
        showOrderButton.shouldBe(Condition.visible);}


    //метод заполнения даты поля
    public void setDate(String date){
        dateField.setValue(date);
        dateField.sendKeys(Keys.ENTER);
    }
    // метод выбора срока аренды
    public void setArenda(){
        arendaDay.click();
        setArendaDay.click();
    }


    //метод выбора цвета самоката
    public void setColor(){
        colorField.click();
    }

    //метод заполнения комментария курьера
    public void setComment(String comment){
        commentField.setValue(comment);
    }

    //метод заполнения данных
    public void  orderingFullSecondForm(String date,String comment) {
        setDate(date);
        setArenda();
        setColor();
        setComment(comment);
    }








}

