package org.gtkkn.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.gtkkn.gradle.plugin.config.attachKnTarget
import org.gtkkn.gradle.plugin.config.dependencyResolutionConfig
import org.gtkkn.gradle.plugin.config.gtkSupported
import org.gtkkn.gradle.plugin.ext.GtkExt
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

@Suppress("unused")
class GtkPlugin : Plugin<Project> {
    companion object {
        const val TASK_GROUP = "gtk"
    }

    override fun apply(project: Project) {
        GtkExt.register(project)

        project.pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
            project.afterKmpPlugin(project.extensions.getByType())
        }
        project.dependencyResolutionConfig()
    }

    private fun Project.afterKmpPlugin(kmp: KotlinMultiplatformExtension) {
        kmp.targets.all {
            if (this is KotlinNativeTarget && gtkSupported) attachKnTarget(this)
        }
    }
}
