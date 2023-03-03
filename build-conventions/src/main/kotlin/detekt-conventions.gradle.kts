import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("io.gitlab.arturbosch.detekt")
}

val libs = the<LibrariesForLibs>()

detekt {
    toolVersion = libs.versions.detekt.get()
    source = files("src/main/kotlin", "src/test/kotlin", "src/androidTest/kotlin")
    parallel = true
    autoCorrect = true
}

dependencies {
    detektPlugins(libs.detekt)
}

afterEvaluate {
    tasks.named("check").configure {
        dependsOn(tasks.named("detektMain"))
        dependsOn(tasks.named("detektTest"))
    }
}
