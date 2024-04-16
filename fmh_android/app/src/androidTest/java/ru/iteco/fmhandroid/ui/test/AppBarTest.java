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
import ru.iteco.fmhandroid.ui.steps.AppBarStep;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.MainStep;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class AppBarTest {
    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();
    static AppBarStep appBarStep = new AppBarStep();
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


    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Наличие Navicon кнопки  на AppBar панели")
    @Description(value = "Проверяем  наличие Navicon кнопки")
    public void thePresenceOfANaviconButtonOnTheAppBarPanel() {
        appBarStep.thePresenceOfTheNaviconButton();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Наличие кнопки в виде бабочки на AppBar панели")
    @Description(value = "Проверяем  наличие кнопки в виде бабочки")
    public void thePresenceOfAButterflyButtonOnTheAppBarPanel() {
        appBarStep.thePresenceOfAButtonInTheFormOfAButterfly();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Наличие кнопки в виде человечка  на AppBar панели")
    @Description(value = "Проверяем  наличие кнопки в виде человечка")
    public void thePresenceOfAButtonInTheFormOfAManOnTheAppBarPanel() {
        appBarStep.thePresenceOfAButtonInTheFormOfAMan();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Перейти в раздел News, используя Navicon кнопку  на AppBar панели")
    @Description(value = "Проверяем переход в раздел News через панель AppBar")
    public void goToTheNewsSectionUsingTheNaviconButtonOnTheAppBarPanel() {
        appBarStep.goToTheNewsSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Вернутся из раздела News в предыдущий раздел, используя системную кнопку назад")
    @Description(value = "Проверяем возврат из раздела News в предыдущий раздел, используя системную кнопку назад")
    public void theyWillReturnFromTheNewsSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.theyWillReturnFromTheNewsSectionToThePreviousSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Перейти в раздел Main, используя Navicon кнопку  на AppBar панели")
    @Description(value = "Проверяем переход в раздел Main, используя Navicon кнопку")
    public void goToTheMainSectionUsingTheNaviconButtonOnTheAppBarPanel() {
        appBarStep.goToTheMainSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Вернутся из раздела Main в предыдущий раздел, используя системную кнопку назад")
    @Description(value = "Проверяем возврат из  раздела Main, в предыдущий раздел, используя системную кнопку назад")
    public void theyWillReturnFromTheMainSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.theyWillReturnFromTheMainSectionToThePreviousSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Перейти в раздел About, используя Navicon кнопку  на AppBar панели")
    @Description(value = "Проверяем переход в раздел About используя  кнопку Navicon")
    public void goToTheAboutSectionUsingTheNaviconButtonOnTheAppBarPanel() {
        appBarStep.goToTheAboutSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Вернутся из раздела About в предыдущий раздел, используя системную кнопку назад")
    @Description(value = "Проверяем возврат из раздела About в предыдущий раздел, используя системную кнопку назад")
    public void theyWillReturnFromTheAboutSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.theyWillReturnFromTheAboutSectionToThePreviousSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Перейти в раздел Love is all, используя кнопку в виде бабочки  на AppBar панели")
    @Description(value = "Проверяем переход в раздел Love is all")
    public void goToTheLoveIsAllSectionUsingTheButterflyButtonOnTheAppBarPanel() {
        appBarStep.goToTheLoveIsAllSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Вернутся в раздел Love is all в предыдущий раздел, используя системную кнопку назад")
    @Description(value = "Проверяем возврат в предыдущий раздел, используя системную кнопку назад")
    public void goBackToTheLoveIsAllSectionToThePreviousSectionUsingTheSystemBackButton() {
        appBarStep.goBackToTheLoveIsAllSectionInThePreviousSection();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Выйти из аккаунта, используя кнопку в виде человечка  на AppBar панели")
    @Description(value = "Проверяем выход из системы")
    public void logOutOfYourAccountUsingTheManShapedButtonOnTheAppBarPanel() {
        appBarStep.logOutOfYourAccount();
    }

    @Epic(value = "Раздел App Bar")
    @Feature(value = "Элементы раздела App Bar")
    @Test
    @DisplayName("Выйти из аккаунта используя системную кнопку назад")
    @Description(value = "Проверяем выход из системы, используя системную кнопку назад")
    public void logOutOfYourAccountUsingTheSystemBackButton() {
        appBarStep.logOutOfYourAccountUsingTheSystemButton();
    }
}
