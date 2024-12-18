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

import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gtkkn.gir.blueprints.CallbackBlueprint

interface CallbackGenerator : ClosureImplementationGenerator, ConversionBlockGenerator, KDocGenerator {
    fun buildCallbackTypeAlias(callback: CallbackBlueprint): TypeAliasSpec {
        val validParameterNames = callback.lambdaTypeName.parameters.map { it.name }.toSet()
        val parameters = callback.parameters.filter { it.kotlinName in validParameterNames }

        return TypeAliasSpec.builder(callback.kotlinName, callback.lambdaTypeName)
            .addKdoc(buildCallbackKDoc(callback.kdoc, parameters, callback.returnTypeKDoc))
            .build()
    }

    fun buildStaticCallbackProperty(callback: CallbackBlueprint): PropertySpec {
        val staticCallbackVal = PropertySpec.builder(
            "${callback.kotlinName}Func",
            nativeCallbackCFunctionTypeName(
                callback.returnTypeInfo.nativeTypeName,
                callback.parameters
                    .filterNot { it.isUserData }
                    .map { param ->
                        ParameterSpec.builder("", param.typeInfo.nativeTypeName).build()
                    },
            ),
        ).initializer(buildStaticClosureImplementation(callback))
        return staticCallbackVal.build()
    }
}
