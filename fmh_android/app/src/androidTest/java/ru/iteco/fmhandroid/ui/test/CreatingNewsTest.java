package ru.iteco.fmhandroid.ui.test;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.text.ParseException;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.CreatingNewsStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class CreatingNewsTest {

    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    CreatingNewsStep creatingNewsStep = new CreatingNewsStep();
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
    @DisplayName("Выбрать категорию Объявление из предложенного списка категорий")
    public void selectTheAdCategoryFromTheSuggestedListOfCategories() throws InterruptedException {
        creatingNewsStep.selectTheAdCategoryFromTheListOfCategories();
    }

    @Test
    @DisplayName("Выбрать категорию День рождения из предложенного списка категорий")
    public void selectTheBirthdayCategoryFromTheSuggestedListOfCategories() throws InterruptedException {
        creatingNewsStep.selectTheAdBirthdayFromTheListOfCategories();
    }

    @Test
    @DisplayName("Выбрать категорию Зарплата из предложенного списка категорий")
    public void selectTheSalaryCategoryFromTheSuggestedListOfCategories() throws InterruptedException {
        creatingNewsStep.selectTheSalaryCategoryFromTheListOfCategories();
    }

    @Test
    @DisplayName("Выбрать категорию Профсоюз из предложенного списка категорий")
    public void selectTheTradeUnionCategoryFromTheSuggestedListOfCategories() throws InterruptedException {
        creatingNewsStep.selectTheTradeUnionCategoryFromTheListOfCategories();
    }

    @Test
    @DisplayName("Выбрать категорию Праздник из предложенного списка категорий ")
    public void selectTheHolidayCategoryFromTheSuggestedListOfCategories() throws InterruptedException {
        creatingNewsStep.selectHolidayCategoryFromTheListOfCategories();
    }

    @Test
    @DisplayName("Выбрать категорию Массаж из предложенного списка категори")
    public void selectTheMassageCategoryFromTheSuggestedCategoryList() throws InterruptedException {
        creatingNewsStep.selectMassageCategoryFromTheListOfCategories();
    }

    @Test
    @DisplayName("Выбрать категорию Благодарность из предложенного списка категорий")
    public void selectTheGratitudeCategoryFromTheSuggestedListOfCategories() throws InterruptedException {
        creatingNewsStep.selectGratitudeCategoryFromTheListOfCategories();
    }

    @Test
    @DisplayName("Выбрать категорию Нужна помощь из предложенного списка категорий")
    public void selectTheNeedHelpCategoryFromTheSuggestedListOfCategories() throws InterruptedException {
        creatingNewsStep.selectNeedHelpCategoryFromTheListOfCategories();
    }

    @Test
    @DisplayName("Ввести в поле Category букву о в нижнем регистре и  выбрать предложенную категорию из выпадающего  списка")
    public void enterTheLetterOInLowercaseInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() throws InterruptedException {
        creatingNewsStep.enterTheLetterOInLowercaseInTheCategoryField();
    }

    @Test
    @DisplayName("Ввести в поле Category букву О в верхнем регистре и  выбрать предложенную категорию из выпадающего  списка")
    public void enterTheLetterOInUppercaseInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() throws InterruptedException {
        creatingNewsStep.enterTheLetterOInUppercaseInTheCategoryField();
    }

    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя кириллицу ")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheCyrillicAlphabet() throws InterruptedException {
        creatingNewsStep.enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownList();
    }

    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя латиницу")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheLatinAlphabet() throws InterruptedException {
        creatingNewsStep.enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListInLatin();
    }

    @Test
    @DisplayName("Создать  новость с пустым полем Category")
    public void createANewsItemWithAnEmptyCategoryField() throws InterruptedException, ParseException {
        creatingNewsStep.createANewsItemWithAnEmptyCategoryFieldInCreatingNews();
    }

    @Test
    @DisplayName("Ввести в поле Title любое слово используя кириллицу ")
    public void enterAnyWordInTheTitleFieldUsingTheCyrillicAlphabet() throws InterruptedException {
        creatingNewsStep.enterAnyWordInTheTitleFieldUsingTheCyrillicAlphabetSectionCreatingNews();
    }

    @Test
    @DisplayName("Ввести в поле Title любое слово используя разный регистр")
    public void enterAnyWordInTheTitleFieldUsingADifferentCase() throws InterruptedException {
        creatingNewsStep.enterAnyWordInTheTitleFieldUsingADifferentCaseCreatingNews();
    }

    @Test
    @DisplayName("Ввести в поле Title любое слово используя латиницу")
    public void enterAnyWordInTheTitleFieldUsingTheLatinAlphabet() throws InterruptedException {
        creatingNewsStep.enterAnyWordInTheTitleFieldUsingTheLatinAlphabetCreatingNews();
    }

    @Test
    @DisplayName("Ввести в поле Title любой набор цифровых символов")
    public void enterAnySetOfNumericCharactersInTheTitleField() throws InterruptedException {
        creatingNewsStep.enterAnySetOfNumericCharactersInTheTitleFieldCreatingNews();
    }

    @Test
    @DisplayName("Создать новость с пустым  полем Title")
    public void createANewsItemWithAnEmptyTitleField() throws InterruptedException {
        creatingNewsStep.createANewsItemWithAnEmptyTitleFieldCreatingNews();
    }

    @Test
    @DisplayName("В поле Publication date выбрать  дату 15.02.2024")
    public void InThePublicationDateFieldSelectTheDate() throws InterruptedException {
        creatingNewsStep.InThePublicationDateFieldSelectTheDateCreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать выбрать время 00:00")
    public void inTheTimeFieldSelectTheTimeMidnight() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTimeMidnightCreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 01:01")
    public void inTheTimeFieldSelectTheTime0101() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime0101CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 06:30")
    public void inTheTimeFieldSelectTheTime0630() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime0630CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 11:58")
    public void inTheTimeFieldSelectTheTime1158() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime1158CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 12:59 ")
    public void inTheTimeFieldSelectTheTime1259() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime1259CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 13:00")
    public void inTheTimeFieldSelectTheTime1300() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime1300CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 14:00")
    public void inTheTimeFieldSelectTheTime1400() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime1400CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 20:00 ")
    public void inTheTimeFieldSelectTheTime2000() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime2000CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 22:00")
    public void inTheTimeFieldSelectTheTime2200() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime2200CreatingNews();
    }

    @Test
    @DisplayName("В поле Time выбрать время 23:00")
    public void inTheTimeFieldSelectTheTime2300() throws InterruptedException {
        creatingNewsStep.inTheTimeFieldSelectTheTime2300CreatingNews();
    }

    @Test
    @DisplayName("Отмена выбранного времени в модуле с часами")
    public void cancelingTheSelectedTimeInTheClockModule() throws InterruptedException {
        creatingNewsStep.cancelingTheSelectedTimeInTheClockModuleCreatingNews();
    }

    @Test
    @DisplayName("Перейти в модуль Set time из модуля с часами,  используя кнопку ввиде клавиатуры")
    public void goToTheSetTimeModuleFromTheClockModuleUsingTheKeyboardButton() throws InterruptedException {
        creatingNewsStep.goToTheSetTimeModuleFromTheClockModuleUsingTheKeyboardButtonCreatingNews();
    }

    @Test
    @DisplayName("Перейти в  модуль с часами из модуля Set time используя кнопку ввиде часов")
    public void goToTheClockModuleFromTheSetTimeModuleUsingTheClockButton() throws InterruptedException {
        creatingNewsStep.goToTheClockModuleFromTheSetTimeModuleUsingTheClockButtonCreatingNews();
    }

    @Test
    @DisplayName("В поле hour ввести 00  часов")
    public void enter00HoursInTheHourField() throws InterruptedException {
        creatingNewsStep.enter00HoursInTheHourFieldCreatingNews();
    }

    @Test
    @DisplayName("В поле hour ввести 01  час")
    public void inTheHourFieldEnter01() throws InterruptedException {
        creatingNewsStep.inTheHourFieldEnter01CreatingNews();
    }

    @Test
    @DisplayName("В поле hour ввести 12  часов")
    public void inTheHourFieldEnter12() throws InterruptedException {
        creatingNewsStep.inTheHourFieldEnter12CreatingNews();
    }

    @Test
    @DisplayName("В поле hour ввести 22  часа")
    public void inTheHourFieldEnter22() throws InterruptedException {
        creatingNewsStep.inTheHourFieldEnter22CreatingNews();
    }

    @Test
    @DisplayName("В поле hour ввести 23  часа")
    public void inTheHourFieldEnter23() throws InterruptedException {
        creatingNewsStep.inTheHourFieldEnter23CreatingNews();
    }

    @Test
    @DisplayName("В поле hour ввести 24 часа")
    public void inTheHourFieldEnter24() throws InterruptedException {
        creatingNewsStep.inTheHourFieldEnter24CreatingNews();
    }

    @Test
    @DisplayName("В поле minute ввести 00 минут")
    public void enter00MinutesInTheMinuteField() throws InterruptedException {
        creatingNewsStep.enter00MinutesInTheMinuteFieldCreatingNews();
    }

    @Test
    @DisplayName("В поле minute ввести 01  минуту")
    public void enter01MinutesInTheMinuteField() throws InterruptedException {
        creatingNewsStep.enter01MinutesInTheMinuteFieldCreatingNews();
    }

    @Test
    @DisplayName("В поле minute ввести 30  минут")
    public void enter30MinutesInTheMinuteField() throws InterruptedException {
        creatingNewsStep.enter30MinutesInTheMinuteFieldCreatingNews();
    }

    @Test
    @DisplayName("В поле minute ввести 59  минут")
    public void enter59MinutesInTheMinuteField() throws InterruptedException {
        creatingNewsStep.enter59MinutesInTheMinuteFieldCreatingNews();
    }

    @Test
    @DisplayName("В модуле Set time ввести 20 часов и 59 минут, и нажать на кнопку CANCEL")
    public void InTheSetTimeModuleEnter20HoursAnd59MinutesAndPressTheCancelButton() throws InterruptedException {
        creatingNewsStep.InTheSetTimeModuleEnter20HoursAnd59MinutesAndPressTheCancel();
    }

    @Test
    @DisplayName("Ввести поле Description  любое предложение используя кириллицу")
    public void enterAnySentenceInTheDescriptionFieldUsingCyrillic() throws InterruptedException {
        creatingNewsStep.enterAnySentenceInTheDescriptionFieldUsingCyrillicCreatingNews();
    }

    @Test
    @DisplayName("Ввести поле Description любое предложение используя  используя разный регистр")
    public void enterTheDescriptionFieldOfAnySentenceUsingADifferentCase() throws InterruptedException {
        creatingNewsStep.enterTheDescriptionFieldOfAnySentenceUsingADifferentCaseCreatingNews();
    }

    @Test
    @DisplayName("Ввести поле Description любое предложение используя латиницу")
    public void enterTheDescriptionFieldOfAnySentenceUsingTheLatinAlphabet() throws InterruptedException {
        creatingNewsStep.enterTheDescriptionFieldOfAnySentenceUsingTheLatinAlphabetCreatingNews();
    }

    @Test
    @DisplayName("Ввести поле Description любой набор цифровых символов")
    public void enterAnySetOfNumericCharactersInTheDescriptionField() throws InterruptedException {
        creatingNewsStep.enterAnySetOfNumericCharactersInTheDescriptionFieldCreatingNews();
    }

}
