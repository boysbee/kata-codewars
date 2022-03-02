package com.codewars.pattern

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PatternTest extends AnyFlatSpec with Matchers {
  it should "return empty" in {
    Pattern.pattern(0) should equal("")
  }

  it should "return empty less than 0" in {
    Pattern.pattern(-99) should equal("")
  }
  it should "return 1" in {
    val result = Pattern.pattern(1)
    result should equal("1")
  }

  it should "return 21" in {
    val result = Pattern.pattern(2)
    result should equal(s"21\n1")
  }

  it should "return 321" in {
    val result = Pattern.pattern(3)
    result should equal(s"321\n21\n1")
  }

  it should "return 4321" in {
    val result = Pattern.pattern(4)
    result should equal(s"4321\n321\n21\n1")
  }

  it should "return 54321" in {
    val result = Pattern.pattern(5)
    result should equal(s"54321\n4321\n321\n21\n1")
  }

  it should "return 654321" in {
    val result = Pattern.pattern(6)
    result should equal(s"654321\n54321\n4321\n321\n21\n1")
  }
}
