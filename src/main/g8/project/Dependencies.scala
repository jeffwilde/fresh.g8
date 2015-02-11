import sbt._

object Version {
  val scala     = "2.11.5"
  val logback   = "1.1.2"
  val scalaTest = "2.2.3"
  val scalactic = "2.2.3"
}

object Library {
  val logbackClassic = "ch.qos.logback"    %  "logback-classic" % Version.logback
  val scalaTest      = "org.scalatest"     %% "scalatest"       % Version.scalaTest
  val scalactic      = "org.scalactic"     %% "scalactic"       % Version.scalactic
}
