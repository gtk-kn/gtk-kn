/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.CodeBlock
import org.gtkkn.gir.blueprints.OptInVersionBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.SkippedObject

interface KDocGenerator {
    fun buildTypeKDoc(
        kdoc: String?,
        optInVersionBlueprint: OptInVersionBlueprint?,
        skippedObjects: List<SkippedObject> = emptyList()
    ): CodeBlock =
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
            optInVersionBlueprint?.version?.let { add("\n@since %L", it) }
        }.build()

    fun buildMethodKDoc(
        kdoc: String?,
        parameters: List<ParameterBlueprint> = emptyList(),
        optInVersionBlueprint: OptInVersionBlueprint?,
        returnTypeKDoc: String? = null,
    ): CodeBlock = CodeBlock.builder().apply {
        kdoc?.let { add("%L", it) }
        if (parameters.isNotEmpty() || returnTypeKDoc != null || optInVersionBlueprint?.version != null) {
            add("\n")
        }
        parameters.forEach { param ->
            add("\n@param %L %L", param.kotlinName, param.kdoc.orEmpty())
        }
        returnTypeKDoc?.let { add("\n@return %L", it) }
        optInVersionBlueprint?.version?.let { add("\n@since %L", it) }
    }.build()

    fun buildSignalKDoc(
        kdoc: String?,
        parameters: List<ParameterBlueprint>,
        optInVersionBlueprint: OptInVersionBlueprint?,
        returnTypeKDoc: String?,
    ): CodeBlock = CodeBlock.builder().apply {
        kdoc?.let { add("%L", it) }
        add("\n\n@param connectFlags A combination of [ConnectFlags]")
        add("\n@param handler the Callback to connect")
        if (parameters.isNotEmpty()) {
            add(". Params: %L", parameters.joinToString(separator = "; ") { "`${it.kotlinName}` ${it.kdoc.orEmpty()}" })
        }
        returnTypeKDoc?.let { add(". Returns %L", it) }
        optInVersionBlueprint?.version?.let { add("\n@since %L", it) }
    }.build()

    fun buildPropertyKDoc(
        kdoc: String?,
        optInVersionBlueprint: OptInVersionBlueprint?,
    ): CodeBlock = CodeBlock.builder().apply {
        kdoc?.let { add("%L", it) }
        optInVersionBlueprint?.version?.let { add("\n\n@since %L", it) }
    }.build()

    fun buildCallbackKDoc(
        kdoc: String?,
        parameters: List<ParameterBlueprint>,
        returnTypeKDoc: String?,
    ): CodeBlock = CodeBlock.builder().apply {
        kdoc?.let { add("%L", it) }
        if (parameters.isNotEmpty() || returnTypeKDoc != null) {
            add("\n")
        }
        parameters.forEach {
            add("\n- param %L", "`${it.kotlinName}` ${it.kdoc.orEmpty()}")
        }
        returnTypeKDoc?.let { add("\n- return %L", it) }
    }.build()
}
