package org.gtkkn.gradle.plugin.ext

import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.kotlin.dsl.getByType
import org.gtkkn.gradle.plugin.utils.maybeCreate

interface GtkExt : GtkKNCompilationExt {
    /**
     * Where to place intermediate outputs of various plugin tasks
     */
    val baseOutputDir: DirectoryProperty

    companion object {
        internal fun register(project: Project) = project.extensions.maybeCreate<GtkExt>("gtk") {
            gSchemasInstallDir.convention(
                project.layout.projectDirectory.dir("${System.getProperty("user.home")}/.local/share/glib-2.0/schemas/"),
            )
            baseOutputDir.convention(project.layout.buildDirectory.dir("gtk/"))
            embedResources.convention(true)
        }
    }
}

internal inline val Project.gtk: GtkExt
    get() = extensions.getByType()
