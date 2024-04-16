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
public class AuthorizationTests {

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
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Поле Login")
    @Test
    @DisplayName("Наличие поля Login  в модуле Authorization")
    @Description(value = "Проверяем наличие поля Login")
    public void thePresenceOfTheFieldLogin() {
        authorizationSteps.loginField();
    }


    @Epic(value = "Модуль авторизации")
    @Feature(value = "Поле Password")
    @Test
    @DisplayName("Наличие поля Password  в модуле Authorization")
    @Description(value = "Проверяем наличие поля Password")
    public void thePresenceOfThePasswordField() {
        authorizationSteps.passwordField();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Кнопка SIGN IN")
    @Test
    @DisplayName("Наличие кнопки SIGN IN  в модуле Authorization")
    @Description(value = "Проверяем наличие кнопки SIGN IN")
    public void thePresenceOfTheSignInButton() {
        authorizationSteps.thePresenceOfTheSIGNINButton();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("Авторизация в мобильном приложении используя  валидные данные зарегистрированного пользователя")
    @Description(value = "Проверяем авторизацию с использованием валидных данных зарегистрированного пользователя")
    public void validAuth() {
        authorizationSteps.validDataOfTheRegisteredUser();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("Авторизация в мобильном приложении используя данные незарегистрированного пользователя")
    @Description(value = "Проверяем авторизацию с использованием данных незарегистрированного пользователя")
    public void dataOfAnUnregisteredUser() {
        authorizationSteps.validDataOfAnUnregisteredUser();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("При авторизации в поле Login ввести невалидное значение кириллицей")
    @Description(value = "Проверяем авторизацию с введение поле Login значения кириллицей")
    public void whenLoggingInEnterAnInvalidValueInCyrillicInTheLoginField() {
        authorizationSteps.enterAnInvalidValueInCyrillic();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("При авторизации в поле Login ввести валидное значение, используя разный регистр")
    @Description(value = "Проверяем авторизацию с введение поле Login значения используя разный регистр")
    public void whenLoggingInEnterAValidValueInTheLoginFieldUsingADifferentCase() {
        authorizationSteps.enterAValidValueUsingADifferentCase();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("При авторизации в поле Login ввести валидное значение в верхнем регистре")
    @Description(value = "Проверяем авторизацию с введение поле Login значения в верхнем регистре")
    public void whenLoggingInEnterAValidUppercaseValueInTheLoginField() {
        authorizationSteps.enterAValidValueInUppercase();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("При авторизации в поле Password ввести валидное значение незарегистрированного пользователя кириллицей")
    @Description(value = "Проверяем авторизацию с введение поле Password значение незарегистрированного пользователя кириллицей")
    public void whenLoggingInEnterTheValidValueOfTheUnregisteredUserInCyrillicInThePasswordField() {
        authorizationSteps.enterTheValidValueOfAnUnregisteredUserInCyrillicInThePasswordField();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("При авторизации в поле Password ввести валидное значение зарегистрированного пользователя, используя разный регистр")
    @Description(value = "Проверяем авторизацию с введение поле Password валидное значение зарегистрированного пользователя, используя разный регистр")
    public void whenLoggingInEnterTheValidValueOfTheRegisteredUserInThePasswordFieldUsingADifferentCase() {
        authorizationSteps.inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingADifferentCase();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("При авторизации в поле Password ввести валидное значение зарегистрированного пользователя используя, верхний регистр")
    @Description(value = "Проверяем авторизацию с введение поле Password валидное значение зарегистрированного пользователя, используя верхний регистр")
    public void whenLoggingInEnterTheValidValueOfTheRegisteredUserInThePasswordFieldUsingUppercase() {
        authorizationSteps.inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingUppercase();
    }

    @Epic(value = "Модуль авторизации")
    @Feature(value = "Авторизация")
    @Test
    @DisplayName("Пустые поля в мобильном приложении")
    @Description(value = "Проверяем авторизацию с пустыми полями модуля")
    public void emptyFieldsInTheMobileApp() {
        authorizationSteps.emptyFields();
    }
}
