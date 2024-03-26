package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;

public class AboutElement {
    public ViewInteraction theAboutSection = onView(withText("About"));
    public ViewInteraction applicationVersion = onView(withText("Version:"));
    public ViewInteraction version = onView(withId(R.id.about_version_value_text_view));
}
