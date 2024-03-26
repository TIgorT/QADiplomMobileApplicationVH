package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.fail;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoActivityResumedException;

import ru.iteco.fmhandroid.ui.elements.AboutElement;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;
import ru.iteco.fmhandroid.ui.elements.LoveIsAllElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class AppBarStep {
    static AppBarElement appBarElement = new AppBarElement();
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    AuthorizationModule authorizationModule = new AuthorizationModule();
    static NewsElement newsElement = new NewsElement();
    static MainElement mainElement = new MainElement();
    static AboutElement aboutElement = new AboutElement();
    static LoveIsAllElement loveIsAllElement = new LoveIsAllElement();


    public void thePresenceOfTheNaviconButton() {
        authorizationSteps.authorization();
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
    }

    public void thePresenceOfAButtonInTheFormOfAButterfly() {
        authorizationSteps.authorization();
        appBarElement.butterflyButtons.check(matches(isDisplayed()));
    }

    public void thePresenceOfAButtonInTheFormOfAMan() {
        authorizationSteps.authorization();
        appBarElement.buttonsInTheFormOfAMan.check(matches(isDisplayed()));
    }

    public void goToTheNewsSection() {
        authorizationSteps.authorization();
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.perform(click());
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void theyWillReturnFromTheNewsSectionToThePreviousSection() {
        authorizationSteps.authorization();
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.perform(click());
        Espresso.pressBack();
        mainElement.newsSection.check(matches(isDisplayed()));
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void goToTheMainSection() {
        authorizationSteps.authorization();
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.perform(click());
        appBarElement.buttonNavicon.perform(click());
        newsElement.theMainSection.perform(click());
        mainElement.newsSection.check(matches(isDisplayed()));
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void theyWillReturnFromTheMainSectionToThePreviousSection() {
        authorizationSteps.authorization();
        appBarElement.buttonNavicon.perform(click());
        newsElement.theNewsSection.perform(click());
        appBarElement.buttonNavicon.perform(click());
        newsElement.theMainSection.perform(click());
        Espresso.pressBack();
        newsElement.theNewsSection.check(matches(isDisplayed()));
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void goToTheAboutSection() {
        authorizationSteps.authorization();
        appBarElement.buttonNavicon.perform(click());
        aboutElement.theAboutSection.perform(click());
        aboutElement.applicationVersion.check(matches(isDisplayed()));
        aboutElement.applicationVersion.check(matches(withText("Version:")));
    }

    public void theyWillReturnFromTheAboutSectionToThePreviousSection() {
        authorizationSteps.authorization();
        appBarElement.buttonNavicon.perform(click());
        aboutElement.theAboutSection.perform(click());
        Espresso.pressBack();
        mainElement.newsSection.check(matches(isDisplayed()));
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void goToTheLoveIsAllSection() {
        authorizationSteps.authorization();
        loveIsAllElement.theLoveIsAlSection.perform(click());
        loveIsAllElement.sectionTitle.check(matches(isDisplayed()));
        loveIsAllElement.sectionTitle.check(matches(withText("Love is all")));
    }

    public void goBackToTheLoveIsAllSectionInThePreviousSection() {
        authorizationSteps.authorization();
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Espresso.pressBack();
        mainElement.newsSection.check(matches(isDisplayed()));
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void logOutOfYourAccount() {
        authorizationSteps.authorization();
        mainElement.exitTheApplicationButton.perform(click());
        mainElement.logOut.perform(click());
        authorizationModule.authorizationModule.check(matches(isDisplayed()));
        authorizationModule.authorizationModule.check(matches(withText("Authorization")));
    }

    public void logOutOfYourAccountUsingTheSystemButton() {
        authorizationSteps.authorization();
        Espresso.pressBack();
        try {
            Espresso.pressBack();
            fail("Should have thrown NoActivityResumedException");
        } catch (NoActivityResumedException expected) {
        }

    }
}
