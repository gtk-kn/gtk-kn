package org.gtkkn.gradle.plugin.config

import org.gradle.api.Project
import org.gtkkn.gradle.plugin.task.compileGSchemasTask
import org.gtkkn.gradle.plugin.task.compileGSchemasTaskName
import org.gtkkn.gradle.plugin.task.copyGSchemasTask
import org.gtkkn.gradle.plugin.task.copyGSchemasTaskName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.KonanTarget

internal fun Project.attachKnTarget(target: KotlinNativeTarget) {
    target.compilations.forEach {
        copyGSchemasTask(it)
        compileGSchemasTask(it)
    }
}

internal fun Project.detachKnTarget(target: KotlinNativeTarget) {
    target.compilations.forEach {
        tasks.remove(tasks.getByName(it.copyGSchemasTaskName))
        tasks.remove(tasks.getByName(it.compileGSchemasTaskName))
    }
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
