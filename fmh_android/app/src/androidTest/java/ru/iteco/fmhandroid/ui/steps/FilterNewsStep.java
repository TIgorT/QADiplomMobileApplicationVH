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


import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.EditingNewsElement;
import ru.iteco.fmhandroid.ui.elements.FilterNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class FilterNewsStep {

    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static FilterNewsElement filterNewsElement = new FilterNewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static AuthorizationModule authorizationModule = new AuthorizationModule();
    static EditingNewsElement editingNewsElement = new EditingNewsElement();

    public void thePresenceOfTheCategoryField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.check(matches(withHint("Category")));
    }

    public void thePresenceOfTheStartDateField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.check(matches(withHint(Data.dateFormat())));
    }

    public void thePresenceOfTheEndDateField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        filterNewsElement.theEndDateField.check(matches(withHint(Data.dateFormat())));
    }

    public void thePresenceOfTheFilterButton() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(withText(Data.filter())));
    }

    public void thePresenceOfTheCancelButton() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCancelButton.check(matches(isDisplayed()));
        filterNewsElement.theCancelButton.check(matches(withText(Data.cancel())));
    }

    public void selectTheAdCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void selectTheBirthdayCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theBirthdayCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theBirthdayCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.birthday())));
    }

    public void selectTheSalaryCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theSalaryCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theSalaryCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.salary())));
    }

    public void selectTheTradeUnionCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theTradeUnionCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theTradeUnionCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.theTradeUnion())));
    }

    public void selectTheHolidayCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theHolidayCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theHolidayCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.holiday())));
    }

    public void selectTheMassageCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theMassageCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theMassageCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.massage())));
    }

    public void selectTheGratitudeCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        Espresso.closeSoftKeyboard();
        filterNewsElement.theGratitudeCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theGratitudeCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.gratitude())));
    }

    public void selectTheNeedHelpCategory() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theNeedHelpCategory.inRoot(RootMatchers.isPlatformPopup()).perform(ViewActions.scrollTo());
        filterNewsElement.theNeedHelpCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theNeedHelpCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.needHelp())));
    }

    public void enterTheLetterOInTheCategoryField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInLowercase()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void enterTheLetterOInUppercaseInTheCategoryField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInUppercase()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

