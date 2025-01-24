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
package org.gtkkn.gradle.plugin.config

import org.gradle.api.Project
import org.gtkkn.gradle.plugin.BuildConfig
import org.gtkkn.gradle.plugin.Versions

private val gtk4Modules = setOf("gtk4", "gdk4", "gsk4")

internal fun Project.dependencyResolutionConfig() {
    configurations.all {
        resolutionStrategy.eachDependency {
            if (requested.version == null && requested.group == BuildConfig.group) {
                @Suppress("UseIfInsteadOfWhen")
                val version = when (requested.name) {
                    in gtk4Modules -> Versions.gtk4
                    // This works for now, but will require revisiting once the versions diverge
                    else -> Versions.common
                }
                useVersion(version)
            }
        }
    }
}
