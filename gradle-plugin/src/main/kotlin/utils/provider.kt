package org.gtkkn.gradle.plugin.utils

import org.gradle.api.Task
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.TaskContainer
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register

internal inline fun <reified T> Task.provider(noinline fn: () -> T): Provider<T> =
    project.provider(fn)

internal inline fun <reified T : Task> TaskContainer.maybeRegister(name: String, noinline configuration: T.() -> Unit) =
    if (names.contains(name)) named<T>(name) else register<T>(name, configuration = configuration)
