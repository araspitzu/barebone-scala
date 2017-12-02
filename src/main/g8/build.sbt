import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import scalariform.formatter.preferences._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "$organization$",
      scalaVersion    := "$scala_version$",
      version         := "0.0.1",
      mainClass in Compile := Some("example.AppEntryPoint"),
      ScalariformKeys.preferences := scalariformPref.value
    )),
    name := "$name$",
    libraryDependencies ++= Seq(
    )
  )

lazy val scalariformPref = Def.setting {
  ScalariformKeys.preferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DanglingCloseParenthesis, Preserve)
    .setPreference(CompactStringConcatenation, true)
}
