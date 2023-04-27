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
import org.gradle.api.file.RegularFile
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.BuildConfig
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.utils.maybeRegister
import org.gtkkn.gradle.plugin.utils.provider
import org.gtkkn.gradle.plugin.utils.qualifiedName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.tasks.CInteropProcess
import java.io.File

@Suppress("LeakingThis")
abstract class CompileGResourcesTask : GtkTask() {
    /**
     * The directories to load files referenced in FILE from
     */
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    /**
     * *.gresource.xml file
     */
    @get:InputFile
    abstract val manifest: RegularFileProperty

    /**
     * Name of the output file
     */
    @get:OutputFile
    abstract val target: RegularFileProperty

    /**
     * Generate output in the format selected for by the target filename extension
     */
    @get:Input
    @get:Optional
    abstract val generate: Property<Boolean>

    /**
     * Generate source header
     */
    @get:Input
    @get:Optional
    abstract val generateHeader: Property<Boolean>

    /**
     * Generate source code used to link in the resource file into your code
     */
    @get:Input
    @get:Optional
    abstract val generateSource: Property<Boolean>

    /**
     *  Generate dependency list
     */
    @get:Input
    @get:Optional
    abstract val generateDependencies: Property<Boolean>

    /**
     * Name of the dependency file to generate
     */
    @get:OutputFile
    @get:Optional
    abstract val dependencyFile: RegularFileProperty

    /**
     * Include phony targets in the generated dependency file
     */
    @get:Input
    @get:Optional
    abstract val generatePhonyTargets: Property<Boolean>

    /**
     * Don’t automatically create and register resource
     */
    @get:Input
    @get:Optional
    abstract val manualRegister: Property<Boolean>

    /**
     * Don’t export functions; declare them G_GNUC_INTERNAL
     */
    @get:Input
    @get:Optional
    abstract val internal: Property<Boolean>

    /**
     *  Don’t embed resource data in the C file; assume it’s linked externally instead
     */
    @get:Input
    @get:Optional
    abstract val externalData: Property<Boolean>

    /**
     * C identifier name used for the generated source code
     */
    @get:Input
    @get:Optional
    abstract val cName: Property<String>

    /**
     * The target C compiler
     */
    @get:Input
    @get:Optional
    abstract val compiler: Property<String>

    init {
        description = "Compiles gresources via native glib-compile-resources toolchain"
        onlyIf { manifest.asFile.orNull?.exists() == true }

        executable.convention("glib-compile-resources")
        packages.glibDefaults()
        args.convention(
            provider {
                buildList {
                    val target = target.get().asFile
                    target.parentFile.mkdirs()
                    add("--target=${target.absolutePath}")
                    add("--sourcedir=${sourceDir.get().asFile.absolutePath}")
                    if (generate.getOrElse(false)) add("--generate")
                    if (generateHeader.getOrElse(false)) add("--generate-header")
                    if (generateSource.getOrElse(false)) add("--generate-source")
                    if (generateDependencies.getOrElse(false)) add("--generate-dependencies")
                    if (dependencyFile.isPresent) add("--dependency-file=${dependencyFile.get().asFile.absolutePath}")
                    if (generatePhonyTargets.getOrElse(false)) add("--generate-phony-targets")
                    if (manualRegister.getOrElse(false)) add("--manual-register")
                    if (internal.getOrElse(false)) add("--internal")
                    if (externalData.getOrElse(false)) add("--external-data")
                    if (cName.isPresent) add("--c-name=${cName.get()}")
                    if (compiler.isPresent) add("--compiler=${compiler.get()}")
                    add(manifest.get().asFile.absolutePath)
                }
            },
        )
    }
}

