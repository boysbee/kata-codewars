package com.codewars.findgcf

/**
  * Created by boysbee on 9/8/2016 AD.
  */
class FindGCF {
  def findGCF(number1: Int, number2: Int): Int = if(number2 == 0) number1 else findGCF(number2, number1 % number2)

}