//    public void enterTheWordSalaryInTheCategoryField() throws InterruptedException {
//        authorizationSteps.authorization();
//        Thread.sleep(1000);
//        appBarElement.buttonNavicon.check(matches(isDisplayed()));
//        appBarElement.buttonNavicon.perform(click());
//        newsElement.theNewsSection.check(matches(isDisplayed()));
//        newsElement.theNewsSection.perform(click());
//        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
//        filterNewsElement.theFilterButton.perform(click());
//        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
//        filterNewsElement.theCategoryField.perform(click());
//        filterNewsElement.theCategoryField.perform(replaceText(Data.salary()));
////        filterNewsElement.theCategoryField.perform(replaceText(Data.aSetOfLettersZar()));
////        filterNewsElement.theCategoryField.perform(click());
////        filterNewsElement.theCategoryField.perform(click());
////        filterNewsElement.actionInTheCategoryField.perform(click());
//        filterNewsElement.theSalaryCategory.
//        filterNewsElement.theSalaryCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
////        filterNewsElement.theSalaryCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(not(isDisplayed())));
////        Thread.sleep(1000);
////        filterNewsElement.theSalaryCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(not(isDisplayed())));
//    }

    public void enterAnyWordInTheCategoryFieldUsingTheCyrillicAlphabet() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theCategoryField.perform(replaceText(Data.bingo()));
        filterNewsElement.theCategoryField.check(matches(withText(Data.bingo())));
    }

    public void enterAnyWordInTheCategoryFieldUsingTheLatinAlphabet() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theCategoryField.perform(replaceText(Data.aWordInLatin()));
        filterNewsElement.theCategoryField.check(matches(withText(Data.aWordInLatin())));
    }
    //////////


    public void chooseTheFifteenthDayOfTheMonth() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2024, 02, 15), click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(withText("15.02.2024")));
    }

    public void selectADateUsingTheArrowsInTheCalendar() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.theBackButtonInTheCalendar.perform(click());
        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2023, 12, 31), click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(withText("31.12.2023")));
    }

    public void selectTheLastYearUsingTheUpperLeftCorner() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.choosingTheYear.check(matches(isDisplayed()));
        filterNewsElement.choosingTheYear.perform(click());
        filterNewsElement.lastYear.check(matches(isDisplayed()));
        filterNewsElement.lastYear.perform(click());
        filterNewsElement.checkingWhichYear.check(matches(withText("2023")));
    }

    public void movingForwardOnTheCalendar() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            filterNewsElement.theForwardButtonInTheCalendar.perform(click());
            Thread.sleep(500);
        }
    }

    public void inTheStartDateFieldSelectAFutureDateUsingTheArrowsInTheCalendar() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        movingForwardOnTheCalendar();
        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2025, 1, 1), click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(withText("01.01.2025")));
    }

    public void selectTheNextYearUsingTheButtonInTheUpperLeftCorner() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.choosingTheYear.check(matches(isDisplayed()));
        filterNewsElement.choosingTheYear.perform(click());
        filterNewsElement.nextYear.check(matches(isDisplayed()));
        filterNewsElement.nextYear.perform(click());
        filterNewsElement.checkingNextYear.check(matches(withText("2025")));
    }

    public void cancelDateSelection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.theCancelButtonInTheCalendar.check(matches(isDisplayed()));
        filterNewsElement.theCancelButtonInTheCalendar.perform(click());
        filterNewsElement.filterNewsModule.check(matches(isDisplayed()));
        filterNewsElement.filterNewsModule.check(matches(withText("Filter news")));
    }

    public void selectTheFifteenthDayInTheCalendarInTheEndDateField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        filterNewsElement.theEndDateField.perform(click());

        filterNewsElement.dateInTheCalendar.perform(PickerActions.setDate(2024, 02, 15), click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theEndDateField.check(matches(withText("15.02.2024")));
    }

    public void filterTheNewsWhenOnlyTheEndDateFieldIsFilledIn() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        filterNewsElement.theEndDateField.perform(click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        filterNewsElement.theFilterButtonInTheModuleFilterNews.perform(click());
        filterNewsElement.errorChecking.check(matches(isDisplayed()));
        filterNewsElement.errorChecking.check(matches(withText("Wrong period")));
    }

    public void filterTheNewsWhenOnlyTheStartDateFieldIsFilledIn() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        filterNewsElement.theFilterButtonInTheModuleFilterNews.perform(click());
        filterNewsElement.errorChecking.check(matches(isDisplayed()));
        filterNewsElement.errorChecking.check(matches(withText("Wrong period")));
    }

    public void filterTheNewsWhenFillingInAllFields() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        filterNewsElement.theEndDateField.perform(click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theFilterButtonInTheModuleFilterNews.check(matches(isDisplayed()));
        filterNewsElement.theFilterButtonInTheModuleFilterNews.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void cancelNewsFiltering() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        filterNewsElement.theCategoryField.check(matches(isDisplayed()));
        filterNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        filterNewsElement.theStartDateField.check(matches(isDisplayed()));
        filterNewsElement.theStartDateField.perform(click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theEndDateField.check(matches(isDisplayed()));
        filterNewsElement.theEndDateField.perform(click());
        filterNewsElement.theOkButton.check(matches(isDisplayed()));
        filterNewsElement.theOkButton.perform(click());
        filterNewsElement.theCancelButton.check(matches(isDisplayed()));
        filterNewsElement.theCancelButton.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void cancelNewsFilteringUsingTheSystemButton() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        Espresso.pressBack();
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }


    public void cancelFilteringOfNewsWithBlankFormFields() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        filterNewsElement.theFilterButton.check(matches(isDisplayed()));
        filterNewsElement.theFilterButton.perform(click());
        Espresso.pressBack();
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void checkingTheActiveCheckbox() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());

        controlPanelElement.theNewsFilteringButtons.check(matches(isDisplayed()));
        controlPanelElement.theNewsFilteringButtons.perform(click());
        filterNewsElement.theCheckBoxActive.check(matches(isDisplayed()));
        filterNewsElement.theCheckBoxActive.perform(click());
        filterNewsElement.theCheckBoxActive.check(matches(not(isChecked())));
    }

    public void checkingTheNotActiveCheckbox() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());

        controlPanelElement.theNewsFilteringButtons.check(matches(isDisplayed()));
        controlPanelElement.theNewsFilteringButtons.perform(click());
        filterNewsElement.theCheckBoxNotActive.check(matches(isDisplayed()));
        filterNewsElement.theCheckBoxNotActive.perform(click());
        filterNewsElement.theCheckBoxNotActive.check(matches(not(isChecked())));
    }
}
