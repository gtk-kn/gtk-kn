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

package org.gtkkn.gradle.plugin.task

import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.utils.qualifiedName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

abstract class CompileGSchemasTask : GtkTask() {
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    @get:OutputDirectory
    abstract val targetDir: DirectoryProperty

    @get:Input
    @get:Optional
    abstract val strict: Property<Boolean>

    @get:Input
    @get:Optional
    abstract val dryRun: Property<Boolean>

    @get:Input
    @get:Optional
    abstract val allowAnyName: Property<Boolean>

    override fun provideArguments(): List<String> = buildList {
        val target = targetDir.get().asFile
        target.mkdirs()
        add("--targetdir=${target.absolutePath}")
        if (strict.getOrElse(false)) add("--strict")
        if (dryRun.getOrElse(false)) add("--dry-run")
        if (allowAnyName.getOrElse(false)) add("--allow-any-name")
        add(sourceDir.get().asFile.absolutePath)
    }
}

private inline val KotlinNativeCompilation.copyGSchemasTaskName get() = "copyGSchemas${qualifiedName}"
private inline val KotlinNativeCompilation.compileGSchemasTaskName get() = "compileGSchemas${qualifiedName}"

internal fun Project.compileGSchemasTasks(target: KotlinNativeTarget) {
    target.compilations.configureEach {
        val processResources = tasks.named<Copy>(this@configureEach.processResourcesTaskName)
        val copyTask = tasks.register<Copy>(copyGSchemasTaskName) {
            dependsOn(processResources)
            from(processResources)
            into(temporaryDir)
            include("**/*.gschema.xml")
        }
        val compileTask = tasks.register<CompileGSchemasTask>(compileGSchemasTaskName) {
            dependsOn(copyTask)
            executable.convention("glib-compile-schemas")
            sourceDir.convention(layout.dir(provider { copyTask.get().destinationDir }))
            targetDir.convention(gtk.gSchemasDirectory)
            packages.glibDefaults()
        }
        tasks.named(compileKotlinTaskName) { dependsOn(compileTask) }
    }
}
