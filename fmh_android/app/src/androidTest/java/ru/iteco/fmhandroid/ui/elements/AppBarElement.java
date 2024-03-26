package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;

public class AppBarElement {
    public ViewInteraction buttonNavicon = onView(withId(R.id.main_menu_image_button));
    public ViewInteraction butterflyButtons = onView(withId(R.id.our_mission_image_button));
    public ViewInteraction buttonsInTheFormOfAMan = onView(withId(R.id.authorization_image_button));
}
