package cs.au.dk.remotetest;

import android.app.Activity;
import android.app.Instrumentation;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.TimePicker;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;

import java.util.ArrayList;

import dk.au.cs.thor.rti.rtinterface.SoloInterface;

public class SoloProxy implements SoloInterface {

    private final String TAG = "SoloProxy";

    Solo solo = null;

    public SoloProxy(Instrumentation i, Activity a) {
        solo = new Solo(i,a);
    }

    public ArrayList<View> getViews() {
        return null;
    }

    public ArrayList<View> getViews(View view) {
        return null;
    }

    public View getTopParent(View view) {
        return null;
    }

    public boolean waitForText(String s) {
        return false;
    }

    public boolean waitForText(String s, int i, long l) {
        return false;
    }

    public boolean waitForText(String s, int i, long l, boolean b) {
        return false;
    }

    public boolean waitForText(String s, int i, long l, boolean b, boolean b2) {
        return false;
    }

    public boolean waitForView(int i) {
        return false;
    }

    public boolean waitForView(int i, int i2, int i3) {
        return false;
    }

    public boolean waitForView(int i, int i2, int i3, boolean b) {
        return false;
    }

    public <T extends View> boolean waitForView(Class<T> tClass) {
        return false;
    }

    public <T extends View> boolean waitForView(View view) {
        return false;
    }

    public <T extends View> boolean waitForView(View view, int i, boolean b) {
        return false;
    }

    public <T extends View> boolean waitForView(Class<T> tClass, int i, int i2) {
        return false;
    }

    public <T extends View> boolean waitForView(Class<T> tClass, int i, int i2, boolean b) {
        return false;
    }

    public boolean waitForWebElement(By by) {
        return false;
    }

    public boolean waitForWebElement(By by, int i, boolean b) {
        return false;
    }

    public boolean waitForWebElement(By by, int i, int i2, boolean b) {
        return false;
    }

    public boolean searchEditText(String s) {
        return false;
    }

    public boolean searchButton(String s) {
        return false;
    }

    public boolean searchButton(String s, boolean b) {
        return false;
    }

    public boolean searchToggleButton(String s) {
        return false;
    }

    public boolean searchButton(String s, int i) {
        return false;
    }

    public boolean searchButton(String s, int i, boolean b) {
        return false;
    }

    public boolean searchToggleButton(String s, int i) {
        return false;
    }

    public boolean searchText(String s) {
        return false;
    }

    public boolean searchText(String s, boolean b) {
        return false;
    }

    public boolean searchText(String s, int i) {
        return false;
    }

    public boolean searchText(String s, int i, boolean b) {
        return false;
    }

    public boolean searchText(String s, int i, boolean b, boolean b2) {
        return false;
    }

    public Activity getCurrentActivity() {
        return null;
    }

    public boolean waitForDialogToOpen() {
        return false;
    }

    public boolean waitForDialogToClose() {
        return false;
    }

    public boolean waitForDialogToOpen(long l) {
        return false;
    }

    public boolean waitForDialogToClose(long l) {
        return false;
    }

    public void clickOnScreen(float v, float v2) {

    }

    public void clickOnScreen(float v, float v2, int i) {

    }

    public void clickLongOnScreen(float v, float v2) {

    }

    public void clickLongOnScreen(float v, float v2, int i) {

    }

    public void clickOnButton(String s) {

    }

    public void clickOnImageButton(int i) {

    }

    public void clickOnToggleButton(String s) {

    }

    public void clickOnWebElement(WebElement webElement) {

    }

    public void clickOnWebElement(By by) {

    }

    public void clickOnWebElement(By by, int i) {

    }

    public void clickOnWebElement(By by, int i, boolean b) {

    }

    public void pressMenuItem(int i) {

    }

    public void pressMenuItem(int i, int i2) {

    }

    public void pressSoftKeyboardNextButton() {

    }

    public void pressSoftKeyboardSearchButton() {

    }

    public void clickOnView(View view) {

    }

    public void clickOnView(View view, boolean b) {

    }

    public void clickLongOnView(View view) {

    }

    public void clickLongOnView(View view, int i) {

    }

    @Override
    public void clickOnText(String s) {
        Log.d(TAG, "Click called");
        solo.clickOnText(s);
    }

    public void clickOnText(String s, int i) {

    }

    public void clickOnText(String s, int i, boolean b) {

    }

    public void clickLongOnTextAndPress(String s, int i) {

    }

    public void clickOnButton(int i) {

    }

    public void clickOnRadioButton(int i) {

    }

    public void clickOnCheckBox(int i) {

    }

    public void clickOnEditText(int i) {

    }

    public ArrayList<TextView> clickInList(int i) {
        return null;
    }

    public ArrayList<TextView> clickInList(int i, int i2) {
        return null;
    }

    public ArrayList<TextView> clickLongInList(int i) {
        return null;
    }

    public ArrayList<TextView> clickLongInList(int i, int i2) {
        return null;
    }

    public ArrayList<TextView> clickLongInList(int i, int i2, int i3) {
        return null;
    }

    public void clickOnActionBarItem(int i) {

    }

    public void clickOnActionBarHomeButton() {

    }

