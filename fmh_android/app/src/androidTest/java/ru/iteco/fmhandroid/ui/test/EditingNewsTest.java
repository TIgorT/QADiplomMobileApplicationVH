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
import ru.iteco.fmhandroid.ui.steps.EditingNewsStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class EditingNewsTest {
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    EditingNewsStep editingNewsStep = new EditingNewsStep();
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
    @DisplayName("В новости модуля Editing News изменить данные в полеCategory")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInTheCategoryField() throws InterruptedException {
        editingNewsStep.inTheNewsOfTheEditingNewsModuleChangeTheData();
    }

    @Test
    @DisplayName("В новости модуля Editing News изменить  данные в поле Title")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInTheTitleField() throws InterruptedException {
        editingNewsStep.changeTheDataInTheTitleField();
    }

    @Test
    @DisplayName("В новости модуля Editing News изменить  данные в поле Publicatio date")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInThePublicationDateField() throws InterruptedException {
        editingNewsStep.changeTheDataInThePublicationDateField();
    }

    @Test
    @DisplayName("В новости модуля Editing News изменить  данные в поле Time")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInTheTimeField() throws InterruptedException {
        editingNewsStep.changeTheDataInTheTimeField();
    }
}
