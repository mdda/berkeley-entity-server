// Project name (artifact name in Maven)
name := "berkeleyentityserver"

// orgnization name (e.g., the package name of the project)
organization := "com.redcatlabs"

version := "0.1-SNAPSHOT"

// project description
description := "Berkeley Entity Resolution Server"

// Enables publishing to maven repo
publishMavenStyle := true

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// library dependencies. (orginization name) % (project name) % (version)

// These are for the SparkJava REST API piece
libraryDependencies ++= Seq(
   "com.sparkjava" % "spark-core" % "2.2"
)

// This is for when we need just simple JSON for POST (input) parsing
libraryDependencies ++= Seq(
   "com.googlecode.json-simple" % "json-simple" % "1.1"
)

// This is for when we need more explicit control over json serialization 
libraryDependencies ++= Seq(
//   "com.google.code.gson" % "gson" % "2.3.1"
)

// The berkeley parser .jar needs to be in the ./lib/ folder
