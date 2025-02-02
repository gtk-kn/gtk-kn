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

import com.squareup.kotlinpoet.CodeBlock
import org.gtkkn.gir.blueprints.DeprecatedBlueprint
import org.gtkkn.gir.blueprints.OptInVersionBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.SkippedObject
import org.gtkkn.gir.blueprints.TypeInfo

interface KDocGenerator {
    fun buildTypeKDoc(
        kdoc: String?,
        optInVersionBlueprint: OptInVersionBlueprint?,
        deprecatedBlueprint: DeprecatedBlueprint?,
        skippedObjects: List<SkippedObject> = emptyList()
    ): CodeBlock =
        CodeBlock.builder().apply {
            val documentedSkippedObjects = skippedObjects.filter { it.documented }
            addDeprecation(deprecatedBlueprint)
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
        optInVersionBlueprint: OptInVersionBlueprint? = null,
        deprecatedBlueprint: DeprecatedBlueprint? = null,
        returnTypeKDoc: String? = null,
    ): CodeBlock? =
        if (!kdoc.isNullOrBlank() ||
            parameters.any { !it.kdoc.isNullOrBlank() } ||
            !returnTypeKDoc.isNullOrBlank() ||
            !optInVersionBlueprint?.version.isNullOrBlank()
        ) {
            CodeBlock.builder().apply {
                addDeprecation(deprecatedBlueprint)
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
        } else {
            null
        }

    fun buildSignalConnectKDoc(
        kdoc: String?,
        detailed: Boolean,
        parameters: List<ParameterBlueprint>,
        optInVersionBlueprint: OptInVersionBlueprint?,
        deprecatedBlueprint: DeprecatedBlueprint?,
        returnTypeKDoc: String?,
    ): CodeBlock = CodeBlock.builder().apply {
        addDeprecation(deprecatedBlueprint)
        kdoc?.let { add("%L", it) }
        add("\n\n@param connectFlags a combination of [ConnectFlags]")
        if (detailed) {
            add("\n@param detail the signal detail")
        }
        add("\n@param handler the Callback to connect")
        if (parameters.isNotEmpty()) {
            add(". Params: %L", parameters.joinToString(separator = "; ") { "`${it.kotlinName}` ${it.kdoc.orEmpty()}" })
        }
        returnTypeKDoc?.let { add(". Returns %L", it) }
        optInVersionBlueprint?.version?.let { add("\n@since %L", it) }
    }.build()

    fun buildSignalEmitKDoc(
        kdoc: String?,
        detailed: Boolean,
        parameters: List<ParameterBlueprint>,
        optInVersionBlueprint: OptInVersionBlueprint?,
        deprecatedBlueprint: DeprecatedBlueprint?,
    ): CodeBlock = CodeBlock.builder().apply {
        addDeprecation(deprecatedBlueprint)
        kdoc?.let { add("%L", it) }
        if (detailed || parameters.isNotEmpty() || !optInVersionBlueprint?.version.isNullOrBlank()) {
            add("\n")
        }
        if (detailed) {
            add("\n@param detail the signal detail")
        }
        parameters.forEach { param ->
            add("\n@param %L %L", param.kotlinName, param.kdoc.orEmpty())
        }
        optInVersionBlueprint?.version?.let { add("\n@since %L", it) }
    }.build()

    fun buildPropertyKDoc(
        kdoc: String?,
        optInVersionBlueprint: OptInVersionBlueprint?,
        deprecatedBlueprint: DeprecatedBlueprint?,
    ): CodeBlock = CodeBlock.builder().apply {
        addDeprecation(deprecatedBlueprint)
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

    fun CodeBlock.Builder.addDeprecation(deprecatedBlueprint: DeprecatedBlueprint?) {
        deprecatedBlueprint?.let { deprecated ->
            add("# ⚠\uFE0F Deprecated ⚠\uFE0F\n")
            add("\nThis is deprecated%L.\n", deprecated.version?.let { " since version $it" }.orEmpty())
            deprecated.message?.let { message ->
                add("\n%L\n", message)
            }
            add("---\n\n")
        }
    }

    fun getAutofreeScopeConstructorKdoc(kotlinName: String) =
        """
            Allocate a new $kotlinName using the provided [AutofreeScope].

            The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
        """.trimIndent()

    fun getNoArgConstructorKdoc(kotlinName: String) =
        """
            Allocate a new $kotlinName.

            This instance will be allocated on the native heap and automatically freed when
            this class instance is garbage collected.
        """.trimIndent()

    fun getAutofreeScopeParamForKdoc() = ParameterBlueprint(
        kotlinName = "scope",
        nativeName = "scope",
        typeInfo = TypeInfo.Primitive(BindingsGenerator.AUTOFREE_SCOPE),
        defaultNull = false,
        kdoc = "The [AutofreeScope] to allocate this structure in.",
    )
}
