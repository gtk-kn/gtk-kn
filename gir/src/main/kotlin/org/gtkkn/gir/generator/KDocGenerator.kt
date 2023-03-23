package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.CodeBlock
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.SkippedObject

interface KDocGenerator {
    fun buildTypeKDoc(kdoc: String?, skippedObjects: List<SkippedObject> = emptyList()): CodeBlock {
        val documentedSkippedObjects = skippedObjects.filter { it.documented }
        // nicely format skipped objects
        val longestObjectName = documentedSkippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = documentedSkippedObjects.maxOfOrNull { it.objectType.length } ?: 0

        return CodeBlock.builder().apply {
            kdoc?.let { add("%L", it) }
            if (documentedSkippedObjects.isNotEmpty()) {
                if (kdoc != null) {
                    add("\n\n")
                }
                add("## Skipped during bindings generation\n\n")
            }
            for (skip in documentedSkippedObjects) {
                addStatement(skip.fullMessage(longestObjectName, longestTypeName))
            }
        }.build()
    }

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
}
