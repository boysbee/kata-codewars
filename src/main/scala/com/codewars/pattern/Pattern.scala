package com.codewars.pattern

import scala.annotation.tailrec

import scala.util.control.Breaks.break

object Pattern {
  def pattern(n: Int): String = {
    if (n <= 0) {
      return ""
    }
    def line(n: Int): String = n.to(1).by(-1).toList.mkString
    def completePattern(n: Int, fn: Int => String): String = n.to(1).by(-1).map(fn).toList.mkString("\n")
    completePattern(n, line)
  }
}
