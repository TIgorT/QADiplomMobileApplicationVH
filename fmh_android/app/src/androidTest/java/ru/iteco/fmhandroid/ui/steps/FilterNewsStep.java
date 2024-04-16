package ru.iteco.fmhandroid.ui.steps;


import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.not;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.PickerActions;
import androidx.test.espresso.matcher.RootMatchers;


import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.FilterNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class FilterNewsStep {

    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static FilterNewsElement filterNewsElement = new FilterNewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();

    public void thePresenceOfTheCategoryField() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Проверка правильности написания поля Category");
        // Делаю проверку что поле Category отображается в модуле Filter news;
        filterNewsElement.theCategoryField.check(matches(withHint("Category")));
    }

    public void thePresenceOfTheStartDateField() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Проверка правильности написания поля с id: news_item_publish_date_start_text_input_edit_text");
        // Делаю проверку что поле дата начало отображается в модуле Filter news;
        filterNewsElement.theStartDateField.check(matches(withHint(Data.dateFormat())));
    }

    public void thePresenceOfTheEndDateField() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        Allure.step("Проверка правильности написания поля с id: news_item_publish_date_end_text_input_edit_text");
        // Делаю проверку что поле дата окончания отображается в модуле Filter news;
        filterNewsElement.theEndDateField.check(matches(withHint(Data.dateFormat())));
    }

    public void thePresenceOfTheFilterButton() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости кнопки FILTER");
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку FILTER");
        // Делаю проверку что кнопка FILTER отображается в модуле Filter news;
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(withText(Data.filter())));
    }

    public void thePresenceOfTheCancelButton() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости кнопки CANCEL");
        filterNewsElement.theCancelButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку CANCEL");
        // Делаю проверку что кнопка CANCEL отображается в модуле Filter news;
        filterNewsElement.theCancelButton.check(matches(withText(Data.cancel())));
    }

    public void selectTheAdCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Объявление в списке");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Объявление из списка");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void selectTheBirthdayCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории День рождения в списке");
        filterNewsElement.theBirthdayCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории День рождения из списка");
        filterNewsElement.theBirthdayCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.birthday())));
    }

    public void selectTheSalaryCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Зарплата в списке");
        filterNewsElement.theSalaryCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Зарплата из списка");
        filterNewsElement.theSalaryCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.salary())));
    }

    public void selectTheTradeUnionCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Профсоюз в списке");
        filterNewsElement.theTradeUnionCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Профсоюз из списка");
        filterNewsElement.theTradeUnionCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.theTradeUnion())));
    }

    public void selectTheHolidayCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Праздник в списке");
        filterNewsElement.theHolidayCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Праздник из списка");
        filterNewsElement.theHolidayCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.holiday())));
    }

    public void selectTheMassageCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Массаж в списке");
        filterNewsElement.theMassageCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Массаж из списка");
        filterNewsElement.theMassageCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.massage())));
    }

    public void selectTheGratitudeCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Закрытие клавиатуры");
        Espresso.closeSoftKeyboard();
        Allure.step("Проверка видимости категории Благодарность в списке");
        filterNewsElement.theGratitudeCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Благодарность из списка");
        filterNewsElement.theGratitudeCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.gratitude())));
    }

    public void selectTheNeedHelpCategory() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Скролл к категории Нужна помощь в списке");
        filterNewsElement.theNeedHelpCategory.inRoot(RootMatchers.isPlatformPopup()).perform(ViewActions.scrollTo());
        Allure.step("Проверка видимости категории Нужна помощь в списке");
        filterNewsElement.theNeedHelpCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Нужна помощь из списка");
        filterNewsElement.theNeedHelpCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.needHelp())));
    }

    public void enterTheLetterOInTheCategoryField() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category букву о в нижнем регистре");
        filterNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInLowercase()));
        Allure.step("Проверка видимости списка категорий");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор отобразившейся категории  из списка");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.category())));
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
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category букву о в верхнем регистре");
        filterNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInUppercase()));
        Allure.step("Проверка видимости списка категорий");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор отобразившейся категории  из списка");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что выбранная категория отображается в поле Category;
        filterNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void enterAnyWordInTheCategoryFieldUsingTheCyrillicAlphabet() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category любое слово, не состоящее в выпадающем списке, используя кириллицу");
        filterNewsElement.theCategoryField.perform(replaceText(Data.bingo()));
        Allure.step("Проверка введённого слова в поле Category");
        // Делаю проверку что в поле Category можно вводить буквенные символы кириллицей;
        filterNewsElement.theCategoryField.check(matches(withText(Data.bingo())));
    }

    public void enterAnyWordInTheCategoryFieldUsingTheLatinAlphabet() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Ввод в поле Category любое слово, не состоящее в выпадающем списке, используя латиницу");
        filterNewsElement.theCategoryField.perform(replaceText(Data.aWordInLatin()));
        Allure.step("Проверка введённого слова в поле Category");
        // Делаю проверку что в поле Category можно вводить буквенные символы латиницей;
        filterNewsElement.theCategoryField.check(matches(withText(Data.aWordInLatin())));
    }


    public void chooseTheFifteenthDayOfTheMonth() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Выбор в модуле календарь даты 15.02.2024");
        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2024, 02, 15), click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка выбранной даты в поле дата начало");
        // Делаю проверку что в поле Дата начало отображается выбранная дата текущего года;
        filterNewsElement.theStartDateField.check(matches(withText("15.02.2024")));
    }

    public void selectADateUsingTheArrowsInTheCalendar() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки смены года");
        filterNewsElement.theBackButtonInTheCalendar.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку смены года");
        filterNewsElement.theBackButtonInTheCalendar.perform(click());
        Allure.step("Выбор в модуле календарь даты 31.12.2023");
        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2023, 12, 31), click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка выбранной даты в поле дата начало");
        // Делаю проверку что в поле Дата начало отображается выбранная дата прошлого года;
        filterNewsElement.theStartDateField.check(matches(withText("31.12.2023")));
    }

    public void selectTheLastYearUsingTheUpperLeftCorner() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки в виде выбранного года");
        filterNewsElement.choosingTheYear.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде выбранного года");
        filterNewsElement.choosingTheYear.perform(click());
        Allure.step("Проверка видимости прошлого года в списке");
        filterNewsElement.lastYear.check(matches(isDisplayed()));
        Allure.step("Выбор прошлого года из списка");
        filterNewsElement.lastYear.perform(click());
        Allure.step("Проверка выбранного года");
        // Делаю проверку что в верху модуля календаря меняется год;
        filterNewsElement.checkingWhichYear.check(matches(withText("2023")));
    }

    public void movingForwardOnTheCalendar() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            filterNewsElement.theForwardButtonInTheCalendar.perform(click());
            Thread.sleep(500);
        }
    }

    public void inTheStartDateFieldSelectAFutureDateUsingTheArrowsInTheCalendar() throws InterruptedException {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Выбор будущего года с помощью стрелки");
        movingForwardOnTheCalendar();
        Allure.step("Выбор в модуле календарь даты 01.01.2025");
        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2025, 1, 1), click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка выбранной даты в поле дата начало");
        // Делаю проверку что в поле Дата начало отображается выбранная дата будущего года;
        filterNewsElement.theStartDateField.check(matches(withText("01.01.2025")));
    }

    public void selectTheNextYearUsingTheButtonInTheUpperLeftCorner() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки в виде выбранного года");
        filterNewsElement.choosingTheYear.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку в виде выбранного года");
        filterNewsElement.choosingTheYear.perform(click());
        Allure.step("Проверка видимости будущего года в списке");
        filterNewsElement.nextYear.check(matches(isDisplayed()));
        Allure.step("Выбор будущего года из списка");
        filterNewsElement.nextYear.perform(click());
        Allure.step("Проверка выбранного года");
        // Делаю проверку что в верху модуля календаря меняется год;
        filterNewsElement.checkingNextYear.check(matches(withText("2025")));
    }

    public void cancelDateSelection() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки CANCEL");
        filterNewsElement.theCancelButtonInTheCalendar.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку CANCEL");
        filterNewsElement.theCancelButtonInTheCalendar.perform(click());
        Allure.step("Проверка видимости элемента раздела News");
        filterNewsElement.filterNewsModule.check(matches(isDisplayed()));
        Allure.step("Проверка написания элемента раздела News");
        // Делаю проверку что после отмены фильтрации возвращаемся назад в раздел News;
        filterNewsElement.filterNewsModule.check(matches(withText("Filter news")));
    }

    public void selectTheFifteenthDayInTheCalendarInTheEndDateField() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.perform(click());
        Allure.step("Выбор в модуле календарь даты 15.02.2024");
        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2024, 02, 15), click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка выбранной даты в поле дата окончания");
        // Делаю проверку что в поле Дата окончания отображается выбранная дата текущего года;
        filterNewsElement.theEndDateField.check(matches(withText("15.02.2024")));
    }

    public void filterTheNewsWhenOnlyTheEndDateFieldIsFilledIn() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости кнопки FILTER");
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку FILTER");
        filterNewsElement.theFilterButtonInTheModuleFilterNews.perform(click());
        Allure.step("Проверка видимости ошибки");
        filterNewsElement.errorChecking.check(matches(isDisplayed()));
        Allure.step("Проверка корректности написания ошибки");
        // Делаю проверку отображения ошибки
        filterNewsElement.errorChecking.check(matches(withText("Wrong period")));
    }

    public void filterTheNewsWhenOnlyTheStartDateFieldIsFilledIn() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости кнопки FILTER");
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку FILTER");
        filterNewsElement.theFilterButtonInTheModuleFilterNews.perform(click());
        Allure.step("Проверка видимости ошибки");
        filterNewsElement.errorChecking.check(matches(isDisplayed()));
        Allure.step("Проверка корректности написания ошибки");
        // Делаю проверку отображения ошибки
        filterNewsElement.errorChecking.check(matches(withText("Wrong period")));
    }

    public void filterTheNewsWhenFillingInAllFields() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Объявление в списке");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Объявление из списка");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости кнопки FILTER");
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку FILTER");
        filterNewsElement.theFilterButtonInTheModuleFilterNews.perform(click());
        Allure.step("Проверка видимости элемента раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка написания элемента раздела News");
        // Делаю проверку факта перехода после нажатия кнопки FILTER в раздел News;
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void cancelNewsFiltering() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Объявление в списке");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Объявление из списка");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости кнопки CANCEL");
        filterNewsElement.theCancelButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку CANCEL");
        filterNewsElement.theCancelButton.perform(click());
        Allure.step("Проверка видимости элемента раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка написания элемента раздела News");
        // Делаю проверку факта перехода после нажатия кнопки CANCEL в раздел News;
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void cancelNewsFilteringUsingTheSystemButton() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        filterNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории Объявление в списке");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории Объявление из списка");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_start_text_input_edit_text");
        filterNewsElement.theStartDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости поля с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле с id: news_item_publish_date_end_text_input_edit_text");
        filterNewsElement.theEndDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        filterNewsElement.theOkButton.perform(click());
        Allure.step("Закрытие клавиатуры");
        Espresso.closeSoftKeyboard();
        Allure.step("Нажатие на системную кнопку назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости элемента раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка написания элемента раздела News");
        // Делаю проверку факта перехода в раздел News, после нажатия системной кнопки назад;
        newsElement.theNewsSection.check(matches(withText("News")));
    }


    public void cancelFilteringOfNewsWithBlankFormFields() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки c id: filter_news_material_button");
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку c id: filter_news_material_button");
        filterNewsElement.theFilterButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        Allure.step("Закрытие клавиатуры");
        Espresso.closeSoftKeyboard();
        Allure.step("Нажатие на системную кнопку назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости элемента раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка написания элемента раздела News");
        // Делаю проверку факта перехода в раздел News, после нажатия системной кнопки назад;
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void checkingTheActiveCheckbox() {
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
        Allure.step("Проверка видимости кнопки с id: filter_news_material_button");
        controlPanelElement.theNewsFilteringButtons.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: filter_news_material_button");
        controlPanelElement.theNewsFilteringButtons.perform(click());
        Allure.step("Проверка видимости кнопки с id: filter_news_active_material_check_box");
        filterNewsElement.theCheckBoxActive.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: filter_news_active_material_check_box");
        filterNewsElement.theCheckBoxActive.perform(click());
        Allure.step("Проверка состояния кнопки с id: filter_news_active_material_check_box");
        // Делаю проверку снятия галочки счек - бокса Active;
        filterNewsElement.theCheckBoxActive.check(matches(not(isChecked())));
    }

    public void checkingTheNotActiveCheckbox() {
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
        Allure.step("Проверка видимости кнопки с id: filter_news_material_button");
        controlPanelElement.theNewsFilteringButtons.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: filter_news_material_button");
        controlPanelElement.theNewsFilteringButtons.perform(click());
        Allure.step("Проверка видимости кнопки с id: filter_news_inactive_material_check_box");
        filterNewsElement.theCheckBoxNotActive.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: filter_news_inactive_material_check_box");
        filterNewsElement.theCheckBoxNotActive.perform(click());
        Allure.step("Проверка состояния кнопки с id: filter_news_inactive_material_check_box");
        // Делаю проверку снятия галочки счек - бокса Not active;
        filterNewsElement.theCheckBoxNotActive.check(matches(not(isChecked())));
    }
}
