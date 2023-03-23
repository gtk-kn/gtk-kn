package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.CodeBlock
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.SkippedObject

interface KDocGenerator {
    fun buildTypeKDoc(kdoc: String?, skippedObjects: List<SkippedObject> = emptyList()): CodeBlock =
        CodeBlock.builder().apply {
            val documentedSkippedObjects = skippedObjects.filter { it.documented }
            kdoc?.let { add("%L", it) }
            if (documentedSkippedObjects.isNotEmpty()) {
                if (kdoc != null) {
                    add("\n\n")
                }
                add("## Skipped during bindings generation\n\n")
            }
            for (skip in documentedSkippedObjects) {
                addStatement(skip.kDocMessage())
            }
        }.build()

    fun buildMethodKDoc(
        kdoc: String?,
        parameters: List<ParameterBlueprint>,
        returnTypeKDoc: String?,
    ): CodeBlock = CodeBlock.builder().apply {
        kdoc?.let { add("%L", it) }
        if (parameters.isNotEmpty() || returnTypeKDoc != null) {
            add("\n")
        }
        parameters.forEach { param ->
            add("\n@param %L %L", param.kotlinName, param.kdoc.orEmpty())
        }
        returnTypeKDoc?.let { add("\n@return %L", it) }
    }.build()

    fun buildSignalKDoc(
        kdoc: String?,
        parameters: List<ParameterBlueprint>,
        returnTypeKDoc: String?,
    ): CodeBlock = CodeBlock.builder().apply {
        kdoc?.let { add("%L", it) }
        add("\n\n@param connectFlags A combination of [ConnectFlags]")
        add("\n@param handler the Callback to connect")
        if (parameters.isNotEmpty()) {
            add(". Params: %L", parameters.joinToString(separator = "; ") { "`${it.kotlinName}` ${it.kdoc.orEmpty()}" })
        }
        returnTypeKDoc?.let { add(". Returns %L", it) }
    }.build()
}
