package org.gtkkn.gradle.plugin.task

import org.gradle.api.Task
import java.io.InputStream
import java.io.OutputStream

//internal fun Exec.configureTooling(executable: String, help: () -> String = { "" }) {
//    this.executable = executable
//    checkTooling(executable, assert = true, help = help)
//}

data class ToolingHelp(
    val debian: String,
    val fedora: String,
)

internal fun Task.checkTooling(executable: String, assert: Boolean, toolingPackages: ToolingPackages) {
    val onPath = project.exec {
        isIgnoreExitValue = true
        standardInput = InputStream.nullInputStream()
        standardOutput = OutputStream.nullOutputStream()
        errorOutput = OutputStream.nullOutputStream()
        this.executable = "which"
        args(executable)
    }.exitValue == 0
    if (!onPath) {
        if (assert) {
            error("GTK tool $executable missing on PATH\n\n")
        } else {
            logger.warn("GTK tool $executable missing on PATH\n\n")
        }
    } else {
        logger.info("GTK tool $executable is present on PATH")
    }
}
