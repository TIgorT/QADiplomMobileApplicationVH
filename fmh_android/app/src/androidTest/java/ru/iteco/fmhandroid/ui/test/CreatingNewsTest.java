package ru.iteco.fmhandroid.ui.test;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.text.ParseException;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Epic;
import io.qameta.allure.kotlin.Feature;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.CreatingNewsStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class CreatingNewsTest {

    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    CreatingNewsStep creatingNewsStep = new CreatingNewsStep();
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

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию Объявление из предложенного списка категорий")
    @Description(value = "Проверяем факт выбора в поле Category катигории Объявление")
    public void selectTheAdCategoryFromTheSuggestedListOfCategories() {
        creatingNewsStep.selectTheAdCategoryFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию День рождения из предложенного списка категорий")
    @Description(value = "Проверяем факт выбора в поле Category катигории День рождения")
    public void selectTheBirthdayCategoryFromTheSuggestedListOfCategories() {
        creatingNewsStep.selectTheAdBirthdayFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию Зарплата из предложенного списка категорий")
    @Description(value = "Проверяем факт выбора в поле Category катигории Зарплата")
    public void selectTheSalaryCategoryFromTheSuggestedListOfCategories() {
        creatingNewsStep.selectTheSalaryCategoryFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию Профсоюз из предложенного списка категорий")
    @Description(value = "Проверяем факт выбора в поле Category катигории Профсоюз")
    public void selectTheTradeUnionCategoryFromTheSuggestedListOfCategories() {
        creatingNewsStep.selectTheTradeUnionCategoryFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию Праздник из предложенного списка категорий ")
    @Description(value = "Проверяем факт выбора в поле Category катигории Праздник")
    public void selectTheHolidayCategoryFromTheSuggestedListOfCategories() {
        creatingNewsStep.selectHolidayCategoryFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию Массаж из предложенного списка категори")
    @Description(value = "Проверяем факт выбора в поле Category катигории Массаж")
    public void selectTheMassageCategoryFromTheSuggestedCategoryList() {
        creatingNewsStep.selectMassageCategoryFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию Благодарность из предложенного списка категорий")
    @Description(value = "Проверяем факт выбора в поле Category катигории Благодарность")
    public void selectTheGratitudeCategoryFromTheSuggestedListOfCategories() {
        creatingNewsStep.selectGratitudeCategoryFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Выбрать категорию Нужна помощь из предложенного списка категорий")
    @Description(value = "Проверяем факт выбора в поле Category катигории Нужна помощь")
    public void selectTheNeedHelpCategoryFromTheSuggestedListOfCategories() {
        creatingNewsStep.selectNeedHelpCategoryFromTheListOfCategories();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category букву о в нижнем регистре и  выбрать предложенную категорию из выпадающего  списка")
    @Description(value = "Проверяем появление выпадающего списка категорий при введении буквенного символа в нижнем регистре")
    public void enterTheLetterOInLowercaseInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() {
        creatingNewsStep.enterTheLetterOInLowercaseInTheCategoryField();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category букву О в верхнем регистре и  выбрать предложенную категорию из выпадающего  списка")
    @Description(value = "Проверяем появление выпадающего списка категорий при введении буквенного символа в верхнем регистре")
    public void enterTheLetterOInUppercaseInTheCategoryFieldAndSelectTheSuggestedCategoryFromTheDropDownList() {
        creatingNewsStep.enterTheLetterOInUppercaseInTheCategoryField();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя кириллицу ")
    @Description(value = "Проверяем отображение введёного слова в поле Category")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheCyrillicAlphabet() {
        creatingNewsStep.enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownList();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Ввести в поле Category любое слово, не состоящее в выпадающем списке, используя латиницу")
    @Description(value = "Проверяем отображение введёного слова в поле Category")
    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListUsingTheLatinAlphabet() {
        creatingNewsStep.enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListInLatin();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Category")
    @Test
    @DisplayName("Создать  новость с пустым полем Category")
    @Description(value = "Проверяем отображение ошибки при создании новости с пустым полем Category")
    public void createANewsItemWithAnEmptyCategoryField() throws ParseException {
        creatingNewsStep.createANewsItemWithAnEmptyCategoryFieldInCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Title")
    @Test
    @DisplayName("Ввести в поле Title любое слово используя кириллицу ")
    @Description(value = "Проверяем отображения введёного слова в поле Title")
    public void enterAnyWordInTheTitleFieldUsingTheCyrillicAlphabet() {
        creatingNewsStep.enterAnyWordInTheTitleFieldUsingTheCyrillicAlphabetSectionCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Title")
    @Test
    @DisplayName("Ввести в поле Title любое слово используя разный регистр")
    @Description(value = "Проверяем отображения введёного слова  в поле Title в разном регистре")
    public void enterAnyWordInTheTitleFieldUsingADifferentCase() {
        creatingNewsStep.enterAnyWordInTheTitleFieldUsingADifferentCaseCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Title")
    @Test
    @DisplayName("Ввести в поле Title любое слово используя латиницу")
    @Description(value = "Проверяем отображения введёного слова  в поле Title используя латиницу")
    public void enterAnyWordInTheTitleFieldUsingTheLatinAlphabet() {
        creatingNewsStep.enterAnyWordInTheTitleFieldUsingTheLatinAlphabetCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Title")
    @Test
    @DisplayName("Ввести в поле Title любой набор цифровых символов")
    @Description(value = "Проверяем отображения любого набора цифровых символов  в поле Title")
    public void enterAnySetOfNumericCharactersInTheTitleField() {
        creatingNewsStep.enterAnySetOfNumericCharactersInTheTitleFieldCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Title")
    @Test
    @DisplayName("Создать новость с пустым  полем Title")
    @Description(value = "Проверяем отображения любого набора цифровых символов  в поле Title")
    public void createANewsItemWithAnEmptyTitleField() {
        creatingNewsStep.createANewsItemWithAnEmptyTitleFieldCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Publication Date")
    @Test
    @DisplayName("В поле Publication date выбрать  дату 15.02.2024")
    @Description(value = "Проверяем что в поле Publication Date вводится дата текущего года")
    public void InThePublicationDateFieldSelectTheDate() {
        creatingNewsStep.InThePublicationDateFieldSelectTheDateCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать выбрать время 00:00")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 00:00 ")
    public void inTheTimeFieldSelectTheTimeMidnight() {
        creatingNewsStep.inTheTimeFieldSelectTheTimeMidnightCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 01:01")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 01:01 ")
    public void inTheTimeFieldSelectTheTime0101() {
        creatingNewsStep.inTheTimeFieldSelectTheTime0101CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 06:30")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 06:30")
    public void inTheTimeFieldSelectTheTime0630() {
        creatingNewsStep.inTheTimeFieldSelectTheTime0630CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 11:58")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 11:58")
    public void inTheTimeFieldSelectTheTime1158() {
        creatingNewsStep.inTheTimeFieldSelectTheTime1158CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 12:59 ")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 12:59")
    public void inTheTimeFieldSelectTheTime1259() {
        creatingNewsStep.inTheTimeFieldSelectTheTime1259CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 13:00")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 13:00")
    public void inTheTimeFieldSelectTheTime1300() {
        creatingNewsStep.inTheTimeFieldSelectTheTime1300CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 14:00")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 14:00")
    public void inTheTimeFieldSelectTheTime1400() {
        creatingNewsStep.inTheTimeFieldSelectTheTime1400CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 20:00 ")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 20:00")
    public void inTheTimeFieldSelectTheTime2000() {
        creatingNewsStep.inTheTimeFieldSelectTheTime2000CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 22:00")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 22:00")
    public void inTheTimeFieldSelectTheTime2200() {
        creatingNewsStep.inTheTimeFieldSelectTheTime2200CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле Time выбрать время 23:00")
    @Description(value = "Проверяем что в поле Time отобразилось выбранное время 23:00")
    public void inTheTimeFieldSelectTheTime2300() {
        creatingNewsStep.inTheTimeFieldSelectTheTime2300CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("Отмена выбранного времени в модуле с часами")
    @Description(value = "Проверяем что поле Time пустое")
    public void cancelingTheSelectedTimeInTheClockModule() {
        creatingNewsStep.cancelingTheSelectedTimeInTheClockModuleCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("Перейти в модуль Set time из модуля с часами,  используя кнопку ввиде клавиатуры")
    @Description(value = "Проверяем переход в модуль Set time")
    public void goToTheSetTimeModuleFromTheClockModuleUsingTheKeyboardButton() {
        creatingNewsStep.goToTheSetTimeModuleFromTheClockModuleUsingTheKeyboardButtonCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("Перейти в  модуль с часами из модуля Set time используя кнопку ввиде часов")
    @Description(value = "Проверяем переход в модуль Set time используя кнопку ввиде часов")
    public void goToTheClockModuleFromTheSetTimeModuleUsingTheClockButton() {
        creatingNewsStep.goToTheClockModuleFromTheSetTimeModuleUsingTheClockButtonCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле hour ввести 00  часов")
    @Description(value = "Проверяем что в поле hour отобразилось выбранное время 00")
    public void enter00HoursInTheHourField() {
        creatingNewsStep.enter00HoursInTheHourFieldCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле hour ввести 01  час")
    @Description(value = "Проверяем что в поле hour отобразилось выбранное время 01")
    public void inTheHourFieldEnter01() {
        creatingNewsStep.inTheHourFieldEnter01CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле hour ввести 12  часов")
    @Description(value = "Проверяем что в поле hour отобразилось выбранное время 12")
    public void inTheHourFieldEnter12() {
        creatingNewsStep.inTheHourFieldEnter12CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле hour ввести 22  часа")
    @Description(value = "Проверяем что в поле hour отобразилось выбранное время 22")
    public void inTheHourFieldEnter22() {
        creatingNewsStep.inTheHourFieldEnter22CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле hour ввести 23  часа")
    @Description(value = "Проверяем что в поле hour отобразилось выбранное время 23")
    public void inTheHourFieldEnter23() {
        creatingNewsStep.inTheHourFieldEnter23CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле hour ввести 24 часа")
    @Description(value = "Проверяем что в поле hour отобразилось выбранное время 24")
    public void inTheHourFieldEnter24() {
        creatingNewsStep.inTheHourFieldEnter24CreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле minute ввести 00 минут")
    @Description(value = "Проверяем что в поле minute отобразилось выбранное время 00")
    public void enter00MinutesInTheMinuteField() {
        creatingNewsStep.enter00MinutesInTheMinuteFieldCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле minute ввести 01  минуту")
    @Description(value = "Проверяем что в поле minute отобразилось выбранное время 01")
    public void enter01MinutesInTheMinuteField() {
        creatingNewsStep.enter01MinutesInTheMinuteFieldCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле minute ввести 30  минут")
    @Description(value = "Проверяем что в поле minute отобразилось выбранное время 30")
    public void enter30MinutesInTheMinuteField() {
        creatingNewsStep.enter30MinutesInTheMinuteFieldCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В поле minute ввести 59  минут")
    @Description(value = "Проверяем что в поле minute отобразилось выбранное время 59")
    public void enter59MinutesInTheMinuteField() {
        creatingNewsStep.enter59MinutesInTheMinuteFieldCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("В модуле Set time ввести 20 часов и 59 минут, и нажать на кнопку CANCEL")
    @Description(value = "Проверяем что после отмены ввода времени, поле minute осталось пустым")
    public void InTheSetTimeModuleEnter20HoursAnd59MinutesAndPressTheCancelButton() {
        creatingNewsStep.InTheSetTimeModuleEnter20HoursAnd59MinutesAndPressTheCancel();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("Ввести поле Description  любое предложение используя кириллицу")
    @Description(value = "Проверяем что Description поле допускает ввод буквенных символов используя кириллицу")
    public void enterAnySentenceInTheDescriptionFieldUsingCyrillic() {
        creatingNewsStep.enterAnySentenceInTheDescriptionFieldUsingCyrillicCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("Ввести поле Description любое предложение используя  используя разный регистр")
    @Description(value = "Проверяем что Description поле допускает ввод буквенных символов используя разный регистр")
    public void enterTheDescriptionFieldOfAnySentenceUsingADifferentCase() {
        creatingNewsStep.enterTheDescriptionFieldOfAnySentenceUsingADifferentCaseCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("Ввести поле Description любое предложение используя латиницу")
    @Description(value = "Проверяем что Description поле допускает ввод буквенных символов используя латиницу")
    public void enterTheDescriptionFieldOfAnySentenceUsingTheLatinAlphabet() {
        creatingNewsStep.enterTheDescriptionFieldOfAnySentenceUsingTheLatinAlphabetCreatingNews();
    }

    @Epic(value = "Раздел Creating News")
    @Feature(value = "Поле Time")
    @Test
    @DisplayName("Ввести поле Description любой набор цифровых символов")
    @Description(value = "Проверяем что Description поле допускает ввод любых цифровых символов")
    public void enterAnySetOfNumericCharactersInTheDescriptionField() {
        creatingNewsStep.enterAnySetOfNumericCharactersInTheDescriptionFieldCreatingNews();
    }

}
