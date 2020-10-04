ThisBuild / scalaVersion := "2.13.3"

ThisBuild / organization := "cl.mez"

scalacOptions += "-Ymacro-annotations"

lazy val ornithopter = project.in(file("."))
  .aggregate(
    core
  )

lazy val core = project.in(file("core"))


