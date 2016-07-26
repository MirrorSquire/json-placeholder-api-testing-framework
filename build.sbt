name := "json-placeholder-api-testing-framework"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.6",
  "io.spray" %% "spray-json" % "1.3.2",
  "com.mashape.unirest" % "unirest-java" % "1.4.9",
  "com.typesafe" % "config" % "1.3.0",
  "org.scala-lang" % "scala-reflect" % "2.11.8",
  "org.scala-lang.modules" % "scala-parser-combinators_2.11" % "1.0.4",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.4"
)