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
import ru.iteco.fmhandroid.ui.steps.MainStep;


@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class AuthorizationTests {

    static AuthorizationSteps authorizationSteps = new AuthorizationSteps();
    static MainStep mainStep = new MainStep();


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
    @DisplayName("Наличие поля Login  в модуле Authorization")
    public void thePresenceOfTheFieldLogin() {
        authorizationSteps.loginField();
    }

    @Test
    @DisplayName("Наличие поля Password  в модуле Authorization")
    public void thePresenceOfThePasswordField() {
        authorizationSteps.passwordField();
    }

    @Test
    @DisplayName("Наличие кнопки SIGN IN  в модуле Authorization")
    public void thePresenceOfTheSignInButton() {
        authorizationSteps.thePresenceOfTheSIGNINButton();
    }

    @Test
    @DisplayName("Авторизация в мобильном приложении используя  валидные данные зарегистрированного пользователя")
    public void validAuth() throws InterruptedException {
        authorizationSteps.validDataOfTheRegisteredUser();
        mainStep.logOut();
    }

    @Test
    @DisplayName("Авторизация в мобильном приложении используя   данные незарегистрированного пользователя")
    public void dataOfAnUnregisteredUser() {
        authorizationSteps.validDataOfAnUnregisteredUser();
    }

    @Test
    @DisplayName("При авторизации в поле Login ввести невалидное значение кириллицей")
    public void whenLoggingInEnterAnInvalidValueInCyrillicInTheLoginField() {
        authorizationSteps.enterAnInvalidValueInCyrillic();
    }

    @Test
    @DisplayName("При авторизации в поле Login ввести валидное значение, используя разный регистр")
    public void whenLoggingInEnterAValidValueInTheLoginFieldUsingADifferentCase() {
        authorizationSteps.enterAValidValueUsingADifferentCase();
    }

    @Test
    @DisplayName("При авторизации в поле Login ввести валидное значение в верхнем регистре")
    public void whenLoggingInEnterAValidUppercaseValueInTheLoginField() {
        authorizationSteps.enterAValidValueInUppercase();
    }

    @Test
    @DisplayName("При авторизации в поле Password ввести валидное значение незарегистрированного пользователя кириллицей")
    public void whenLoggingInEnterTheValidValueOfTheUnregisteredUserInCyrillicInThePasswordField() {
        authorizationSteps.enterTheValidValueOfAnUnregisteredUserInCyrillicInThePasswordField();
    }

    @Test
    @DisplayName("При авторизации в поле Password ввести валидное значение зарегистрированного пользователя, используя разный регистр")
    public void whenLoggingInEnterTheValidValueOfTheRegisteredUserInThePasswordFieldUsingADifferentCase() {
        authorizationSteps.inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingADifferentCase();
    }

    @Test
    @DisplayName("При авторизации в поле Password ввести валидное значение зарегистрированного пользователя используя, верхний регистр")
    public void whenLoggingInEnterTheValidValueOfTheRegisteredUserInThePasswordFieldUsingUppercase() {
        authorizationSteps.inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingUppercase();
    }

    @Test
    @DisplayName("Пустые поля в мобильном приложении")
    public void emptyFieldsInTheMobileApp() {
        authorizationSteps.emptyFields();
    }
}
