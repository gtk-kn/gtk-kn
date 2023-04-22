/*
 * Copyright (c) 2023 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

@file:Suppress("PackageDirectoryMismatch")

import org.gradle.api.Action
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.findByType
import org.gtkkn.gradle.plugin.config.gtkSupported
import org.gtkkn.gradle.plugin.ext.GtkKNCompilationExt
import org.gtkkn.gradle.plugin.ext.GtkKNTargetExt
import org.gtkkn.gradle.plugin.utils.qualifiedName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

/*
 * Due to the way gradle resolves script context,
 * anything placed in a global package will be available in buildscripts without requiring imports.
 *
 * BE EXTRA CAREFUL of what you put here as it will pollute the buildscript context for the consumers.
 * This file should be reserved for gradle accessors that it cannot generate
 */
val KotlinNativeTarget.gtk: GtkKNTargetExt
    get() = (this as ExtensionAware).extensions.findByType() ?: error(
        if (gtkSupported) {
            "gtk extension is missing for $name KotlinNativeTarget"
        } else {
            "KotlinNativeTarget[${name}] KonanTarget ${konanTarget.name} is not supported"
        },
    )

fun KotlinNativeTarget.gtk(configure: Action<GtkKNTargetExt>) = configure.execute(gtk)

val KotlinNativeCompilation.gtk: GtkKNCompilationExt
    get() = (this as ExtensionAware).extensions.findByType() ?: error(
        if (target.gtkSupported) {
            "gtk extension is missing for $name KotlinNativeCompilation"
        } else {
            "KotlinNativeCompilation[${qualifiedName}] KonanTarget ${konanTarget.name} is not supported"
        },
    )

fun KotlinNativeCompilation.gtk(configure: Action<GtkKNCompilationExt>) = configure.execute(gtk)
