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

package org.gtkkn.gradle.plugin.config

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.TaskProvider
import org.gradle.configurationcache.extensions.capitalized
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.gradle.plugins.ide.idea.model.IdeaModel
import org.gtkkn.gradle.plugin.BuildConfig
import org.gtkkn.gradle.plugin.domain.GResourceBundle
import org.gtkkn.gradle.plugin.ext.GtkKotlinNativeCompilationExt
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.task.CompileGResourcesTask
import org.gtkkn.gradle.plugin.task.GenerateCEmbedDefTask
import org.gtkkn.gradle.plugin.task.PkgConfigTask
import org.gtkkn.gradle.plugin.utils.maybeRegister
import org.gtkkn.gradle.plugin.utils.qualifiedName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.tasks.CInteropProcess
import java.io.File

internal fun NamedDomainObjectContainer<GResourceBundle>.configure(
    compilation: KotlinNativeCompilation,
    gtk: GtkKotlinNativeCompilationExt
) {
    val project = compilation.project
    val idea = project.extensions.findByType<IdeaModel>()
    whenObjectAdded bundle@{
        embed.convention(gtk.embedResources)
        targetDir.convention(compilation.project.gtk.baseOutputDir.dir("gresources/${compilation.target.name}/${compilation.name}/$name"))
        project.registerHeaderTask(compilation, this)
        val sourceTask = project.registerSourceTask(compilation, this)
        val bundleTask = project.registerBundleTask(compilation, this)
        val defFile = targetDir.file("${name}.def")
        val defTask = project.registerDefTask(compilation, this, sourceTask, defFile)
        compilation.cinterops.register("gResource${name.capitalized()}") {
            project.tasks.named<CInteropProcess>(interopProcessingTaskName) {
                dependsOn(defTask, sourceTask)
                onlyIf("Resource embedding enabled") { embed.get() }
                onlyIf("Def file exists") { defTask.get().target.asFile.get().exists() }
            }
            defFileProperty.set(defFile.map(RegularFile::getAsFile))
            dependencyFiles = project.files(sourceTask.flatMap(CompileGResourcesTask::target))
        }
        project.tasks.named(compilation.compileKotlinTaskName) { dependsOn(bundleTask) }

        project.afterEvaluate {
            if (this@bundle.name != "default") idea?.module?.resourceDirs?.add(manifest.asFile.get().parentFile.absoluteFile)
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

private fun Project.registerHeaderTask(
    compilation: KotlinNativeCompilation,
    bundle: GResourceBundle,
) = tasks.register<CompileGResourcesTask>(
    "compileGResourceHeader${compilation.qualifiedName}${bundle.name.uppercase()}",
) {
    onlyIf("Manifest file exists") { manifest.asFile.get().exists() }
    onlyIf("Resource embedding enabled") { bundle.embed.get() }
    description = "Compiles gresources into c header file"
    sourceDir.convention(layout.dir(bundle.manifest.asFile.map(File::getParentFile)))
    target.convention(bundle.targetDir.file("${bundle.name}.h"))
    generateHeader.convention(true)
    manifest.convention(bundle.manifest)
    cName.convention(bundle.name)
}

private fun Project.registerSourceTask(
    compilation: KotlinNativeCompilation,
    bundle: GResourceBundle,
) = tasks.register<CompileGResourcesTask>(
    "compileGResourceSource${compilation.qualifiedName}${bundle.name.uppercase()}",
) {
    onlyIf("Manifest file exists") { manifest.asFile.get().exists() }
    onlyIf("Resource embedding enabled") { bundle.embed.get() }
    description = "Compiles gresources into c source file"
    sourceDir.convention(layout.dir(bundle.manifest.asFile.map(File::getParentFile)))
    target.convention(bundle.targetDir.file("${bundle.name}.c"))
    generateSource.convention(true)
    manifest.convention(bundle.manifest)
    cName.convention(bundle.name)
}

private fun Project.registerBundleTask(
    compilation: KotlinNativeCompilation,
    bundle: GResourceBundle,
) = tasks.register<CompileGResourcesTask>(
    "compileGResourceBundle${compilation.qualifiedName}${bundle.name.uppercase()}",
) {
    onlyIf("Manifest file exists") { manifest.asFile.get().exists() }
    onlyIf("Resource embedding disabled") { !bundle.embed.get() }
    description = "Compiles gresources into gresource bundle"
    sourceDir.convention(layout.dir(bundle.manifest.asFile.map(File::getParentFile)))
    target.convention(bundle.targetDir.file("${bundle.name}.gresource"))
    generate.convention(true)
    manifest.convention(bundle.manifest)
    cName.convention(bundle.name)
}

private fun Project.registerDefTask(
    compilation: KotlinNativeCompilation,
    bundle: GResourceBundle,
    sourceTask: TaskProvider<CompileGResourcesTask>,
    defFile: Provider<RegularFile>,
): TaskProvider<GenerateCEmbedDefTask> {
    val pkgConfigTask = rootProject.tasks.maybeRegister<PkgConfigTask>("generateGioCFlags") {
        library.convention("gio-2.0")
        cFlags.convention(true)
    }
    return tasks.register<GenerateCEmbedDefTask>(
        "generateGResourceDef${compilation.qualifiedName}${bundle.name.uppercase()}",
    ) {
        onlyIf("Resource embedding enabled") { bundle.embed.get() }
        dependsOn(sourceTask, pkgConfigTask)
        source.convention(sourceTask.flatMap(CompileGResourcesTask::target))
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
