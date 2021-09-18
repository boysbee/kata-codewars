package com.codewars.reversestring

import org.scalatest.funsuite.AnyFunSuite
/**
  * Created by boysbee on 9/6/2016.
  */
class ReverseTest extends AnyFunSuite :

  test("it should return \"1\" when put \"1\""){
    val actual = Reverse.reverse("1");
    assert( "1" == actual)
  }

  test("it should return \"12\" when put \"21\""){
    val actual = Reverse.reverse("12");
    assert( "21" == actual)
  }

  test("it should return \"123\" when put \"321\""){
    val actual = Reverse.reverse("123");
    assert( "321" == actual)
  }

  test("it should return \"1234\" when put \"4321\""){
    val actual = Reverse.reverse("1234");
    assert( "4321" == actual)
  }
  test("it should return \"12345\" when put \"54321\""){
    val actual = Reverse.reverse("12345");
    assert( "54321" == actual)
  }
end ReverseTest
