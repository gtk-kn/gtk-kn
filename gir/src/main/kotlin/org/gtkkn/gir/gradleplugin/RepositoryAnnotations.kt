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

package org.gtkkn.gir.gradleplugin

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import org.gtkkn.gir.ext.capitalized
import org.gtkkn.gir.generator.BindingsGenerator.Companion.PAIR_TYPE
import org.gtkkn.gir.generator.KtLintFormatter
import java.io.File

internal fun generateRepositoryAnnotationsFile(optInAnnotationsFile: File, gradlePluginDir: File) {
    val className = ClassName("org.gtkkn.gradle.plugin.config", "RepositoryAnnotations")
    val repositoryAnnotations = parseOptInAnnotationsFile(optInAnnotationsFile)

    // Prepare KotlinPoet code generation
    val mapEntries = repositoryAnnotations.map { (repositoryName, versions) ->
        val listInitializer = versions.joinToString(separator = ",\n") { (version, fqName) ->
            "\"%S\" to \"%S\"".format(version, fqName)
        }

        "\"$repositoryName\" to listOf(\n$listInitializer\n)"
    }.joinToString(separator = ",\n")

    val mapInitializer = CodeBlock.of("mapOf(\n$mapEntries\n)")

    val propertySpec = PropertySpec.builder(
        "repositoryAnnotations",
        MAP.parameterizedBy(STRING, LIST.parameterizedBy(PAIR_TYPE.parameterizedBy(STRING, STRING))),
    )
        .initializer(mapInitializer)
        .addAnnotation(
            AnnotationSpec.builder(Suppress::class)
                .addMember("%S", "all")
                .build(),
        )
        .addModifiers(KModifier.INTERNAL)
        .build()

    val fileSpec = FileSpec.builder(className)
        .indent("    ")
        .addFileComment("This is a generated file. Do not modify.")
        .addProperty(propertySpec)
        .build()

    val stringBuilder = StringBuilder()
    fileSpec.writeTo(stringBuilder)
    // Write the file to the specified directory
    val outputDir = gradlePluginDir.resolve("src/main/kotlin")
    KtLintFormatter(outputDir).formatAndWriteKotlinFile(
        outputDir,
        className.packageName,
        className.simpleName,
        stringBuilder.toString(),
    )
}

internal fun parseOptInAnnotationsFile(optInAnnotationsFile: File): Map<String, List<Pair<String, String>>> {
    // Sort the optInAnnotations.txt file
    val lines = optInAnnotationsFile.readLines().filter { it.isNotBlank() }.sorted()
    optInAnnotationsFile.printWriter().use { writer ->
        lines.forEach { writer.println(it) }
    }

    val repositoryAnnotations = mutableMapOf<String, MutableList<Pair<String, String>>>()
    lines.forEach { line ->
        val annotationFqName = line.trim()
        if (annotationFqName.isNotEmpty()) {
            val parts = annotationFqName.split('.')
            if (parts.size >= 6) {
                val repositoryName = parts[3]
                val className = parts[5]

                val prefix = repositoryName.capitalized() + "Version"
                val versionPart = className.removePrefix(prefix)
                val version = versionPart.replace('_', '.')

                val annotationsList = repositoryAnnotations.getOrPut(repositoryName) { mutableListOf() }
                annotationsList.add(version to annotationFqName)
            }
        }
    }
    return repositoryAnnotations
}
