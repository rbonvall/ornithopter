libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"     % "3.2.0"            % Test
, "org.scala-lang" %  "scala-reflect" % scalaVersion.value % Provided
, "com.propensive" %% "magnolia"      % "0.16.0"
)
