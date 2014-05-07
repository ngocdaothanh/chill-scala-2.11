organization := "tv.cntt"

name         := "chill-scala-2.11"

version      := "1.0-SNAPSHOT"

scalaVersion := "2.11.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

//------------------------------------------------------------------------------

libraryDependencies += "com.esotericsoftware.kryo" % "kryo" % "2.21"
