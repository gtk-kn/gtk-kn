/*
 * Copyright (c) 2024 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
