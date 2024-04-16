package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;

import static ru.iteco.fmhandroid.ui.data.Utils.waitDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.elements.SplashScreenElement;

public class SplashScreenStep {
    SplashScreenElement splashScreenElement = new SplashScreenElement();

    public void downloadPage() {
        onView(isRoot()).perform(waitDisplayed(R.id.splashscreen_image_view, 8_000));
    }

    public void displayingTheLoadingImageInSplashScreen() {
        Allure.step("Проверка видимости загрузочной картинки");
        //Делаю проверку видимости загрузочной картинки
        splashScreenElement.splashScreenPicture.check(matches(isDisplayed()));
    }

    public void displayingTheDownloadStatusInSplashScreen() {
        Allure.step("Проверка видимости статуса загрузки");
        // Делаю проверку статуса загрузки
        splashScreenElement.theIconForLoadingTheScreensaver.check(matches(isDisplayed()));
    }

    public void displayingAQuoteWhenDownloadingInSplashScreen() {
        Allure.step("Проверка видимости цитаты загрузки");
        //Делаю проверку цитаты загрузки
        splashScreenElement.downloadText.check(matches(isDisplayed()));
    }
}
