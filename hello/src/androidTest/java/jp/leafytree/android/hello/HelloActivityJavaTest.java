package jp.leafytree.android.hello;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class HelloActivityJavaTest extends ActivityInstrumentationTestCase2<HelloActivity> {
    public HelloActivityJavaTest() {
        super(HelloActivity.class);
    }

    public void test1() {
        assertTrue(true);
    }

    public void test2() {

    }
}
