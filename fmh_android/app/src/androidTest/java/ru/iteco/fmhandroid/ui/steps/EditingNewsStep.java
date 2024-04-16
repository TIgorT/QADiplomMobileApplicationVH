package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.data.Data.changedPublicationDate;
import static ru.iteco.fmhandroid.ui.data.Data.theTestDateOfTheMewsPublication;

import androidx.test.espresso.contrib.PickerActions;
import androidx.test.espresso.matcher.RootMatchers;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.AppBarElement;
import ru.iteco.fmhandroid.ui.elements.ControlPanelElement;
import ru.iteco.fmhandroid.ui.elements.CreatingNewsElement;
import ru.iteco.fmhandroid.ui.elements.EditingNewsElement;
import ru.iteco.fmhandroid.ui.elements.NewsElement;

public class EditingNewsStep {
    static AppBarElement appBarElement = new AppBarElement();
    static NewsElement newsElement = new NewsElement();
    static CreatingNewsElement creatingNewsElement = new CreatingNewsElement();
    static ControlPanelElement controlPanelElement = new ControlPanelElement();
    static EditingNewsElement editingNewsElement = new EditingNewsElement();

    public void creatingTestNews() {
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
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: add_news_image_view");
        controlPanelElement.aButtonInTheFormOfAPlusSignInACircle.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Проверка в списке видимости  категории Профсоюз");
        creatingNewsElement.theTradeUnionCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()));
        Allure.step("Нажатие на категорию Профсоюз в списке категорий");
        creatingNewsElement.theTradeUnionCategoryInTheCreatingNewsModule.inRoot(RootMatchers.isPlatformPopup()).perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Очистка поля Title от сообщения");
        creatingNewsElement.titleField.perform(clearText());
        Allure.step("Заполнение поля Title");
        creatingNewsElement.titleField.perform(replaceText(Data.theFirstTestTitleOfTheNews()));
        Allure.step("Проверка видимости поля Publication date");
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        Allure.step("Заполнение поля Publication date");
        creatingNewsElement.thePublicationDateField.perform(replaceText(theTestDateOfTheMewsPublication()));
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Time");
        creatingNewsElement.timeField.perform(click());
        Allure.step("Выбор времени 22:45");
        creatingNewsElement.choosingTheTimeOfPublicationOfTheNews.perform(PickerActions.setTime(22, 45), click());
        Allure.step("Проверка видимости кнопки ОК");
        creatingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        creatingNewsElement.theOkButton.perform(click());
        Allure.step("Проверка видимости поля Description");
        creatingNewsElement.descriptionField.check(matches(isDisplayed()));
        Allure.step("Заполнение поля Description");
        creatingNewsElement.descriptionField.perform(replaceText(Data.theTextContentOfTheNews()));
        Allure.step("Проверка видимости кнопки SAVE");
        creatingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        creatingNewsElement.theSaveButton.perform(click());
    }

    public void deletingTestNews() {
        Allure.step("Проверка видимости кнопки с id: delete_news_item_image_view");
        editingNewsElement.theDeleteNewsButton.check(matches(isDisplayed()));
        Allure.step("ажатие на кнопку с id: delete_news_item_image_view");
        editingNewsElement.theDeleteNewsButton.perform(click());
        Allure.step("Проверка видимости кнопки ОК");
        editingNewsElement.theOkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку ОК");
        editingNewsElement.theOkButton.perform(click());
    }

    public void inTheNewsOfTheEditingNewsModuleChangeTheData() {
        Allure.step("Проверка видимости кнопки с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.perform(click());
        Allure.step("Проверка видимости поля Category");
        creatingNewsElement.theCategoryField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Category");
        creatingNewsElement.theCategoryField.perform(click());
        Allure.step("Выбор из списка категорию Массаж");
        creatingNewsElement.theCategoryField.perform(replaceText(Data.massage()));
        Allure.step("Проверка написания выбранной категории в поле Category");
        // Делаю проверку что изменённая категория отображается в поле Category;
        creatingNewsElement.theCategoryField.check(matches(withText(Data.massage())));
        Allure.step("Проверка видимости кнопки SAVE");
        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        editingNewsElement.theSaveButton.perform(click());
    }

    public void changeTheDataInTheTitleField() {
        Allure.step("Проверка видимости кнопки с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.perform(click());
        Allure.step("Проверка видимости поля Title");
        creatingNewsElement.titleField.check(matches(isDisplayed()));
        Allure.step("Нажатие на поле Title");
        creatingNewsElement.titleField.perform(click());
        Allure.step("Очистка поля Title от сообщения");
        creatingNewsElement.titleField.perform(clearText());
        Allure.step("Заполнение поля Title новыми данными");
        creatingNewsElement.titleField.perform(replaceText(Data.dataInTheTitleField()));
        Allure.step("Проверка написания изменённой темы новости в поле Title");
        // Делаю проверку что изменённая тема новости отображается в поле Title;
        creatingNewsElement.titleField.check(matches(withText(Data.dataInTheTitleField())));
        Allure.step("Проверка видимости кнопки SAVE");
        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        editingNewsElement.theSaveButton.perform(click());
    }

    public void changeTheDataInThePublicationDateField() {
        Allure.step("Проверка видимости кнопки с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.perform(click());
        Allure.step("Проверка видимости поля Publication Date");
        creatingNewsElement.thePublicationDateField.check(matches(isDisplayed()));
        Allure.step(" Выбор в поле Publication Date новую дату");
        creatingNewsElement.thePublicationDateField.perform(replaceText(changedPublicationDate()));
        Allure.step("Проверка новой даты в поле Publication Date");
        // Делаю проверку что изменённая дата отображается в поле Publication Date;
        creatingNewsElement.thePublicationDateField.check(matches(withText(Data.changedPublicationDate())));
        Allure.step("Проверка видимости кнопки SAVE");
        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        editingNewsElement.theSaveButton.perform(click());
    }

    public void changeTheDataInTheTimeField() {
        Allure.step("Проверка видимости кнопки с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: edit_news_item_image_view");
        editingNewsElement.theEditNewsButton.perform(click());
        Allure.step("Проверка видимости поля Time");
        creatingNewsElement.timeField.check(matches(isDisplayed()));
        Allure.step(" Выбор в поле Time нового времени");
        creatingNewsElement.timeField.perform(replaceText(Data.changingTheTime()));
        Allure.step("Проверка нового времени в поле Time");
        // Делаю проверку что изменённая дата отображается в поле Publication Date;
        creatingNewsElement.timeField.check(matches(withText(Data.changingTheTime())));
        Allure.step("Проверка видимости кнопки SAVE");
        editingNewsElement.theSaveButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку SAVE");
        editingNewsElement.theSaveButton.perform(click());
    }
}
