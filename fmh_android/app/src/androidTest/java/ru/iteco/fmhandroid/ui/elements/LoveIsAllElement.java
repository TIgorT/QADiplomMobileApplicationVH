package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.is;


import static ru.iteco.fmhandroid.ui.data.Utils.childAtPosition;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matchers;

import ru.iteco.fmhandroid.R;

public class LoveIsAllElement {
    public ViewInteraction theLoveIsAlSection = onView(withId(R.id.our_mission_image_button));
    public ViewInteraction sectionTitle = onView(withId(R.id.our_mission_title_text_view));
    public ViewInteraction aCheckmarkButton = onView(
            Matchers.allOf(withId(R.id.our_mission_item_list_recycler_view),
                    childAtPosition(
                            withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                            0)));
    public ViewInteraction descriptionOfTheQuote = onView(
            Matchers.allOf(withId(R.id.our_mission_item_description_text_view),
                    withText("\"Ну, идеальное устройство мира в моих глазах. Где никто не оценивает, никто не осудит, где говоришь, и тебя слышат, где, если страшно, тебя обнимут и возьмут за руку, а если холодно тебя согреют.” Юля Капис, волонтер")));

    public ViewInteraction aCheckmarkButtonSeven = onView(
            Matchers.allOf(withId(R.id.our_mission_item_list_recycler_view),
                    childAtPosition(
                            withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                            0)));

    public ViewInteraction descriptionOfTheQuoteSeven = onView(
            Matchers.allOf(withId(R.id.our_mission_item_description_text_view),
                    withText("\"Делай добро... А добро заразительно. По-моему, все люди милосердны. Нужно просто говорить с ними об этом, суметь разбудить в них чувство сострадания, заложенное от рождения\" - В.В. Миллионщикова")));

}
