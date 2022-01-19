package ru.yandex.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Landing {

    //локатор лого Яндекс в Логотипе "Яндекс Самокат"
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
    private SelenideElement yandexButton;

    //локатор лого самокат в Логотипе "Яндекс Самокат"
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoScooter__3lsAR")
    private SelenideElement scooterButton;

    //локатор кнопки "Заказать" в шапке страницы
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g")
    private SelenideElement headerButtonOrder;

    //локатор кнопки статуса заказа
    @FindBy(how = How.CLASS_NAME,using = "Header_Link__1TAG7")
    private SelenideElement statusOrderButton;

    //локатор поля ввода номера заказа
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='Введите номер заказа']")
    private SelenideElement entryField;

    //Локатор кнопки GO! для поиска статуса заказа
    @FindBy(how = How.XPATH,using = ".//div[@class='Header_SearchInput__3YRIQ']/button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement buttonGO;


    //Локатор картинки скутера не закрашенной
    @FindBy(how = How.XPATH,using =".//div[@class='Home_FirstPart__3g6vG']/div[@class='Home_BluePrint__TGX2n']/img[@alt='Scooter blueprint']")
    private SelenideElement imgScooter;

    //Локатор картинки скутера  закрашенной
    @FindBy(how = How.XPATH,using =".//div[@class='Home_FirstPart__3g6vG']/div[@class='Home_Scooter__3YdJy']/img[@alt='Scooter blueprint']")
    private SelenideElement imgScooterTwo;

    //Локатор самокат на пару дней.
    @FindBy(how = How.CLASS_NAME,using ="Home_Header__iJKdX")
    private SelenideElement samokatTwoDays;

    //Локатор текста "Привезём его прямо к вашей двери"
    @FindBy(how = How.XPATH,using =".//div[@class='Home_Header__iJKdX']/div[@class='Home_SubHeader__zwi_E']")
    private SelenideElement samokatTwoDaysSubText;




    //Локатор текста "Привезём его прямо к вашей двери"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю')]")
    private SelenideElement samokatTwoDaysSubTextTwo;


    //Локатор текста Модель Toxic PRO
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Модель Toxic PRO')]")
    private SelenideElement samokatModel;
    //Проверка локатора Модель Toxic PRO

    //Локатор текста "Максимальная скорость"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Максимальная скорость')]")
    private SelenideElement samokatMaxSpeedText;


    //Локатор текста 40 км/ч
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'40 км/ч')]")
    private SelenideElement samokatMaxSpeed;

    //Локатор текста Проедет без поздарядки
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Проедет без поздарядки')]")
    private SelenideElement samokatMileageWithouChargeText;


    //Локатор текста 80 км'
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'80 км')]")
    private SelenideElement samokatMileageWithouCharge;


    //Локатор текста Выдерживает вес
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Выдерживает вес')]")
    private SelenideElement samokatWeightStrengthText;


    //Локатор текста 120 кг'
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'120 кг')]")
    private SelenideElement samokatWeightStrength;
    //Проверка локатора 120 кг'




    //Локатор текста "Как это работает"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Как это работает')]")
    private SelenideElement howItWork;

    //Локатор для кружка статуса заказа номер 1
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[1]/div[1]")
    private SelenideElement circleOrderOne;

    //Локатор для кружка статуса заказа номер 2
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[2]/div[1]")
    private SelenideElement circleOrderTwo;

    //Локатор для кружка статуса заказа номер 3
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[3]/div[1]")
    private SelenideElement circleOrderThree;

    //Локатор для кружка статуса заказа номер 4
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[4]/div[1]")
    private SelenideElement circleOrderFoure;


    //Локатор для "Заказываете самокат"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Заказываете самокат')]")
    private SelenideElement makeOrderText;

    //Локатор для "Выбираете, когда и куда привезти"
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]")
    private SelenideElement makeOrderSubText;

    //Локатор для "Курьер привозит самокат"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Курьер привозит самокат')]")
    private SelenideElement deliverText;

    //Локатор для "А вы — оплачиваете аренду"
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[2]/div[2]/div[2]")
    private SelenideElement deliverSubText;

    //Локатор для "Катаетесь"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Катаетесь')]")
    private SelenideElement driveText;


    //Локатор для "Сколько часов аренды осталось — видно на сайте"
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[3]/div[2]/div[2]")
    private SelenideElement driveSubText;


    //Локатор для "Курьер забирает самокат"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Курьер забирает самокат')]")
    private SelenideElement CourierRreturnSamokatText;


    //Локатор для "Когда аренда заканчивается"
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[4]/div[2]/div[2]")
    private SelenideElement CourierRreturnSamokatSubText;


    //Локатор  для нижней кнопки  "Заказать"
    @FindBy(how = How.XPATH,using ="//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button")// не работает почему то //div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']")
    private SelenideElement footerOrder;




    //Локатор текста "Как это работает"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Вопросы о важном')]")
    private SelenideElement questionsAboutSamokat;

    // Локатор первой кнопки аккардиона "Сколько это стоит и как оплатить?"
    @FindBy(how = How.ID,using ="accordion__heading-0")
    private SelenideElement accardionOne;


    //локатор Текста первой кнопки аккардиона
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Сутки — 400 рублей. Оплата курьеру — наличными или картой')]")
    private SelenideElement accardionOneText;


    // локатор второй кнопки аккардиона "Хочу сразу несколько самокатов! Так можно?"
    @FindBy(how = How.ID,using ="accordion__heading-1")
    private SelenideElement accardionTwo;


    //локатор Текста второй кнопки аккардиона "Пока что у нас так...."
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.')]")
    private SelenideElement accardionTwoText;


    // локатор Тртей кнопки аккардиона "Как рассчитывается время аренды?"
    @FindBy(how = How.ID,using ="accordion__heading-2")
    private SelenideElement accardionThree;

    //локатор Текста третей кнопки аккардиона "Допустим, вы оформляете заказ на 8 мая......"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.')]")
    private SelenideElement accardionThreeText;


    // локатор четвертой кнопки аккардиона "Можно ли заказать самокат прямо на сегодня?"
    @FindBy(how = How.ID,using ="accordion__heading-3")
    private SelenideElement accardionFoure;


    //локатор Текста четвертой кнопки аккардиона "Можно ли заказать самокат прямо на сегодня?"
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Только начиная с завтрашнего дня. Но скоро станем расторопнее.')]")
    private SelenideElement accardionFoureText;


    // локатор Пятой кнопки аккардиона "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy(how = How.ID,using ="accordion__heading-4")
    private SelenideElement accardionFive;

    //локатор Текста Пятой кнопки аккардиона "Пока что нет!..."
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.')]")
    private SelenideElement accardionFiveText;


    // локатор Шестой кнопки аккардиона "Вы привозите зарядку вместе с самокатом?"
    @FindBy(how = How.ID,using ="accordion__heading-5")
    private SelenideElement accardionSix;


    //локатор Текста Шестой кнопки аккардиона "Самокат приезжает к вам с полной зарядкой...."
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.')]")
    private SelenideElement accardionSixText;


    // локатор Седьмой кнопки аккардиона "Можно ли отменить заказ?"
    @FindBy(how = How.ID,using ="accordion__heading-6")
    private SelenideElement accardionSeven;

    //локатор Текста седьмой кнопки аккардиона "Да, пока самокат не привезли. Штрафа не будет...."
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.')]")
    private SelenideElement accardionSevenText;


    // локатор Восьмой кнопки аккардиона "Я жизу за МКАДом, привезёте?"
    @FindBy(how = How.ID,using ="accordion__heading-7")
    private SelenideElement accardionEight;

    //локатор Текста Восьмой кнопки аккардиона "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    @FindBy(how = How.XPATH,using =".//*[contains(text(),'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]")
    private  SelenideElement AccardionEightText;

    @FindBy(how = How.ID,using = "rcc-confirm-button")
    private SelenideElement cookies;
    //Локатор кнопки куки

    @FindBy(how = How.CLASS_NAME,using = "accordion")
    private SelenideElement accardion;


    //Локатор стрелки выпадающего списка
    private  ElementsCollection arrowsButton = $$(byClassName("accordion__item"));




    //клик по лого Яндекс в Логотипе "Яндекс Самокат"
    public void clickYandexLogo(){
        yandexButton.shouldBe(visible);
        String chord = Keys.chord(Keys.LEFT_CONTROL, Keys.ENTER);
        yandexButton.sendKeys(chord );
        switchTo().window(1);
        $(byXpath("//*[@id=\"text\"]")).shouldBe(visible);
    }

    //клик по лого Самокат в Логотипе "Яндекс Самокат" средней кнопкой мыши
    //Переходим во вторую открывшуюся вкладку
    public void clickScooterLogo(){
        scooterButton.shouldBe(visible);
        String chord = Keys.chord(Keys.LEFT_CONTROL, Keys.ENTER);
        scooterButton.sendKeys(chord );
        switchTo().window(1);
        scooterButton.should(exist);
    }



    //клик по кнопке "Заказать" в шапке страницы
    public void clickHeaderButtonOrder(){
        headerButtonOrder.scrollTo().shouldBe(visible).click();
        $(byXpath(".//*[contains(text(),'Для кого самокат')]")).shouldBe(exist);
        System.out.println($(byXpath(".//*[contains(text(),'Для кого самокат')]")).shouldBe(exist));
    }

    //клик по кнопке статсуа заказа в шапке странице
    public void clickStatusOrderButton() {
//        statusOrderButton.scrollTo().shouldBe(Condition.visible).click();
        checker(statusOrderButton, visible);
    }

    //**КЛИК ПО ПЛЭЙСХОЛДЕРУ**//
    //клик по кнопке статсуа заказа в шапке странице
    //клик по полю статуса заказа

    public void clickPlaceHolder() {
        checker(statusOrderButton, visible);
//        statusOrderButton.scrollTo().shouldBe(Condition.visible).click();
        entryField.shouldBe(visible).click();
    }

    private void checker(SelenideElement element,Condition condition){
        element.scrollTo().shouldBe(condition).click();
    }

    //**КЛИК ПО ПЛЭЙСХОЛДЕРУ, ВВОД НСЕУЩЕСТВУЮЩЕГО ЗАКАЗА И НАЖАИТЕ КНОПКИ GO!**//
    //клик по кнопке статсуа заказа в шапке странице
    //клик по плэйсхолдеру
    //ввод в плэйсхолдер несуществующего заказа "123456"
    //Нажатие кнопки GO!
    public void clickGoButton() {
        statusOrderButton.shouldBe(visible).click();
        entryField.shouldBe(visible).click();
        entryField.setValue(String.valueOf(123456));
        buttonGO.shouldBe(visible).click();
        $(byClassName("Track_NotFound__6oaoY")).shouldBe(visible);
    }

    //проверка что нашли локатор картинки незакрашенного скутера.
    public void findeImgScooter(){
        imgScooter.shouldBe(exist);
        System.out.println(imgScooter);
    }

    //проверка что нашли локатор картинки закрашенного скутера.
    public void findeImgScooterTwo(){
        imgScooterTwo.shouldBe(exist);
        System.out.println(imgScooterTwo);
    }

    // проверка тчо нашли самокат на пару дней
    public void findeSamokatTwoDays(){
        samokatTwoDays.shouldBe(exist);
        System.out.println(samokatTwoDays);
    }

    // проверка тчо нашли локатор  "Привезём его прямо к вашей двери"
    public void  findeSamokatTwoDaysSubText(){
        samokatTwoDaysSubText.shouldBe(exist);
        System.out.println(samokatTwoDaysSubText);
    }

    //СКРОЛИМ ДО ПОЯВЛЕНИЯ ХАРАКТЕРИСТИК САМОКАТА И ИЩЕМ ЭЛЕМЕНТЫ
    // проверка тчо нашли локатор  "Привезём его прямо к вашей двери"
    public void  findeSamokatTwoDaysSubTextTwo(){
        samokatTwoDaysSubTextTwo.scrollTo().shouldBe(exist);
        samokatTwoDaysSubTextTwo.getText();
        samokatTwoDaysSubTextTwo.shouldBe(have(exactText("Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю")));
        System.out.println(samokatTwoDaysSubTextTwo);
    }

    public void  findeSamokatModel(){
        samokatModel.scrollTo().shouldBe(exist);
        samokatModel.getText();
        samokatModel.shouldBe(have(exactText("Модель Toxic PRO")));
        System.out.println(samokatModel);
    }

    //Проверка локатора "Максимальная скорость"
    public void  findeSamokatMaxSpeedText(){
        samokatMaxSpeedText.scrollTo().shouldBe(exist);
        samokatMaxSpeedText.getText();
        samokatMaxSpeedText.shouldBe(have(exactText("Максимальная скорость")));
        System.out.println( samokatMaxSpeedText);
    }

    //СКРОЛИМ ДО ПОЯВЛЕНИЯ ХАРАКТЕРИСТИК САМОКАТА И ИЩЕМ ЭЛЕМЕНТЫ

    //Проверка локатора 40 км/ч
    public void  findeSamokatMaxSpeed(){
        samokatMaxSpeed.scrollTo().shouldBe(exist);
        samokatMaxSpeed.getText();
        samokatMaxSpeed.shouldBe(have(exactText("40 км/ч")));
        System.out.println(samokatMaxSpeed);
    }
    //Проверка локатора Проедет без поздарядки'
    public void  findeSamokatMileageWithouChargeText(){
        samokatMileageWithouChargeText.scrollTo().shouldBe(exist);
        samokatMileageWithouChargeText.getText();
        samokatMileageWithouChargeText.shouldBe(have(exactText("Проедет без поздарядки")));
        System.out.println(samokatMileageWithouChargeText);
    }

    //Проверка локатора 80 км'
    public void  findeSamokatMileageWithouCharge(){
        samokatMileageWithouCharge.scrollTo().shouldBe(exist);
        samokatMileageWithouCharge.getText();
        samokatMileageWithouCharge.shouldBe(have(exactText("80 км")));
        System.out.println(samokatMileageWithouCharge);
    }

    //Проверка локатора Выдерживает вес
    public void  findeSamokatWeightStrengthText(){
        samokatWeightStrengthText.scrollTo().shouldBe(exist);
        samokatWeightStrengthText.getText();
        samokatWeightStrengthText.shouldBe(have(exactText("Выдерживает вес")));
        System.out.println(samokatWeightStrengthText);
    }

    public void  findeSamokatWeightStrength(){
        samokatWeightStrength.scrollTo().shouldBe(exist);
        samokatWeightStrength.getText();
        samokatWeightStrength.shouldBe(have(exactText("120 кг")));
        System.out.println(samokatWeightStrength);
    }

    //проверка локатора "Как это работает"
    public void  findeHowItWork(){
        howItWork.scrollTo().shouldBe(exist);
        howItWork.getText();
        howItWork.shouldBe(have(exactText("Как это работает")));
        System.out.println(howItWork);
    }

    //проверка локатора кружка статуса заказа номер 1
    public void  findeCircleOrderOne(){
        circleOrderOne.scrollTo().shouldBe(exist);
        System.out.println(circleOrderOne);
    }

    //проверка локатора кружка статуса заказа номер 2
    public void  findeCircleOrderTwo(){
        circleOrderTwo.scrollTo().shouldBe(exist);
        System.out.println(circleOrderTwo);
    }

    //проверка локатора кружка статуса заказа номер 3
    public void  findeCircleOrderThree(){
        circleOrderThree.scrollTo().shouldBe(exist);
        System.out.println(circleOrderThree);
    }

    //проверка локатора кружка статуса заказа номер 4
    public void  findeCircleOrderFoure(){
        circleOrderFoure.scrollTo().shouldBe(exist);
        System.out.println(circleOrderFoure);
    }


    //проверка локатора "Заказываете самокат"
    public void  findeMakeOrderText(){
        makeOrderText.scrollTo().shouldBe(exist);
        System.out.println(makeOrderText);
    }

    //проверка локатора "Выбираете, когда и куда привезти"
    public void findeMakeOrderSubText(){
        makeOrderSubText.scrollTo().shouldBe(exist);
        System.out.println(makeOrderSubText);
    }

    //проверка локатора "Курьер привозит самокат"
    public void  findeDeliverText(){
        deliverText.scrollTo().shouldBe(exist);
        System.out.println(deliverText);
    }

    //проверка локатора "А вы — оплачиваете аренду"
    public void  findeDeliverSubText(){
        deliverSubText.scrollTo().shouldBe(exist);
        System.out.println(deliverSubText);
    }

    //проверка локатора "Катаетесь"
    public void  findeDriveText(){
        driveText.scrollTo().shouldBe(exist);
        System.out.println(driveText);
    }

    //проверка локатора "Сколько часов аренды осталось — видно на сайте"
    public void  findeDriveSubText(){
        driveSubText.scrollTo().shouldBe(exist);
        System.out.println(driveSubText);
    }

    //проверка локатора "Курьер забирает самокат"
    public void  findeCourierReturnSamokatText(){
        CourierRreturnSamokatText.scrollTo().shouldBe(exist);
        System.out.println(CourierRreturnSamokatText);
    }

    //проверка локатора "Когда аренда заканчивается"
    public void  findeCourierReturnSamokatSubText(){
        CourierRreturnSamokatSubText.scrollTo().shouldBe(exist);
        System.out.println(CourierRreturnSamokatSubText);
    }

