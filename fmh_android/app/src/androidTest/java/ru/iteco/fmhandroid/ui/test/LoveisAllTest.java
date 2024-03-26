package ru.iteco.fmhandroid.ui.test;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.LoveisAllStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class LoveisAllTest {
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    LoveisAllStep loveisAllStep = new LoveisAllStep();

    @Rule
    public ActivityTestRule<AppActivity> mActivityTestRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void authCheck() throws InterruptedException {
        Thread.sleep(5000);
        try {
            authorizationSteps.isAuthorizationScreen();
        } catch (NoMatchingViewException e) {
            mainStep.logOut();
        }
    }

    @Test
    @DisplayName("Развернуть тематическую цитату в разделе Love is all")
    public void expandTheThematicQuoteInTheLoveIsAllSection() throws InterruptedException {
        loveisAllStep.quoteInTheSectionLoveIsAll();
    }

    @Test
    @DisplayName("Свернуть тематическую цитату в разделе Love is all")
    public void collapseTheThematicQuoteInTheLoveIsAllSection() throws InterruptedException {
        loveisAllStep.theCollapsedQuoteInTheLoveIsAllSection();
    }

    @Test
    @DisplayName("Вернутся из раздела Love is all   в предыдущий раздел используя системную кнопку назад")
    public void theyWillReturnFromTheLoveIsAllSectionToThePreviousSectionUsingTheSystemBackButton() throws InterruptedException {
        loveisAllStep.theyWillReturnFromTheLoveIsAllSection();
    }

    @Test
    @DisplayName("Скрол к седьмой тематической цитате в разделе Love is all")
    public void scrollToTheSeventhThematicQuoteInTheLoveIsAllSection() throws InterruptedException {
        loveisAllStep.scrollToTheSeventhQuoteFromTheLoveIsAllSection();
    }
}
