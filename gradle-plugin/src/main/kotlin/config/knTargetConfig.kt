package org.gtkkn.gradle.plugin.config

import org.gradle.api.Project
import org.gtkkn.gradle.plugin.ext.GtkKNCompilationExt
import org.gtkkn.gradle.plugin.ext.GtkKNTargetExt
import org.gtkkn.gradle.plugin.ext.gtk
import org.gtkkn.gradle.plugin.task.compileGResourcesTasks
import org.gtkkn.gradle.plugin.task.compileGSchemasTasks
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.KonanTarget

internal fun Project.attachKnTarget(target: KotlinNativeTarget) {
    val targetGtk = GtkKNTargetExt.register(gtk, target)
    target.compilations.all {
        GtkKNCompilationExt.register(targetGtk, this)
    }
    compileGSchemasTasks(target)
    compileGResourcesTasks(target)
}

internal inline val KotlinNativeTarget.gtkSupported
    get() = when (this.konanTarget) {
        KonanTarget.LINUX_X64 -> true

        KonanTarget.LINUX_ARM32_HFP,
        KonanTarget.LINUX_ARM64,
        KonanTarget.LINUX_MIPS32,
        KonanTarget.LINUX_MIPSEL32,
        KonanTarget.MACOS_ARM64,
        KonanTarget.MACOS_X64,
        KonanTarget.MINGW_X64,
        KonanTarget.MINGW_X86 -> false

        else -> false
    }
