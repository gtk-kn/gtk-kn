@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    // Prevent loading the Kotlin Gradle plugin multiple times
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    id("spotless-conventions")
}

tasks.register("generateBindings") {
    dependsOn(":gir:run")
    dependsOn("spotlessApply")
    group = BasePlugin.BUILD_GROUP
}

afterEvaluate {
    tasks.named("spotlessApply") {
        mustRunAfter(":gir:run")
    }
}

tasks.withType<Wrapper> {
    description = "Regenerates the Gradle Wrapper files"
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = libs.versions.gradle.get()
}
