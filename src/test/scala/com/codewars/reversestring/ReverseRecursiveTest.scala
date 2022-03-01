package com.codewars.reversestring

import org.scalatest.funsuite.AnyFunSuite

/**
  * Created by boysbee on 9/6/2016.
  */
class ReverseRecursiveTest extends AnyFunSuite :

  test("it should return \"1\" when put \"1\""){
    val actual = Reverse.recursiveReverse("1");
    assert( actual == "1")
  }

  test("it should return \"12\" when put \"21\""){
    val actual = Reverse.recursiveReverse("12");
    assert( actual == "21")
  }

  test("it should return \"123\" when put \"321\""){
    val actual = Reverse.recursiveReverse("123");
    assert( actual == "321")
  }

  test("it should return \"1234\" when put \"4321\""){
    val actual = Reverse.reverse("1234");
    assert( actual == "4321" )
  }
  test("it should return \"12345\" when put \"54321\""){
    val actual = Reverse.recursiveReverse("12345");
    assert( actual == "54321")
  }
end ReverseRecursiveTest

