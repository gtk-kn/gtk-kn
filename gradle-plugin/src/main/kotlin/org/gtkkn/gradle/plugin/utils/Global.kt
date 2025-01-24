/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

@file:Suppress("PackageDirectoryMismatch", "unused")

import org.gradle.api.GradleException
import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.withType
import org.gtkkn.gradle.plugin.domain.GResourceBundle
import org.gtkkn.gradle.plugin.domain.GSchemaBundle
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

fun NamedDomainObjectProvider<GResourceBundle>.embed(compilation: KotlinNativeCompilation): Unit =
    configure { embed(compilation) }

fun NamedDomainObjectProvider<GResourceBundle>.embed(compilation: Provider<KotlinNativeCompilation>): Unit =
    configure { embed(compilation) }

fun NamedDomainObjectProvider<GSchemaBundle>.preinstall(compilation: KotlinNativeCompilation): Unit =
    configure { preinstall(compilation) }

fun NamedDomainObjectProvider<GSchemaBundle>.preinstall(compilation: Provider<KotlinNativeCompilation>): Unit =
    configure { preinstall(compilation) }

/**
 * Returns a [Provider] that resolves to the [KotlinNativeCompilation] with the given [name]
 * from the first [KotlinNativeTarget] found in the project.
 *
 * This function searches for the [KotlinMultiplatformExtension] in the project and retrieves
 * the first native target of type [KotlinNativeTarget]. If no such target is found, a
 * [GradleException] is thrown. The compilation with the specified [name] is then retrieved
 * from the target's compilations.
 *
 * @param name The name of the compilation to retrieve. Defaults to "main".
 * @return A [Provider] that resolves to the [KotlinNativeCompilation] with the given [name].
 * @throws GradleException If the [KotlinMultiplatformExtension] is not found or if no
 * [KotlinNativeTarget] is present in the project.
 */
fun Project.nativeTargetCompilation(name: String = "main"): Provider<KotlinNativeCompilation> =
    provider {
        val kotlin = extensions.findByType(KotlinMultiplatformExtension::class.java)
            ?: throw GradleException("KotlinMultiplatformExtension not found.")
        val nativeTarget = kotlin.targets.withType<KotlinNativeTarget>().firstOrNull()
            ?: throw GradleException("No native target named 'native' found.")
        nativeTarget.compilations.getByName(name)
    }
