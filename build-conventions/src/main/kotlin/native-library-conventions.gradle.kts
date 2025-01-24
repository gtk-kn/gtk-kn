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

import org.gradle.internal.os.OperatingSystem

plugins {
    kotlin("multiplatform")
    id("config-conventions")
    id("org.jetbrains.dokka")
    id("detekt-conventions")
}

kotlin {
    explicitApi()
    val hostOs = OperatingSystem.current()
    val hostArch = System.getProperty("os.arch")
    val isArm64 = hostArch == "aarch64"
    when {
        hostOs.isLinux && !isArm64 -> linuxX64()
        hostOs.isMacOsX && isArm64 -> macosArm64()
        else -> throw GradleException("Host OS '${hostOs}' is not supported by gtk-kn.")
    }

    sourceSets {
        all {
            languageSettings.optIn("kotlinx.cinterop.ExperimentalForeignApi")
            languageSettings.optIn("kotlin.experimental.ExperimentalNativeApi")
        }
    }
}
