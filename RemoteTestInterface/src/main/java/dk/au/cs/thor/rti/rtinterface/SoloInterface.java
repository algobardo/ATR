package dk.au.cs.thor.rti.rtinterface;

import android.app.Activity;
import android.view.View;
import android.widget.*;
import com.robotium.solo.By;
import com.robotium.solo.WebElement;

import java.util.ArrayList;

//TODO: Enable as much method as possible but remember the following
/*
java.lang.IllegalArgumentException: invalid method : public abstract void dk.au.cs.thor.remoteTestInterface.SoloInterface.clearEditText(android.widget.EditText)
        E/AndroidRuntime( 2570): 	at org.json.rpc.commons.TypeChecker.isValidInterface(TypeChecker.java:109)
        E/AndroidRuntime( 2570): 	at org.json.rpc.server.HandleEntry.<init>(HandleEntry.java:53)
        E/AndroidRuntime( 2570): 	at org.json.rpc.server.JsonRpcExecutor.addHandler(JsonRpcExecutor.java:92)
        E/AndroidRuntime( 2570): 	at cs.au.dk.remotetest.RemoteActivityTest$1.run(RemoteActivityTest.java:107)
        E/AndroidRuntime( 2570): 	at java.lang.Thread.run(Thread.java:841)
        E/AndroidRuntime( 2570): Caused by: java.lang.IllegalArgumentException: invalid parameter type : class android.widget.EditText
        E/AndroidRuntime( 2570): 	at org.json.rpc.commons.TypeChecker.isValidMethod(TypeChecker.java:73)
        E/AndroidRuntime( 2570): 	at org.json.rpc.commons.TypeChecker.isValidInterface(TypeChecker.java:99)
        E/AndroidRuntime( 2570): 	... 4 more
        E/AndroidRuntime( 2570): Caused by: java.lang.IllegalArgumentException: no zero-arg constructor found : class android.widget.EditText
        E/AndroidRuntime( 2570): 	at org.json.rpc.commons.GsonTypeChecker.isValidType(GsonTypeChecker.java:97)
        E/AndroidRuntime( 2570): 	at org.json.rpc.commons.GsonTypeChecker.isValidType(GsonTypeChecker.java:30)
        E/AndroidRuntime( 2570): 	at org.json.rpc.commons.TypeChecker.isValidMethod(TypeChecker.java:63)
        E/AndroidRuntime( 2570): 	... 5 more
*/
public interface SoloInterface {/*
    public ArrayList<View> getViews();

    public ArrayList<View> getViews(View parent);

    public View getTopParent(View view);

    public boolean waitForText(String text);

    public boolean waitForText(String text, int minimumNumberOfMatches, long timeout);

    public boolean waitForText(String text, int minimumNumberOfMatches, long timeout, boolean scroll);

    public boolean waitForText(String text, int minimumNumberOfMatches, long timeout, boolean scroll, boolean onlyVisible);

    public boolean waitForView(int id);

    public boolean waitForView(int id, int minimumNumberOfMatches, int timeout);

    public boolean waitForView(int id, int minimumNumberOfMatches, int timeout, boolean scroll);

    public <T extends View> boolean waitForView(final Class<T> viewClass);

    public <T extends View> boolean waitForView(View view);

    public <T extends View> boolean waitForView(View view, int timeout, boolean scroll);

    public <T extends View> boolean waitForView(final Class<T> viewClass, final int minimumNumberOfMatches, final int timeout);

    public <T extends View> boolean waitForView(final Class<T> viewClass, final int minimumNumberOfMatches, final int timeout, final boolean scroll);

    public boolean waitForWebElement(By by);

    public boolean waitForWebElement(By by, int timeout, boolean scroll);

    public boolean waitForWebElement(By by, int minimumNumberOfMatches, int timeout, boolean scroll);

    public boolean searchEditText(String text);

    public boolean searchButton(String text);

    public boolean searchButton(String text, boolean onlyVisible);

    public boolean searchToggleButton(String text);

    public boolean searchButton(String text, int minimumNumberOfMatches);

    public boolean searchButton(String text, int minimumNumberOfMatches, boolean onlyVisible);

    public boolean searchToggleButton(String text, int minimumNumberOfMatches);

    public boolean searchText(String text);

    public boolean searchText(String text, boolean onlyVisible);

    public boolean searchText(String text, int minimumNumberOfMatches);

    public boolean searchText(String text, int minimumNumberOfMatches, boolean scroll);

    public boolean searchText(String text, int minimumNumberOfMatches, boolean scroll, boolean onlyVisible);

    public Activity getCurrentActivity();

    public boolean waitForDialogToOpen();

    public boolean waitForDialogToClose();

    public boolean waitForDialogToOpen(long timeout);

    public boolean waitForDialogToClose(long timeout);

    public void clickOnScreen(float x, float y);

    public void clickOnScreen(float x, float y, int numberOfClicks);

    public void clickLongOnScreen(float x, float y);

    public void clickLongOnScreen(float x, float y, int time);

    public void clickOnButton(String text);

    public void clickOnImageButton(int index);

    public void clickOnToggleButton(String text);

    public void clickOnWebElement(WebElement webElement);

    public void clickOnWebElement(By by);

    public void clickOnWebElement(By by, int match);

    public void clickOnWebElement(By by, int match, boolean scroll);

    public void pressMenuItem(int index);

    public void pressMenuItem(int index, int itemsPerRow);

    public void pressSoftKeyboardNextButton();

    public void pressSoftKeyboardSearchButton();

    public void clickOnView(View view);

    public void clickOnView(View view, boolean immediately);

    public void clickLongOnView(View view);

    public void clickLongOnView(View view, int time);
*/
    public void clickOnText(String text);
/*
    public void clickOnText(String text, int match);

    public void clickOnText(String text, int match, boolean scroll);

    public void clickLongOnTextAndPress(String text, int index);

    public void clickOnButton(int index);

    public void clickOnRadioButton(int index);

    public void clickOnCheckBox(int index);

    public void clickOnEditText(int index);

    public ArrayList<TextView> clickInList(int line);

    public ArrayList<TextView> clickInList(int line, int index);

    public ArrayList<TextView> clickLongInList(int line);

    public ArrayList<TextView> clickLongInList(int line, int index);

    public ArrayList<TextView> clickLongInList(int line, int index, int time);

    public void clickOnActionBarItem(int id);

    public void clickOnActionBarHomeButton();

    public boolean scrollDown();

    public void scrollToBottom();

    public boolean scrollUp();

    public void scrollToTop();

    public boolean scrollDownList(AbsListView list);

    public boolean scrollListToBottom(AbsListView list);

    public boolean scrollUpList(AbsListView list);

    public boolean scrollListToTop(AbsListView list);

    public boolean scrollDownList(int index);

    public boolean scrollListToBottom(int index);

    public boolean scrollUpList(int index);

    public boolean scrollListToTop(int index);

    public void scrollListToLine(AbsListView absListView, int line);

    public void scrollListToLine(int index, int line);

    public void scrollToSide(int side, float scrollPosition, int stepCount);

    public void scrollToSide(int side, float scrollPosition);

    public void scrollToSide(int side);

    public void scrollViewToSide(View view, int side, float scrollPosition, int stepCount);

    public void scrollViewToSide(View view, int side, float scrollPosition);

    public void scrollViewToSide(View view, int side);

    public void setDatePicker(int index, int year, int monthOfYear, int dayOfMonth);

    public void setDatePicker(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth);

    public void setTimePicker(int index, int hour, int minute);

    public void setTimePicker(TimePicker timePicker, int hour, int minute);

    public void setProgressBar(int index, int progress);

    public void setProgressBar(ProgressBar progressBar, int progress);

    public void setNavigationDrawer(final int status);

    public void setSlidingDrawer(int index, int status);

    public void setSlidingDrawer(SlidingDrawer slidingDrawer, int status);

    public void enterText(int index, String text);

    public void enterText(EditText editText, String text);

    public void enterTextInWebElement(By by, String text);

    public void typeText(int index, String text);

    public void typeText(EditText editText, String text);

    public void typeTextInWebElement(By by, String text);

    public void typeTextInWebElement(By by, String text, int match);

    public void typeTextInWebElement(WebElement webElement, String text);

    public void clearEditText(int index);

    public void clearEditText(EditText editText);

    public void clearTextInWebElement(By by);

    public void clickOnImage(int index);

    public EditText getEditText(int index);

    public Button getButton(int index);

    public TextView getText(int index);

    public ImageView getImage(int index);

    public ImageButton getImageButton(int index);

    public View getView(int id);

    public View getView(int id, int index);

    public View getView(String id);

    public View getView(String id, int index);

    public <T extends View> T getView(Class<T> viewClass, int index);

    public WebElement getWebElement(By by, int index);

    public String getWebUrl();

    public ArrayList<View> getCurrentViews();

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> classToFilterBy);

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> classToFilterBy, boolean includeSubclasses);

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> classToFilterBy, View parent);

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> classToFilterBy, boolean includeSubclasses, View parent);

    public ArrayList<WebElement> getWebElements();

    public ArrayList<WebElement> getWebElements(By by);

    public ArrayList<WebElement> getCurrentWebElements();

    public ArrayList<WebElement> getCurrentWebElements(By by);

    public boolean isTextChecked(String text);

    public void hideSoftKeyboard();

    public void unlockScreen();

    public void goBackToActivity(String name);

    public boolean waitForActivity(String name);

    public boolean waitForActivity(Class<? extends Activity> activityClass);

    public boolean isSatisfied();

    public boolean waitForFragmentByTag(String tag);

    public boolean waitForFragmentByTag(String tag, int timeout);

    public boolean waitForFragmentById(int id);

    public boolean waitForFragmentById(int id, int timeout);

    public boolean waitForLogMessage(String logMessage);

    public boolean waitForLogMessage(String logMessage, int timeout);

    public void clearLog();

    public void finishOpenedActivities();

    public void takeScreenshot();

    public void takeScreenshot(String name);

    public void takeScreenshot(String name, int quality);

    public void startScreenshotSequence(String name);

    public void startScreenshotSequence(String name, int quality, int frameDelay, int maxFrames);

    public void stopScreenshotSequence();
    */
}
