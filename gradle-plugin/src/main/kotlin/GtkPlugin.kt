package org.gtkkn.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.gtkkn.gradle.plugin.config.attachKnTarget
import org.gtkkn.gradle.plugin.config.dependencyResolutionConfig
import org.gtkkn.gradle.plugin.config.gtkSupported
import org.gtkkn.gradle.plugin.task.gtkDoctorTask
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

@Suppress("unused")
class GtkPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
            project.afterKmpPlugin(project.extensions.getByType())
        }
        project.gtkDoctorTask()
        project.dependencyResolutionConfig()
    }

    private fun Project.afterKmpPlugin(kmp: KotlinMultiplatformExtension) {
        kmp.targets.configureEach {
            if (this is KotlinNativeTarget && gtkSupported) attachKnTarget(this)
        }
    }
}
