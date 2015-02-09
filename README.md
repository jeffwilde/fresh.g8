# Fresh Simple Scala Template
A [giter8] template which builds a simple [sbt] skeleton project to get your Scala coding off to a fresh start.

The generated project is configured with [ScalaTest], stub project package, and aims to keep up with sbt best practices.

# Usage
First install g8 by following the [readme](http://github.com/n8han/giter8#readme).
Then simply run the following shell command:

    g8 jeffwilde/fresh

There are some properties that need to be specified (most can be left default)

| property | what it does
|---       |---
| title | A title for the project's README
| description | A description for the project's README
| organization | Basis for the containing package name
| artifact | Project artifact and package name

After g8 has finished:

    cd <name>
    sbt test
    sbt run

Now that you're off to a fresh start, warm up your magic coding fingers and make something great!

# Author
Jeff Wilde <jeff@robo.ai>

# Licence
Copyright 2015 Complicated Robot Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

[giter8]: https://github.com/n8han/giter8
[sbt]: http://www.scala-sbt.org/
[scalatest]: http://www.scalatest.org/