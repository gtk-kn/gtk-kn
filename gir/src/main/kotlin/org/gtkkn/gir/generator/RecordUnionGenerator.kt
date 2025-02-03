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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.RecordUnionCommonBlueprint

/**
 * Provides common logic for generating records/unions, such as:
 * - Adding KDoc/Annotations
 * - Adding methods, fields
 * - Adding toString if needed
 * - Building companion object with factory constructors and functions
 */
interface RecordUnionGenerator : FieldGenerator, MethodGenerator, FunctionGenerator, ConstructorGenerator {
    fun TypeSpec.Builder.addCommonTopLevelKdocAndAnnotations(
        blueprint: RecordUnionCommonBlueprint
    ) {
        addKdoc(
            buildTypeKDoc(
                blueprint.kdoc,
                blueprint.optInVersionBlueprint,
                blueprint.deprecatedBlueprint,
                blueprint.skippedObjects
            )
        )
        blueprint.optInVersionBlueprint?.typeName?.let { addAnnotation(it) }
    }

    fun TypeSpec.Builder.setupInheritance(blueprint: RecordUnionCommonBlueprint) {
        superclass(BindingsGenerator.PROXY_INSTANCE_TYPE)
        addSuperclassConstructorParameter(blueprint.objectPointerName)
    }

    fun TypeSpec.Builder.addMethodsAndFields(
        blueprint: RecordUnionCommonBlueprint
    ) {
        // Instance methods
        blueprint.methods.forEach { addFunction(buildMethod(it, blueprint.objectPointerName)) }

        // Fields
        blueprint.fields.forEach { addProperty(buildFieldProperty(blueprint.objectPointerName, it)) }
    }

    fun TypeSpec.Builder.addToStringIfNeeded(
        blueprint: RecordUnionCommonBlueprint,
        isDisguised: Boolean = false
    ) {
        if (blueprint.fields.isNotEmpty() && blueprint.methods.none { it.kotlinName == "toString" }) {
            addFunction(buildToStringFunction(blueprint))
        } else if ((blueprint.nativeTypeName as ClassName).simpleName == "GValue") {
            addFunction(buildGValueToStringFunction())
        }
    }

    fun buildToStringFunction(blueprint: RecordUnionCommonBlueprint): FunSpec {
        val fieldValues = blueprint.fields.joinToString(", ") { "${it.kotlinName}=\$${it.kotlinName}" }
        return FunSpec.builder("toString")
            .addModifiers(KModifier.OVERRIDE)
            .returns(String::class)
            .addCode("return \"${blueprint.kotlinName}($fieldValues)\"")
            .build()
    }

    fun buildGValueToStringFunction(): FunSpec = FunSpec.builder("toString")
        .addModifiers(KModifier.OVERRIDE)
        .returns(String::class)
        .addCode("return %M(this)", BindingsGenerator.G_STRDUP_VALUE_CONTENTS)
        .build()

    fun buildCompanionObject(
        companionSpecBuilder: TypeSpec.Builder,
        blueprint: RecordUnionCommonBlueprint,
        kotlinTypeName: ClassName
    ): TypeSpec? {
        if (blueprint.constructors.isEmpty() && blueprint.functions.isEmpty()) {
            return null
        }
        blueprint.functions.forEach {
            companionSpecBuilder.addFunction(buildFunction(it))
        }
        if (kotlinTypeName == ClassName.bestGuess("org.gtkkn.bindings.glib.Variant")) {
            companionSpecBuilder.addFunction(buildVariantGetTypeFunction())
        }
        return companionSpecBuilder.build()
    }
}
