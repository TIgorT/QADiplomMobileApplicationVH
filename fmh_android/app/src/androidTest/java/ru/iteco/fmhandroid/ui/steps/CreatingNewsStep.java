package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static ru.iteco.fmhandroid.ui.data.Utils.dateOfPublication;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.contrib.PickerActions;
import androidx.test.espresso.matcher.RootMatchers;

import java.text.ParseException;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;


public class CreatingNewsStep {
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static AuthorizationModule authorizationModule = new AuthorizationModule();


    public void selectTheAdCategoryFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка в списке видимости  категории Объявление");
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Объявление в списке категорий");
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void selectTheAdBirthdayFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка в списке видимости категории День рождения");
        creatingNewsElement.theBirthdayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию День рождения в списке категорий");
        creatingNewsElement.theBirthdayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.birthday())));
    }

    public void selectTheSalaryCategoryFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка в списке видимости категории Зарплата");
        creatingNewsElement.theSalaryCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Зарплата в списке категорий");
        creatingNewsElement.theSalaryCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.salary())));
    }

    public void selectTheTradeUnionCategoryFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка в списке видимости категории Профсоюз");
        creatingNewsElement.theTradeUnionCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Профсоюз в списке категорий");
        creatingNewsElement.theTradeUnionCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.theTradeUnion())));
    }

    public void selectHolidayCategoryFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка в списке видимости категории Праздник");
        creatingNewsElement.theHolidayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Праздник в списке категорий");
        creatingNewsElement.theHolidayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.holiday())));
    }

    public void selectMassageCategoryFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка в списке видимости категории Массаж");
        creatingNewsElement.theMassageCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Массаж в списке категорий");
        creatingNewsElement.theMassageCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.massage())));
    }

    public void selectGratitudeCategoryFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Закрытие клавиатуры");
        Espresso.closeSoftKeyboard();
        Allure.step("Проверка в списке видимости категории Благодарность");
        creatingNewsElement.theGratitudeCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Благодарность в списке категорий");
        creatingNewsElement.theGratitudeCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.gratitude())));
    }

    public void selectNeedHelpCategoryFromTheListOfCategories() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Закрытие клавиатуры");
        Espresso.closeSoftKeyboard();
        Allure.step("Проверка в списке видимости категории Нужна помощь");
        creatingNewsElement.theNeedHelpCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Нужна помощь в списке категорий");
        creatingNewsElement.theNeedHelpCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.needHelp())));
    }

    public void enterTheLetterOInLowercaseInTheCategoryField() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category буквенный символ в нижнем регистре");
        creatingNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInLowercase()));
        Allure.step("Проверка видимости списка категории");
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Объявление в списке категорий");
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void enterTheLetterOInUppercaseInTheCategoryField() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category буквенный символ в верхнем регистре");
        creatingNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInUppercase()));
        Allure.step("Проверка видимости списка категории");
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Объявление в списке категорий");
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownList() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category любое слово, не состоящее в выпадающем списке, используя кириллицу");
        creatingNewsElement.theCategoryField.perform(replaceText(Data.bingo()));
        Allure.step("Проверка введённого слова в поле Category");
        // Делаю проверку что в поле Category вводятся буквенные символы используя кириллицу;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.bingo())));
    }

    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListInLatin() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category любое слово, не состоящее в выпадающем списке, используя латиницу");
        creatingNewsElement.theCategoryField.perform(replaceText(Data.aWordInLatin()));
        Allure.step("Проверка введённого слова в поле Category");
        // Делаю проверку что в поле Category вводятся буквенные символы используя латиницу;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.aWordInLatin())));
    }

    public void createANewsItemWithAnEmptyCategoryFieldInCreatingNews() throws ParseException {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Ввод в поле Title любое слово");
        creatingNewsElement.titleField.perform(replaceText(Data.sea()));
        Allure.step("Проверка видимости поля Publication Date");
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        Allure.step("Ввод в поле Publication Date  даты");
        creatingNewsElement.thePublicationDateField.perform(replaceText(dateOfPublication()));
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Ввод в поле Time времени");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(21, 30), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости поля Description");
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        Allure.step("Ввод в поле Description любого валидного значения");
        creatingNewsElement.descriptionField.perform(replaceText(Data.theContentOfTheNews()));
        Allure.step("Проверка видимости кнопки SAVE");
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        creatingNewsElement.theSaveButton.perform(click());
        Allure.step("Проверка видимости ошибки");
        //Делаю проверку видимости ошибки при создании новости с пустым полем Category;
        authorizationModule.emptyToast(R.string.empty_fields).check(matches(isDisplayed()));
    }

    public void enterAnyWordInTheTitleFieldUsingTheCyrillicAlphabetSectionCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Ввод в поле Title любое слово используя кириллицу");
        creatingNewsElement.titleField.perform(replaceText(Data.theNameOfTheNews()));
        Allure.step("Проверка в поле Title правильного введённого слова");
        //Делаю проверку что в поле Title вводятся буквенные символы используя кириллицу;
        creatingNewsElement.titleField.check(matches(withText(Data.theNameOfTheNews())));
    }

    public void enterAnyWordInTheTitleFieldUsingADifferentCaseCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Ввод в поле Title любое слово используя разный регистр");
        creatingNewsElement.titleField.perform(replaceText(Data.newsContentIinDifferentRegisters()));
        Allure.step("Проверка в поле Title правильного введённого слова");
        //Делаю проверку что в поле Title вводятся буквенные символы с разным регистром;
        creatingNewsElement.titleField.check(matches(withText(Data.newsContentIinDifferentRegisters())));
    }

    public void enterAnyWordInTheTitleFieldUsingTheLatinAlphabetCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Ввод в поле Title любое слово используя латиницу");
        creatingNewsElement.titleField.perform(replaceText(Data.aWordInLatin()));
        Allure.step("Проверка в поле Title правильного введённого слова");
        //Делаю проверку что в поле Title вводятся буквенные символы на латинице;
        creatingNewsElement.titleField.check(matches(withText(Data.aWordInLatin())));
    }

    public void enterAnySetOfNumericCharactersInTheTitleFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Ввод в поле Title любой набор цифровых символов");
        creatingNewsElement.titleField.perform(replaceText(Data.aSetOfNumbers()));
        Allure.step("Проверка в поле Title правильного введённого набора цифровых символов");
        //Делаю проверку что в поле Title вводятся цифровые символы;
        creatingNewsElement.titleField.check(matches(withText(Data.aSetOfNumbers())));
    }

    public void createANewsItemWithAnEmptyTitleFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости кнопки SAVE");
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        creatingNewsElement.theSaveButton.perform(click());
        Allure.step("Проверка видимости ошибки");
        //Делаю проверку видимости ошибки при создании новости с пустым полем Title;
        authorizationModule.emptyToast(R.string.empty_fields).check(matches(isDisplayed()));
    }

    public void InThePublicationDateFieldSelectTheDateCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Publication Date");
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        Allure.step("Заполнение поля Publication Date");
        creatingNewsElement.thePublicationDateField.perform(replaceText(Data.theSecondDateOfPublicationOfTheNews()));
        Allure.step("Проверка правильного заполнения поля Publication Date");
        //Делаю проверку что в поле Publication Date вводится дата текущего года;
        creatingNewsElement.thePublicationDateField.check(matches(withText(Data.theSecondDateOfPublicationOfTheNews())));
    }

    public void inTheTimeFieldSelectTheTimeMidnightCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 00:00");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(00, 00), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheFirstCheck())));
    }

    public void inTheTimeFieldSelectTheTime0101CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 01:01");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(01, 01), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheSecondCheck())));
    }

    public void inTheTimeFieldSelectTheTime0630CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 06:30");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(06, 30), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForFheThirdCheck())));
    }

    public void inTheTimeFieldSelectTheTime1158CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 11:58");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(11, 58), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheFourthCheck())));
    }

    public void inTheTimeFieldSelectTheTime1259CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 12:59");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(12, 59), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheFifthCheck())));
    }

    public void inTheTimeFieldSelectTheTime1300CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 13:00");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(13, 00), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheSixthCheck())));
    }

    public void inTheTimeFieldSelectTheTime1400CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 14:00");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(14, 00), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheSeventhCheck())));
    }

    public void inTheTimeFieldSelectTheTime2000CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 20:00");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(20, 00), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheEighthCheck())));
    }

    public void inTheTimeFieldSelectTheTime2200CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 22:00");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(22, 00), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheNinthCheck())));
    }

    public void inTheTimeFieldSelectTheTime2300CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 23:00");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(23, 00), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка правильного  отображения ввыбранного времени в  поле Time");
        //Делаю проверку что в поле Time правильно отображается введённое время;
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheTenthCheck())));
    }

    public void cancelingTheSelectedTimeInTheClockModuleCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор в модуле Time 23:00");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(23, 00), click());
        Allure.step("Проверка видимости кнопки CANCEL");
        creatingNewsElement.theCancelButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку CANCEL");
        creatingNewsElement.theCancelButton.perform(click());
        Allure.step("Проверка отображения пустого в  поля Time");
        //Делаю проверку что поле Time пустое;
        creatingNewsElement.timeField.check(matches(withText("")));
    }

    public void goToTheSetTimeModuleFromTheClockModuleUsingTheKeyboardButtonCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());

        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());

        // Проверка теста - нахождение в модуле Set time
        Allure.step("Проверка видимости элемента модуля Set time");
        creatingNewsElement.theSetTimeModule.check(matches(isDisplayed()));
        Allure.step("Проверка правильности написания элемента модуля Set time");
        creatingNewsElement.theSetTimeModule.check(matches(withText("Set time")));

    }

    public void goToTheClockModuleFromTheSetTimeModuleUsingTheClockButtonCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Повторное нажатие на предыдущую кнопку");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Проверка видимости элемента модуля часов");
        //Проверка нахождения в начальном модуле Time;
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
    }

    public void enter00HoursInTheHourFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле hour 00");
        creatingNewsElement.inTheHourField.perform(replaceText("00"));
        Allure.step("Проверка правильного отображения введёного времени в поле hour");
        // Делаю проверку правильного отображения введёного времени в поле hour;
        creatingNewsElement.inTheHourField.check(matches(withText("00")));
    }

    public void inTheHourFieldEnter01CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле hour 01");
        creatingNewsElement.inTheHourField.perform(replaceText("01"));
        Allure.step("Проверка правильного отображения введёного времени в поле hour");
        // Делаю проверку правильного отображения введёного времени в поле hour;
        creatingNewsElement.inTheHourField.check(matches(withText("01")));
    }

    public void inTheHourFieldEnter12CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле hour 12");
        creatingNewsElement.inTheHourField.perform(replaceText("12"));
        Allure.step("Проверка правильного отображения введёного времени в поле hour");
        // Делаю проверку правильного отображения введёного времени в поле hour;
        creatingNewsElement.inTheHourField.check(matches(withText("12")));
    }

    public void inTheHourFieldEnter22CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле hour 22");
        creatingNewsElement.inTheHourField.perform(replaceText("22"));
        Allure.step("Проверка правильного отображения введёного времени в поле hour");
        // Делаю проверку правильного отображения введёного времени в поле hour;
        creatingNewsElement.inTheHourField.check(matches(withText("22")));
    }

    public void inTheHourFieldEnter23CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле hour 23");
        creatingNewsElement.inTheHourField.perform(replaceText("23"));
        Allure.step("Проверка правильного отображения введёного времени в поле hour");
        // Делаю проверку правильного отображения введёного времени в поле hour;
        creatingNewsElement.inTheHourField.check(matches(withText("23")));
    }

    public void inTheHourFieldEnter24CreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле hour 24");
        creatingNewsElement.inTheHourField.perform(replaceText("24"));
        Allure.step("Проверка правильного отображения введёного времени в поле hour");
        // Делаю проверку правильного отображения введёного времени в поле hour;
        creatingNewsElement.inTheHourField.check(matches(withText("24")));
    }

    public void enter00MinutesInTheMinuteFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле minute 00");
        creatingNewsElement.InTheMinuteField.perform(replaceText("00"));
        Allure.step("Проверка правильного отображения введёного времени в поле minute");
        // Делаю проверку правильного отображения введёного времени в поле minute;
        creatingNewsElement.InTheMinuteField.check(matches(withText("00")));
    }

    public void enter01MinutesInTheMinuteFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле minute 01");
        creatingNewsElement.InTheMinuteField.perform(replaceText("01"));
        Allure.step("Проверка правильного отображения введёного времени в поле minute");
        // Делаю проверку правильного отображения введёного времени в поле minute;
        creatingNewsElement.InTheMinuteField.check(matches(withText("01")));
    }

    public void enter30MinutesInTheMinuteFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле minute 30");
        creatingNewsElement.InTheMinuteField.perform(replaceText("30"));
        Allure.step("Проверка правильного отображения введёного времени в поле minute");
        // Делаю проверку правильного отображения введёного времени в поле minute;
        creatingNewsElement.InTheMinuteField.check(matches(withText("30")));
    }

    public void enter59MinutesInTheMinuteFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Ввод в поле minute 59");
        creatingNewsElement.InTheMinuteField.perform(replaceText("59"));
        Allure.step("Проверка правильного отображения введёного времени в поле minute");
        // Делаю проверку правильного отображения введёного времени в поле minute;
        creatingNewsElement.InTheMinuteField.check(matches(withText("59")));
    }

    public void InTheSetTimeModuleEnter20HoursAnd59MinutesAndPressTheCancel() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде клавиатуры");
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        Allure.step("Проверка видимости поля hour");
        creatingNewsElement.inTheHourField.check(matches(isDisplayed()));
        Allure.step("Ввод в поле hour 20");
        creatingNewsElement.inTheHourField.perform(replaceText("20"));
        Allure.step("Проверка видимости поля minute");
        creatingNewsElement.InTheMinuteField.check(matches(isDisplayed()));
        Allure.step("Ввод в поле minute 59");
        creatingNewsElement.InTheMinuteField.perform(replaceText("59"));
        Allure.step("Проверка видимости кнопки CANCEL");
        creatingNewsElement.theCancelButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку CANCEL");
        creatingNewsElement.theCancelButton.perform(click());
        Allure.step("Проверка отображения пустого поля Time");
        // Делаю проверку  на пустое поле  Time  после отмены  ввода времени;
        creatingNewsElement.timeField.check(matches(withText("")));
    }

    public void enterAnySentenceInTheDescriptionFieldUsingCyrillicCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Description");
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Description");
        creatingNewsElement.descriptionField.perform(click());
        Allure.step("Ввод в поле Description любое предложение используя кириллицу");
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()));
        Allure.step("Проверка  правильного отображения в поле Description введённого предложения");
        // Делаю проверку что Description поле допускает ввод буквенных символов используя кириллицу;
        creatingNewsElement.descriptionField.check(matches(withText(Data.descriptionOfTheNews())));
    }

    public void enterTheDescriptionFieldOfAnySentenceUsingADifferentCaseCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Description");
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Description");
        creatingNewsElement.descriptionField.perform(click());
        Allure.step("Ввод в поле Description любое предложение используя разный регистр");
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNewsUsingADifferentRegister()));
        Allure.step("Проверка  правильного отображения в поле Description введённого предложения");
        // Делаю проверку что Description поле допускает ввод буквенных символов используя разный регистр;
        creatingNewsElement.descriptionField.check(matches(withText(Data.descriptionOfTheNewsUsingADifferentRegister())));
    }

    public void enterTheDescriptionFieldOfAnySentenceUsingTheLatinAlphabetCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Description");
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Description");
        creatingNewsElement.descriptionField.perform(click());
        Allure.step("Ввод в поле Description любое предложение используя латиницу");
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNewsUsingTheLatinAlphabet()));
        Allure.step("Проверка  правильного отображения в поле Description введённого предложения");
        // Делаю проверку что Description поле допускает ввод буквенных символов используя латиницу;
        creatingNewsElement.descriptionField.check(matches(withText(Data.descriptionOfTheNewsUsingTheLatinAlphabet())));
    }

    public void enterAnySetOfNumericCharactersInTheDescriptionFieldCreatingNews() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Description");
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Description");
        creatingNewsElement.descriptionField.perform(click());
        Allure.step("Ввод в поле Description используя любой набор цифровых символов");
        creatingNewsElement.descriptionField.perform(replaceText(Data.aSetOfNumbers()));
        Allure.step("Проверка  правильного отображения в поле Description введённого набора цифровых символов");
        // Делаю проверку что Description поле допускает ввод любых цифровых символов;
        creatingNewsElement.descriptionField.check(matches(withText(Data.aSetOfNumbers())));
    }


}
