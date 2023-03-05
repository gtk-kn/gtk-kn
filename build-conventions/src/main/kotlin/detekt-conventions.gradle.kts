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
        tasks.findByName("detektMain")?.let { dependsOn(it) }
        tasks.findByName("detektTest")?.let { dependsOn(it) }
        tasks.findByName("detektJsMain")?.let { dependsOn(it) }
        tasks.findByName("detektJsTest")?.let { dependsOn(it) }
        tasks.findByName("detektJvmMain")?.let { dependsOn(it) }
        tasks.findByName("detektJvmTest")?.let { dependsOn(it) }
        tasks.findByName("detektNativeMain")?.let { dependsOn(it) }
        tasks.findByName("detektNativeTest")?.let { dependsOn(it) }
    }
}
