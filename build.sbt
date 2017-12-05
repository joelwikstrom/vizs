// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "Vizs"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.1"

testFrameworks += new TestFramework("utest.runner.Framework")

skip in packageJSDependencies := false

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1"
)


scalaJSUseMainModuleInitializer := true
jsDependencies += "org.webjars.npm" % "viz.js" % "1.7.0" / "1.7.0/viz.js"
