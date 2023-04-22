package org.gtkkn.gradle.plugin.utils

import org.gradle.api.plugins.ExtensionContainer
import org.gradle.configurationcache.extensions.capitalized
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.findByType
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

internal inline fun <reified T : Any> ExtensionContainer.maybeCreate(name: String, init: T.() -> Unit) =
    findByType<T>() ?: create<T>(name).apply(init)

internal val KotlinNativeCompilation.qualifiedName get() = "${target.name.capitalized()}${name.capitalized()}"
