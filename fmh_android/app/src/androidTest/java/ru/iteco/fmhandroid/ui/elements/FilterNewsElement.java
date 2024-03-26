package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

import static ru.iteco.fmhandroid.ui.data.Utils.childAtPosition;

import android.view.View;
import android.widget.DatePicker;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;

public class FilterNewsElement {
    public ViewInteraction filterNewsModule = onView(withId(R.id.filter_news_title_text_view));
    public ViewInteraction theFilterButton = onView(withId(R.id.filter_news_material_button));
    public ViewInteraction theCategoryField = onView(withId(R.id.news_item_category_text_auto_complete_text_view));
    public ViewInteraction theStartDateField = onView(withId(R.id.news_item_publish_date_start_text_input_edit_text));
    public ViewInteraction theEndDateField = onView(withId(R.id.news_item_publish_date_end_text_input_edit_text));
    public ViewInteraction theFilterButtonInTheModuleFilterNews = onView(withId(R.id.filter_button));
    public ViewInteraction theCancelButton = onView(withId(R.id.cancel_button));
    public ViewInteraction theOkButton = onView(withId(android.R.id.button1));
    public ViewInteraction theCancelButtonInTheCalendar = onView(withId(android.R.id.button2));
    public ViewInteraction theBackButtonInTheCalendar = onView(allOf(withClassName(is("androidx.appcompat.widget.AppCompatImageButton")),
            withContentDescription("Previous month")));
    public ViewInteraction theForwardButtonInTheCalendar = onView(allOf(withClassName(is("androidx.appcompat.widget.AppCompatImageButton")),
            withContentDescription("Next month")));

    public ViewInteraction choosingTheYear = onView(allOf(withClassName(is("com.google.android.material.textview.MaterialTextView")),
            withText("2024")));
    public DataInteraction lastYear = onData(anything())
            .inAdapterView(allOf(withClassName(is("android.widget.YearPickerView")),
                    childAtPosition(
                            withClassName(is("com.android.internal.widget.DialogViewAnimator")),
                            1)))
            .atPosition(123);

    public DataInteraction nextYear = onData(anything())
            .inAdapterView(allOf(withClassName(is("android.widget.YearPickerView")),
                    childAtPosition(
                            withClassName(is("com.android.internal.widget.DialogViewAnimator")),
                            1)))
            .atPosition(125);
    public ViewInteraction checkingWhichYear = onView(
            allOf(IsInstanceOf.<View>instanceOf(android.widget.TextView.class), withText("2023"),
                    withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                    isDisplayed()));
    public ViewInteraction checkingNextYear = onView(
            allOf(IsInstanceOf.<View>instanceOf(android.widget.TextView.class), withText("2025"),
                    withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                    isDisplayed()));
    public ViewInteraction theAdCategory = onView(withText(Data.category()));
    public ViewInteraction theBirthdayCategory = onView(withText(Data.birthday()));
    public ViewInteraction theSalaryCategory = onView(withText(Data.salary()));
    public ViewInteraction theTradeUnionCategory = onView(withText(Data.theTradeUnion()));
    public ViewInteraction theHolidayCategory = onView(withText(Data.holiday()));
    public ViewInteraction theMassageCategory = onView(withText(Data.massage()));
    public ViewInteraction theGratitudeCategory = onView(withText(Data.gratitude()));
    public ViewInteraction theNeedHelpCategory = onView(withText(Data.needHelp()));
    public ViewInteraction theCheckBoxActive = onView(withId(R.id.filter_news_active_material_check_box));
    public ViewInteraction theCheckBoxNotActive = onView(withId(R.id.filter_news_inactive_material_check_box));
    public ViewInteraction dateInTheCalendar = onView(withClassName(Matchers.equalTo(DatePicker.class.getName())));

    public ViewInteraction errorChecking = onView(
            allOf(withId(android.R.id.message), withText("Wrong period"),
                    withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                    isDisplayed()));

    public ViewInteraction actionInTheCategoryField = onView(
            allOf(withId(com.google.android.material.R.id.text_input_end_icon), withContentDescription("Show dropdown menu"),
                    childAtPosition(
                            childAtPosition(
                                    withClassName(is("android.widget.LinearLayout")),
                                    1),
                            0),
                    isDisplayed()));


}
