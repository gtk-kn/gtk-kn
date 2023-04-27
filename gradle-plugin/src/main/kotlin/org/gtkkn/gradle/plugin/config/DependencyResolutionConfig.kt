/*
 * Copyright (c) 2023 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
