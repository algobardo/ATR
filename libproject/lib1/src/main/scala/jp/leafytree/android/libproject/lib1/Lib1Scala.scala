package jp.leafytree.android.libproject.lib1

import scala.tools.nsc.Settings
import scala.tools.nsc.interpreter.{IMain, ILoop}

object Repl extends App {
  
  /*def repl = new ILoop {

  }*/

  def run0() = {

    IMain.stripString("kjhsdjkhdsgjkhdshjksdfjh,fwhjfwjhfwjhewjh")

  }
  
  def run1() = {
    /*val settings = new Settings
    settings.Yreplsync.value = true //Do not use async code
    settings.embeddedDefaults[Repl.type]
*/
    //repl.process(settings)

    ILoop.run("val x = 5")
  }
}

