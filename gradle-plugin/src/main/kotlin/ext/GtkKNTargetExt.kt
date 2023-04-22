package org.gtkkn.gradle.plugin.ext

import org.gradle.api.plugins.ExtensionAware
import org.gtkkn.gradle.plugin.utils.maybeCreate
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

interface GtkKNTargetExt : GtkKNCompilationExt {

    companion object {
        internal fun register(gtk: GtkExt, target: KotlinNativeTarget) =
            (target as ExtensionAware).extensions.maybeCreate<GtkKNTargetExt>("gtk") {
                gSchemasInstallDir.convention(gtk.gSchemasInstallDir)
                embedResources.convention(gtk.embedResources)
            }
    }
}
