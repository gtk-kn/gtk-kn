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

package org.gtkkn.gradle.plugin.ext

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.domainObjectContainer
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.gtkkn.gradle.plugin.GtkPlugin
import org.gtkkn.gradle.plugin.domain.GResourceBundle
import org.gtkkn.gradle.plugin.domain.GSchemaBundle
import org.gtkkn.gradle.plugin.task.CompileGSchemasTask
import org.gtkkn.gradle.plugin.utils.maybeCreate
import org.gtkkn.gradle.plugin.utils.maybeRegister

interface GtkKnExt : ExtensionAware {
    /**
     * The entry point for the Kotlin/Native executable.
     * Moved here so that can be specified it in the `gtk` extension block:
     *
     * ```kotlin
     * gtkKn {
     *     entryPoint = "my.custom.main"
     * }
     * ```
     */
    val entryPoint: Property<String>

    /**
     * Where to place intermediate outputs of various plugin tasks
     */
    val outputPrefix: DirectoryProperty

    /**
     * Base directory to install various gio resources
     */
    val installPrefix: DirectoryProperty

    /**
     * A map of library names to their target versions.
     * Users can specify the version they want to target for each library in their project.
     *
     * This property is used to automatically opt in to all necessary library versions
     * up to and including the specified target version for each library.
     *
     * For example:
     * ```
     * gtkKn {
     *     targetLibraryVersions.put("gtk", "4.10")
     *     targetLibraryVersions.put("gio", "2.28")
     * }
     * ```
     * By specifying the target versions, the build process will ensure that the project
     * opts in to all APIs up to the given version, facilitating compatibility and access
     * to newer features while maintaining control over the API level.
     */
    val targetLibraryVersions: MapProperty<String, String>

    companion object {
        const val NAME = "gtkKn"
        internal fun register(project: Project) = project.extensions.maybeCreate<GtkKnExt>(NAME) {
            outputPrefix.convention(project.layout.buildDirectory.dir("gtk-kn/"))
            installPrefix.convention(
                project.layout.projectDirectory.dir(
                    "${System.getProperty("user.home")}/.local/share",
                ),
            )
            registerGResources(project)
            registerGSchemas(project)
            registerMetaTasks(project)

            targetLibraryVersions.convention(project.objects.mapProperty(String::class.java, String::class.java))
        }

        private fun GtkKnExt.registerGResources(project: Project) {
            project.objects.domainObjectContainer(GResourceBundle::class) { name ->
                GResourceBundle.create(name, project)
            }.apply {
                whenObjectRemoved {
                    project.tasks.removeAll(
                        setOfNotNull(
                            processTask.orNull,
                            compileHeaderTask.orNull,
                            compileSourceTask.orNull,
                            compileBundleTask.orNull,
                        ),
                    )
                }
                register("main")
                // Needed to actualise all entities (as a side effect) in order to spawn tasks
                project.afterEvaluate { this@apply.forEach { _ -> } }
            }.also { extensions.add("gresources", it) }
        }

        private fun GtkKnExt.registerGSchemas(project: Project) {
            project.objects.domainObjectContainer(GSchemaBundle::class) { name ->
                GSchemaBundle.create(name, project)
            }.apply {
                whenObjectRemoved {
                    project.tasks.removeAll(
                        setOfNotNull(
                            processTask.orNull,
                            installTask.orNull,
                        ),
                    )
                }
                register("main")
                project.afterEvaluate { this@apply.forEach { _ -> } }
            }.also { extensions.add("gschemas", it) }
        }

        private fun registerMetaTasks(project: Project) {
            val installGSchemas = project.tasks.register("installGSchemas") {
                group = GtkPlugin.TASK_GROUP
                description = "Installs all gschemas"
                dependsOn(
                    project.tasks.withType<CompileGSchemasTask>()
                        .matching { t -> t.name.endsWith("InstallGSchema") },
                )
            }
            project.tasks.maybeRegister<Task>("install") {
                group = group ?: GtkPlugin.TASK_GROUP
                dependsOn(installGSchemas)
            }
        }
    }
}

internal inline val Project.gtkKn: GtkKnExt get() = extensions.getByType()
