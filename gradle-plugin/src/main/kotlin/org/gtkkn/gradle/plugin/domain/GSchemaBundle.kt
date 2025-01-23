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
import org.gtkkn.gradle.plugin.GtkPlugin
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
            group = GtkPlugin.TASK_GROUP
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
                group = GtkPlugin.TASK_GROUP
                description = "Prepares ${bundle.name} gschema for installation"
                dependsOn(bundle.processTask)
                mustRunAfter(bundle.verifyTask)
                from(project.layout.dir(resourcesDir))
                into(bundle.installDir)
                eachFile { name = "${namePrefix}_${file.name}" }
            }
            return tasks.register<CompileGSchemasTask>("${bundle.name}InstallGSchema") {
                group = GtkPlugin.TASK_GROUP
                description = "Installs ${bundle.name} gschema"
                dependsOn(copyTask)
                onlyIf { resourcesDir.get().exists() }
                sourceDir.convention(bundle.installDir)
            }
        }
    }
}
