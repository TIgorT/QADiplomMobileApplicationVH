package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.matcher.RootMatchers;

import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.FilterNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class ControlPanelStep {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static FilterNewsElement filterNewsElement = new FilterNewsElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();

    public void thePresenceOfTheSortNewsButton() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.theSortNewsButton.check(matches(isDisplayed()));
    }

    public void thePresenceOfTheNewsFilteringButton() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.theNewsFilteringButtons.check(matches(isDisplayed()));
    }

    public void thePresenceOfTheCreateNewsButton() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
    }

    public void goToTheFilterNewsSection() throws InterruptedException {
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
        filterNewsElement.filterNewsModule.check(matches(isDisplayed()));
    }

    public void goToTheCreatingNewsSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        controlPanelElement.theCreateNewsButton.perform(click());
        creatingNewsElement.theTitleOfTheCreatingNewsSection.check(matches(isDisplayed()));
        creatingNewsElement.theTitleOfTheCreatingNewsSection.check(matches(withText(Data.theNameOfTheCreatingNewsSection())));
    }

    public void expandTheNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());

        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        controlPanelElement.theCreateNewsButton.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
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
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()), closeSoftKeyboard());
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());

        controlPanelElement.aButtonInTheFormOfACheckMark.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfACheckMark.perform(actionOnItemAtPosition(0, click()));
        controlPanelElement.descriptionOfTheNews.check(matches(withText(Data.descriptionOfTheNews())));
        Thread.sleep(500);
        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(doesNotExist());
    }

    public void collapseTheNews() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());

        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        controlPanelElement.theCreateNewsButton.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
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
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()), closeSoftKeyboard());
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());

        controlPanelElement.aButtonInTheFormOfACheckMark.check(matches(isDisplayed()));
        controlPanelElement.aButtonInTheFormOfACheckMark.perform(actionOnItemAtPosition(0, click()));
        controlPanelElement.aButtonInTheFormOfACheckMark.perform(actionOnItemAtPosition(0, click()));
        Thread.sleep(1000);
        controlPanelElement.descriptionOfTheNews.check(doesNotExist());

        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(doesNotExist());
    }

    public void deleteANewsItem() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        controlPanelElement.theCreateNewsButton.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
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
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()), closeSoftKeyboard());
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(doesNotExist());
    }

    public void cancelTheNewsDeletionProcess() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        controlPanelElement.theCreateNewsButton.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
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
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()), closeSoftKeyboard());
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theCancelButton.check(matches(isDisplayed()));
        controlPanelElement.theCancelButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));

        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(doesNotExist());
    }

    public void goToTheEditingNewsSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(1000);
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.perform(click());
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        newsElement.aPencilShapedButton.perform(click());
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        controlPanelElement.theCreateNewsButton.perform(click());
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        creatingNewsElement.theCategoryField.perform(click());
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
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
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()), closeSoftKeyboard());
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        creatingNewsElement.theSaveButton.perform(click());
        controlPanelElement.aPencilShapedButton.check(matches(isDisplayed()));
        controlPanelElement.aPencilShapedButton.perform(click());
        controlPanelElement.theNameOfTheEditingNewsSection.check(matches(isDisplayed()));
        controlPanelElement.theNameOfTheEditingNewsSection.check(matches(withText("Editing")));
        controlPanelElement.theCancelButton.check(matches(isDisplayed()));
        controlPanelElement.theCancelButton.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());

        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        controlPanelElement.deleteANewsItem.perform(click());
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        controlPanelElement.theOkButton.perform(click());
        controlPanelElement.theNameOfTheNews.check(doesNotExist());
    }
}
