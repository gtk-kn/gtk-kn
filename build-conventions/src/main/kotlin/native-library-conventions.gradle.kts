import org.gradle.internal.os.OperatingSystem

/*
 * Copyright (c) 2024 gtk-kn
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
