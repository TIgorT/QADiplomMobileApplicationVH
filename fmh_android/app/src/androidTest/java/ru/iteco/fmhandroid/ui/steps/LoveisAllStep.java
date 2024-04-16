package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import static org.hamcrest.core.IsNot.not;
import static ru.iteco.fmhandroid.ui.data.Utils.waitDisplayed;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;
import ru.iteco.fmhandroid.ui.elements.LoveIsAllElement;
import ru.iteco.fmhandroid.ui.elements.MainElement;

public class LoveisAllStep {
    static LoveIsAllElement loveIsAllElement = new LoveIsAllElement();
    static MainElement mainElement = new MainElement();

    public void quoteInTheSectionLoveIsAll() {
        Allure.step("Проверка видимости кнопки c id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Allure.step("Проверка видимости кнопки разворачивающей цитату");
        loveIsAllElement.aCheckmarkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку разворачивающую цитату");
        loveIsAllElement.aCheckmarkButton.perform(actionOnItemAtPosition(0, click()));
        Allure.step("Ожидание локатора с id: our_mission_item_description_text_view");
        onView(isRoot()).perform(waitDisplayed(R.id.our_mission_item_material_card_view, 1000));
        Allure.step("Проверка видимости содержания цитаты");
        // Делаю проверку видимости поля с содержанием цитаты;
        loveIsAllElement.descriptionOfTheQuote.check(matches(isDisplayed()));
        Allure.step("Проверка содержания цитаты");
        //Делаю проверку содержимого цитаты;
        loveIsAllElement.descriptionOfTheQuote.check(matches(withText(Data.theFirstThematicQuote())));


    }

    public void theCollapsedQuoteInTheLoveIsAllSection() {
        Allure.step("Проверка видимости кнопки c id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Allure.step("Проверка видимости кнопки разворачивающей цитату");
        loveIsAllElement.aCheckmarkButton.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку разворачивающую цитату");
        loveIsAllElement.aCheckmarkButton.perform(actionOnItemAtPosition(0, click()));
        Allure.step("Повторное нажатие на кнопку разворачивающую цитату");
        loveIsAllElement.aCheckmarkButton.perform(actionOnItemAtPosition(0, click()));
        Allure.step("Ожидание локатора с id: our_mission_item_description_text_view");
        onView(isRoot()).perform(waitDisplayed(R.id.our_mission_item_material_card_view, 1000));
        Allure.step("Проверка - содержания цитаты скрыто");
        //Делаю проверку - содержимое цитаты скрыто
        loveIsAllElement.theDescriptionOfTheQuoteIsHidden.check(matches(not(isDisplayed())));
    }

    public void theyWillReturnFromTheLoveIsAllSection() {
        Allure.step("Проверка видимости кнопки c id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Allure.step("Возврат в предыдущий раздел с помощью системной кнопки назад");
        Espresso.pressBack();
        Allure.step("Проверка видимости элемента из предыдущего раздела");
        //Делаю проверку факта нахождения в предыдущем разделе
        mainElement.newsSection.check(matches(isDisplayed()));
        Allure.step("Проверка названия элемента из предыдущего раздела");
        //Делаю проверку факта нахождения в предыдущем разделе
        mainElement.newsSection.check(matches(withText("News")));
    }

    public void scrollToTheSeventhQuoteFromTheLoveIsAllSection() {
        Allure.step("Проверка видимости кнопки c id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.check(matches(isDisplayed()));
        Allure.step("Нажатие на кнопку с id: our_mission_image_button");
        loveIsAllElement.theLoveIsAlSection.perform(click());
        Allure.step("Скрол к цитате на седьмой позиции");
        loveIsAllElement.aCheckmarkButtonSeven.perform(actionOnItemAtPosition(6, ViewActions.scrollTo()));
        Allure.step("Нажатие на кнопку разворачивающую цитату");
        loveIsAllElement.aCheckmarkButtonSeven.perform(actionOnItemAtPosition(6, ViewActions.click()));
        Allure.step("Ожидание локатора с id: our_mission_item_description_text_view");
        onView(isRoot()).perform(waitDisplayed(R.id.our_mission_item_material_card_view, 1000));
        Allure.step("Проверка видимости содержания цитаты");
        //Делаю проверку видимости содержания цитаты находящейся на 7 позиции;
        loveIsAllElement.descriptionOfTheQuoteSeven.check(matches(isDisplayed()));
        Allure.step("Проверка содержания цитаты");
        //Делаю проверку содержимого цитаты находящейся на 7 позиции;
        loveIsAllElement.descriptionOfTheQuoteSeven.check(matches(withText(Data.theSecondThematicQuote())));
    }
}