    public boolean scrollDown() {
        return false;
    }

    public void scrollToBottom() {

    }

    public boolean scrollUp() {
        return false;
    }

    public void scrollToTop() {

    }

    public boolean scrollDownList(AbsListView absListView) {
        return false;
    }

    public boolean scrollListToBottom(AbsListView absListView) {
        return false;
    }

    public boolean scrollUpList(AbsListView absListView) {
        return false;
    }

    public boolean scrollListToTop(AbsListView absListView) {
        return false;
    }

    public boolean scrollDownList(int i) {
        return false;
    }

    public boolean scrollListToBottom(int i) {
        return false;
    }

    public boolean scrollUpList(int i) {
        return false;
    }

    public boolean scrollListToTop(int i) {
        return false;
    }

    public void scrollListToLine(AbsListView absListView, int i) {

    }

    public void scrollListToLine(int i, int i2) {

    }

    public void scrollToSide(int i, float v, int i2) {

    }

    public void scrollToSide(int i, float v) {

    }

    public void scrollToSide(int i) {

    }

    public void scrollViewToSide(View view, int i, float v, int i2) {

    }

    public void scrollViewToSide(View view, int i, float v) {

    }

    public void scrollViewToSide(View view, int i) {

    }

    public void setDatePicker(int i, int i2, int i3, int i4) {

    }

    public void setDatePicker(DatePicker datePicker, int i, int i2, int i3) {

    }

    public void setTimePicker(int i, int i2, int i3) {

    }

    public void setTimePicker(TimePicker timePicker, int i, int i2) {

    }

    public void setProgressBar(int i, int i2) {

    }

    public void setProgressBar(ProgressBar progressBar, int i) {

    }

    public void setNavigationDrawer(int i) {

    }

    public void setSlidingDrawer(int i, int i2) {

    }

    public void setSlidingDrawer(SlidingDrawer slidingDrawer, int i) {

    }

    public void enterText(int i, String s) {

    }

    public void enterText(EditText editText, String s) {

    }

    public void enterTextInWebElement(By by, String s) {

    }

    public void typeText(int i, String s) {

    }

    public void typeText(EditText editText, String s) {

    }

    public void typeTextInWebElement(By by, String s) {

    }

    public void typeTextInWebElement(By by, String s, int i) {

    }

    public void typeTextInWebElement(WebElement webElement, String s) {

    }

    public void clearEditText(int i) {

    }

    public void clearEditText(EditText editText) {

    }

    public void clearTextInWebElement(By by) {

    }

    public void clickOnImage(int i) {

    }

    public EditText getEditText(int i) {
        return null;
    }

    public Button getButton(int i) {
        return null;
    }

    public TextView getText(int i) {
        return null;
    }

    public ImageView getImage(int i) {
        return null;
    }

    public ImageButton getImageButton(int i) {
        return null;
    }

    public View getView(int i) {
        return null;
    }

    public View getView(int i, int i2) {
        return null;
    }

    public View getView(String s) {
        return null;
    }

    public View getView(String s, int i) {
        return null;
    }

    public <T extends View> T getView(Class<T> tClass, int i) {
        return null;
    }

    public WebElement getWebElement(By by, int i) {
        return null;
    }

    public String getWebUrl() {
        return null;
    }

    public ArrayList<View> getCurrentViews() {
        return null;
    }

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> tClass) {
        return null;
    }

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> tClass, boolean b) {
        return null;
    }

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> tClass, View view) {
        return null;
    }

    public <T extends View> ArrayList<T> getCurrentViews(Class<T> tClass, boolean b, View view) {
        return null;
    }

    public ArrayList<WebElement> getWebElements() {
        return null;
    }

    public ArrayList<WebElement> getWebElements(By by) {
        return null;
    }

    public ArrayList<WebElement> getCurrentWebElements() {
        return null;
    }

    public ArrayList<WebElement> getCurrentWebElements(By by) {
        return null;
    }

    public boolean isTextChecked(String s) {
        return false;
    }

    public void hideSoftKeyboard() {

    }

    public void unlockScreen() {

    }

    public void goBackToActivity(String s) {

    }

    public boolean waitForActivity(String s) {
        return false;
    }

    public boolean waitForActivity(Class<? extends Activity> aClass) {
        return false;
    }

    public boolean isSatisfied() {
        return false;
    }

    public boolean waitForFragmentByTag(String s) {
        return false;
    }

    public boolean waitForFragmentByTag(String s, int i) {
        return false;
    }

    public boolean waitForFragmentById(int i) {
        return false;
    }

    public boolean waitForFragmentById(int i, int i2) {
        return false;
    }

    public boolean waitForLogMessage(String s) {
        return false;
    }

    public boolean waitForLogMessage(String s, int i) {
        return false;
    }

    public void clearLog() {

    }

    public void finishOpenedActivities() {

    }

    public void takeScreenshot() {

    }

    public void takeScreenshot(String s) {

    }

    public void takeScreenshot(String s, int i) {

    }

    public void startScreenshotSequence(String s) {

    }

    public void startScreenshotSequence(String s, int i, int i2, int i3) {

    }

    public void stopScreenshotSequence() {

    }
}
