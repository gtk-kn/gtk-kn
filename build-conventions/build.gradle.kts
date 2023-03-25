// Sharing build logic between subprojects
// https://docs.gradle.org/current/samples/sample_convention_plugins.html

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.detekt)
    implementation(libs.plugin.spotless)
    implementation(libs.plugin.dokka)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
