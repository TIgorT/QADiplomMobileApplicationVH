package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import static ru.iteco.fmhandroid.ui.data.Utils.childAtPosition;

import android.widget.TimePicker;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matchers;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Data;

public class CreatingNewsElement {
    public ViewInteraction theCategoryField = onView(withId(R.id.news_item_category_text_auto_complete_text_view));
    public ViewInteraction theCategoryAnnouncement = onView(withText("Объявление"));
    public ViewInteraction titleField = onView(withId(R.id.news_item_title_text_input_edit_text));
    public ViewInteraction thePublicationDateField = onView(withId(R.id.news_item_publish_date_text_input_edit_text));
    public ViewInteraction theOkButton = onView(withText("OK"));
    public ViewInteraction theCancelButton = onView(withText("CANCEL"));
    public ViewInteraction timeField = onView(withId(R.id.news_item_publish_time_text_input_edit_text));

    public ViewInteraction choosingTheTimeOfPublicationOfTheNews = onView(withClassName(Matchers.equalTo(TimePicker.class.getName())));
    public ViewInteraction descriptionField = onView(withId(R.id.news_item_description_text_input_edit_text));
    public ViewInteraction theSaveButton = onView(withId(R.id.save_button));
    public ViewInteraction theTitleOfTheCreatingNewsSection = onView(withId(R.id.custom_app_bar_title_text_view));
    public ViewInteraction theAdCategoryInTheCreatingNewsModule = onView(withText(Data.category()));
    public ViewInteraction theBirthdayCategoryInTheCreatingNewsModule = onView(withText(Data.birthday()));
    public ViewInteraction theSalaryCategoryInTheCreatingNewsModule = onView(withText(Data.salary()));
    public ViewInteraction theTradeUnionCategoryInTheCreatingNewsModule = onView(withText(Data.theTradeUnion()));
    public ViewInteraction theHolidayCategoryInTheCreatingNewsModule = onView(withText(Data.holiday()));
    public ViewInteraction theMassageCategoryInTheCreatingNewsModule = onView(withText(Data.massage()));
    public ViewInteraction theGratitudeCategoryInTheCreatingNewsModule = onView(withText(Data.gratitude()));
    public ViewInteraction theNeedHelpCategoryInTheCreatingNewsModule = onView(withText(Data.needHelp()));
    public ViewInteraction aButtonInTheFormOfAKeyboard = onView(withClassName(is("androidx.appcompat.widget.AppCompatImageButton")));
    public ViewInteraction theSetTimeModule = onView(withText("Set time"));
    public ViewInteraction inTheHourField = onView(allOf(withClassName(is("androidx.appcompat.widget.AppCompatEditText")),
            childAtPosition(allOf(withClassName(is("android.widget.RelativeLayout")),
                    childAtPosition(withClassName(is("android.widget.TextInputTimePickerView")),
                            1)), 0)));
    public ViewInteraction InTheMinuteField = onView(allOf(withClassName(is("androidx.appcompat.widget.AppCompatEditText")),
            childAtPosition(allOf(withClassName(is("android.widget.RelativeLayout")),
                    childAtPosition(withClassName(is("android.widget.TextInputTimePickerView")),
                            1)), 3)));


}
