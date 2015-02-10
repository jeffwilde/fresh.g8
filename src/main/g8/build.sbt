lazy val $name;format="lower,word-only"$ = project.in(file("."))

name := "$name;format="lower,word-only"$"

libraryDependencies ++= List(
)

initialCommands := """|import $organization$.$name;format="lower,word-only"$._""".stripMargin
