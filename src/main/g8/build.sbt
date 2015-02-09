lazy val $artifact$ = project.in(file("."))

name := "$artifact$"

libraryDependencies ++= List(
)

initialCommands := """|import $organization$.$artifact$._""".stripMargin
