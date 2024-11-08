/*
 * Copyright (c) 2024 gtk-kn
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

import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("io.gitlab.arturbosch.detekt")
}

val libs = the<LibrariesForLibs>()

detekt {
    toolVersion = libs.versions.detekt.get()
    source.from(
        DetektExtension.DEFAULT_SRC_DIR_KOTLIN,
        DetektExtension.DEFAULT_TEST_SRC_DIR_KOTLIN,
        "src/nativeMain/kotlin",
        "src/nativeTest/kotlin",
    )
    parallel = true
    autoCorrect = true
}

dependencies {
    detektPlugins(libs.detekt)
}

tasks {
    named("check") {
        dependsOn(withType<Detekt>())
    }
}
