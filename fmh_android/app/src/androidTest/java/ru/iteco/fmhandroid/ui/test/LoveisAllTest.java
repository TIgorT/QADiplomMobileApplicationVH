package ru.iteco.fmhandroid.ui.test;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Epic;
import io.qameta.allure.kotlin.Feature;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.LoveisAllStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class LoveisAllTest {
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    LoveisAllStep loveisAllStep = new LoveisAllStep();
    static SplashScreenStep splashScreenStep = new SplashScreenStep();

    @Rule
    public ActivityTestRule<AppActivity> mActivityTestRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void checkingTheLogout() {
        splashScreenStep.downloadPage();
        try {
            authorizationSteps.loadingTheAuthorizationModule();
        } catch (Exception e) {
            mainStep.logOut();
        }
        authorizationSteps.authorization();
    }

    @Epic(value = "Раздел Love is all")
    @Feature(value = "Элементы раздела Love is all")
    @Test
    @DisplayName("Развернуть тематическую цитату в разделе Love is all")
    @Description(value = "Проверяем функцию разворачивания тематической цитаты")
    public void expandTheThematicQuoteInTheLoveIsAllSection() {
        loveisAllStep.quoteInTheSectionLoveIsAll();
    }

    @Epic(value = "Раздел Love is all")
    @Feature(value = "Элементы раздела Love is all")
    @Test
    @DisplayName("Свернуть тематическую цитату в разделе Love is all")
    @Description(value = "Проверка функции сворачивания тематической цитаты")
    public void collapseTheThematicQuoteInTheLoveIsAllSection() {
        loveisAllStep.theCollapsedQuoteInTheLoveIsAllSection();
    }

    @Epic(value = "Раздел Love is all")
    @Feature(value = "Элементы раздела Love is all")
    @Test
    @DisplayName("Вернутся из раздела Love is all в предыдущий раздел используя системную кнопку назад")
    @Description(value = "Проверка функции возврата в предыдущий раздел с помощью системной кнопки назад")
    public void theyWillReturnFromTheLoveIsAllSectionToThePreviousSectionUsingTheSystemBackButton() {
        loveisAllStep.theyWillReturnFromTheLoveIsAllSection();
    }

    @Epic(value = "Раздел Love is all")
    @Feature(value = "Элементы раздела Love is all")
    @Test
    @DisplayName("Скрол к седьмой тематической цитате в разделе Love is all")
    @Description(value = "Проверка функции скрола")
    public void scrollToTheSeventhThematicQuoteInTheLoveIsAllSection() {
        loveisAllStep.scrollToTheSeventhQuoteFromTheLoveIsAllSection();
    }
}
