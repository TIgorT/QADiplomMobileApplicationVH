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
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.NewsStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class NewsTest {
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    NewsStep newsStep = new NewsStep();
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
    @DisplayName("Перейти в раздел Filter news из раздела News")
    public void goToTheFilterNewsSectionFromTheNewsSection() throws InterruptedException {
        newsStep.theFilterNewsSection();
    }

    @Test
    @DisplayName("Вернутся в раздел News из раздела Filter news, используя системную кнопку назад")
    public void theyWillReturnToTheNewsSectionFromTheFilterNewsSectionUsingTheSysteBackButton() throws InterruptedException {
        newsStep.returnToTheNewsSection();
    }

    @Test
    @DisplayName("Перейти в раздел Control panel из раздела News")
    public void goToTheControlPanelSectionFromTheNewsSection() throws InterruptedException {
        newsStep.controlPanelSection();
    }

    @Test
    @DisplayName("Вернутся в раздел News из раздела Control panel, используя системную кнопку назад")
    public void theyWillReturnToTheNewsSectionFromTheControlPanelSectionUsingTheSystemBackButton() throws InterruptedException {
        newsStep.goBackToTheNewsSection();
    }

    @Test
    @DisplayName("Развернуть новость в разделе News")
    public void expandTheNewsInTheNewsSection() throws InterruptedException {
        newsStep.expandTheNewNewsInTheNewsSection();
    }

    @Test
    @DisplayName("Свернуть новость в разделе News")
    public void collapseTheNewsInTheNewsSection() throws InterruptedException {
        newsStep.collapseTheNewNewsInTheNewsSection();
    }

    @Test
    @DisplayName("Вернутся из раздела News в предыдущий раздел, используя системную кнопку назад")
    public void theyWillReturnFromTheNewsSectionToThePreviousSectionUsingTheSystemBackButton() throws InterruptedException {
        newsStep.theyWillReturnFromTheNewsSectionToThePreviousSection();
    }
}
