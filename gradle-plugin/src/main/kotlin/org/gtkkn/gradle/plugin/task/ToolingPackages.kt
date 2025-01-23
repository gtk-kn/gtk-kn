/*
 * Copyright (c) 2024 gtk-kn
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

package org.gtkkn.gradle.plugin.task

import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.internal.os.OperatingSystem

interface ToolingPackages {
    @get:Input
    @get:Optional
    val arch: Property<String>

    @get:Input
    @get:Optional
    val brew: Property<String>

    @get:Input
    @get:Optional
    val debian: Property<String>

    @get:Input
    @get:Optional
    val fedora: Property<String>
}

internal fun ToolingPackages.glibDefaults() {
    arch.convention("glib2-devel")
    brew.convention("glib")
    debian.convention("libglib2.0-dev")
    fedora.convention("glib2-devel")
}

@Suppress("UseIfInsteadOfWhen")
internal fun ToolingPackages.installInstructions() = when {
    OperatingSystem.current().isLinux -> """
        Arch:   ${arch.map { "pacman -S $it" }.getOrElse("N/A")}
        Debian: ${debian.map { "apt install $it" }.getOrElse("N/A")}
        Fedora: ${fedora.map { "dnf install $it" }.getOrElse("N/A")}
    """.trimIndent()

    OperatingSystem.current().isMacOsX -> """
        ${brew.map { "brew install $it" }.getOrElse("N/A")}
    """.trimIndent()

    else -> """
        Operating system not supported by gtkkn
    """.trimIndent()
}
