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
import org.gradle.api.file.RegularFile
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.file.SourceDirectorySet
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.domainObjectSet
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.BuildConfig
import org.gtkkn.gradle.plugin.GtkPlugin
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.task.CompileGResourcesTask
import org.gtkkn.gradle.plugin.task.GenerateCEmbedDefTask
import org.gtkkn.gradle.plugin.task.PkgConfigTask
import org.gtkkn.gradle.plugin.utils.maybeRegister
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.tasks.CInteropProcess
import java.io.File

@Suppress("ClassOrdering")
interface GResourceBundle : Named, SourceDirectorySet {
    /**
     * *.gresource.xml file
     */
    val manifest: RegularFileProperty

    /**
     * A set of [KotlinNativeCompilation] objects that this gresource bundle should be embedded into
     */
    val embed: DomainObjectSet<KotlinNativeCompilation>

    /**
     * Embed this [GResourceBundle] into a given [KotlinNativeCompilation]
     */
    fun embed(compilation: KotlinNativeCompilation) {
        embed.add(compilation)
    }

    /**
     * Embed this [GResourceBundle] into a given [KotlinNativeCompilation]
     */
    fun embed(compilation: Provider<KotlinNativeCompilation>) {
        embed.addLater(compilation)
    }

    /**
     * Directory to place gresources outputs
     */
    val targetDir: DirectoryProperty

    val processTask: TaskProvider<Copy>
    val compileHeaderTask: TaskProvider<CompileGResourcesTask>
    val compileSourceTask: TaskProvider<CompileGResourcesTask>
    val compileBundleTask: TaskProvider<CompileGResourcesTask>
    val generateDefTask: TaskProvider<GenerateCEmbedDefTask>

