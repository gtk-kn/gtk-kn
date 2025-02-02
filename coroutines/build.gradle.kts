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

plugins {
    id("native-library-conventions")
    id("dokka-conventions")
    id("publishing-conventions")
}

version = config.versions.coroutines.get()

kotlin {
    sourceSets {
        nativeMain {
            dependencies {
                api(projects.bindings.core.glib)
                api(libs.kotlinx.coroutines.core)
            }
        }
        nativeTest {
            dependencies {
                implementation(libs.kotlinx.coroutines.test)
            }
        }
        configureEach {
            languageSettings {
                optIn("org.gtkkn.bindings.glib.annotations.GLibVersion2_10")
                optIn("org.gtkkn.bindings.glib.annotations.GLibVersion2_22")
                optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
                optIn("kotlinx.coroutines.InternalCoroutinesApi")
            }
        }
    }
}
