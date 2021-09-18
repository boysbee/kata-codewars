val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "kata-codewars",
    version := "2.0.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test
    )
)
