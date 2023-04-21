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
    jvmToolchain(17)
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
        args = buildList {
            if (project.extra.has("org.gtkkn.configFile")) {
                var configFile = project.extra.get("org.gtkkn.configFile") as String
                if (!configFile.startsWith("/")) {
                    configFile = "$rootDir/$configFile"
                }
                add("--configFile")
                add(configFile)
            }
        }
    }

    compileJava {
        options.compilerArgs.add("-Xlint:deprecation")
        options.compilerArgs.add("-Xlint:unchecked")
    }
}
