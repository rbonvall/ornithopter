libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"     % "3.0.5"            % Test
, "org.scala-lang" %  "scala-reflect" % scalaVersion.value % Provided
, "com.propensive" %% "magnolia"      % "0.16.0"
)
