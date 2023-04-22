/*
 * Copyright (c) 2023 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    alias(libs.plugins.kotlin.jvm)
    application
    alias(libs.plugins.kotlinx.serialization)
    id("detekt-conventions")
}

dependencies {
    implementation(libs.bundles.kotlin.logging.jvm)
    implementation(libs.bundles.ktlint)
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinx.cli)
    implementation(libs.kotlinx.serialization.json)
    testImplementation(libs.kotlin.test.junit5)
}

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}

application {
    mainClass.set("org.gtkkn.gir.MainKt")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
    named<JavaExec>("run") {
        description = "Generate source code from introspective files"
        // https://github.com/pinterest/ktlint/issues/1391#issuecomment-1336221448
        jvmArgs = mutableListOf("--add-opens=java.base/java.lang=ALL-UNNAMED")
        val configFile = if (project.extra.has("org.gtkkn.configFile")) {
            var cf = project.extra.get("org.gtkkn.configFile") as String
            if (!cf.startsWith("/")) {
                "$rootDir/$cf"
            } else {
                cf
            }
        } else {
            "$rootDir/gtkkn.json"
        }
        args = listOf(
            "--configFile",
            configFile,
        )
        inputs.file(configFile)
        inputs.properties(
            "GTK_KN_LICENSE" to System.getenv("GTK_KN_LICENSE").orEmpty(),
            "GTK_KN_LOG_LEVEL" to System.getenv("GTK_KN_LOG_LEVEL").orEmpty(),
            "GTK_KN_SKIP_FORMAT" to System.getenv("GTK_KN_SKIP_FORMAT").orEmpty(),
        )
    }

    compileJava {
        options.compilerArgs.add("-Xlint:deprecation")
        options.compilerArgs.add("-Xlint:unchecked")
    }
}