internal fun Project.compileGResourcesTasks(target: KotlinNativeTarget) {
    target.compilations.all compilation@{
        val compilationGtk = this@compilation.gtk
        val processResources = tasks.named<Copy>(processResourcesTaskName)

        val gResources = processResources
            .map(Copy::getDestinationDir)
            .map(File::listFiles)
            .map { d -> d.singleOrNull { f -> f.name.endsWith("gresource.xml") } as File }
            .run { layout.file(this) }

        val baseName = "gResource"
        val baseDir = this@compileGResourcesTasks.gtk.baseOutputDir.dir("gResource/${target.name}/$name")
        val defOutput = baseDir.map { f -> f.file("$baseName.def") }

        val sourceTask = registerSourcesTask(
            kotlinNativeCompilation = this@compilation,
            processResources = processResources,
            target = baseDir.map { f -> f.file("$baseName.c") },
            gResources = gResources,
        )
        val headerTask = registerHeaderTask(
            kotlinNativeCompilation = this@compilation,
            processResources = processResources,
            target = baseDir.map { f -> f.file("$baseName.h") },
            gResources = gResources,
        )
        val bundleTask = registerBundleTask(
            kotlinNativeCompilation = this@compilation,
            processResources = processResources,
            target = baseDir.map { f -> f.file("$baseName.gresource") },
            gResources = gResources,
        )
        val defTask = registerDefTask(
            kotlinNativeCompilation = this@compilation,
            sourceTask = sourceTask,
            headerTask = headerTask,
            defOutput = defOutput,
        )
        cinterops.register(baseName) {
            tasks.named<CInteropProcess>(interopProcessingTaskName) {
                dependsOn(defTask, sourceTask)
                onlyIf("Resource embedding enabled") { compilationGtk.embedResources.get() }
                onlyIf("Def file exists") { defTask.get().output.asFile.get().exists() }
            }
            defFileProperty.set(defOutput.map(RegularFile::getAsFile))
            dependencyFiles = files(sourceTask.flatMap(CompileGResourcesTask::target))
        }
        tasks.named(compileKotlinTaskName) { dependsOn(bundleTask) }
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

private fun Project.registerDefTask(
    kotlinNativeCompilation: KotlinNativeCompilation,
    sourceTask: TaskProvider<CompileGResourcesTask>,
    headerTask: TaskProvider<CompileGResourcesTask>,
    defOutput: Provider<RegularFile>
): TaskProvider<GenerateCEmbedDefTask> {
    val pkgConfigTask = rootProject.tasks.maybeRegister<PkgConfigTask>("generateGioCFlags") {
        library.convention("gio-2.0")
        cFlags.convention(true)
    }
    return tasks.register<GenerateCEmbedDefTask>("generateGResourceDef${kotlinNativeCompilation.qualifiedName}") {
        onlyIf("Resource embedding enabled") { kotlinNativeCompilation.gtk.embedResources.get() }
        dependsOn(sourceTask, headerTask, pkgConfigTask)
        source.convention(sourceTask.flatMap(CompileGResourcesTask::target))
        output.convention(defOutput)
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

private fun Project.registerBundleTask(
    kotlinNativeCompilation: KotlinNativeCompilation,
    processResources: TaskProvider<Copy>,
    gResources: Provider<RegularFile>,
    target: Provider<RegularFile>
) = tasks.register<CompileGResourcesTask>("compileGResourceBundle${kotlinNativeCompilation.qualifiedName}") {
    onlyIf("Resource embedding disabled") { !kotlinNativeCompilation.gtk.embedResources.get() }
    description = "Compiles resources into gresource bundle"
    dependsOn(processResources)
    sourceDir.convention(layout.dir(processResources.map(Copy::getDestinationDir)))
    this@register.target.convention(target)
    this@register.generate.convention(true)
    manifest.convention(gResources)
}

private fun Project.registerHeaderTask(
    kotlinNativeCompilation: KotlinNativeCompilation,
    processResources: TaskProvider<Copy>,
    gResources: Provider<RegularFile>,
    target: Provider<RegularFile>
) = tasks.register<CompileGResourcesTask>("compileGResourceHeader${kotlinNativeCompilation.qualifiedName}") {
    onlyIf("Resource embedding enabled") { kotlinNativeCompilation.gtk.embedResources.get() }
    description = "Compiles resources into c header file"
    dependsOn(processResources)
    sourceDir.convention(layout.dir(processResources.map(Copy::getDestinationDir)))
    this@register.target.convention(target)
    this@register.generateHeader.convention(true)
    manifest.convention(gResources)
}

private fun Project.registerSourcesTask(
    kotlinNativeCompilation: KotlinNativeCompilation,
    processResources: TaskProvider<Copy>,
    gResources: Provider<RegularFile>,
    target: Provider<RegularFile>
) = tasks.register<CompileGResourcesTask>("compileGResourceSource${kotlinNativeCompilation.qualifiedName}") {
    onlyIf("Resource embedding enabled") { kotlinNativeCompilation.gtk.embedResources.get() }
    description = "Compiles resources into c source file"
    dependsOn(processResources)
    sourceDir.convention(layout.dir(processResources.map(Copy::getDestinationDir)))
    this@register.target.convention(target)
    this@register.generateSource.convention(true)
    manifest.convention(gResources)
}
