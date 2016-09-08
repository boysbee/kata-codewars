name := "kata-codewars"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "3.0.0" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test" exclude("junit", "junit-dep")
)