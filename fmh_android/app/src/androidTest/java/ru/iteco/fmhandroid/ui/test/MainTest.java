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

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class MainTest {

    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();


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
    @DisplayName("Свернуть список  модуля News")
    public void collapseTheListOfTheNewsModule() {
        mainStep.listOfTheNewsModule();
    }

    @Test
    @DisplayName("Развернуть список  модуля News")
    public void theExpandedListOfTheNewsModule() {
        mainStep.theExpandedListOfTheNewsModule();
    }

    @Test
    @DisplayName("Перейти в раздел News из раздела Main, используя объёмную кнопку - ALL NEWS")
    public void goToTheNewsSectionFromTheMainSectionUsingTheVolumeButtonAllNews() {
        mainStep.goToTheNewsSectionFromTheMainSection();
    }

    @Test
    @DisplayName("Отображение новости в разделе Main")
    public void displayingTheNewsInTheMainSection() throws InterruptedException {
        mainStep.newsInTheMainSection();
    }

    @Test
    @DisplayName("Развернуть новость в разделе Main")
    public void expandTheNewsInTheMainSection() throws InterruptedException {
        mainStep.expandTheNews();
    }

    @Test
    @DisplayName("Свернуть новость в разделе Main")
    public void collapseTheNewsInTheMainSection() throws InterruptedException {
        mainStep.collapseTheNews();
    }


}
