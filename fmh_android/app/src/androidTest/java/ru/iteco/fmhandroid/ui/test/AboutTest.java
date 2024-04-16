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
import ru.iteco.fmhandroid.ui.steps.AboutStep;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class AboutTest {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static AboutStep aboutStep = new AboutStep();
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

    @Epic(value = "Раздел About")
    @Feature(value = "Элементы раздела About")
    @Test
    @DisplayName("Отображение в  разделе About версии  мобильного приложения")
    @Description(value = "Проверяем отображение версии мобильного приложения")
    public void displayingTheVersionOfTheMobileApplicationInTheAboutSection() {
        aboutStep.goToTheAboutSectionVersion();
    }

    @Epic(value = "Раздел About")
    @Feature(value = "Элементы раздела About")
    @Test
    @DisplayName("Возврат из  раздела About в предыдущий раздел используя системную кнопку назад")
    @Description(value = "Проверяем возврат в предыдущий раздел с помощью системной кнопки назад")
    public void returnFromTheAboutSectionToThePreviousSectionUsingTheSystemBackButton() {
        aboutStep.returnFromTheAboutSection();
    }
}
