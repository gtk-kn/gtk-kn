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

import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    id("bindings-library-conventions")
    alias(libs.plugins.kotlinx.atomicfu)
}

version = config.versions.core.get()

kotlin {
    targets.withType<KotlinNativeTarget> {
        compilations["main"].apply {
            cinterops.create("gobject")
        }
    }
    sourceSets {
        configureEach {
            languageSettings {
                optIn("kotlin.experimental.ExperimentalNativeApi")
                optIn("kotlin.native.internal.InternalForKotlinNative")
                optIn("kotlin.native.runtime.NativeRuntimeApi")
                optIn("kotlinx.cinterop.ExperimentalForeignApi")
            }
        }
        nativeMain {
            dependencies {
                api(projects.bindings.commonAnnotations)
            }
        }
    }
}
