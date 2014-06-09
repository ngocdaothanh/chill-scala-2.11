organization := "tv.cntt"

name         := "chill-scala"

version      := "1.1-SNAPSHOT"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.11.1", "2.10.4")

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

//------------------------------------------------------------------------------

libraryDependencies += "com.esotericsoftware.kryo" % "kryo" % "2.21"
