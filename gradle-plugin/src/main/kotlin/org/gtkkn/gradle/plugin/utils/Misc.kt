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
package org.gtkkn.gradle.plugin.utils

import org.gradle.api.plugins.ExtensionContainer
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.findByType
import org.gtkkn.gradle.plugin.ext.capitalized
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

internal inline fun <reified T : Any> ExtensionContainer.maybeCreate(name: String, init: T.() -> Unit) =
    (findByType<T>() ?: create<T>(name)).apply(init)

internal val KotlinNativeCompilation.qualifiedName get() = "${target.name.capitalized()}${name.capitalized()}"
