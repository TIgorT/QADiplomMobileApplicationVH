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
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class MainTest {

    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
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


    @Epic(value = "Раздел Main")
    @Feature(value = "Элементы раздела Main")
    @Test
    @DisplayName("Свернуть список  модуля News")
    @Description(value = "Проверяем  состояние списка модуля News в разделе Main")
    public void collapseTheListOfTheNewsModule() {
        mainStep.listOfTheNewsModule();
    }

    @Epic(value = "Раздел Main")
    @Feature(value = "Элементы раздела Main")
    @Test
    @DisplayName("Развернуть список  модуля News")
    @Description(value = "Проверка видимости кнопки All News в разделе Main")
    public void theExpandedListOfTheNewsModule() {
        mainStep.theExpandedListOfTheNewsModule();
    }

    @Epic(value = "Раздел Main")
    @Feature(value = "Элементы раздела Main")
    @Test
    @DisplayName("Перейти в раздел News из раздела Main, используя объёмную кнопку - ALL NEWS")
    @Description(value = "Проверка перехода в раздел Main")
    public void goToTheNewsSectionFromTheMainSectionUsingTheVolumeButtonAllNews() {
        mainStep.goToTheNewsSectionFromTheMainSection();
    }

    @Epic(value = "Раздел Main")
    @Feature(value = "Элементы раздела Main")
    @Test
    @DisplayName("Отображение новости в разделе Main")
    @Description(value = "Проверка отображения созданой новости в разделе Main")
    public void displayingTheNewsInTheMainSection() {
        mainStep.newsInTheMainSection();
    }

    @Epic(value = "Раздел Main")
    @Feature(value = "Элементы раздела Main")
    @Test
    @DisplayName("Развернуть новость в разделе Main")
    @Description(value = "Проверка функции разворачивания новости в разделе Main")
    public void expandTheNewsInTheMainSection() {
        mainStep.expandTheNews();
    }

    @Epic(value = "Раздел Main")
    @Feature(value = "Элементы раздела Main")
    @Test
    @DisplayName("Свернуть новость в разделе Main")
    @Description(value = "Проверка сворачивания новости в разделе News")
    public void collapseTheNewsInTheMainSection() {
        mainStep.collapseTheNews();
    }

}
