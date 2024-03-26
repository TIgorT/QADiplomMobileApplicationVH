package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import ru.iteco.fmhandroid.ui.elements.SplashScreenElement;

public class SplashScreenStep {
    SplashScreenElement splashScreenElement = new SplashScreenElement();

    public void displayingTheLoadingImageInSplashScreen() {
        splashScreenElement.splashScreenPicture.check(matches(isDisplayed()));
    }

    public void displayingTheDownloadStatusInSplashScreen() {
        splashScreenElement.theIconForLoadingTheScreensaver.check(matches(isDisplayed()));
    }

    public void displayingAQuoteWhenDownloadingInSplashScreen() {
        splashScreenElement.downloadText.check(matches(isDisplayed()));
    }
}
