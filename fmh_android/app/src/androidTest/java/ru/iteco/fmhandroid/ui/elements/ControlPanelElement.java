package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.data.Utils.childAtPosition;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matchers;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;

public class ControlPanelElement {
    public ViewInteraction aButtonInTheFormOfAPlusSignInACircle = onView(withId(R.id.add_news_image_view));
    public ViewInteraction controlPanelHeader = onView(withText("Control panel"));
    public ViewInteraction theSortNewsButton = onView(withId(R.id.sort_news_material_button));
    public ViewInteraction theNewsFilteringButtons = onView(withId(R.id.filter_news_material_button));
    public ViewInteraction theCreateNewsButton = onView(withId(R.id.add_news_image_view));
    public ViewInteraction aButtonInTheFormOfACheckMark = onView(
            Matchers.allOf(withId(R.id.news_list_recycler_view),
                    childAtPosition(
                            withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                            0)));
    public ViewInteraction descriptionOfTheNews = onView(
            allOf(withId(R.id.news_item_description_text_view), withText(Data.descriptionOfTheNews()),
                    withParent(withParent(withId(R.id.news_item_material_card_view))),
                    isDisplayed()));
    public ViewInteraction theNameOfTheNews = onView(
            allOf(withId(R.id.news_item_title_text_view), withText(Data.theNameOfTheNews()),
                    withParent(withParent(withId(R.id.news_item_material_card_view))),
                    isDisplayed()));

    public ViewInteraction deleteANewsItem = onView(
            allOf(withId(R.id.delete_news_item_image_view), childAtPosition
                            (childAtPosition(withId(R.id.news_item_material_card_view),
                                            0),
                                    14),
                    isDisplayed()));

    public ViewInteraction theOkButton = onView(withText("OK"));

    public ViewInteraction theCancelButton = onView(withText("CANCEL"));
    public ViewInteraction aPencilShapedButton = onView(
            allOf(withId(R.id.edit_news_item_image_view), childAtPosition(
                            childAtPosition(
                                    withId(R.id.news_item_material_card_view),
                                    0),
                            15),
                    isDisplayed()));
    public ViewInteraction theNameOfTheEditingNewsSection = onView(withId(R.id.custom_app_bar_title_text_view));

}
