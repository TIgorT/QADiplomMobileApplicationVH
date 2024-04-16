package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.fail;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoActivityResumedException;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.elements.AboutElement;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;
import ru.iteco.fmhandroid.ui.elements.LoveIsAllElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class AppBarStep {
    static AppBarElement appBarElement = new AppBarElement();
    AuthorizationModule authorizationModule = new AuthorizationModule();
    static NewsElement newsElement = new NewsElement();
    static MainElement mainElement = new MainElement();
    static AboutElement aboutElement = new AboutElement();
    static LoveIsAllElement loveIsAllElement = new LoveIsAllElement();


    public void thePresenceOfTheNaviconButton() {
        Allure.step("Проверка отображения Navicon кнопки");
        //Проверка отображения Navicon кнопки  на AppBar панели;
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
    }

    public void thePresenceOfAButtonInTheFormOfAButterfly() {
        Allure.step("Проверка отображения кнопки с id: our_mission_image_button");
        // Проверка отображения кнопки в виде бабочки на AppBar панели;
        appBarElement.butterflyButtons.check(matches(isDisplayed()));
    }

    public void thePresenceOfAButtonInTheFormOfAMan() {
        Allure.step("Проверка отображения кнопки с id: authorization_image_button");
        //Проверка отображения кнопки в виде человечка на AppBar панели;
        appBarElement.buttonsInTheFormOfAMan.check(matches(isDisplayed()));
    }

    public void goToTheNewsSection() {
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости элемента из раздела News");
        // Делаю проверку  нахождения в разделе News;
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела News");
        //Делаю проверку на название элемента  из раздела News
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void theyWillReturnFromTheNewsSectionToThePreviousSection() {
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Возврат в предыдущий раздел используя системную кнопку назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости элемента из раздела Main");
        // Делаю проверку видимости элемента (Нахождения в разделе Main);
        mainElement.newsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела Main");
        //Делаю проверку на название элемента из раздела  Main;
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void goToTheMainSection() {
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения раздела Main");
        newsElement.theMainSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Main");
        newsElement.theMainSection.perform(click());
        Allure.step("Проверка видимости элемента из раздела Main");
        //Делаю проверку видимости элемента (Нахождения в разделе Main);
        mainElement.newsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела Main");
        //Делаю проверку на название элемента из раздела  Main;
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void theyWillReturnFromTheMainSectionToThePreviousSection() {
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения раздела News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения раздела Main");
        newsElement.theMainSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Main");
        newsElement.theMainSection.perform(click());
        Allure.step("Возврат в предыдущий раздел используя системную кнопку назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости элемента из раздела News");
        // Делаю проверку  нахождения в разделе News;
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела News");
        //Делаю проверку на название элемента  из раздела News
        newsElement.theNewsSection.check(matches(withText("News")));
    }

    public void goToTheAboutSection() {
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения About кнопки");
        aboutElement.theAboutSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку About");
        aboutElement.theAboutSection.perform(click());
        Allure.step("Проверка видимости элемента из раздела About");
        // Делаю проверку  нахождения в разделе About;
        aboutElement.applicationVersion.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела About");
        //Делаю проверку на название элемента  из раздела About
        aboutElement.applicationVersion.check(matches(withText("Version:")));
    }

    public void theyWillReturnFromTheAboutSectionToThePreviousSection() {
        Allure.step("Проверка отображения Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка отображения About кнопки");
        aboutElement.theAboutSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку About");
        aboutElement.theAboutSection.perform(click());
        Allure.step("Возврат в предыдущий раздел используя системную кнопку назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости элемента из раздела Main");
        // Делаю проверку видимости элемента (Нахождения в разделе Main);
        mainElement.newsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела Main");
        //Делаю проверку на название элемента из раздела  Main;
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void goToTheLoveIsAllSection() {
        Allure.step("Проверка отображения  кнопки c Id:our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку c Id:our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Allure.step("Проверка отображения элемента из раздела Love is all");
        //Делаю проверку видимости элемента (Нахождения в разделе Love is all);
        loveIsAllElement.sectionTitle.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела Love is all");
        //Делаю проверку на название элемента из раздела  Love is all;
        loveIsAllElement.sectionTitle.check(matches(withText("Love is all")));
    }

    public void goBackToTheLoveIsAllSectionInThePreviousSection() {
        Allure.step("Проверка отображения  кнопки c Id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку c Id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Allure.step("Возврат в предыдущий раздел используя системную кнопку назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости элемента из раздела Main");
        // Делаю проверку видимости элемента (Нахождения в разделе Main);
        mainElement.newsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из раздела Main");
        //Делаю проверку на название элемента из раздела  Main;
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void logOutOfYourAccount() {
        Allure.step("Проверка отображения  кнопки c Id: authorization_image_button");
        mainElement.exitTheApplicationButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку c Id: authorization_image_button");
        mainElement.exitTheApplicationButton.perform(click());
        Allure.step("Проверка отображения  кнопки Log out");
        mainElement.logOut.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку Log out");
        mainElement.logOut.perform(click());
        Allure.step("Проверка видимости элемента из модуля Авторизация");
        // Делаю проверку нахождения в модуле авторизация;
        authorizationModule.authorizationModule.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из модуля Авторизация");
        // Делаю проверку названия элемента в модуле авторизация;
        authorizationModule.authorizationModule.check(matches(withText("Authorization")));
    }

    public void logOutOfYourAccountUsingTheSystemButton() {
        Allure.step("Выход из системы используя системную кнопку назад");
        Espresso.pressBack();
        try {
            Espresso.pressBack();
            fail("Should have thrown NoActivityResumedException");
        } catch (NoActivityResumedException expected) {
        }

    }
}
