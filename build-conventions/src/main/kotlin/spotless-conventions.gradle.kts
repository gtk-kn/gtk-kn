import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("com.diffplug.spotless")
}

val libs = the<LibrariesForLibs>()

spotless {
    kotlin {
        target("**/*.kt")
        targetExclude("$buildDir/**/*.kt", "build-conventions/build/**/*.kt")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    kotlinGradle {
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    format("misc") {
        // define the files to apply `misc` to
        target("**/*.md", "**/.gitignore")

        // define the steps to apply to those files
        indentWithSpaces()
        trimTrailingWhitespace()
        endWithNewline()
    }
}
