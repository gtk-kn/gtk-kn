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
