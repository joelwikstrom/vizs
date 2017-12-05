package se.selectstjarna.vizs

import org.scalajs.dom

import scala.scalajs.js


object Main extends js.JSApp {
  def main(): Unit = {

    val svg = Viz.Viz("digraph { a -> b; }")
    dom.document.getElementById("playground").innerHTML = svg
  }

}
