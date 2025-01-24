/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class RevertBindingsTask @Inject constructor(
    private val execOperations: ExecOperations
) : DefaultTask() {
    init {
        group = "Build"
        description = "Reverts changes and removes untracked files in all " +
            "/src/nativeMain/kotlin/org/gtkkn/bindings directories within the bindings/ directory using Git."

        notCompatibleWithConfigurationCache(
            "This task executes external Git commands during the execution phase, " +
                    "which is not supported by Gradle's configuration cache.",
        )
    }

    @TaskAction
    fun revert() {
        val bindingPaths = project.file("bindings")
            .walkTopDown()
            .filter { dir ->
                dir.isDirectory && dir.path.endsWith("/src/nativeMain/kotlin/org/gtkkn/bindings")
            }
            .map { it.relativeTo(project.rootDir).path }
            .filter { path ->
                val result = execOperations.exec {
                    commandLine("git", "ls-files", "--error-unmatch", path)
                    isIgnoreExitValue = true
                }
                result.exitValue == 0
            }
            .toList()

        if (bindingPaths.isEmpty()) {
            logger.lifecycle("No bindings directories found to revert.")
            return
        }

        bindingPaths.forEach { path ->
            execOperations.exec {
                commandLine("git", "restore", "--staged", "--worktree", path)
            }
            execOperations.exec {
                commandLine("git", "clean", "-fd", "--", path)
            }
        }

        logger.lifecycle("Reverted changes in the following paths:\n${bindingPaths.joinToString("\n")}")
    }
}
