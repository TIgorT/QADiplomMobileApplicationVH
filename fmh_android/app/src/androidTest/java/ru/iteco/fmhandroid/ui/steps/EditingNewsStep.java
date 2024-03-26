package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.data.Data.changedPublicationDate;
import static ru.iteco.fmhandroid.ui.data.Data.theTestDateOfTheMewsPublication;

import androidx.test.espresso.contrib.PickerActions;
import androidx.test.espresso.matcher.RootMatchers;

import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.EditingNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class EditingNewsStep {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static EditingNewsElement editingNewsElement = new EditingNewsElement();

    public void inTheNewsOfTheEditingNewsModuleChangeTheData() throws InterruptedException {
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
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.theFirstTestTitleOfTheNews()));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(replaceText(theTestDateOfTheMewsPublication()));
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(22, 45), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(replaceText(Data.theTextContentOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theEditNewsButton.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        creatingNewsElement.theCategoryField.perform(replaceText(Data.massage()));
        creatingNewsElement.theCategoryField.check(matches(withText(Data.massage())));

        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        editingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theDeleteNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theDeleteNewsButton.perform(click());
        editingNewsElement.theOkButton.check(matches(isDisplayed()));
        editingNewsElement.theOkButton.perform(click());
    }

    public void changeTheDataInTheTitleField() throws InterruptedException {
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
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.theFirstTestTitleOfTheNews()));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(replaceText(theTestDateOfTheMewsPublication()));
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(22, 45), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(replaceText(Data.theTextContentOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theEditNewsButton.perform(click());

        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.dataInTheTitleField()));
        creatingNewsElement.titleField.check(matches(withText(Data.dataInTheTitleField())));

        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        editingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theDeleteNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theDeleteNewsButton.perform(click());
        editingNewsElement.theOkButton.check(matches(isDisplayed()));
        editingNewsElement.theOkButton.perform(click());
    }

    public void changeTheDataInThePublicationDateField() throws InterruptedException {
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
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.theFirstTestTitleOfTheNews()));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(replaceText(theTestDateOfTheMewsPublication()));
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(22, 45), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(replaceText(Data.theTextContentOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theEditNewsButton.perform(click());

        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(replaceText(changedPublicationDate()));
        creatingNewsElement.thePublicationDateField.check(matches(withText(Data.changedPublicationDate())));

        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        editingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theDeleteNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theDeleteNewsButton.perform(click());
        editingNewsElement.theOkButton.check(matches(isDisplayed()));
        editingNewsElement.theOkButton.perform(click());
    }

    public void changeTheDataInTheTimeField() throws InterruptedException {
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
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(replaceText(Data.theFirstTestTitleOfTheNews()));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(replaceText(theTestDateOfTheMewsPublication()));
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(22, 45), click());
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(replaceText(Data.theTextContentOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theEditNewsButton.perform(click());

        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(replaceText(Data.changingTheTime()));
        creatingNewsElement.timeField.check(matches(withText(Data.changingTheTime())));

        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        editingNewsElement.theSaveButton.perform(click());

        editingNewsElement.theDeleteNewsButton.check(matches(isDisplayed()));
        editingNewsElement.theDeleteNewsButton.perform(click());
        editingNewsElement.theOkButton.check(matches(isDisplayed()));
        editingNewsElement.theOkButton.perform(click());
    }
}
