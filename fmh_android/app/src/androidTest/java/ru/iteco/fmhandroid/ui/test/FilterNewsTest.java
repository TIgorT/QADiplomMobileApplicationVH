package ru.iteco.fmhandroid.ui.test;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.FilterNewsStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class FilterNewsTest {

    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static FilterNewsStep filterNewsStep = new FilterNewsStep();


    @Rule
    public ActivityTestRule<AppActivity> mActivityTestRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void authCheck() throws InterruptedException {
        Thread.sleep(5000);
        try {
            authorizationSteps.isAuthorizationScreen();
        } catch (NoMatchingViewException e) {
            mainStep.logOut();
        }
    }

    @Test
    @DisplayName("Наличие поля Category  в разделе  Filter news")
    public void thePresenceOfTheCategoryFieldInTheFilterNewsSection() throws InterruptedException {
        filterNewsStep.thePresenceOfTheCategoryField();
    }

    @Test
    @DisplayName("Наличие поля Дата начало в разделе Filter news")
    public void thePresenceOfTheStartDateFieldInTheFilterNewsSection() throws InterruptedException {
        filterNewsStep.thePresenceOfTheStartDateField();
    }

    @Test
    @DisplayName("Наличие поля Дата окончания в разделе Filter news")
    public void thePresenceOfTheEndDateFieldInTheFilterNewsSection() throws InterruptedException {
        filterNewsStep.thePresenceOfTheEndDateField();
    }

    @Test
    @DisplayName("Наличие кнопки FILTER в разделе Filter news")
    public void thePresenceOfTheFilterButtonInTheFilterNewsSection() throws InterruptedException {
        filterNewsStep.thePresenceOfTheFilterButton();
    }

    @Test
    @DisplayName("Наличие кнопки CANCEL в разделе Filter news")
    public void thePresenceOfTheCancelButtonInTheFilterNewsSection() throws InterruptedException {
        filterNewsStep.thePresenceOfTheCancelButton();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Объявление")
    public void inTheCategoryFieldSelectTheAdCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheAdCategory();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию День рождения")
    public void inTheCategoryFieldSelectTheBirthdayCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheBirthdayCategory();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Зарплата")
    public void inTheCategoryFieldSelectTheSalaryCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheSalaryCategory();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Профсоюз")
    public void inTheCategoryFieldSelectTheTradeUnionCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheTradeUnionCategory();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Праздник")
    public void inTheCategoryFieldSelectTheHolidayCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheHolidayCategory();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Массаж")
    public void inTheCategoryFieldSelectTheMassageCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheMassageCategory();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Благодарность")
    public void inTheCategoryFieldSelectTheGratitudeCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheGratitudeCategory();
    }

    @Test
    @DisplayName("В поле Category из предложенного списка выбрать категорию Нужна помощь")
    public void inTheCategoryFieldSelectTheNeedHelpCategoryFromTheSuggestedList() throws InterruptedException {
        filterNewsStep.selectTheNeedHelpCategory();
    }

    @Test
    @DisplayName("Ввести в поле Category букву о и  выбрать предложенную категорию из выпадающего  списка")
    public void enterTheLetterOInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() throws InterruptedException {
        filterNewsStep.enterTheLetterOInTheCategoryField();
    }

    @Test
    @DisplayName("Ввести в поле Category букву О и  выбрать предложенную категорию из выпадающего  списка")
    public void enterTheLetterOInUppercaseInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() throws InterruptedException {
        filterNewsStep.enterTheLetterOInUppercaseInTheCategoryField();
    }

//    @Test
//    @DisplayName("Ввести в поле Category слово Зарплата и свернуть выпавший список ")
//    public void enterTheWordSalaryInTheCategoryFieldAndCollapseTheDropDownList() throws InterruptedException {
//        filterNewsStep.enterTheWordSalaryInTheCategoryField();
//    }

    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя кириллицу")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheCyrillicAlphabet() throws InterruptedException {
        filterNewsStep.enterAnyWordInTheCategoryFieldUsingTheCyrillicAlphabet();
    }

    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя латиницу")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheLatinAlphabet() throws InterruptedException {
        filterNewsStep.enterAnyWordInTheCategoryFieldUsingTheLatinAlphabet();
    }


    @Test
    @DisplayName("Выбрать дату 15.02.2024 в поле Дата начало")
    public void inTheStartDateFieldSelectTheFifteenth() throws InterruptedException {
        filterNewsStep.chooseTheFifteenthDayOfTheMonth();
    }

    @Test
    @DisplayName(" В поле Дата начало выбрать   дату 31.12.2023, используя стрелки в календаре")
    public void inTheStartDateFieldSelectTheDateUsingTheArrowsInTheCalendar() throws InterruptedException {
        filterNewsStep.selectADateUsingTheArrowsInTheCalendar();
    }

    @Test
    @DisplayName("Выбрать  прошлый год, используя  в верхнем левом углу календаря кнопку в виде года")
    public void selectThePreviousYearUsingTheYearButtonInTheUpperLeftCornerOfTheCalendar() throws InterruptedException {
        filterNewsStep.selectTheLastYearUsingTheUpperLeftCorner();
    }

    @Test
    @DisplayName(" В поле Дата начало выбрать   дату  01.01.2025 , используя стрелки в календаре")
    public void InTheStartDateFieldSelectTheNextYearUsingTheArrowsInTheCalendar() throws InterruptedException {
        filterNewsStep.inTheStartDateFieldSelectAFutureDateUsingTheArrowsInTheCalendar();
    }

    @Test
    @DisplayName("Выбрать  будущий год, используя  в верхнем левом углу календаря кнопку в виде года")
    public void selectTheNextYearUsingTheYearButtonInTheUpperLeftCornerOfTheCalendar() throws InterruptedException {
        filterNewsStep.selectTheNextYearUsingTheButtonInTheUpperLeftCorner();
    }

    @Test
    @DisplayName("Отменить выбор даты, используя кнопку CANCEL")
    public void toCancelTheDateSelectionUsingTheCancelButton() throws InterruptedException {
        filterNewsStep.cancelDateSelection();
    }

    @Test
    @DisplayName("Выбрать  дату 15.02.2024 в поле Дата окончания")
    public void selectTheDateInTheEndDateField() throws InterruptedException {
        filterNewsStep.selectTheFifteenthDayInTheCalendarInTheEndDateField();
    }

    @Test
    @DisplayName("Отфильтровать новости при заполненном только  поле Дата окончания")
    public void filteringNewsWithOnlyTheEndDateFieldFilledIn() throws InterruptedException {
        filterNewsStep.filterTheNewsWhenOnlyTheEndDateFieldIsFilledIn();
    }

    @Test
    @DisplayName("Отфильтровать новости при заполненном только  поле Дата начало")
    public void filteringNewsWithFillingInOnlyTheStartDateField() throws InterruptedException {
        filterNewsStep.filterTheNewsWhenOnlyTheStartDateFieldIsFilledIn();
    }

    @Test
    @DisplayName("Отфильтровать новости при корректном заполнении всех полей")
    public void filterTheNewsIfAllFieldsAreFilledInCorrectly() throws InterruptedException {
        filterNewsStep.filterTheNewsWhenFillingInAllFields();
    }

    @Test
    @DisplayName("Отменить фильтрацию новостей при корректном заполнении всех полей")
    public void cancelNewsFilteringIfAllFieldsAreFilledInCorrectly() throws InterruptedException {
        filterNewsStep.cancelNewsFiltering();
    }

    @Test
    @DisplayName("Отменить фильтрацию новостей, используя системную кнопку Назад")
    public void toCancelNewsFilteringUsingTheSystemBackButton() throws InterruptedException {
        filterNewsStep.cancelNewsFilteringUsingTheSystemButton();
    }

    @Test
    @DisplayName("Отменить фильтрацию новостей с незаполненными полями формы Filter news, используя системную кнопку Назад")
    public void toCancelFilteringOfNewsWithBlankFieldsOfTheFilterNewsFormUsingTheSystemBackButton() throws InterruptedException {
        filterNewsStep.cancelFilteringOfNewsWithBlankFormFields();
    }

    @Test
    @DisplayName("Проверка чек - бокса Active в модуле Filter news из раздела Control panel")
    public void checkingTheActiveCheckboxInTheFilterNewsModuleFromTheControlPanelSection() throws InterruptedException {
        filterNewsStep.checkingTheActiveCheckbox();
    }

    @Test
    @DisplayName("Проверка чек -бокса Not active в модуле Filter news из раздела Control panel")
    public void checkingTheNotActiveCheckboxInTheFilterNewsModuleFromTheControlPanelSection() throws InterruptedException {
        filterNewsStep.checkingTheNotActiveCheckbox();
    }

}
