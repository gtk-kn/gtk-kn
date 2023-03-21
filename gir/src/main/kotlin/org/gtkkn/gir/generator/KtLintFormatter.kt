package org.gtkkn.gir.generator

import com.pinterest.ktlint.core.Code
import com.pinterest.ktlint.core.KtLintRuleEngine
import com.pinterest.ktlint.core.RuleSetProviderV2
import com.pinterest.ktlint.core.api.EditorConfigDefaults
import java.io.File
import java.util.ServiceLoader

class KtLintFormatter {
    private val ruleProviders = buildSet {
        ServiceLoader.load(RuleSetProviderV2::class.java).flatMapTo(this) { it.getRuleProviders() }
    }
    private val ktLintRuleEngine = KtLintRuleEngine(
        ruleProviders = ruleProviders,
        editorConfigDefaults = EditorConfigDefaults.load(EDITORCONFIG_PATH),
    )

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

    companion object {
        private val EDITORCONFIG_PATH =
            File(System.getProperty("user.dir")).parentFile.resolve(".editorconfig").toPath()
    }
}
