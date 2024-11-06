/*
 * Copyright (c) 2023 gtk-kn
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
import org.gtkkn.gradle.plugin.ext.GtkExt
import org.gtkkn.gradle.plugin.ext.capitalized
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import java.io.File

internal inline fun <reified T : Any> ExtensionContainer.maybeCreate(name: String, init: T.() -> Unit) =
    (findByType<T>() ?: create<T>(name)).apply(init)

internal val KotlinNativeCompilation.qualifiedName get() = "${target.name.capitalized()}${name.capitalized()}"

internal fun configureOptInAnnotations(project: Project) {
    val gtkExt = project.extensions.getByType(GtkExt::class.java)
    val repositoryVersions = gtkExt.targetLibraryVersions.getOrElse(emptyMap())

    // Path to the optInAnnotations.txt file
    val optInAnnotationsFile = project.rootProject.file("bindings/optInAnnotations.txt")

    if (!optInAnnotationsFile.exists()) {
        project.logger.warn("optInAnnotations.txt not found at ${optInAnnotationsFile.path}")
        return
    }

    // Parse the annotations
    val repositoryAnnotations = parseOptInAnnotationsFile(optInAnnotationsFile)

    val annotationsToOptIn = mutableSetOf<String>()

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

private fun parseOptInAnnotationsFile(optInAnnotationsFile: File): Map<String, List<Pair<String, String>>> {
    val repositoryAnnotations = mutableMapOf<String, MutableList<Pair<String, String>>>()
    if (optInAnnotationsFile.exists()) {
        optInAnnotationsFile.forEachLine { line ->
            val annotationFqName = line.trim()
            if (annotationFqName.isNotEmpty()) {
                // Example: org.gtkkn.bindings.adw.annotations.AdwVersion1_4
                val parts = annotationFqName.split('.')
                if (parts.size >= 6) {
                    // parts[3] = adw
                    // parts[5] = AdwVersion1_4
                    val repositoryName = parts[3]
                    val className = parts[5]

                    // Extract version from class name
                    val prefix = repositoryName.capitalized() + "Version"
                    val versionPart = className.removePrefix(prefix)
                    val version = versionPart.replace('_', '.')

                    val annotationsList = repositoryAnnotations.getOrPut(repositoryName) { mutableListOf() }
                    annotationsList.add(version to annotationFqName)
                }
            }
        }
    }
    return repositoryAnnotations
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
