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

package org.gtkkn.gradle.plugin.ext

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.Property
import org.gtkkn.gradle.plugin.config.configure
import org.gtkkn.gradle.plugin.domain.GResourceBundle
import org.gtkkn.gradle.plugin.domain.GSchemaBundle
import org.gtkkn.gradle.plugin.utils.maybeCreate
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

interface GtkKotlinNativeCompilationExt : ExtensionAware {
    /**
     * Where to install compiled gschema.xml
     */
    val schemasInstallDir: DirectoryProperty

    /**
     * Should gresources be compiled and embedded into final executable
     */
    val embedResources: Property<Boolean>

    val resourceBundles: NamedDomainObjectContainer<GResourceBundle>
    val schemaBundles: NamedDomainObjectContainer<GSchemaBundle>

    companion object {
        internal fun register(gtk: GtkKotlinNativeCompilationExt, compilation: KotlinNativeCompilation) =
            (compilation as ExtensionAware).extensions.maybeCreate<GtkKotlinNativeCompilationExt>("gtk") {
                schemasInstallDir.convention(gtk.schemasInstallDir)
                embedResources.convention(gtk.embedResources)

                resourceBundles.configure(compilation, this)
                schemaBundles.configure(compilation, this)
            }
    }
}
