package org.gtkkn.gradle.plugin.task

import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.GtkPlugin
import org.gtkkn.gradle.plugin.utils.capitalise
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

internal inline val KotlinNativeCompilation.copyGSchemasTaskName
    get() = "${target.name}${name.capitalise()}CopyGSchemas"

internal fun Project.copyGSchemasTask(
    compilation: KotlinNativeCompilation
) = tasks.register<Copy>(compilation.copyGSchemasTaskName) {
    group = GtkPlugin.TASK_GROUP
    val processResourcesTask = tasks.named<Copy>(compilation.processResourcesTaskName)
    dependsOn(processResourcesTask)
    from(processResourcesTask) {
        include("**/*.gschema.xml")
    }
    into(temporaryDir)
}
