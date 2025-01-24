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

package org.gtkkn.gir.generator

import com.pinterest.ktlint.cli.ruleset.core.api.RuleSetProviderV3
import com.pinterest.ktlint.rule.engine.api.Code
import com.pinterest.ktlint.rule.engine.api.EditorConfigDefaults
import com.pinterest.ktlint.rule.engine.api.EditorConfigDefaults.Companion.load
import com.pinterest.ktlint.rule.engine.api.KtLintRuleEngine
import com.pinterest.ktlint.rule.engine.core.api.AutocorrectDecision
import com.pinterest.ktlint.rule.engine.core.api.propertyTypes
import org.gtkkn.gir.log.logger
import java.io.File
import java.nio.file.Path
import java.util.ServiceLoader

class KtLintFormatter(outputDir: File) {
    private val ruleProviders = buildSet {
        ServiceLoader.load(RuleSetProviderV3::class.java).flatMapTo(this) { it.getRuleProviders() }
    }
    private val ktLintRuleEngine: KtLintRuleEngine

    init {
        val editorConfigPath = findEditorConfigPath(outputDir)
        if (editorConfigPath == null) {
            logger.error { "Unable to find .editorconfig file in or above directory ${outputDir.absolutePath}" }
        }
        ktLintRuleEngine = KtLintRuleEngine(
            ruleProviders = ruleProviders,
            editorConfigDefaults = editorConfigPath?.let { load(it, ruleProviders.propertyTypes()) }
                ?: EditorConfigDefaults.EMPTY_EDITOR_CONFIG_DEFAULTS,
        )
    }

    fun formatAndWriteKotlinFile(
        outputDirectory: File,
        packageName: String,
        simpleName: String,
        content: String
    ) {
        // Create the package directory structure
        val packageDir = packageName.replace(".", "/")
        val dir = File(outputDirectory, packageDir).apply { mkdirs() }

        // Create the Kotlin file
        val kotlinFile = File(dir, "$simpleName.kt")
        kotlinFile.createNewFile()

        // Provide a virtual path for the code snippet
        val virtualPath = kotlinFile.toPath()

        // Format and write the file
        kotlinFile.writeText(
            ktLintRuleEngine.format(Code.fromSnippetWithPath(content, virtualPath)) { _ ->
                AutocorrectDecision.ALLOW_AUTOCORRECT
            },
        )
    }

    private fun findEditorConfigPath(startDir: File): Path? {
        var currentDir: File? = startDir

        while (currentDir != null) {
            val editorConfig = File(currentDir, ".editorconfig")
            if (editorConfig.exists()) {
                return editorConfig.toPath()
            }

            currentDir = currentDir.parentFile
        }

        return null
    }
}
