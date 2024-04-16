package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import androidx.test.espresso.matcher.RootMatchers;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.FilterNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class ControlPanelStep {
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static FilterNewsElement filterNewsElement = new FilterNewsElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();

    public void thePresenceOfTheSortNewsButton() {
        Allure.step("Проверка видимости Navicon кнопки");
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
        Allure.step("Проверка видимости кнопки с id: sort_news_material_button");
        // Делаю проверку видимости кнопки сортировки новостей в разделе Control panel
        controlPanelElement.theSortNewsButton.check(matches(isDisplayed()));
    }

    public void thePresenceOfTheNewsFilteringButton() {
        Allure.step("Проверка видимости Navicon кнопки");
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
        Allure.step("Проверка видимости кнопки с id: filter_news_material_button");
        // Делаю проверку видимости кнопки фильтрации новостей в разделе Control panel
        controlPanelElement.theNewsFilteringButtons.check(matches(isDisplayed()));
    }

    public void thePresenceOfTheCreateNewsButton() {
        Allure.step("Проверка видимости Navicon кнопки");
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
        // Делаю проверку видимости кнопки создание новости в разделе Control panel
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
    }

    public void goToTheFilterNewsSection() {
        Allure.step("Проверка видимости Navicon кнопки");
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
        Allure.step("Проверка видимости кнопки с id: filter_news_material_button");
        controlPanelElement.theNewsFilteringButtons.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: filter_news_material_button");
        controlPanelElement.theNewsFilteringButtons.perform(click());
        Allure.step("Проверка видимости элемента модуля Filter news");
        // Делаю проверку нахождения в модуле Filter news
        filterNewsElement.filterNewsModule.check(matches(isDisplayed()));
    }

    public void goToTheCreatingNewsSection() {
        Allure.step("Проверка видимости Navicon кнопки");
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
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.theCreateNewsButton.perform(click());
        Allure.step("Проверка видимости элемента в модуле Creating News");
        creatingNewsElement.theTitleOfTheCreatingNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента в модуле Creating News");
        // Делаю проверку факта нахождения в модуле Creating News;
        creatingNewsElement.theTitleOfTheCreatingNewsSection.check(matches(withText(Data.theNameOfTheCreatingNewsSection())));
    }

    public void creatingATestNews() {
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
        controlPanelElement.theCreateNewsButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.theCreateNewsButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка видимости категории объявление");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Выбор категории объявление");
        filterNewsElement.theAdCategory.inRoot(RootMatchers.isPlatformPopup()).perform(click());
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
        creatingNewsElement.descriptionField.perform(replaceText(Data.descriptionOfTheNews()), closeSoftKeyboard());
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

    public void expandTheNews() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingATestNews();

        Allure.step("Проверка видимости кнопки, разворачивающей новость в разделе Control panel");
        controlPanelElement.aButtonInTheFormOfACheckMark.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку, разворачивающую новость в разделе Control panel");
        controlPanelElement.aButtonInTheFormOfACheckMark.perform(actionOnItemAtPosition(0, click()));

        // Делаю проверку видимости и полноты содерждания созданной новости;
        Allure.step("Проверка видимости содержания новости");
        controlPanelElement.descriptionOfTheNews.check(matches(isDisplayed()));
        Allure.step("Проверка правильного написания  содержания новости");
        controlPanelElement.descriptionOfTheNews.check(matches(withText(Data.descriptionOfTheNews())));

        // Очистка мобильного приложение (удаление тестовых данных);
        Allure.step("Удаление тестовой новости");
        deletingTestNews();
    }


    public void collapseTheNews() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingATestNews();

        Allure.step("Проверка видимости кнопки, разворачивающей новость в разделе Control panel");
        controlPanelElement.aButtonInTheFormOfACheckMark.check(matches(isDisplayed()));
        Allure.step("Нажатие на  кнопку, разворачивающую новость в разделе Control panel");
        controlPanelElement.aButtonInTheFormOfACheckMark.perform(actionOnItemAtPosition(0, click()));
        Allure.step("Повторное нажатие на  кнопку, разворачивающую новость в разделе Control panel");
        controlPanelElement.aButtonInTheFormOfACheckMark.perform(actionOnItemAtPosition(0, click()));

        //Делаю проверку в тесте - содерждание созданной новости скрито;
        Allure.step("Проверка - содержание новости скрыто");
        controlPanelElement.descriptionOfTheNews.check(doesNotExist());

        // Очистка мобильного приложение (удаление тестовых данных);
        Allure.step("Удаление тестовой новости");
        deletingTestNews();
    }

    public void deleteANewsItem() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingATestNews();
        Allure.step("Проверка видимости названии новости в разделе Control panel");
        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));
        Allure.step("Проверка видимости кнопки с id: delete_news_item_image_view");
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: delete_news_item_image_view");
        controlPanelElement.deleteANewsItem.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        controlPanelElement.theOkButton.perform(click());
        Allure.step("Проверка отсутствия новости в разделе Control panel");

        // Делаю проверку - созданной новости в разделе Control panel нет;
        controlPanelElement.theNameOfTheNews.check(doesNotExist());
    }

    public void cancelTheNewsDeletionProcess() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingATestNews();
        Allure.step("Проверка видимости названии новости в разделе Control panel");
        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));
        Allure.step("Проверка видимости кнопки с id: delete_news_item_image_view");
        controlPanelElement.deleteANewsItem.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: delete_news_item_image_view");
        controlPanelElement.deleteANewsItem.perform(click());
        Allure.step("Проверка видимости кнопки CANCEL");
        controlPanelElement.theCancelButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку CANCEL");
        controlPanelElement.theCancelButton.perform(click());

        // Делаю проверку теста - созданная новости в разделе Control panel не удалена;
        Allure.step("Проверка видимости названии новости в разделе Control panel");
        controlPanelElement.theNameOfTheNews.check(matches(isDisplayed()));

        // Очистка мобильного приложение (удаление тестовых данных);
        Allure.step("Удаление тестовой новости");
        deletingTestNews();
    }

    public void goToTheEditingNewsSection() {
        // Cоздание тестовых данных;
        Allure.step("Создание тестовой новости");
        creatingATestNews();
        Allure.step("Проверка видимости кнопки с id: edit_news_item_image_view");
        controlPanelElement.aPencilShapedButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_item_image_view");
        controlPanelElement.aPencilShapedButton.perform(click());

        // Делаю проверку теста - нахождение в модуле Editing News;
        Allure.step("Проверка видимости элемента модуля Editing News ");
        controlPanelElement.theNameOfTheEditingNewsSection.check(matches(isDisplayed()));
        Allure.step("Проверка написания элемента модуля Editing News ");
        controlPanelElement.theNameOfTheEditingNewsSection.check(matches(withText("Editing")));

        // Очистка мобильного приложение (удаление тестовых данных);

        Allure.step("Проверка видимости кнопки CANCEL");
        controlPanelElement.theCancelButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку CANCEL");
        controlPanelElement.theCancelButton.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        controlPanelElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        controlPanelElement.theOkButton.perform(click());
        Allure.step("Удаление тестовой новости");
        deletingTestNews();
    }
}
