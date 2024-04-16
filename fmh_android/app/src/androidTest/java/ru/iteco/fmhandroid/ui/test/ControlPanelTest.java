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
import ru.iteco.fmhandroid.ui.steps.ControlPanelStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class ControlPanelTest {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static ControlPanelStep controlPanelStep = new ControlPanelStep();
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

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Наличие кнопки сортировки новостей в разделе Control panel")
    @Description(value = "Проверяем наличие кнопки сортировки в разделе Control panel")
    public void thePresenceOfTheSortNewsButtonInTheControlPanelSection() {
        controlPanelStep.thePresenceOfTheSortNewsButton();
    }

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Наличие кнопки фильтрации новостей в разделе Control panel")
    @Description(value = "Проверяем наличие кнопки фильтрации новостей в разделе Control panel")
    public void thePresenceOfTheNewsFilteringButtonInTheControlPanelSection() {
        controlPanelStep.thePresenceOfTheNewsFilteringButton();
    }

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Наличие кнопки создание новости в разделе Control panel")
    @Description(value = "Проверяем наличие кнопки создание новости в разделе Control panel")
    public void thePresenceOfTheCreateNewsButtonInTheControlPanelSection() {
        controlPanelStep.thePresenceOfTheCreateNewsButton();
    }

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Перейти в раздел Filter news из раздела Control panel")
    @Description(value = "Проверяем переход в раздел Filter news из раздела Control panel")
    public void goToTheFilterNewsSectionFromTheControlPanelSection() {
        controlPanelStep.goToTheFilterNewsSection();
    }

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Перейти в раздел Creating News из раздела Control panel")
    @Description(value = "Проверяем переход в модуль Creating News из раздела Control panel")
    public void goToTheCreatingNewsSectionFromTheControlPanelSection() {
        controlPanelStep.goToTheCreatingNewsSection();
    }

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Развернуть новость в  разделе Control panels")
    @Description(value = "Проверяем функцию разворачивания новости в разделе Control panels")
    public void expandTheNewsInTheControlPanelSection() {
        controlPanelStep.expandTheNews();
    }

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Свернуть новость в разделе Control panels")
    @Description(value = "Проверяем функцию сворачивания новости в разделе Control panels")
    public void collapseTheNewsInTheControlPanelSection() {
        controlPanelStep.collapseTheNews();
    }

    @Epic(value = "Раздел Control panel")
    @Feature(value = "Элементы раздела Control panel")
    @Test
    @DisplayName("Удалить новость из раздела  Control panels")
    @Description(value = "Проверяем функцию удаления новости")
    public void deleteTheNewsFromTheControlPanelSection() {
        controlPanelStep.deleteANewsItem();
    }

    @Test
    @DisplayName("Отменить процес удаления новости из  раздела Control panels")
    public void cancelTheProcessOfDeletingNewsFromTheControlPanelSection() {
        controlPanelStep.cancelTheNewsDeletionProcess();
    }

    @Test
    @DisplayName("Перейти в раздел Editing News из раздела Control panels")
    public void goToTheEditingNewsSectionFromTheControlPanelSection() {
        controlPanelStep.goToTheEditingNewsSection();
    }
}
