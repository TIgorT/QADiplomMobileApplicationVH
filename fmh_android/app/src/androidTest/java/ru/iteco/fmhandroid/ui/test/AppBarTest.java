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
import ru.iteco.fmhandroid.ui.steps.AppBarStep;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.MainStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class AppBarTest {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static AppBarStep appBarStep = new AppBarStep();


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
    @DisplayName("Наличие Navicon кнопки  на AppBar панели")
    public void thePresenceOfANaviconButtonOnTheAppBarPanel() {
        appBarStep.thePresenceOfTheNaviconButton();
    }

    @Test
    @DisplayName("Наличие кнопки в виде бабочки на AppBar панели")
    public void thePresenceOfAButterflyButtonOnTheAppBarPanel() {
        appBarStep.thePresenceOfAButtonInTheFormOfAButterfly();
    }

    @Test
    @DisplayName("Наличие кнопки в виде человечка  на AppBar панели")
    public void thePresenceOfAButtonInTheFormOfAManOnTheAppBarPanel() {
        appBarStep.thePresenceOfAButtonInTheFormOfAMan();
    }

    @Test
    @DisplayName("Перейти в раздел News, используя Navicon кнопку  на AppBar панели")
    public void goToTheNewsSectionUsingTheNaviconButtonOnTheAppBarPanel() {
        appBarStep.goToTheNewsSection();
    }

    @Test
    @DisplayName("Вернутся из раздела News в предыдущий раздел, используя системную кнопку назад")
    public void theyWillReturnFromTheNewsSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.theyWillReturnFromTheNewsSectionToThePreviousSection();
    }

    @Test
    @DisplayName("Перейти в раздел Main, используя Navicon кнопку  на AppBar панели")
    public void goToTheMainSectionUsingTheNaviconButtonOnTheAppBarPanel() {
        appBarStep.goToTheMainSection();
    }

    @Test
    @DisplayName("Вернутся из раздела Main в предыдущий раздел, используя системную кнопку назад")
    public void theyWillReturnFromTheMainSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.theyWillReturnFromTheMainSectionToThePreviousSection();
    }

    @Test
    @DisplayName("Перейти в раздел About, используя Navicon кнопку  на AppBar панели")
    public void goToTheAboutSectionUsingTheNaviconButtonOnTheAppBarPanel() {
        appBarStep.goToTheAboutSection();
    }

    @Test
    @DisplayName("Вернутся из раздела About в предыдущий раздел, используя системную кнопку назад")
    public void theyWillReturnFromTheAboutSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.theyWillReturnFromTheAboutSectionToThePreviousSection();
    }


    @Test
    @DisplayName("Перейти в раздел Love is all, используя кнопку в виде бабочки  на AppBar панели")
    public void goToTheLoveIsAllSectionUsingTheButterflyButtonOnTheAppBarPanel() {
        appBarStep.goToTheLoveIsAllSection();
    }

    @Test
    @DisplayName("Вернутся в раздел Love is all в предыдущий раздел, используя системную кнопку назад")
    public void goBackToTheLoveIsAllSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.goBackToTheLoveIsAllSectionInThePreviousSection();
    }

    @Test
    @DisplayName("Выйти из аккаунта, используя кнопку в виде человечка  на AppBar панели")
    public void logOutOfYourAccountUsingTheManShapedButtonOnTheAppBarPanel() {
        appBarStep.logOutOfYourAccount();
    }

    @Test
    @DisplayName("Выйти из аккаунта используя системную кнопку назад")
    public void logOutOfYourAccountUsingTheSystemBackButton() {
        appBarStep.logOutOfYourAccountUsingTheSystemButton();
    }
}
