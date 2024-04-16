package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;

import static ru.iteco.fmhandroid.ui.data.Utils.waitDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;

public class AuthorizationSteps {

    static AuthorizationModule authorizationModule = new AuthorizationModule();
    static MainStep mainStep = new MainStep();

    public void isAuthorizationScreen() {
        authorizationModule.authorizationModule.check(matches(isDisplayed()));
    }

    public void loadingTheAuthorizationModule() {
        onView(isRoot()).perform(waitDisplayed(R.id.enter_button, 8000));
    }

    public void authorization() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        Allure.step("Проверка видимости кнопки SIGN IN");
        authorizationModule.signInButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Ожидание элемента c Id: main_menu_image_button");
        onView(isRoot()).perform(waitDisplayed(R.id.main_menu_image_button, 3000));
    }

    public void validDataOfTheRegisteredUser() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        Allure.step("Проверка видимости кнопки SIGN IN");
        authorizationModule.signInButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Ожидание локатора R.id.main_menu_image_button");
        onView(isRoot()).perform(waitDisplayed(R.id.main_menu_image_button, 500));
        Allure.step("Проверка - переход в раздел Main");
        // Делаю проверку перехода в раздел Main;
        mainStep.theMainSection();
    }

    public void loginField() {
        Allure.step("Поле Login в авторизационном модуле");
        // Делаю проверку отображения поля логин;
        authorizationModule.login.check(matches(isDisplayed()));
    }

    public void passwordField() {
        Allure.step("Поле Password в авторизационном модуле");
        //Делаю проверку отображения поля пароль;
        authorizationModule.password.check(matches(isDisplayed()));
    }

    public void thePresenceOfTheSIGNINButton() {
        Allure.step("Кнопка SIGN IN в авторизационном модуле");
        //Делаю проверку отображения кнопки SIGN IN;
        authorizationModule.signInButton.check(matches(isDisplayed()));
    }

    public void validDataOfAnUnregisteredUser() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.invalidLogin()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.invalidPassword()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterAnInvalidValueInCyrillic() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.invalidLogin()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterAValidValueUsingADifferentCase() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.invalidLoginDifferentCase()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterAValidValueInUppercase() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.validLoginInUppercase()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterTheValidValueOfAnUnregisteredUserInCyrillicInThePasswordField() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.invalidPassword()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingADifferentCase() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.invalidPasswordDifferentCase()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingUppercase() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Login");
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Ввод данных в поле Password");
        authorizationModule.password.perform(replaceText(Data.validPasswordInUppercase()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void emptyFields() {
        Allure.step("Проверка видимости поля Login");
        authorizationModule.login.check(matches(isDisplayed()));
        Allure.step("Проверка видимости поля Password");
        authorizationModule.password.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SIGN IN");
        authorizationModule.signInButton.perform(click());
        Allure.step("Отображение ошибки входа");
        // Делаю проверку  отображения ошибки;
        authorizationModule.emptyToast(R.string.empty_login_or_password).check(matches(isDisplayed()));
    }
}
