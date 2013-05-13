organization := "net.surguy.less"

name := "less"

version := "0.2-SNAPSHOT"

scalaVersion := "2.10.1"

libraryDependencies += "org.slf4j" % "jcl-over-slf4j" % "1.6.1"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.7"

libraryDependencies += "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.2"

libraryDependencies += "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2"

libraryDependencies += "junit" % "junit" % "4.8.2" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "1.14" % "test"

libraryDependencies += "rhino" % "js" % "1.7R2" % "test"
