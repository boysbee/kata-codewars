package com.codewars.order_please


object Order {


  //
  // Best practice
  // def order(str: String): String = str.split(' ').sortBy(_.find(_.isDigit)).mkString(" ")
  //

  // My code
  def order(str: String): String = {
    if ("".equals(str)) {
      return ""
    }
    val s = str.split(" ")
    val a = new Array[String](s.length + 1)

    def toInt(s: String): Option[Int] = {
      try {
        Some(Integer.parseInt(s.trim))
      } catch {
        case e: Exception => None
      }
    }

    s.foreach(v => {
      v.toCharArray.foreach(v1 => {
        toInt(v1.toString) match {
          case Some(i) => a(i) = v
          case _ => None
        }
      })
    })
    a.filter(a1 => a1 != null).mkString(" ")
  }
}