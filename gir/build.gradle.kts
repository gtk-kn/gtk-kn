import org.jetbrains.kotlin.config.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    alias(libs.plugins.kotlin.jvm)
    application
    id("detekt-conventions")
}

dependencies {
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinx.cli)
    testImplementation(libs.kotlin.test.junit5)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JvmTarget.JVM_11.description
}


tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("org.gtkkn.gir.MainKt")
}

tasks.named("run") {
    description = "Generate source code from introspective files"
}

tasks.compileJava {
    options.compilerArgs.add("-Xlint:deprecation")
    options.compilerArgs.add("-Xlint:unchecked")
}