//Вопросы о важном


    //проверка локатора "Как это работает"
    public void  findeQuestionsAboutSamokat(){
        questionsAboutSamokat.scrollTo().shouldBe(exist);
        questionsAboutSamokat.getText();
        questionsAboutSamokat.shouldBe(have(exactText("Вопросы о важном")));
        System.out.println(questionsAboutSamokat);
    }
/*
    // Проверка локатора первой кнопки аккардиона "Сколько это стоит? И как оплатить?"
    public void  findeAccardionOne(){
    accardionOne.scrollTo().shouldBe(Condition.visible).click();
    }

    // Проверка локатора текста  первой кнопки аккардиона "Сколько это стоит? И как оплатить?"
    public void  findeAccardionOneText(){
        accardionOne.scrollTo().shouldBe(Condition.visible).click();
        accardionOneText.shouldBe(Condition.exist);
        accardionOneText.getText();
        accardionOneText.shouldBe(Condition.have(Condition.exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой.")));
        System.out.println(accardionOneText);
    }
    // Проверка локатора текста второй кнопки аккардиона "Хочу сразу несколько самокатов! Так можно?"
    public void  findeAccardionTwo(){

        accardionTwo.scrollTo().shouldBe(Condition.visible).click();
    }
    // Проверка локатора текста второй кнопки аккардиона "Пока что у нас так...."
    public void  findeAccardionTwoText(){
        accardionTwo.scrollTo().shouldBe(Condition.visible).click();
        accardionTwoText.shouldBe(Condition.exist);
        accardionTwoText.getText();
        accardionTwoText.shouldBe(Condition.have(Condition.exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.")));
        System.out.println(accardionTwoText);
    }
    // Проверка локатора Третей кнопки аккардиона "Как рассчитывается время аренды?"
    public void  findeAccardionThree(){
        accardionThree.scrollTo().shouldBe(Condition.visible).click();
    }


    // Проверка локатора текста третей кнопки аккардиона "Допустим, вы оформляете заказ на 8 мая......"
    public void  findeAccardionThreeText(){
        accardionThree.scrollTo().shouldBe(Condition.visible).click();
        accardionThreeText.shouldBe(Condition.exist);
        accardionThreeText.getText();
        accardionThreeText.shouldBe(Condition.have(Condition.exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.")));
        System.out.println(accardionThreeText);
    }

    // Проверка локатора текста четвертой кнопки аккардиона "Можно ли заказать самокат прямо на сегодня?"
    public void  findeAccardionFoureText(){
        accardionFoure.scrollTo().shouldBe(Condition.visible).click();
        accardionFoureText.shouldBe(Condition.exist);
        accardionFoureText.getText();
        accardionFoureText.shouldBe(Condition.have(Condition.exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее.")));
        System.out.println(accardionFoureText);
    }

    // Проверка четвертой кнопки аккардиона "Можно ли заказать самокат прямо на сегодня?"
    public void  findeAccardionFoure(){
        accardionFoure.scrollTo().shouldBe(Condition.visible).click();
    }

    // Проверка локатора текста Пятой кнопки аккардиона "Пока что нет!..."
    public void  findeAccardionFiveText(){
        accardionFive.scrollTo().shouldBe(Condition.visible).click();
        accardionFiveText.shouldBe(Condition.exist);
        accardionFiveText.getText();
        accardionFiveText.shouldBe(Condition.have(Condition.exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.")));
        System.out.println(accardionFiveText);
    }

    // Проверка локатора Пятой  кнопки аккардиона "Можно ли продлить заказ или вернуть самокат раньше?"
    public void  findeAccardionFive(){
        accardionFive.scrollTo().shouldBe(Condition.visible).click();
    }



    // Проверка локатора текста Шестой кнопки аккардиона "Самокат приезжает к вам с полной зарядкой...."
    public void  findeAccardionSixText(){
        accardionSix.scrollTo().shouldBe(Condition.visible).click();
        accardionSixText.shouldBe(Condition.exist);
        accardionSixText.getText();
        accardionSixText.shouldBe(Condition.have(Condition.exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.")));
        System.out.println(accardionSixText);
    }

    // Проверка Шестой  кнопки аккардиона "Вы привозите зарядку вместе с самокатом?"
    public void  findeAccardionSix(){
        accardionSix.scrollTo().shouldBe(Condition.visible).click();
    }

    // Проверка Седьмой кнопки аккардиона "Можно ли отменить заказ?"
    public void  findeAccardionSeven(){

        accardionSeven.scrollTo().shouldBe(Condition.visible).click();
    }

    // Проверка локатора Седьмой кнопки аккардиона "Да, пока самокат не привезли. Штрафа не будет...."
    public void  findeAccardionSevenText(){
        accardionSeven.scrollTo().shouldBe(Condition.visible).click();
        accardionSevenText.shouldBe(Condition.exist);
        accardionSevenText.getText();
        accardionSevenText.shouldBe(Condition.have(Condition.exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.")));
        System.out.println(accardionSevenText);
    }

    // Проверка локатора Восьмой кнопки аккардиона "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    public void  findeAccardionEightText(){
        accardionEight.scrollTo().shouldBe(Condition.visible).click();
        accardionEightText.shouldBe(Condition.exist);
        accardionEightText.getText();
        accardionEightText.shouldBe(Condition.have(Condition.exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области.")));
        System.out.println(accardionEightText);
}

    // Проверка Восьмой кнопки аккардиона "Я жизу за МКАДом, привезёте?"
    public void  findeAccardionEight(){
        accardionEight.scrollTo().shouldBe(Condition.visible).click();
    }

    */



    //кликаем сразу по всем кнопкам аккардиона
    public Landing clickArrowButton(int numberArrow) {

        arrowsButton.get(numberArrow).find(byXpath(".//div[contains(@id,'accordion__heading')]")).click();
        return this;
    }

//проверяем чт окогда кликнули кнопку аккардиона то текст отображается
    public Landing TextShouldBeVisible(int numberId) {
        $(byId("accordion__panel-"+numberId)).shouldBe(visible);
        return this;
        }

    //проверка для локатора нижней кнопки  "Заказать"
    public void  findeFooterOrder(){
        footerOrder.scrollTo().shouldBe(visible).click();
    }


    public void clickCookies(){
        cookies.scrollTo().shouldBe(visible).click();
    }


    }

