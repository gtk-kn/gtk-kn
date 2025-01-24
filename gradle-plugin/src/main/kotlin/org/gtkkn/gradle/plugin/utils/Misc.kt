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
package org.gtkkn.gradle.plugin.utils

import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionContainer
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.findByType
import org.gtkkn.gradle.plugin.config.repositoryAnnotations
import org.gtkkn.gradle.plugin.ext.GtkKnExt
import org.gtkkn.gradle.plugin.ext.capitalized
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

internal inline fun <reified T : Any> ExtensionContainer.maybeCreate(name: String, init: T.() -> Unit) =
    (findByType<T>() ?: create<T>(name)).apply(init)

internal val KotlinNativeCompilation.qualifiedName get() = "${target.name.capitalized()}${name.capitalized()}"

internal fun configureOptInAnnotations(project: Project) {
    val gtkKnExt = project.extensions.getByType(GtkKnExt::class.java)
    val repositoryVersions = gtkKnExt.targetLibraryVersions.getOrElse(emptyMap())

    val annotationsToOptIn = mutableSetOf<String>()

    // default annotations
    annotationsToOptIn.add("kotlinx.cinterop.ExperimentalForeignApi")

    repositoryVersions.forEach { (repositoryName, userVersion) ->
        val annotations = repositoryAnnotations[repositoryName].orEmpty()
        annotations.forEach { (annotationVersion, annotationFqName) ->
            if (compareVersions(annotationVersion, userVersion) <= 0) {
                annotationsToOptIn.add(annotationFqName)
            }
        }
    }

    if (annotationsToOptIn.isNotEmpty()) {
        // Configure the Kotlin compiler
        project.extensions.findByType(KotlinMultiplatformExtension::class.java)?.sourceSets?.configureEach {
            val languageSettings = languageSettings
            annotationsToOptIn.forEach { annotationFqName ->
                languageSettings.optIn(annotationFqName)
            }
        }
    }
}

private fun compareVersions(v1: String, v2: String): Int {
    val parts1 = v1.split('.').map { it.toIntOrNull() ?: 0 }
    val parts2 = v2.split('.').map { it.toIntOrNull() ?: 0 }
    val maxLength = maxOf(parts1.size, parts2.size)
    for (i in 0 until maxLength) {
        val p1 = parts1.getOrElse(i) { 0 }
        val p2 = parts2.getOrElse(i) { 0 }
        if (p1 != p2) {
            return p1.compareTo(p2)
        }
    }
    return 0
}
