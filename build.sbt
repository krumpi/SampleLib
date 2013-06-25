name          := "Venolve Sample Library"

organization  := "com.venolve"

version       := "0.1-SNAPSHOT"

scalaVersion  := "2.10.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= Seq(
  "org.mongodb"         %%  "casbah"          % "2.6.1"
)

publishTo := Some("Artifactory Realm" at "http://50.56.177.120:8081/artifactory/libs-snapshot-local")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")