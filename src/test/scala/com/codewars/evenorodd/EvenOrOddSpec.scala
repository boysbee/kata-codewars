package com.codewars.evenorodd

import org.scalatest.funsuite.AnyFunSuite

/**
  * Created by boysbee on 9/8/2016 AD.
  */
class EvenOrOddTest extends AnyFunSuite: 
  test("return \"odd\" when put 3") {
    assert("odd" == EvenOrOdd.evenOrOdd(3).get)
  }
  test("return \"even\" when put 6") {
    assert("even" == EvenOrOdd.evenOrOdd(6).get)
  }
end EvenOrOddTest