package ru.iteco.fmhandroid.ui.test;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
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
import ru.iteco.fmhandroid.ui.steps.EditingNewsStep;
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class EditingNewsTest {
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    MainStep mainStep = new MainStep();
    EditingNewsStep editingNewsStep = new EditingNewsStep();
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
        editingNewsStep.creatingTestNews();
    }

    @After
    public void cleanUpAfterOurselves() {
        editingNewsStep.deletingTestNews();
    }


    @Epic(value = "Модуль Editing News")
    @Feature(value = "Элементы модуля Editing News ")
    @Test
    @DisplayName("В новости модуля Editing News изменить данные в поле Category")
    @Description(value = "Проверяем изменения данных в поле Category")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInTheCategoryField() {
        editingNewsStep.inTheNewsOfTheEditingNewsModuleChangeTheData();
    }

    @Epic(value = "Модуль Editing News")
    @Feature(value = "Элементы модуля Editing News ")
    @Test
    @DisplayName("В новости модуля Editing News изменить  данные в поле Title")
    @Description(value = "Проверяем изменения данных в поле Title")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInTheTitleField() {
        editingNewsStep.changeTheDataInTheTitleField();
    }

    @Epic(value = "Модуль Editing News")
    @Feature(value = "Элементы модуля Editing News ")
    @Test
    @DisplayName("В новости модуля Editing News изменить  данные в поле Publicatio date")
    @Description(value = "Проверяем изменения данных в поле Publicatio date")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInThePublicationDateField() {
        editingNewsStep.changeTheDataInThePublicationDateField();
    }

    @Epic(value = "Модуль Editing News")
    @Feature(value = "Элементы модуля Editing News ")
    @Test
    @DisplayName("В новости модуля Editing News изменить  данные в поле Time")
    @Description(value = "Проверяем изменения данных в поле Time")
    public void inTheNewsOfTheEditingNewsModuleChangeTheDataInTheTimeField() {
        editingNewsStep.changeTheDataInTheTimeField();
    }
}
