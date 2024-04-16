package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.not;

import static ru.iteco.fmhandroid.ui.data.Utils.forceClick;
import static ru.iteco.fmhandroid.ui.data.Utils.waitDisplayed;

import androidx.test.espresso.matcher.RootMatchers;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.AuthorizationModule;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class MainStep {
    static MainElement mainElement = new MainElement();
    static AuthorizationModule authorizationModule = new AuthorizationModule();
    static NewsElement newsElement = new NewsElement();
    static AppBarElement appBarElement = new AppBarElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();

    public void theMainSection() {
        mainElement.newsSection.check(matches(isDisplayed()));
    }

    public void logOut() {
        mainElement.exitTheApplicationButton.perform(click());
        mainElement.logOut.perform(click());
        authorizationModule.authorizationModule.check(matches(isDisplayed()));
    }


    public void listOfTheNewsModule() {
        Allure.step("Проверка видимости кнопки с id: expand_material_button");
        mainElement.theCheckmarkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: expand_material_button");
        mainElement.theCheckmarkButton.perform(click());
        Allure.step("Проверка свёрнутого списка");
        //Делаю проверку, что список News в разделе Main  свёрнут;
        mainElement.theAllNewsButton.check(matches(not(isDisplayed())));
    }

    public void theExpandedListOfTheNewsModule() {
        Allure.step("Проверка видимости кнопки с id: expand_material_button");
        mainElement.theCheckmarkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: expand_material_button");
        mainElement.theCheckmarkButton.perform(click());
        Allure.step("Повторное нажатие на кнопку с id: expand_material_button");
        mainElement.theCheckmarkButton.perform(click());
        Allure.step("Проверка видимости развё списка, кнопки All News");
        //Делаю проверку видимости кнопки All News;
        mainElement.theAllNewsButton.check(matches(isDisplayed()));
        Allure.step("Проверка видимости в развёрнутом списке, кнопки All News");
        //Делаю проверку видимости кнопки All News;
        mainElement.theAllNewsButton.check(matches(withText("ALL NEWS")));
    }

    public void goToTheNewsSectionFromTheMainSection() {
        Allure.step("Проверка видимости кнопки All News");
        mainElement.theAllNewsButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку All News");
        mainElement.theAllNewsButton.perform(click());
        Allure.step("Проверка видимости поля в разделе News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия поля в разделе News");
        newsElement.theNewsSection.check(matches(withText("News")));
    }


    public void creatingTestNews() {
        Allure.step("Проверка видимости кнопки Navicon");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории объявление");
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории объявление");
        creatingNewsElement.theCategoryAnnouncement.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Очистка поля Title от сообщения");
        creatingNewsElement.titleField.perform(clearText());
        Allure.step("Заполнение поля Title");
        creatingNewsElement.titleField.perform(replaceText(Data.theNameOfTheNews()));
        Allure.step("Проверка сообщения в поле Title");
        creatingNewsElement.titleField.check(matches(withText(Data.theNameOfTheNews())));
        Allure.step("Проверка видимости поля Publication date");
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Publication date");
        creatingNewsElement.thePublicationDateField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости поля Description");
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Description");
        creatingNewsElement.descriptionField.perform(click());
        Allure.step("Заполнение поля Description");
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()));
        Allure.step("Проверка видимости кнопки SAVE");
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        creatingNewsElement.theSaveButton.perform(click());
    }

    public void deletingTestNews() {
        Allure.step("Проверка видимости кнопки Navicon");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки News");
        newsElement.theNewsSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку News");
        newsElement.theNewsSection.perform(click());
        Allure.step("Проверка видимости кнопки с id: edit_news_material_button");
        newsElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_material_button");
        newsElement.aPencilShapedButton.perform(click());
        Allure.step("Проверка видимости кнопки с id: delete_news_item_image_view");
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: delete_news_item_image_view");
        controlPanelElement.deleteANewsItem.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        controlPanelElement.theOkButton.perform(click());
    }

    public void newsInTheMainSection() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingTestNews();

        Allure.step("Проверка видимости Navicon кнопки ");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки Main");
        newsElement.theMainSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Main");
        newsElement.theMainSection.perform(click());

        // Проверка данного теста;

        Allure.step("Ожидания элементов id:main_menu_image_button");
        onView(isRoot()).perform(waitDisplayed(R.id.news_item_material_card_view, 3000));
        Allure.step("Проверка видимости названия новости");
        // Делаю проверку  видимости созданной новости в разделе Main;
        mainElement.theNameOfTheNewsInTheMainSection.check(matches(isDisplayed()));
        Allure.step("Проверка правильного написания  названия новости");
        mainElement.theNameOfTheNewsInTheMainSection.check(matches(withText(Data.theNameOfTheNews())));

        // Очистка мобильного приложения после теста (удаление созданной новости);
        Allure.step("Удаление тестовой новости");
        deletingTestNews();
    }

    public void expandTheNews() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingTestNews();

        Allure.step("Проверка видимости Navicon кнопки ");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки Main");
        newsElement.theMainSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Main");
        newsElement.theMainSection.perform(click());
        Allure.step("Проверка видимости кнопки, разворачивающей новость в разделе Main");
        mainElement.expandTheNewsInTheMainSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку, разворачивающую новость в разделе Main");
        mainElement.expandTheNewsInTheMainSection.perform(actionOnItemAtPosition(0, click()));

        // Проверка данного теста;

        Allure.step("Ожидания элементов id:main_menu_image_button");
        onView(isRoot()).perform(waitDisplayed(R.id.news_item_material_card_view, 5000));
        Allure.step("Проверка видимости  содержания новости в разделе Main");
        mainElement.theContentOfTheNews.check(matches(isDisplayed()));
        Allure.step("Проверка правильного написания  содержания новости");
        mainElement.theContentOfTheNews.check(matches(withText(Data.descriptionOfTheNews())));

        // Очистка мобильного приложения после теста (удаление созданной новости);
        Allure.step("Удаление тестовой новости");
        deletingTestNews();

    }

    public void collapseTheNews() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingTestNews();

        Allure.step("Проверка видимости Navicon кнопки");
        appBarElement.buttonNavicon.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Navicon");
        appBarElement.buttonNavicon.perform(click());
        Allure.step("Проверка видимости кнопки Main");
        newsElement.theMainSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку Main");
        newsElement.theMainSection.perform(click());
        Allure.step("Проверка видимости кнопки, разворачивающей новость в разделе Main");
        mainElement.expandTheNewsInTheMainSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку, разворачивающую новость в разделе Main");
        mainElement.expandTheNewsInTheMainSection.perform(actionOnItemAtPosition(0, click()));
        Allure.step("Повторное нажатие на  кнопку, разворачивающую новость в разделе Main");
        mainElement.expandTheNewsInTheMainSection.perform(actionOnItemAtPosition(0, forceClick()));

        // Проверка данного теста;

        Allure.step("Ожидания элементов id:main_menu_image_button");
        onView(isRoot()).perform(waitDisplayed(R.id.news_item_material_card_view, 5000));
        Allure.step("Проверка - содержание новости скрыто");
        mainElement.theContentOfTheNewsHidden.check(matches(not(isDisplayed())));

        // Очистка мобильного приложения после теста (удаление созданной новости);
        Allure.step("Удаление тестовой новости");
        deletingTestNews();
    }
}
