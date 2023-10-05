/*
 * Copyright (c) 2024 gtk-kn
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

package org.gtkkn.gradle.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.logging.LogLevel
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.TaskAction
import org.gradle.internal.os.OperatingSystem
import org.gradle.process.ExecOperations
import java.io.ByteArrayOutputStream
import java.io.File
import javax.inject.Inject

abstract class NativeTask : DefaultTask() {
    @get:Input
    abstract val executable: Property<String>

    @get:Internal
    abstract val workingDir: DirectoryProperty

    @get:Input
    abstract val args: ListProperty<String>

    @get:Nested
    abstract val packages: ToolingPackages

    @get:Inject
    protected abstract val execOperations: ExecOperations

    /**
     * Added utility for extending classes to prepend some arguments before [args]
     */
    protected open fun prependArgs(): List<String> = emptyList()

    protected open fun processOutput(output: String) {}

    @TaskAction
    fun run() {
        checkTooling(executable.get(), true, packages)
        ByteArrayOutputStream().use { outputStream ->
            execOperations.exec {
                logging.captureStandardOutput(LogLevel.INFO)
                logging.captureStandardError(LogLevel.ERROR)
                executable = this@NativeTask.executable.get()
                workingDir = this@NativeTask.workingDir.asFile.getOrElse(temporaryDir)
                args = prependArgs() + this@NativeTask.args.get()
                standardOutput = outputStream
            }
            outputStream.toString()
        }.also(::processOutput)
    }

    private fun checkTooling(executable: String, assert: Boolean, toolingPackages: ToolingPackages) {
        val onPath = isExecutableOnPath(executable)
        if (!onPath) {
            val message = """
                GTK tool $executable missing on PATH
                Install the following package to fix it

            """.trimIndent() + toolingPackages.installInstructions()
            if (assert) {
                error(message)
            } else {
                logger.warn(message)
            }
        } else {
            logger.info("GTK tool $executable is present on PATH")
        }
    }

    private fun isExecutableOnPath(executable: String): Boolean {
        val paths = System.getenv("PATH").split(File.pathSeparator)
        val os = OperatingSystem.current()

        // On Windows, executables may have extensions like .exe, .bat, .cmd
        val executableNames = if (os.isWindows) {
            val pathExt = System.getenv("PATHEXT")?.split(';') ?: listOf(".exe", ".bat", ".cmd")
            pathExt.map { ext -> "$executable$ext" }
        } else {
            listOf(executable)
        }

        return paths.any { dir ->
            executableNames.any { name ->
                val file = File(dir, name)
                file.exists() && file.canExecute()
            }
        }
    }
}
