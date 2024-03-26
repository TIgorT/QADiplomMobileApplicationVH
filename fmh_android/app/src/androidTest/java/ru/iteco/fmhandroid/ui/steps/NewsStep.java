package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.not;
import static ru.iteco.fmhandroid.ui.data.Utils.forceClick;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.RootMatchers;

import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.FilterNewsElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class NewsStep {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static FilterNewsElement filterNewsElement = new FilterNewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static MainElement mainElement = new MainElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();

    public void theFilterNewsSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.theFilterButton.check(matches(isDisplayed()));
        newsElement.theFilterButton.perform(click());
        filterNewsElement.filterNewsModule.check(matches(isDisplayed()));
        filterNewsElement.filterNewsModule.check(matches(withText("Filter news")));
    }

    public void returnToTheNewsSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.theFilterButton.check(matches(isDisplayed()));
        newsElement.theFilterButton.perform(click());
        Espresso.pressBack();
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void controlPanelSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.controlPanelHeader.check(matches(isDisplayed()));
        controlPanelElement.controlPanelHeader.check(matches(withText("Control panel")));
    }

    public void goBackToTheNewsSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        Espresso.pressBack();
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void expandTheNewNewsInTheNewsSection() throws InterruptedException {
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
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());

        newsElement.expandTheNewsInTheNewsSection.check(matches(isDisplayed()));
        newsElement.expandTheNewsInTheNewsSection.perform(actionOnItemAtPosition(0, click()));
        Thread.sleep(1000);
        mainElement.theContentOfTheNews.check(matches(isDisplayed()));
        mainElement.theContentOfTheNews.check(matches(withText(Data.descriptionOfTheNews())));

        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
    }

    public void collapseTheNewNewsInTheNewsSection() throws InterruptedException {
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
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());

        newsElement.expandTheNewsInTheNewsSection.check(matches(isDisplayed()));
        newsElement.expandTheNewsInTheNewsSection.perform(actionOnItemAtPosition(0, click()));
        newsElement.expandTheNewsInTheNewsSection.perform(actionOnItemAtPosition(0, forceClick()));
        Thread.sleep(1000);
        mainElement.theContentOfTheNews.check(matches(not(isDisplayed())));

        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
    }

    public void theyWillReturnFromTheNewsSectionToThePreviousSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        Espresso.pressBack();
        mainElement.theAllNewsButton.check(matches(isDisplayed()));
        mainElement.theAllNewsButton.check(matches(withText("ALL NEWS")));
    }
}
