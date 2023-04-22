package org.gtkkn.gradle.plugin.ext

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.Property
import org.gtkkn.gradle.plugin.utils.maybeCreate
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation

interface GtkKNCompilationExt : ExtensionAware {
    /**
     * Where to install compiled gschema.xml
     */
    val gSchemasInstallDir: DirectoryProperty

    /**
     * Should gresources be compiled and embedded into final executable
     */
    val embedResources: Property<Boolean>

    companion object {
        internal fun register(gtk: GtkKNCompilationExt, compilation: KotlinNativeCompilation) =
            (compilation as ExtensionAware).extensions.maybeCreate<GtkKNCompilationExt>("gtk") {
                gSchemasInstallDir.convention(gtk.gSchemasInstallDir)
                embedResources.convention(gtk.embedResources)
            }
    }
}
