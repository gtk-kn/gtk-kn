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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.U_LONG
import org.gtkkn.gir.blueprints.SignalBlueprint

interface SignalGenerator : ClosureImplementationGenerator, ConversionBlockGenerator, KDocGenerator {
    fun buildSignalConnectFunction(signal: SignalBlueprint, objectPointerName: String): FunSpec =
        FunSpec.builder(signal.kotlinConnectName).apply {
            val connectFlagsTypeName = ClassName("org.gtkkn.bindings.gobject", "ConnectFlags")

            addKdoc(
                buildSignalKDoc(
                    signal.kdoc,
                    signal.parameters,
                    signal.optInVersionBlueprint,
                    signal.returnTypeKDoc,
                ),
            )

            signal.optInVersionBlueprint?.typeName?.let { annotationClassName ->
                addAnnotation(annotationClassName)
            }

            addParameter(
                ParameterSpec.builder("connectFlags", connectFlagsTypeName)
                    .defaultValue("%T(0u)", connectFlagsTypeName)
                    .build(),
            )
            addParameter("handler", signal.lambdaTypeName)
            returns(U_LONG)

            addCode("return %M(", BindingsGenerator.G_SIGNAL_CONNECT_DATA)
            addCode("%N.%M()", objectPointerName, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", %S", signal.signalName)
            addCode(", %NFunc.%M()", signal.kotlinConnectName, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", %T.create(handler).asCPointer()", BindingsGenerator.STABLEREF)
            addCode(", %M.%M()", BindingsGenerator.STATIC_STABLEREF_DESTROY, BindingsGenerator.REINTERPRET_FUNC)
            addCode(", connectFlags.mask")
            addCode(")")
        }.build()

    fun buildStaticSignalCallback(signal: SignalBlueprint): PropertySpec {
        val staticCallbackVal = PropertySpec.builder(
            "${signal.kotlinConnectName}Func",
            nativeCallbackCFunctionTypeName(
                signal.returnTypeInfo.nativeTypeName,
                signal.parameters
                    .filterNot { it.isUserData }
                    .map { param ->
                        ParameterSpec.builder("", param.typeInfo.nativeTypeName).build()
                    },
            ),
            KModifier.PRIVATE,
        ).initializer(buildStaticClosureImplementation(signal))
        return staticCallbackVal.build()
    }
}
