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

@file:Suppress("PackageDirectoryMismatch")

/*
 * Due to the way gradle resolves script context,
 * anything placed in a global package will be available in buildscripts without requiring imports.
 *
 * BE EXTRA CAREFUL of what you put here as it will pollute the buildscript context for the consumers.
 * This file should be reserved for gradle accessors that it cannot generate
 */
import org.gradle.api.Action
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.findByType
import org.gtkkn.gradle.plugin.config.gtkSupported
import org.gtkkn.gradle.plugin.ext.GtkKotlinNativeCompilationExt
import org.gtkkn.gradle.plugin.ext.GtkKotlinNativeTargetExt
import org.gtkkn.gradle.plugin.utils.qualifiedName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

val KotlinNativeTarget.gtk: GtkKotlinNativeTargetExt
    get() = (this as ExtensionAware).extensions.findByType() ?: error(
        if (gtkSupported) {
            "gtk extension is missing for $name KotlinNativeTarget"
        } else {
            "KotlinNativeTarget[$name] KonanTarget ${konanTarget.name} is not supported"
        },
    )

fun KotlinNativeTarget.gtk(configure: Action<GtkKotlinNativeTargetExt>): GtkKotlinNativeTargetExt =
    gtk.apply(configure::execute)

val KotlinNativeCompilation.gtk: GtkKotlinNativeCompilationExt
    get() = (this as ExtensionAware).extensions.findByType() ?: error(
        if (target.gtkSupported) {
            "gtk extension is missing for $name KotlinNativeCompilation"
        } else {
            "KotlinNativeCompilation[$qualifiedName] KonanTarget ${konanTarget.name} is not supported"
        },
    )

fun KotlinNativeCompilation.gtk(configure: Action<GtkKotlinNativeCompilationExt>): GtkKotlinNativeCompilationExt =
    gtk.apply(configure::execute)
