package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;

public class AuthorizationSteps {

    static AuthorizationModule authorizationModule = new AuthorizationModule();
    static MainStep mainStep = new MainStep();

    public void isAuthorizationScreen() {
        authorizationModule.authorizationModule.check(matches(isDisplayed()));
    }

    public void authorization() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        authorizationModule.signInButton.perform(click());
    }

    public void validDataOfTheRegisteredUser() throws InterruptedException {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        authorizationModule.signInButton.check(matches(isDisplayed()));
        authorizationModule.signInButton.perform(click());
        Thread.sleep(1000);
        mainStep.theMainSection();
    }

    public void loginField() {
        authorizationModule.login.check(matches(isDisplayed()));
    }

    public void passwordField() {
        authorizationModule.password.check(matches(isDisplayed()));
    }

    public void thePresenceOfTheSIGNINButton() {
        authorizationModule.signInButton.check(matches(isDisplayed()));
    }

    public void validDataOfAnUnregisteredUser() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.invalidLogin()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.invalidPassword()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterAnInvalidValueInCyrillic() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.invalidLogin()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterAValidValueUsingADifferentCase() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.invalidLoginDifferentCase()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterAValidValueInUppercase() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.validLoginInUppercase()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.validPassword()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void enterTheValidValueOfAnUnregisteredUserInCyrillicInThePasswordField() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.invalidPassword()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingADifferentCase() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.invalidPasswordDifferentCase()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void inThePasswordFieldEnterTheValidValueOfTheRegisteredUserUsingUppercase() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.login.perform(replaceText(Data.validLogin()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.password.perform(replaceText(Data.validPasswordInUppercase()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.error).check(matches(isDisplayed()));
    }

    public void emptyFields() {
        authorizationModule.login.check(matches(isDisplayed()));
        authorizationModule.password.check(matches(isDisplayed()));
        authorizationModule.signInButton.perform(click());
        authorizationModule.emptyToast(R.string.empty_login_or_password).check(matches(isDisplayed()));
    }
}
