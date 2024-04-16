package ru.iteco.fmhandroid.ui.test;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Epic;
import io.qameta.allure.kotlin.Feature;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.FilterNewsStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class FilterNewsTest {

    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static FilterNewsStep filterNewsStep = new FilterNewsStep();
    static SplashScreenStep splashScreenStep = new SplashScreenStep();


    @Rule
    public ActivityTestRule<AppActivity> mActivityTestRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void checkingTheLogout() {
        splashScreenStep.downloadPage();
        try {
            authorizationSteps.loadingTheAuthorizationModule();
        } catch (Exception e) {
            mainStep.logOut();
        }
        authorizationSteps.authorization();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Наличие поля Category  в разделе  Filter news")
    @Description(value = "Проверяем отображение поля Category в модуле Filter news")
    public void thePresenceOfTheCategoryFieldInTheFilterNewsSection() {
        filterNewsStep.thePresenceOfTheCategoryField();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Start date")
    @Test
    @DisplayName("Наличие поля Дата начало в разделе Filter news")
    @Description(value = "Проверяем отображение поля Дата начало в модуле Filter news")
    public void thePresenceOfTheStartDateFieldInTheFilterNewsSection() {
        filterNewsStep.thePresenceOfTheStartDateField();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле End date")
    @Test
    @DisplayName("Наличие поля Дата окончания в разделе Filter news")
    @Description(value = "Проверяем отображение поля Дата окончания в модуле Filter news")
    public void thePresenceOfTheEndDateFieldInTheFilterNewsSection() {
        filterNewsStep.thePresenceOfTheEndDateField();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Кнопка FILTER")
    @Test
    @DisplayName("Наличие кнопки FILTER в разделе Filter news")
    @Description(value = "Проверяем отображение кнопки FILTER в модуле Filter news")
    public void thePresenceOfTheFilterButtonInTheFilterNewsSection() {
        filterNewsStep.thePresenceOfTheFilterButton();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Кнопка CANCEL")
    @Test
    @DisplayName("Наличие кнопки CANCEL в разделе Filter news")
    @Description(value = "Проверяем отображение кнопки CANCEL в модуле Filter news")
    public void thePresenceOfTheCancelButtonInTheFilterNewsSection() {
        filterNewsStep.thePresenceOfTheCancelButton();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Объявление")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheAdCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheAdCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию День рождения")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheBirthdayCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheBirthdayCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Зарплата")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheSalaryCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheSalaryCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Профсоюз")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheTradeUnionCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheTradeUnionCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Праздник")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheHolidayCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheHolidayCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Массаж")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheMassageCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheMassageCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Благодарность")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheGratitudeCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheGratitudeCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Нужна помощь")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void inTheCategoryFieldSelectTheNeedHelpCategoryFromTheSuggestedList() {
        filterNewsStep.selectTheNeedHelpCategory();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category букву о и  выбрать предложенную категорию из выпадающего  списка")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void enterTheLetterOInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() {
        filterNewsStep.enterTheLetterOInTheCategoryField();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category букву О и  выбрать предложенную категорию из выпадающего  списка")
    @Description(value = "Проверяем отображение выбранной категории в поле Category")
    public void enterTheLetterOInUppercaseInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() {
        filterNewsStep.enterTheLetterOInUppercaseInTheCategoryField();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя кириллицу")
    @Description(value = "Проверяем отображение введённого слова в поле Category")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheCyrillicAlphabet() {
        filterNewsStep.enterAnyWordInTheCategoryFieldUsingTheCyrillicAlphabet();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя латиницу")
    @Description(value = "Проверяем отображение введённого слова в поле Category")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheLatinAlphabet() {
        filterNewsStep.enterAnyWordInTheCategoryFieldUsingTheLatinAlphabet();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Start date")
    @Test
    @DisplayName("Выбрать дату 15.02.2024 в поле Дата начало")
    @Description(value = "Проверяем отображение выбранной даты в поле Дата начало")
    public void inTheStartDateFieldSelectTheFifteenth() {
        filterNewsStep.chooseTheFifteenthDayOfTheMonth();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Start date")
    @Test
    @DisplayName(" В поле Дата начало выбрать   дату 31.12.2023, используя стрелки в календаре")
    @Description(value = "Проверяем отображение выбранной даты в поле Дата начало")
    public void inTheStartDateFieldSelectTheDateUsingTheArrowsInTheCalendar() {
        filterNewsStep.selectADateUsingTheArrowsInTheCalendar();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Start date")
    @Test
    @DisplayName("Выбрать  прошлый год, используя  в верхнем левом углу календаря кнопку в виде года")
    @Description(value = "Проверяем отображение выбранного года в верхнем левом углу календаря")
    public void selectThePreviousYearUsingTheYearButtonInTheUpperLeftCornerOfTheCalendar() {
        filterNewsStep.selectTheLastYearUsingTheUpperLeftCorner();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Start date")
    @Test
    @DisplayName(" В поле Дата начало выбрать   дату  01.01.2025 , используя стрелки в календаре")
    @Description(value = "Проверяем отображение выбранной даты в поле Дата начало")
    public void InTheStartDateFieldSelectTheNextYearUsingTheArrowsInTheCalendar() throws InterruptedException {
        filterNewsStep.inTheStartDateFieldSelectAFutureDateUsingTheArrowsInTheCalendar();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Start date")
    @Test
    @DisplayName("Выбрать  будущий год, используя  в верхнем левом углу календаря кнопку в виде года")
    @Description(value = "Проверяем отображение выбранного года в верхнем левом углу календаря")
    public void selectTheNextYearUsingTheYearButtonInTheUpperLeftCornerOfTheCalendar() {
        filterNewsStep.selectTheNextYearUsingTheButtonInTheUpperLeftCorner();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Start date")
    @Test
    @DisplayName("Отменить выбор даты, используя кнопку CANCEL")
    @Description(value = "Проверяем отмену фильтрации, используя кнопку CANCEL")
    public void toCancelTheDateSelectionUsingTheCancelButton() {
        filterNewsStep.cancelDateSelection();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "End date")
    @Test
    @DisplayName("Выбрать  дату 15.02.2024 в поле Дата окончания")
    @Description(value = "Проверяем отображение выбранной даты в поле Дата окончания")
    public void selectTheDateInTheEndDateField() {
        filterNewsStep.selectTheFifteenthDayInTheCalendarInTheEndDateField();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "End date")
    @Test
    @DisplayName("Отфильтровать новости при заполненном только  поле Дата окончания")
    @Description(value = "Проверяем отображения ошибки в модуле Filter news")
    public void filteringNewsWithOnlyTheEndDateFieldFilledIn() {
        filterNewsStep.filterTheNewsWhenOnlyTheEndDateFieldIsFilledIn();
    }


    @Epic(value = "Модуль Filter news")
    @Feature(value = "Start date")
    @Test
    @DisplayName("Отфильтровать новости при заполненном только  поле Дата начало")
    @Description(value = "Проверяем отображения ошибки в модуле Filter news")
    public void filteringNewsWithFillingInOnlyTheStartDateField() {
        filterNewsStep.filterTheNewsWhenOnlyTheStartDateFieldIsFilledIn();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Filter news")
    @Test
    @DisplayName("Отфильтровать новости при корректном заполнении всех полей")
    @Description(value = "Проверяем факт перехода после нажатия кнопки FILTER в раздел News")
    public void filterTheNewsIfAllFieldsAreFilledInCorrectly() {
        filterNewsStep.filterTheNewsWhenFillingInAllFields();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Filter news")
    @Test
    @DisplayName("Отменить фильтрацию новостей при корректном заполнении всех полей")
    @Description(value = "Проверяем факт перехода после нажатия кнопки CANCEL в раздел News")
    public void cancelNewsFilteringIfAllFieldsAreFilledInCorrectly() {
        filterNewsStep.cancelNewsFiltering();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Filter news")
    @Test
    @DisplayName("Отменить фильтрацию новостей с заполненными полями формы Filter news, используя системную кнопку Назад")
    @Description(value = "Проверяем факт перехода в раздел News, после нажатия системной кнопки назад")
    public void toCancelNewsFilteringUsingTheSystemBackButton() {
        filterNewsStep.cancelNewsFilteringUsingTheSystemButton();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Filter news")
    @Test
    @DisplayName("Отменить фильтрацию новостей с незаполненными полями формы Filter news, используя системную кнопку Назад")
    @Description(value = "Проверяем факт перехода в раздел News, после нажатия системной кнопки назад")
    public void toCancelFilteringOfNewsWithBlankFieldsOfTheFilterNewsFormUsingTheSystemBackButton() {
        filterNewsStep.cancelFilteringOfNewsWithBlankFormFields();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Filter news")
    @Test
    @DisplayName("Проверка чек - бокса Active в модуле Filter news из раздела Control panel")
    @Description(value = "Проверяем снятие галочки счек - бокса Active")
    public void checkingTheActiveCheckboxInTheFilterNewsModuleFromTheControlPanelSection() {
        filterNewsStep.checkingTheActiveCheckbox();
    }

    @Epic(value = "Модуль Filter news")
    @Feature(value = "Filter news")
    @Test
    @DisplayName("Проверка чек -бокса Not active в модуле Filter news из раздела Control panel")
    @Description(value = "Проверяем снятие галочки счек - бокса Not active")
    public void checkingTheNotActiveCheckboxInTheFilterNewsModuleFromTheControlPanelSection() {
        filterNewsStep.checkingTheNotActiveCheckbox();
    }
}
