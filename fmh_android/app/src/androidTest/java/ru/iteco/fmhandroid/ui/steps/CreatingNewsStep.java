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

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;


public class CreatingNewsStep {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static AuthorizationModule authorizationModule = new AuthorizationModule();


    public void selectTheAdCategoryFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void selectTheAdBirthdayFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theBirthdayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theBirthdayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.birthday())));
    }

    public void selectTheSalaryCategoryFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theSalaryCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theSalaryCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.salary())));
    }

    public void selectTheTradeUnionCategoryFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theTradeUnionCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theTradeUnionCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.theTradeUnion())));
    }

    public void selectHolidayCategoryFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theHolidayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theHolidayCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.holiday())));
    }

    public void selectMassageCategoryFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theMassageCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theMassageCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.massage())));
    }

    public void selectGratitudeCategoryFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        Espresso.closeSoftKeyboard();
        creatingNewsElement.theGratitudeCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theGratitudeCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.gratitude())));
    }

    public void selectNeedHelpCategoryFromTheListOfCategories() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        Espresso.closeSoftKeyboard();
        creatingNewsElement.theNeedHelpCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theNeedHelpCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.needHelp())));
    }

    public void enterTheLetterOInLowercaseInTheCategoryField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInLowercase()));
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void enterTheLetterOInUppercaseInTheCategoryField() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theCategoryField.perform(replaceText(Data.theLetterOInUppercase()));
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theAdCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.theCategoryField.check(matches(withText(Data.category())));
    }

    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownList() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theCategoryField.perform(replaceText(Data.bingo()));
        creatingNewsElement.theCategoryField.check(matches(withText(Data.bingo())));
    }

    public void enterAnyWordInTheCategoryFieldThatIsNotInTheDropDownListInLatin() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theCategoryField.perform(replaceText(Data.aWordInLatin()));
        creatingNewsElement.theCategoryField.check(matches(withText(Data.aWordInLatin())));
    }

    public void createANewsItemWithAnEmptyCategoryFieldInCreatingNews() throws InterruptedException, ParseException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.sea()));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(replaceText(dateOfPublication()));
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(21, 30), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(replaceText(Data.theContentOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        authorizationModule.emptyToast(R.string.empty_fields).check(matches(isDisplayed()));
    }

    public void enterAnyWordInTheTitleFieldUsingTheCyrillicAlphabetSectionCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.theNameOfTheNews()));
        creatingNewsElement.titleField.check(matches(withText(Data.theNameOfTheNews())));
    }

    public void enterAnyWordInTheTitleFieldUsingADifferentCaseCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.newsContentIinDifferentRegisters()));
        creatingNewsElement.titleField.check(matches(withText(Data.newsContentIinDifferentRegisters())));
    }

    public void enterAnyWordInTheTitleFieldUsingTheLatinAlphabetCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.aWordInLatin()));
        creatingNewsElement.titleField.check(matches(withText(Data.aWordInLatin())));
    }

    public void enterAnySetOfNumericCharactersInTheTitleFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.aSetOfNumbers()));
        creatingNewsElement.titleField.check(matches(withText(Data.aSetOfNumbers())));
    }

    public void createANewsItemWithAnEmptyTitleFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        authorizationModule.emptyToast(R.string.empty_fields).check(matches(isDisplayed()));
    }

    public void InThePublicationDateFieldSelectTheDateCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(replaceText(Data.theSecondDateOfPublicationOfTheNews()));
        creatingNewsElement.thePublicationDateField.check(matches(withText(Data.theSecondDateOfPublicationOfTheNews())));
    }

    public void inTheTimeFieldSelectTheTimeMidnightCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(00, 00), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheFirstCheck())));
    }

    public void inTheTimeFieldSelectTheTime0101CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(01, 01), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheSecondCheck())));
    }

    public void inTheTimeFieldSelectTheTime0630CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(06, 30), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForFheThirdCheck())));
    }

    public void inTheTimeFieldSelectTheTime1158CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(11, 58), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheFourthCheck())));
    }

    public void inTheTimeFieldSelectTheTime1259CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(12, 59), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheFifthCheck())));
    }

    public void inTheTimeFieldSelectTheTime1300CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(13, 00), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheSixthCheck())));
    }

    public void inTheTimeFieldSelectTheTime1400CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(14, 00), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheSeventhCheck())));
    }

    public void inTheTimeFieldSelectTheTime2000CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(20, 00), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheEighthCheck())));
    }

    public void inTheTimeFieldSelectTheTime2200CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(22, 00), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheNinthCheck())));
    }

    public void inTheTimeFieldSelectTheTime2300CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(23, 00), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText(Data.timeForTheTenthCheck())));
    }

    public void cancelingTheSelectedTimeInTheClockModuleCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(23, 00), click());
        creatingNewsElement.theCancelButton.check(matches(isDisplayed()));
        creatingNewsElement.theCancelButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText("")));
    }

    public void goToTheSetTimeModuleFromTheClockModuleUsingTheKeyboardButtonCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());

        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());

        creatingNewsElement.theSetTimeModule.check(matches(isDisplayed()));
        creatingNewsElement.theSetTimeModule.check(matches(withText("Set time")));

    }

    public void goToTheClockModuleFromTheSetTimeModuleUsingTheClockButtonCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
    }

    public void enter00HoursInTheHourFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.inTheHourField.perform(replaceText("00"));
        creatingNewsElement.inTheHourField.check(matches(withText("00")));
    }

    public void inTheHourFieldEnter01CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.inTheHourField.perform(replaceText("01"));
        creatingNewsElement.inTheHourField.check(matches(withText("01")));
    }

    public void inTheHourFieldEnter12CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.inTheHourField.perform(replaceText("12"));
        creatingNewsElement.inTheHourField.check(matches(withText("12")));
    }

    public void inTheHourFieldEnter22CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.inTheHourField.perform(replaceText("22"));
        creatingNewsElement.inTheHourField.check(matches(withText("22")));
    }

    public void inTheHourFieldEnter23CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.inTheHourField.perform(replaceText("23"));
        creatingNewsElement.inTheHourField.check(matches(withText("23")));
    }

    public void inTheHourFieldEnter24CreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.inTheHourField.perform(replaceText("24"));
        creatingNewsElement.inTheHourField.check(matches(withText("24")));
    }

    public void enter00MinutesInTheMinuteFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.InTheMinuteField.perform(replaceText("00"));
        creatingNewsElement.InTheMinuteField.check(matches(withText("00")));
    }

    public void enter01MinutesInTheMinuteFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.InTheMinuteField.perform(replaceText("01"));
        creatingNewsElement.InTheMinuteField.check(matches(withText("01")));
    }

    public void enter30MinutesInTheMinuteFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.InTheMinuteField.perform(replaceText("30"));
        creatingNewsElement.InTheMinuteField.check(matches(withText("30")));
    }

    public void enter59MinutesInTheMinuteFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.InTheMinuteField.perform(replaceText("59"));
        creatingNewsElement.InTheMinuteField.check(matches(withText("59")));
    }

    public void InTheSetTimeModuleEnter20HoursAnd59MinutesAndPressTheCancel() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.aButtonInTheFormOfAKeyboard.check(matches(isDisplayed()));
        creatingNewsElement.aButtonInTheFormOfAKeyboard.perform(click());
        creatingNewsElement.inTheHourField.check(matches(isDisplayed()));
        creatingNewsElement.inTheHourField.perform(replaceText("20"));
        creatingNewsElement.InTheMinuteField.check(matches(isDisplayed()));
        creatingNewsElement.InTheMinuteField.perform(replaceText("59"));
        creatingNewsElement.theCancelButton.check(matches(isDisplayed()));
        creatingNewsElement.theCancelButton.perform(click());
        creatingNewsElement.timeField.check(matches(withText("")));
    }

    public void enterAnySentenceInTheDescriptionFieldUsingCyrillicCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(click());
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()));
        creatingNewsElement.descriptionField.check(matches(withText(Data.descriptionOfTheNews())));
    }

    public void enterTheDescriptionFieldOfAnySentenceUsingADifferentCaseCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(click());
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNewsUsingADifferentRegister()));
        creatingNewsElement.descriptionField.check(matches(withText(Data.descriptionOfTheNewsUsingADifferentRegister())));
    }

    public void enterTheDescriptionFieldOfAnySentenceUsingTheLatinAlphabetCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(click());
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNewsUsingTheLatinAlphabet()));
        creatingNewsElement.descriptionField.check(matches(withText(Data.descriptionOfTheNewsUsingTheLatinAlphabet())));
    }

    public void enterAnySetOfNumericCharactersInTheDescriptionFieldCreatingNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(click());
        creatingNewsElement.descriptionField.perform(replaceText(Data.aSetOfNumbers()));
        creatingNewsElement.descriptionField.check(matches(withText(Data.aSetOfNumbers())));
    }


}
