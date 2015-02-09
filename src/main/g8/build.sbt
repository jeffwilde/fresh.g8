lazy val $project$ = project.in(file("."))

name := "$project$"

libraryDependencies ++= List(
)

initialCommands := """|import $organization$.$project$._""".stripMargin
