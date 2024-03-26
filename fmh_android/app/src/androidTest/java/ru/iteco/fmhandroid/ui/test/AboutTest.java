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
import ru.iteco.fmhandroid.ui.steps.AboutStep;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.MainStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class AboutTest {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static AboutStep aboutStep = new AboutStep();
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
    @DisplayName("Отображениев  раздел About версии  мобильного приложения ")
    public void displayingTheVersionOfTheMobileApplicationInTheAboutSection() throws InterruptedException {
        aboutStep.goToTheAboutSectionVersion();
    }

    @Test
    @DisplayName("Возврат из  раздела About в предыдущий раздел используя системную кнопку назад")
    public void returnFromTheAboutSectionToThePreviousSectionUsingTheSystemBackButton() throws InterruptedException {
        aboutStep.returnFromTheAboutSection();
    }
}
