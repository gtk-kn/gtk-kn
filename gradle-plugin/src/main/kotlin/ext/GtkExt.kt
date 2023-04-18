package org.gtkkn.gradle.plugin.ext

import org.gtkkn.gradle.plugin.utils.maybeCreate
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.plugins.ExtensionAware

interface GtkExt : ExtensionAware {
    val gSchemasDirectory: DirectoryProperty
}

internal inline val Project.gtk: GtkExt
    get() = extensions.maybeCreate("gtk") {
        gSchemasDirectory.convention(
            layout.projectDirectory.dir("${System.getenv("HOME")}/.local/share/glib-2.0/schemas/"),
        )
    }
