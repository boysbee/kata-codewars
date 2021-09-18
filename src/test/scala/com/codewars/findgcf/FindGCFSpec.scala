package com.codewars.findgcf

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest._
import matchers.should._

/**
  * Created by boysbee on 9/8/2016 AD.
  */
class FindGCFSpec extends AnyFlatSpec with Matchers {
  val finder: FindGCF = new FindGCF
  it should "return 2 when find gcf with 2,2" in {
    val result = finder.findGCF(2, 2)
    2 should equal(result)
  }
  it should "return 4 when find gcf with 8 and 20" in {
    val result = finder.findGCF(8, 20)
    4 should equal(result)
  }
  it should "return 1 when find gcf with 5 and 13" in {
    val result = finder.findGCF(5, 13)
    1 should equal(result)
  }
  it should "return 100 when find gcf with 100 and 100" in {
    val result = finder.findGCF(100, 100)
    100 should equal(result)
  }
}
