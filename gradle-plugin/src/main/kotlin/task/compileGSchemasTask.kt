package org.gtkkn.gradle.plugin.task

import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.Exec
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.GtkPlugin
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.utils.capitalise
import org.jetbrains.kotlin.gradle.plugin.mpp.AbstractExecutable
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

internal inline val KotlinNativeCompilation.compileGSchemasTaskName
    get() = "${target.name}${name.capitalise()}CompileGSchemas"

internal fun Project.compileGSchemasTask(
    compilation: KotlinNativeCompilation
) = tasks.register<Exec>(compilation.compileGSchemasTaskName) {
    group = GtkPlugin.TASK_GROUP
    val copySchemasTask = tasks.named<Copy>(compilation.copyGSchemasTaskName)
    dependsOn(copySchemasTask)
    onlyIf { copySchemasTask.get().destinationDir.exists() }
    inputs.dir(copySchemasTask.map(Copy::getDestinationDir))
    outputs.dir(gtk.gSchemasDirectory)

    configureTooling("glib-compile-schemas")
    args(
        "--targetdir=${gtk.gSchemasDirectory.asFile.get().absolutePath}",
        copySchemasTask.get().destinationDir,
    )
}.also {
    compilation.target.binaries.whenObjectAdded {
        if (this is AbstractExecutable && this.compilation == compilation) tasks.named(linkTaskName) { dependsOn(it) }
    }
    compilation.target.binaries.whenObjectRemoved {
        if (this is AbstractExecutable && this.compilation == compilation) tasks.named(linkTaskName) {
            dependsOn.remove(
                it,
            )
        }
    }
}
