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

// Sharing build logic between subprojects
// https://docs.gradle.org/current/samples/sample_convention_plugins.html

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.plugin.detekt)
    implementation(libs.plugin.dokka)
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.spotless)
    implementation(libs.plugin.versions)
    implementation(libs.plugin.versions.update)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
