ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.0-RC1-bin-20231205-7480582-NIGHTLY"

lazy val root = (project in file("."))
  .settings(
    name := "scala3-caprese-exercise",
    scalacOptions ++= Seq(
      "-language:experimental.saferExceptions",
      "-language:experimental.captureChecking",
      "-Ycc-new"
    )
  )
