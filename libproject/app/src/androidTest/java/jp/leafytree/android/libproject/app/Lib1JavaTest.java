package jp.leafytree.android.libproject.app;

import android.test.ActivityInstrumentationTestCase2;
import jp.leafytree.android.libproject.AppActivity;
import junit.framework.TestCase;
import junit.framework.Assert;
import jp.leafytree.android.libproject.lib1.Repl;

public class Lib1JavaTest extends ActivityInstrumentationTestCase2<AppActivity> {
    
    public Lib1JavaTest(Class c){
        super(c);
    }

    void testLib0() {
        Repl.run0();
    }

    void testLib1() {
        Repl.run1();
    }
}