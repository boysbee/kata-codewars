package com.codewars.reversestring

/**
  * Created by boysbee on 9/6/2016.
  */
object Reverse {
  def reverse(text: String): String = (for(i <- text.length until 0 by -1) yield text(i -1)).mkString

}
