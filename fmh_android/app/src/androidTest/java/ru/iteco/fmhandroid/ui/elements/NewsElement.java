package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.data.Utils.childAtPosition;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;

public class NewsElement {
    public ViewInteraction theNewsSection = onView(withText("News"));
    public ViewInteraction theMainSection = onView(withText("Main"));
    public ViewInteraction aPencilShapedButton = onView(withId(R.id.edit_news_material_button));
    public ViewInteraction theFilterButton = onView(withId(R.id.filter_news_material_button));
    public ViewInteraction expandTheNewsInTheNewsSection = onView(
            allOf(withId(R.id.news_list_recycler_view),
                    childAtPosition(
                            withId(R.id.all_news_cards_block_constraint_layout),
                            0)));
}
