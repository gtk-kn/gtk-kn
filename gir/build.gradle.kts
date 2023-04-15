/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

import org.jetbrains.kotlin.config.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    alias(libs.plugins.kotlin.jvm)
    application
    id("detekt-conventions")
}

dependencies {
    implementation(libs.bundles.kotlin.logging.jvm)
    implementation(libs.bundles.ktlint)
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinx.cli)
    testImplementation(libs.kotlin.test.junit5)
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JvmTarget.JVM_17.description
}


tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("org.gtkkn.gir.MainKt")
}

tasks.named<JavaExec>("run") {
    val configFile: String? = project.extra.get("org.gtkkn.configFile") as? String
    description = "Generate source code from introspective files"
    // https://github.com/pinterest/ktlint/issues/1391#issuecomment-1336221448
    jvmArgs = mutableListOf("--add-opens=java.base/java.lang=ALL-UNNAMED")
    args = mutableListOf<String>().apply {
        if (configFile != null) {
            add("-c")
            add(configFile)
        }
    }
}

repositories {
    mavenCentral()
}


tasks.compileJava {
    options.compilerArgs.add("-Xlint:deprecation")
    options.compilerArgs.add("-Xlint:unchecked")
}
