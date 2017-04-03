name := "scala_test_base_template"

version := "1.0"

scalaVersion := "2.11.9"

scalacOptions ++= Seq(
  "-Xlint",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  //  "-Ywarn-unused",
  //  "-Ywarn-unused-import",
  "-Ywarn-value-discard",
  "-Xelide-below", "ALL"
)
scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies ++= (Seq(
) ++ Seq( // scalatest
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
) ++ Seq( // specs2
  "org.specs2" %% "specs2-core" % "3.8.9" % "test"
))
