package jp.leafytree.android.hello

import android.test.ActivityInstrumentationTestCase2
import android.widget.TextView
import jp.test.Eval
import junit.framework.Assert

class HelloActivityTest extends ActivityInstrumentationTestCase2[HelloActivity](classOf[HelloActivity]) {
  def test1() {
    Assert.assertTrue(true)
  }

  def test2() {
    Eval.run0()
  }
  
  def test3() {
    Eval.run1()
  }
}
