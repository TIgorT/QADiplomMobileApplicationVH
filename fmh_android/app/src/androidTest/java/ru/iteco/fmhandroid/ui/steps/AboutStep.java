package ru.iteco.fmhandroid.ui.steps;


import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import androidx.test.espresso.Espresso;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.elements.AboutElement;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;

public class AboutStep {
    static AppBarElement appBarElement = new AppBarElement();
    static AboutElement aboutElement = new AboutElement();
    static MainElement mainElement = new MainElement();

    public void goToTheAboutSectionVersion() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на Navicon кнопку ");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости раздела About");
        aboutElement.theAboutSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку About");
        aboutElement.theAboutSection.perform(click());
        Allure.step("Проверка видимости поля Version");
        aboutElement.version.check(matches(isDisplayed()));
        Allure.step("Проверка номера версии мобильного приложения");
        //Делаю проверку на номер версии мобильного приложения
        aboutElement.version.check(matches(withText("1.0.0")));
    }

    public void returnFromTheAboutSection() {
        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на Navicon кнопку");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости раздела About");
        aboutElement.theAboutSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку About");
        aboutElement.theAboutSection.perform(click());
        Allure.step("Возврат в предыдущий раздел используя системную кнопку назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости поля");
        mainElement.newsSection.check(matches(isDisplayed()));
        Allure.step("Проверка  наименования поля");
        //Делаю проверку нахождения в разделе Main
        mainElement.newsSection.check(matches(withText("News")));
    }
}
