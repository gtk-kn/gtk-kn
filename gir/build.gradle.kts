/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

plugins {
    alias(libs.plugins.kotlin.jvm)
    application
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlinx.serialization)
    id("detekt-conventions")
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
            val propertyValue = project.extra.get("org.gtkkn.configFile") as String
            if (!propertyValue.startsWith("/")) {
                "$rootDir/$propertyValue"
            } else {
                propertyValue
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

// Configure each subproject with cleanBindings to depend on the run task
gradle.projectsEvaluated {
    rootProject.subprojects.forEach { subproject ->
        subproject.tasks.findByName("cleanBindings")?.let { cleanTask ->
            // Add the cleanBindings task as a dependency for the gir:run task
            rootProject.tasks.getByPath(":gir:run").dependsOn(cleanTask)
        }
    }
}

dependencies {
    implementation(libs.bundles.kotlin.logging.jvm)
    implementation(libs.bundles.ktlint)
    implementation(libs.kasechange)
    implementation(libs.kotlin.inject.runtime)
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinx.cli)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.serialization.json)
    ksp(libs.kotlin.inject.compiler)
    testImplementation(libs.kotlin.test.junit5)
}
