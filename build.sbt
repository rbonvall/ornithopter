ThisBuild / scalaVersion := "2.13.3"

ThisBuild / organization := "cl.mez"

lazy val ornithopter = project.in(file("."))
  .aggregate(
    core
  )

lazy val core = project.in(file("core"))