    companion object {
        internal fun create(name: String, project: Project): GResourceBundle {
            val defFile = project.gtk.outputPrefix.file("gresources/$name/$name.def")
            return object : GResourceBundle, SourceDirectorySet by project.objects.sourceDirectorySet(name, name) {
                override fun getName() = name
                override val manifest = project.objects.fileProperty()
                override val embed = project.objects.domainObjectSet(KotlinNativeCompilation::class)
                override val targetDir = project.objects.directoryProperty()
                override val processTask = project.registerProcessTask(this)
                override val compileHeaderTask = project.registerHeaderTask(this)
                override val compileSourceTask = project.registerSourceTask(this)
                override val compileBundleTask = project.registerBundleTask(this)
                override val generateDefTask = project.registerDefTask(this, defFile)
            }.apply gresource@{
                srcDir(project.layout.projectDirectory.dir("src/gresources/${this@gresource.name}"))
                manifest.convention(
                    project.layout.file(
                        project.provider {
                            val candidates = files.filter { it.name.endsWith("gresource.xml") }
                            if (candidates.size > 1) {
                                project.logger.error(
                                    """
                                        |Multiple manifests detected for gresource[${this@gresource.name}]!
                                        |Either remove extra manifests or declare desired manifest explicitly.
                                        |Detected manifests:
                                        |${candidates.joinToString("\n|\t", prefix = "\t")}
                                    """.trimMargin(),
                                )
                                error("Multiple manifests detected for gresource[${this@gresource.name}]!")
                            } else {
                                candidates.firstOrNull()
                            }
                        },
                    ),
                )
                embed.whenObjectAdded {
                    cinterops.register("${this@gresource.name}GResource") {
                        definitionFile.set(defFile.map(RegularFile::getAsFile).get())
                        dependencyFiles = project.files(compileSourceTask)
                        project.tasks.named<CInteropProcess>(interopProcessingTaskName) {
                            dependsOn(generateDefTask)
                        }
                    }
                }
                embed.whenObjectRemoved {
                    cinterops.removeIf { it.name == "${this@gresource.name}GResource" }
                }
            }
        }

        private fun Project.registerProcessTask(
            bundle: GResourceBundle,
        ) = tasks.register<Copy>("${bundle.name}ProcessGResources") {
            group = GtkPlugin.TASK_GROUP
            from(bundle.asFileTree)
            destinationDir = layout.buildDirectory.file("processedGResources/${bundle.name}").get().asFile
        }

        private fun Project.registerHeaderTask(
            bundle: GResourceBundle,
        ) = tasks.register<CompileGResourcesTask>("${bundle.name}CompileGResourceHeader") {
            onlyIf("Manifest file exists") { manifest.asFile.get().exists() }
            dependsOn(bundle.processTask)
            group = GtkPlugin.TASK_GROUP
            description = "Compiles gresources into c header file"
            sourceDir.convention(layout.dir(bundle.processTask.map(Copy::getDestinationDir)))
            target.convention(project.gtk.outputPrefix.file("gresources/${bundle.name}/${bundle.name}.h"))
            generateHeader.convention(true)
            manifest.convention(bundle.manifest)
            cName.convention(bundle.name)
        }

        private fun Project.registerSourceTask(
            bundle: GResourceBundle,
        ) = tasks.register<CompileGResourcesTask>("${bundle.name}CompileGResourceSource") {
            onlyIf("Manifest file exists") { manifest.asFile.get().exists() }
            dependsOn(bundle.processTask)
            group = GtkPlugin.TASK_GROUP
            description = "Compiles gresources into c source file"
            sourceDir.convention(layout.dir(bundle.processTask.map(Copy::getDestinationDir)))
            target.convention(project.gtk.outputPrefix.file("gresources/${bundle.name}/${bundle.name}.c"))
            generateSource.convention(true)
            manifest.convention(bundle.manifest)
            cName.convention(bundle.name)
        }

        private fun Project.registerBundleTask(
            bundle: GResourceBundle,
        ) = tasks.register<CompileGResourcesTask>("${bundle.name}CompileGResourceBundle") {
            onlyIf("Manifest file exists") { manifest.asFile.get().exists() }
            dependsOn(bundle.processTask)
            group = GtkPlugin.TASK_GROUP
            description = "Compiles gresources into bundle file"
            sourceDir.convention(layout.dir(bundle.processTask.map(Copy::getDestinationDir)))
            target.convention(project.gtk.outputPrefix.file("gresources/${bundle.name}/${bundle.name}.gresource"))
            generate.convention(true)
            manifest.convention(bundle.manifest)
            cName.convention(bundle.name)
        }

        private fun Project.registerDefTask(
            bundle: GResourceBundle,
            defFile: Provider<RegularFile>,
        ): TaskProvider<GenerateCEmbedDefTask> {
            val pkgConfigTask = rootProject.tasks.maybeRegister<PkgConfigTask>("generateGioCFlags") {
                library.convention("gio-2.0")
                cFlags.convention(true)
            }
            return tasks.maybeRegister<GenerateCEmbedDefTask>("${bundle.name}GenerateGResourceDef") {
                dependsOn(bundle.compileSourceTask, pkgConfigTask)
                group = GtkPlugin.TASK_GROUP
                source.convention(bundle.compileSourceTask.flatMap(CompileGResourcesTask::target))
                target.convention(defFile)
                packageName.convention("${BuildConfig.group}.resources.c")
                compilerOpts.convention(
                    pkgConfigTask
                        .flatMap(PkgConfigTask::target)
                        .map(RegularFile::getAsFile)
                        .map(File::readText)
                        .map(String::trim),
                )
            }
        }

        /*
         * Leaving the below as an alternative way of embedding resources
         * should we start having any problems with cinterop
         */
//        val buildBitcodeTask = tasks.register<BuildBitcodeTask>("buildGResourceBitcode${qualifiedName}") {
//            dependsOn(sourceTask)
//            this@register.target.convention(konanTarget)
//            includes.add(layout.projectDirectory.dir("/usr/include/glib-2.0"))
//            includes.add(layout.projectDirectory.dir("/usr/lib64/glib-2.0/include"))
//            input.convention(sourceTask.flatMap(CompileGResourcesTask::target))
//            output.convention(baseDir.map { it.file("$baseName.bc") })
//        }
//        compileTaskProvider.configure {
//            dependsOn(buildBitcodeTask)
//        }
//        compilerOptions.configure {
//            freeCompilerArgs.add("-native-library")
//            buildBitcodeTask.flatMap(BuildBitcodeTask::output)
//                .map(RegularFile::getAsFile)
//                .map(File::getAbsolutePath)
//                .let(freeCompilerArgs::add)
//        }
    }
}
