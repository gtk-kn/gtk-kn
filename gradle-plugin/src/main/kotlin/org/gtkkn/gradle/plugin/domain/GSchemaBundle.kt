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

package org.gtkkn.gradle.plugin.domain

import org.gradle.api.DomainObjectSet
import org.gradle.api.Named
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.domainObjectSet
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.GtkKnPlugin
import org.gtkkn.gradle.plugin.ext.GtkKnExt
import org.gtkkn.gradle.plugin.ext.gtkKn
import org.gtkkn.gradle.plugin.task.CompileGSchemasTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

@Suppress("ClassOrdering")
interface GSchemaBundle : Named {
    /**
     * *.gschema.xml file
     *
     * Defaults to "${projectDir}/src/gschemas/${name}.gschema.xml"
     */
    val manifest: RegularFileProperty

    /**
     * A directory where to install this gschema.
     *
     * Defaults to "${[GtkKnExt.installPrefix]}/glib-2.0/schemas/
     */
    val installDir: DirectoryProperty

    /**
     * A set of [KotlinNativeCompilation] which depend on schemas being preinstalled
     */
    val preinstall: DomainObjectSet<KotlinNativeCompilation>

    fun preinstall(compilation: KotlinNativeCompilation) {
        preinstall.add(compilation)
    }

    fun preinstall(compilation: Provider<KotlinNativeCompilation>) {
        preinstall.addLater(compilation)
    }

    val processTask: TaskProvider<Copy>
    val verifyTask: TaskProvider<CompileGSchemasTask>
    val installTask: TaskProvider<CompileGSchemasTask>

    companion object {
        internal fun create(name: String, project: Project): GSchemaBundle =
            object : GSchemaBundle {
                override fun getName() = name
                override val manifest = project.objects.fileProperty()
                override val installDir: DirectoryProperty = project.objects.directoryProperty()
                override val preinstall = project.objects.domainObjectSet(KotlinNativeCompilation::class)
                override val processTask = project.registerProcessTask(this)
                override val verifyTask = project.registerVerifyTask(this)
                override val installTask = project.registerInstallTask(this)
            }.apply {
                manifest.convention(project.layout.projectDirectory.file("src/gschemas/$name.gschema.xml"))
                installDir.convention(project.gtkKn.installPrefix.dir("glib-2.0/schemas/"))
                preinstall.whenObjectAdded {
                    compileTaskProvider.configure {
                        dependsOn(installTask)
                    }
                }
            }

        private fun Project.registerProcessTask(
            bundle: GSchemaBundle,
        ) = tasks.register<Copy>("${bundle.name}ProcessGSchema") {
            group = GtkKnPlugin.TASK_GROUP
            description = "Processes ${bundle.name} gschema"
            from(bundle.manifest)
            destinationDir = layout.buildDirectory.file("processedGSchemas/${bundle.name}").get().asFile
        }

        private fun Project.registerVerifyTask(
            bundle: GSchemaBundle,
        ): TaskProvider<CompileGSchemasTask> {
            val resourcesDir = bundle.processTask.map(Copy::getDestinationDir)
            return tasks.register<CompileGSchemasTask>("${bundle.name}VerifyGSchema") {
                group = "verification"
                description = "Verifies ${bundle.name} gschema"
                dependsOn(bundle.processTask)
                onlyIf { resourcesDir.get().exists() }
                dryRun.convention(true)
                sourceDir.convention(project.layout.dir(resourcesDir))
            }.also { t -> tasks.named("check") { dependsOn(t) } }
        }

        private fun Project.registerInstallTask(
            bundle: GSchemaBundle,
        ): TaskProvider<CompileGSchemasTask> {
            val resourcesDir = bundle.processTask.map(Copy::getDestinationDir)
            val namePrefix = "${project.group}_${project.name}"
            val copyTask = tasks.register<Copy>("${bundle.name}PrepareInstallGSchema") {
                group = GtkKnPlugin.TASK_GROUP
                description = "Prepares ${bundle.name} gschema for installation"
                dependsOn(bundle.processTask)
                mustRunAfter(bundle.verifyTask)
                from(project.layout.dir(resourcesDir))
                into(bundle.installDir)
                eachFile { name = "${namePrefix}_${file.name}" }
            }
            return tasks.register<CompileGSchemasTask>("${bundle.name}InstallGSchema") {
                group = GtkKnPlugin.TASK_GROUP
                description = "Installs ${bundle.name} gschema"
                dependsOn(copyTask)
                onlyIf { resourcesDir.get().exists() }
                sourceDir.convention(bundle.installDir)
            }
        }
    }
}
