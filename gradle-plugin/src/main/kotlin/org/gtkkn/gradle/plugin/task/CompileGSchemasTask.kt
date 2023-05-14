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

package org.gtkkn.gradle.plugin.task

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gtkkn.gradle.plugin.utils.provider

@Suppress("LeakingThis")
abstract class CompileGSchemasTask : GtkTask() {
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    /**
     * Where to store the gschemas.compiled file
     */
    @get:OutputDirectory
    @get:Optional
    abstract val targetDir: DirectoryProperty

    /**
     * Do not abort on any errors in schemas
     */
    @get:Input
    @get:Optional
    abstract val lax: Property<Boolean>

    /**
     * Do not write the gschema.compiled file
     */
    @get:Input
    @get:Optional
    abstract val dryRun: Property<Boolean>

    /**
     * Do not enforce key name restrictions
     */
    @get:Input
    @get:Optional
    abstract val allowAnyName: Property<Boolean>

    init {
        description = "Compiles gschema via native glib-compile-schemas toolchain"
        onlyIf { sourceDir.asFile.get().exists() }

        executable.convention("glib-compile-schemas")
        packages.glibDefaults()
        targetDir.convention(sourceDir)
        args.convention(
            provider {
                buildList {
                    val target = targetDir.asFile.get()
                    target.mkdirs()
                    add("--targetdir=${target.absolutePath}")
                    if (!lax.getOrElse(false)) add("--strict")
                    if (dryRun.getOrElse(false)) add("--dry-run")
                    if (allowAnyName.getOrElse(false)) add("--allow-any-name")
                    add(sourceDir.get().asFile.absolutePath)
                }
            },
        )
    }
}
