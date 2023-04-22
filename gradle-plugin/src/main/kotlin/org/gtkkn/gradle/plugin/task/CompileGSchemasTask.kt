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

package org.gtkkn.gradle.plugin.task

import gtk
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
import org.gtkkn.gradle.plugin.utils.provider
import org.gtkkn.gradle.plugin.utils.qualifiedName
import org.jetbrains.kotlin.gradle.plugin.mpp.AbstractExecutable
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

@Suppress("LeakingThis")
abstract class CompileGSchemasTask : GtkTask() {
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    /**
     * Where to store the gschemas.compiled file
     */
    @get:OutputDirectory
    abstract val targetDir: DirectoryProperty

    /**
     * Do not abort on any errors in schemas
     */
    @get:Input
    @get:Optional
    abstract val lax: Property<Boolean>

    /**
     * Do not write the gschema.compiled file
     */
    @get:Input
    @get:Optional
    abstract val dryRun: Property<Boolean>

    /**
     * Do not enforce key name restrictions
     */
    @get:Input
    @get:Optional
    abstract val allowAnyName: Property<Boolean>

    init {
        description = "Compiles gschema via native glib-compile-schemas toolchain"
        onlyIf { sourceDir.asFile.get().exists() }

        executable.convention("glib-compile-schemas")
        packages.glibDefaults()
        args.convention(
            provider {
                buildList {
                    val target = targetDir.get().asFile
                    target.mkdirs()
                    add("--targetdir=${target.absolutePath}")
                    if (!lax.getOrElse(false)) add("--strict")
                    if (dryRun.getOrElse(false)) add("--dry-run")
                    if (allowAnyName.getOrElse(false)) add("--allow-any-name")
                    add(sourceDir.get().asFile.absolutePath)
                }
            },
        )
    }
}

internal fun Project.compileGSchemasTasks(target: KotlinNativeTarget) {
    target.compilations.all compilation@{
        val compilationGtk = this@compilation.gtk
        val processResources = tasks.named<Copy>(processResourcesTaskName)
        val copyTask = tasks.register<Copy>("copyGSchemas$qualifiedName") {
            description = "Stages all *.gschema.xml from processed resources"
            dependsOn(processResources)
            from(processResources)
            into(temporaryDir)
            include("**/*.gschema.xml")
        }
        val compileTask = tasks.register<CompileGSchemasTask>("compileGSchemas$qualifiedName") {
            dependsOn(copyTask)
            sourceDir.convention(layout.dir(copyTask.map(Copy::getDestinationDir)))
            targetDir.convention(this@compileGSchemasTasks.gtk.baseOutputDir.dir("gSchemas"))
        }
        val installTask = tasks.register<CompileGSchemasTask>("installGSchemas$qualifiedName") {
            dependsOn(copyTask)
            sourceDir.convention(layout.dir(copyTask.map(Copy::getDestinationDir)))
            targetDir.convention(compilationGtk.gSchemasInstallDir)
        }
        tasks.named(compileKotlinTaskName) { dependsOn(compileTask) }
        target.binaries.all {
            if (this is AbstractExecutable && compilation == this@compilation) {
                linkTaskProvider.configure { dependsOn(installTask) }
            }
        }
    }
}
