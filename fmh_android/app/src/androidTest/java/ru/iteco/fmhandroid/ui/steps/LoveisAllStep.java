package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;

import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.LoveIsAllElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;

public class LoveisAllStep {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static LoveIsAllElement loveIsAllElement = new LoveIsAllElement();
    static MainElement mainElement = new MainElement();

    public void quoteInTheSectionLoveIsAll() throws InterruptedException {
        authorizationSteps.authorization();
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        loveIsAllElement.theLoveIsAlSection.perform(click());
        loveIsAllElement.aCheckmarkButton.check(matches(isDisplayed()));
        loveIsAllElement.aCheckmarkButton.perform(actionOnItemAtPosition(0, click()));
        Thread.sleep(500);
        loveIsAllElement.descriptionOfTheQuote.check(matches(isDisplayed()));
        loveIsAllElement.descriptionOfTheQuote.check(matches(withText(Data.theFirstThematicQuote())));

    }

    public void theCollapsedQuoteInTheLoveIsAllSection() throws InterruptedException {
        authorizationSteps.authorization();
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        loveIsAllElement.theLoveIsAlSection.perform(click());
        loveIsAllElement.aCheckmarkButton.check(matches(isDisplayed()));
        loveIsAllElement.aCheckmarkButton.perform(actionOnItemAtPosition(0, click()));
        loveIsAllElement.aCheckmarkButton.perform(actionOnItemAtPosition(0, click()));
        Thread.sleep(500);
        loveIsAllElement.descriptionOfTheQuote.check(matches(isEnabled()));

    }

    public void theyWillReturnFromTheLoveIsAllSection() throws InterruptedException {
        authorizationSteps.authorization();
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Espresso.pressBack();
        mainElement.newsSection.check(matches(isDisplayed()));
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void scrollToTheSeventhQuoteFromTheLoveIsAllSection() throws InterruptedException {
        authorizationSteps.authorization();
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        loveIsAllElement.theLoveIsAlSection.perform(click());
        loveIsAllElement.aCheckmarkButtonSeven.perform(actionOnItemAtPosition(6, ViewActions.scrollTo()));
        loveIsAllElement.aCheckmarkButtonSeven.perform(actionOnItemAtPosition(6, ViewActions.click()));
        Thread.sleep(500);
        loveIsAllElement.descriptionOfTheQuoteSeven.check(matches(isDisplayed()));
        loveIsAllElement.descriptionOfTheQuoteSeven.check(matches(withText(Data.theSecondThematicQuote())));
    }
}
