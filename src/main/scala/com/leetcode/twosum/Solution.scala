package com.leetcode.twosum

import java.lang.annotation.Target
import scala.annotation.tailrec
import scala.util.control.Breaks.{break, breakable}
import scala.collection.immutable._

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var result = Tuple2(-1, -1)
    breakable {
      for (i <- nums.indices) {
        for (j <- (i + 1) until nums.length) {
          if (nums(i) + nums(j) == target) {
            result = Tuple2(i, j)
            break
          }
        }
      }
    }
    Array(result._1, result._2)
  }


  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    @tailrec
    def _twoSum2(nums: Array[Int], target: Int, start: Int, next: Int): Array[Int] = {
      println(s"check ${nums.mkString("[",",","]")} index[$start:${nums(start)}], index[$next:${nums(next)}] by target $target ")
      if (nums(start) + nums(next) == target) { Array(start, next) }
      else {
        if (next < nums.length - 1) {
          val newVal = if(next == nums.length -1 ) nums.length -1 else next + 1
          println(s"not match target then start:$start , increase next:$newVal")
          _twoSum2(nums, target, start, newVal)
        } else {
          val newVal = start + 1
          println(s"end of next then up step start: $newVal , next: ${newVal + 1}")
          _twoSum2(nums, target, newVal, newVal + 1)
        }
      }
    }

    _twoSum2(nums, target, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    var res1 = Array(-1, -1)
    //    res1 = twoSum(Array(2, 7, 11, 15), 9)
    //    println(res1(0) + "," + res1(1))
    //    res1 = (twoSum(Array(3, 2, 4), 6))
    //    println(res1(0) + "," + res1(1))
    //    res1 = (twoSum(Array(3, 3), 6))
    //    println(res1(0) + "," + res1(1))
//    res1 = (twoSum(Array(2, 5, 5, 11), 10))
//    println(res1(0) + "," + res1(1))
    //
    //    res1 = twoSum2(Array(2, 7, 11, 15), 9)
    //    println(res1(0) + "," + res1(1))
    //    res1 = twoSum2(Array(3, 2, 4), 6)
    //    println(res1(0) + "," + res1(1))
    //    res1 = twoSum2(Array(3, 3), 6)
    //    println(res1(0) + "," + res1(1))
    //
//    res1 = twoSum2(Array(3, 2, 3), 6)
//    println(res1(0) + "," + res1(1))
    //
    res1 = twoSum2(Array(2, 5, 5, 11), 10)
    println(res1(0) + "," + res1(1))
  }
}