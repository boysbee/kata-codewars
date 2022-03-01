package com.codewars.reversestring

import scala.annotation.tailrec

object Reverse {
  def reverse(text: String): String = (for (i <- text.length until 0 by -1) yield text(i - 1)).mkString

  def recursiveReverse(text: String): String = {
    def _reverse(t: String, ac: String): String = {
      if (t.length == 0) ""
      else ac.appended(t.last) + _reverse(t.substring(0, t.length - 1), ac)
    }

    _reverse(text, "")
  }
}
