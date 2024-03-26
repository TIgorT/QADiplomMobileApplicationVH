package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

import static ru.iteco.fmhandroid.ui.data.Utils.childAtPosition;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;


public class EditingNewsElement {
    public ViewInteraction theSwitcherButton = onView(withId(R.id.switcher));
    public ViewInteraction theSaveButton = onView(withId(R.id.save_button));
    public ViewInteraction theCancelButton = onView(withText("CANCEL"));
    public ViewInteraction theOkButton = onView(withText("OK"));
    public ViewInteraction theEditNewsButton = onView(withId(R.id.edit_news_item_image_view));
    public ViewInteraction theDeleteNewsButton = onView(withId(R.id.delete_news_item_image_view));
    
    public DataInteraction theMassageCategoryInTheEditingNews = onData(anything())
            .inAdapterView(childAtPosition(withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                    0)).atPosition(5);
}
