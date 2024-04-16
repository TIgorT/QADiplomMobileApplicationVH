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
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.NewsStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class NewsTest {
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    NewsStep newsStep = new NewsStep();
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


    @Epic(value = "Раздел News")
    @Feature(value = "Элементы раздела News")
    @Test
    @DisplayName("Перейти в раздел Filter news из раздела News")
    @Description(value = "Проверяем факт перехода в раздел Filter news из раздела News")
    public void goToTheFilterNewsSectionFromTheNewsSection() {
        newsStep.theFilterNewsSection();
    }

    @Epic(value = "Раздел News")
    @Feature(value = "Элементы раздела News")
    @Test
    @DisplayName("Вернутся в раздел News из раздела Filter news, используя системную кнопку назад")
    @Description(value = "Проверяем  возврат в предыдущий раздел используя системную кнопку назад")
    public void theyWillReturnToTheNewsSectionFromTheFilterNewsSectionUsingTheSystemBackButton() {
        newsStep.returnToTheNewsSection();
    }

    @Epic(value = "Раздел News")
    @Feature(value = "Элементы раздела News")
    @Test
    @DisplayName("Перейти в раздел Control panel из раздела News")
    @Description(value = "Проверяем  переход в раздел Control panel")
    public void goToTheControlPanelSectionFromTheNewsSection() {
        newsStep.controlPanelSection();
    }

    @Epic(value = "Раздел News")
    @Feature(value = "Элементы раздела News")
    @Test
    @DisplayName("Вернутся в раздел News из раздела Control panel, используя системную кнопку назад")
    @Description(value = "Проверяем  возврат в предыдущий раздел Control panel, используя системную кнопку назад")
    public void theyWillReturnToTheNewsSectionFromTheControlPanelSectionUsingTheSystemBackButton() {
        newsStep.goBackToTheNewsSection();
    }

    @Epic(value = "Раздел News")
    @Feature(value = "Элементы раздела News")
    @Test
    @DisplayName("Развернуть новость в разделе News")
    @Description(value = "Проверяем функцию разворачивания новости в разделе News")
    public void expandTheNewsInTheNewsSection() {
        newsStep.expandTheNewNewsInTheNewsSection();
    }

    @Epic(value = "Раздел News")
    @Feature(value = "Элементы раздела News")
    @Test
    @DisplayName("Свернуть новость в разделе News")
    @Description(value = "Проверяем функцию сворачивания новости в разделе News")
    public void collapseTheNewsInTheNewsSection() {
        newsStep.collapseTheNewNewsInTheNewsSection();
    }

    @Epic(value = "Раздел News")
    @Feature(value = "Элементы раздела News")
    @Test
    @DisplayName("Вернутся из раздела News в предыдущий раздел, используя системную кнопку назад")
    @Description(value = "Проверяем возврат в предыдущий раздел используя системную кнопку назад")
    public void theyWillReturnFromTheNewsSectionToThePreviousSectionUsingTheSystemBackButton() {
        newsStep.theyWillReturnFromTheNewsSectionToThePreviousSection();
    }
}
