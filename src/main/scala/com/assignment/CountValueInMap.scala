package com.assignment

object CountValueInMap  {
    case class Transactions(originalId: String, destinationId: String) {
        def key: String = { s"${this.originalId}_${this.destinationId}"}
    }
    def count(list: List[Transactions]): Map[String,Int] = list.groupMapReduce(_.key)(_ => 1)(_ + _)

    def main(args: Array[String]): Unit = {
        println(count(List(Transactions("A","B"),
            Transactions("A","B"), Transactions("B", "A"),
            Transactions("B","C"),Transactions("A","C"))))
    }
}