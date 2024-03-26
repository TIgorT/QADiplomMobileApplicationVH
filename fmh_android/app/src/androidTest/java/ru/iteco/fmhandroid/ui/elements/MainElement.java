package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import static ru.iteco.fmhandroid.ui.data.Utils.childAtPosition;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;

public class MainElement {
    public ViewInteraction exitTheApplicationButton = onView(withId(R.id.authorization_image_button));
    public ViewInteraction newsSection = onView(withText("News"));
    public ViewInteraction logOut = onView(withText("Log out"));
    public ViewInteraction theCheckmarkButton = onView(withId(R.id.expand_material_button));
    public ViewInteraction theAllNewsButton = onView(withId(R.id.all_news_text_view));
    public ViewInteraction expandTheNewsInTheMainSection = onView(
            allOf(withId(R.id.news_list_recycler_view),
                    childAtPosition(
                            withId(R.id.all_news_cards_block_constraint_layout),
                            0)));
    public ViewInteraction theNameOfTheNewsInTheMainSection = onView(
            allOf(withId(R.id.news_item_title_text_view), withText(Data.theNameOfTheNews()),
                    withParent(withParent(withId(R.id.news_item_material_card_view))),
                    isDisplayed()));
    public ViewInteraction theContentOfTheNews = onView(
            allOf(withId(R.id.news_item_description_text_view), withText(Data.descriptionOfTheNews()),
                    withParent(withParent(withId(R.id.news_item_material_card_view)))));

}
