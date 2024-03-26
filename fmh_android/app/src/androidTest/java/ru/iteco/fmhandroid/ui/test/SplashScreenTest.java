package ru.iteco.fmhandroid.ui.test;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.SplashScreenStep;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class SplashScreenTest {
    SplashScreenStep splashScreenStep = new SplashScreenStep();
    @Rule
    public ActivityTestRule<AppActivity> mActivityTestRule =
            new ActivityTestRule<>(AppActivity.class);

    @Test
    @DisplayName("Отображение загрузочной картинки")
    public void displayingTheLoadingImage() {
        splashScreenStep.displayingTheLoadingImageInSplashScreen();
    }

    @Test
    @DisplayName("Отображение статуса загрузки")
    public void displayingTheDownloadStatus() {
        splashScreenStep.displayingTheDownloadStatusInSplashScreen();
    }

    @Test
    @DisplayName("Отображение цитаты при загрузке")
    public void displayingAQuoteWhenDownloading() {
        splashScreenStep.displayingAQuoteWhenDownloadingInSplashScreen();
    }

}
