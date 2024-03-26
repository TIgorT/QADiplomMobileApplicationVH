package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.not;

import static ru.iteco.fmhandroid.ui.data.Utils.forceClick;

import androidx.test.espresso.matcher.RootMatchers;

import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class MainStep {
    static MainElement mainElement = new MainElement();
    static AuthorizationModule authorizationModule = new AuthorizationModule();
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static NewsElement newsElement = new NewsElement();
    static AppBarElement appBarElement = new AppBarElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();

    public void theMainSection() {
        mainElement.newsSection.check(matches(isDisplayed()));
    }

    public void logOut() {
        mainElement.exitTheApplicationButton.perform(click());
        mainElement.logOut.perform(click());
        authorizationModule.authorizationModule.check(matches(isDisplayed()));
    }


    public void listOfTheNewsModule() {
        authorizationSteps.authorization();
        mainElement.theCheckmarkButton.check(matches(isDisplayed()));
        mainElement.theCheckmarkButton.perform(click());
        mainElement.theAllNewsButton.check(matches(isEnabled()));
    }

    public void theExpandedListOfTheNewsModule() {
        authorizationSteps.authorization();
        mainElement.theCheckmarkButton.check(matches(isDisplayed()));
        mainElement.theCheckmarkButton.perform(click());
        mainElement.theCheckmarkButton.perform(click());
        mainElement.theAllNewsButton.check(matches(isDisplayed()));
        mainElement.theAllNewsButton.check(matches(withText("ALL NEWS")));
    }

    public void goToTheNewsSectionFromTheMainSection() {
        authorizationSteps.authorization();
        mainElement.theAllNewsButton.check(matches(isDisplayed()));
        mainElement.theAllNewsButton.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void newsInTheMainSection() throws InterruptedException {
        authorizationSteps.authorization();
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
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(clearText());
        creatingNewsElement.titleField.perform(replaceText(Data.theNameOfTheNews()));
        creatingNewsElement.titleField.check(matches(withText(Data.theNameOfTheNews())));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(click());
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(click());
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theMainSection.check(matches(isDisplayed()));
        newsElement.theMainSection.perform(click());

        Thread.sleep(1000);
        mainElement.theNameOfTheNewsInTheMainSection.check(matches(isDisplayed()));
        mainElement.theNameOfTheNewsInTheMainSection.check(matches(withText(Data.theNameOfTheNews())));

        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
    }

    public void expandTheNews() throws InterruptedException {
        authorizationSteps.authorization();
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
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(clearText());
        creatingNewsElement.titleField.perform(replaceText(Data.theNameOfTheNews()));
        creatingNewsElement.titleField.check(matches(withText(Data.theNameOfTheNews())));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(click());
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(click());
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theMainSection.check(matches(isDisplayed()));
        newsElement.theMainSection.perform(click());

        mainElement.expandTheNewsInTheMainSection.check(matches(isDisplayed()));
        mainElement.expandTheNewsInTheMainSection.perform(actionOnItemAtPosition(0, click()));
        Thread.sleep(1000);
        mainElement.theContentOfTheNews.check(matches(isDisplayed()));
        mainElement.theContentOfTheNews.check(matches(withText(Data.descriptionOfTheNews())));

        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
    }

    public void collapseTheNews() throws InterruptedException {
        authorizationSteps.authorization();
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
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        creatingNewsElement.titleField.perform(click());
        creatingNewsElement.titleField.perform(clearText());
        creatingNewsElement.titleField.perform(replaceText(Data.theNameOfTheNews()));
        creatingNewsElement.titleField.check(matches(withText(Data.theNameOfTheNews())));
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        creatingNewsElement.thePublicationDateField.perform(click());
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        creatingNewsElement.timeField.perform(click());
        creatingNewsElement.theOkButton.perform(click());
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        creatingNewsElement.descriptionField.perform(click());
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()));
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theMainSection.check(matches(isDisplayed()));
        newsElement.theMainSection.perform(click());

        mainElement.expandTheNewsInTheMainSection.check(matches(isDisplayed()));
        mainElement.expandTheNewsInTheMainSection.perform(actionOnItemAtPosition(0, click()));
        mainElement.expandTheNewsInTheMainSection.perform(actionOnItemAtPosition(0, forceClick()));
        Thread.sleep(1500);
        mainElement.theContentOfTheNews.check(matches(not(isDisplayed())));

        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
    }
}
