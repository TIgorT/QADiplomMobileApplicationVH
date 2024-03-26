package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Utils;

public class AuthorizationModule {
    public ViewInteraction login = onView(withHint(R.string.login));
    public ViewInteraction password = onView(withHint("Password"));
    public ViewInteraction signInButton = onView(withId(R.id.enter_button));
    public ViewInteraction authorizationModule = onView(withText("Authorization"));

    public ViewInteraction emptyToast(int id) {
        return onView(withText(id)).inRoot(new Utils.ToastMatcher());
    }
}
