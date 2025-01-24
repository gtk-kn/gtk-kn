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

package ext

import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.getByType

interface ConfigExt : ExtensionAware {
    val website: Property<String>
    val vcsUrl: Property<String>
}

/**
 * A container with various versions available to choose from
 */
interface VersionsExt : ExtensionAware {
    val adwaita: Property<String>
    val common: Property<String>
    val core: Property<String>
    val coroutines: Property<String>
    val gradlePlugin: Property<String>
    val gtk4: Property<String>
    val gtksource: Property<String>
    val javascriptcore: Property<String>
    val soup: Property<String>
    val webkit2: Property<String>
}

internal inline val Project.config: ConfigExt get() = extensions.getByType()
internal inline val ConfigExt.versions: VersionsExt get() = extensions.getByType()
