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
import ru.iteco.fmhandroid.ui.steps.ControlPanelStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class ControlPanelTest {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static ControlPanelStep controlPanelStep = new ControlPanelStep();


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
    @DisplayName("Наличие кнопки сортировки новостей в разделе Control panel")
    public void thePresenceOfTheSortNewsButtonInTheControlPanelSection() throws InterruptedException {
        controlPanelStep.thePresenceOfTheSortNewsButton();
    }

    @Test
    @DisplayName("Наличие кнопки фильтрации новостей в разделе Control panel")
    public void thePresenceOfTheNewsFilteringButtonInTheControlPanelSection() throws InterruptedException {
        controlPanelStep.thePresenceOfTheNewsFilteringButton();
    }

    @Test
    @DisplayName("Наличие кнопки создание новости в разделе Control panel")
    public void thePresenceOfTheCreateNewsButtonInTheControlPanelSection() throws InterruptedException {
        controlPanelStep.thePresenceOfTheCreateNewsButton();
    }

    @Test
    @DisplayName("Перейти в раздел Filter news из раздела Control panel")
    public void goToTheFilterNewsSectionFromTheControlPanelSection() throws InterruptedException {
        controlPanelStep.goToTheFilterNewsSection();
    }

    @Test
    @DisplayName("Перейти в раздел Creating News из раздела Control panel")
    public void goToTheCreatingNewsSectionFromTheControlPanelSection() throws InterruptedException {
        controlPanelStep.goToTheCreatingNewsSection();
    }

    @Test
    @DisplayName("Развернуть новость в  разделе Control panels")
    public void expandTheNewsInTheControlPanelSection() throws InterruptedException {
        controlPanelStep.expandTheNews();
    }

    @Test
    @DisplayName("Свернуть новость в разделе Control panels")
    public void collapseTheNewsInTheControlPanelSection() throws InterruptedException {
        controlPanelStep.collapseTheNews();
    }

    @Test
    @DisplayName("Удалить новость из раздела  Control panels")
    public void deleteTheNewsFromTheControlPanelSection() throws InterruptedException {
        controlPanelStep.deleteANewsItem();
    }

    @Test
    @DisplayName("Отменить процес удаления новости из  раздела Control panels")
    public void cancelTheProcessOfDeletingNewsFromTheControlPanelSection() throws InterruptedException {
        controlPanelStep.cancelTheNewsDeletionProcess();
    }

    @Test
    @DisplayName("Перейти в раздел Editing News из раздела Control panels")
    public void goToTheEditingNewsSectionFromTheControlPanelSection() throws InterruptedException {
        controlPanelStep.goToTheEditingNewsSection();
    }
}
