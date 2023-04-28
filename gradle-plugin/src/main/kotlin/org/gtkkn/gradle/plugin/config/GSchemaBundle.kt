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

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.tasks.Copy
import org.gradle.configurationcache.extensions.capitalized
import org.gradle.kotlin.dsl.register
import org.gtkkn.gradle.plugin.domain.GSchemaBundle
import org.gtkkn.gradle.plugin.ext.GtkKotlinNativeCompilationExt
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.task.CompileGSchemasTask
import org.gtkkn.gradle.plugin.utils.qualifiedName
import org.jetbrains.kotlin.gradle.plugin.mpp.AbstractExecutable
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import java.io.File


internal fun NamedDomainObjectContainer<GSchemaBundle>.configure(
    compilation: KotlinNativeCompilation,
    gtk: GtkKotlinNativeCompilationExt
) {
    val project = compilation.project
    whenObjectAdded bundle@{
        val suffix = "${compilation.qualifiedName}${name.capitalized()}"
        installDir.convention(gtk.schemasInstallDir)
        targetDir.convention(project.gtk.baseOutputDir.dir("gschemas/${compilation.target.name}/${compilation.name}/$name"))
        val copyTask = project.tasks.register<Copy>("copyGSchemas$suffix") {
            onlyIf("Manifest file exists") { manifest.asFile.orNull?.exists() == true }
            description = "Stages all *.gschema.xml from processed resources"
            from(this@bundle.manifest.asFile.map(File::getParentFile))
            into(temporaryDir)
            include { it.file.absolutePath == this@bundle.manifest.asFile.get().absolutePath }
        }
        val compileTask = project.tasks.register<CompileGSchemasTask>("compileGSchemas$suffix") {
            dependsOn(copyTask)
            sourceDir.convention(project.layout.dir(copyTask.map(Copy::getDestinationDir)))
            targetDir.convention(this@bundle.targetDir)
        }
        val installTask = project.tasks.register<CompileGSchemasTask>("installGSchemas$suffix") {
            dependsOn(copyTask)
            sourceDir.convention(project.layout.dir(copyTask.map(Copy::getDestinationDir)))
            targetDir.convention(this@bundle.installDir)
        }
        project.tasks.named(compilation.compileKotlinTaskName) { dependsOn(compileTask) }
        compilation.target.binaries.all {
            if (this is AbstractExecutable && this.compilation == compilation) {
                linkTaskProvider.configure { dependsOn(installTask) }
            }
        }
    }
}
