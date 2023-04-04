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
