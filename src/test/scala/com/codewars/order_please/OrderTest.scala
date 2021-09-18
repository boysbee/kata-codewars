package com.codewars.order_please

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest._
import matchers.should._

class OrderTest extends AnyFlatSpec with Matchers {

  "order(\"is2 Thi1s T4est 3a\")" should "return \"Thi1s is2 3a T4est\"" in {
    Order.order("is2 Thi1s T4est 3a") should be("Thi1s is2 3a T4est")
  }
}