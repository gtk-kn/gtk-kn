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

package org.gtkkn.gradle.plugin.domain

import org.gradle.api.DomainObjectSet
import org.gradle.api.Named
import org.gradle.api.Project
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.domainObjectSet
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.GtkPlugin
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.task.CompileGSchemasTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

@Suppress("ClassOrdering")
interface GSchemaBundle : Named {
    /**
     * *.gschema.xml file
     */
    val manifest: RegularFileProperty

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
    val installTask: TaskProvider<CompileGSchemasTask>

    companion object {
        internal fun create(name: String, project: Project): GSchemaBundle =
            object : GSchemaBundle {
                override fun getName() = name
                override val manifest = project.objects.fileProperty()
                override val preinstall = project.objects.domainObjectSet(KotlinNativeCompilation::class)
                override val processTask = project.registerProcessTask(this)
                override val installTask = project.registerInstallTask(this)
            }.apply {
                manifest.convention(project.layout.projectDirectory.file("src/gschemas/$name.gschema.xml"))
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
            from(bundle.manifest)
            destinationDir = project.buildDir.resolve("processedGSchemas/${bundle.name}")
        }

        private fun Project.registerInstallTask(
            bundle: GSchemaBundle,
        ) = tasks.register<CompileGSchemasTask>("${bundle.name}InstallGSchema") {
            group = GtkPlugin.TASK_GROUP
            dependsOn(bundle.processTask)
            sourceDir.convention(project.layout.dir(bundle.processTask.map(Copy::getDestinationDir)))
            targetDir.convention(gtk.schemasInstallDir)
        }
    }
}
