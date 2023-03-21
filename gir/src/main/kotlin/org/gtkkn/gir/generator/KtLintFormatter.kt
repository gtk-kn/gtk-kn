package org.gtkkn.gir.generator

import com.pinterest.ktlint.core.Code
import com.pinterest.ktlint.core.KtLintRuleEngine
import com.pinterest.ktlint.core.RuleSetProviderV2
import com.pinterest.ktlint.core.api.EditorConfigDefaults
import org.gtkkn.gir.log.logger
import java.io.File
import java.nio.file.Path
import java.util.ServiceLoader

class KtLintFormatter(outputDir: File) {
    private val ruleProviders = buildSet {
        ServiceLoader.load(RuleSetProviderV2::class.java).flatMapTo(this) { it.getRuleProviders() }
    }
    private val ktLintRuleEngine: KtLintRuleEngine

    init {
        val editorConfigPath = findEditorConfigPath(outputDir)
        if (editorConfigPath == null) {
            logger.error("Unable to find .editorconfig file in or above directory ${outputDir.absolutePath}")
        }
        ktLintRuleEngine = KtLintRuleEngine(
            ruleProviders = ruleProviders,
            editorConfigDefaults = editorConfigPath?.let { EditorConfigDefaults.load(it) }
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

        // Format and write the file
        kotlinFile.writeText(ktLintRuleEngine.format(Code.CodeSnippet(content)))
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
