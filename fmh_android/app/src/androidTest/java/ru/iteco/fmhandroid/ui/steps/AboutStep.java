package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;

import ru.iteco.fmhandroid.ui.elements.AboutElement;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;

public class AboutStep {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static AppBarElement appBarElement = new AppBarElement();
    static AboutElement aboutElement = new AboutElement();
    static MainElement mainElement = new MainElement();

    public void goToTheAboutSectionVersion() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(500);
        appBarElement.buttonNavicon.perform(click());
        aboutElement.theAboutSection.perform(click());
        aboutElement.version.check(matches(isDisplayed()));
        aboutElement.version.check(matches(withText("1.0.0")));
    }

    public void returnFromTheAboutSection() throws InterruptedException {
        authorizationSteps.authorization();
        Thread.sleep(500);
        appBarElement.buttonNavicon.perform(click());
        aboutElement.theAboutSection.perform(click());
        Espresso.pressBack();
        mainElement.newsSection.check(matches(isDisplayed()));
        mainElement.newsSection.check(matches(withText("News")));
    }
}
