package com.codewars.evenorodd

/**
  * Created by boysbee on 9/8/2016 AD.
  */
object EvenOrOdd {
  def evenOrOdd(number: Int): Option[String] = {
    number % 2 == 0 match {
      case true => Some("even")
      case false => Some("odd")
    }
  }

}
