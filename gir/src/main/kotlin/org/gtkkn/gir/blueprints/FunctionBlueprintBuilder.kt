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

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName
import net.pearx.kasechange.toCamelCase
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class FunctionBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girFunction: GirFunction,
) : CallableBlueprintBuilder<FunctionBlueprint>(context, girNamespace) {
    override fun blueprintObjectType(): String = "function"
    override fun blueprintObjectName(): String = girFunction.callable.getName()

    override fun buildInternal(): FunctionBlueprint {
        if (!girFunction.callable.shouldBeGenerated()) {
            throw NotIntrospectableException(girFunction.callable.cIdentifier ?: girFunction.callable.getName())
        }

        if (girFunction.callable.cIdentifier == null) {
            throw UnresolvableTypeException("Function ${girFunction.callable.getName()} does not have cIdentifier")
        }
        if (girFunction.parameters?.instanceParameter != null) {
            throw UnresolvableTypeException("Function with instance parameter is not supported yet")
        }

        context.checkIgnoredFunction(girFunction.callable.cIdentifier)

        girFunction.parameters?.let { addParameters(it) }

        val returnValue = girFunction.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        val kotlinName = girFunction.callable.getName().toCamelCase()
        val nativeName = girFunction.callable.cIdentifier
        val nativeMemberPackageName =
            if (kotlinName == "getType" && girNamespace.name == "GLib" ||
                nativeName == "g_strv_get_type" ||
                nativeName == "g_variant_get_gtype"
            ) {
                // these native functions are defined in `gobject/glib-types.h` but used in GLib
                "org.gtkkn.native.gobject"
            } else {
                context.namespaceNativePackageName(girNamespace)
            }
        val nativeMemberName = MemberName(nativeMemberPackageName, nativeName)

        return FunctionBlueprint(
            kotlinName = kotlinName,
            nativeName = nativeName,
            nativeMemberName = nativeMemberName,
            parameters = sanitizeParameters(parameterBlueprints),
            returnTypeInfo = returnTypeInfo,
            throws = girFunction.callable.throws == true,
            exceptionResolvingFunctionMember = girNamespace.exceptionResolvingFunction(),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(
                context,
                girNamespace,
                girFunction.callable.info,
            ).build().getOrNull(),
            kdoc = context.processKdoc(girFunction.doc?.doc?.text),
            returnTypeKDoc = context.processKdoc(girFunction.returnValue.doc?.doc?.text),
        )
    }

    /**
     * Postprocess parameter blueprints for some additional gir fixes.
     */
    private fun sanitizeParameters(params: List<ParameterBlueprint>): List<ParameterBlueprint> =
        if (needsNickBlurbFix(params)) {
            params.map { nickBlurbFix(it) }
        } else {
            params
        }

    private fun needsNickBlurbFix(params: List<ParameterBlueprint>): Boolean =
        girFunction.callable.cIdentifier.orEmpty().startsWith("g_param_spec_") &&
            params.size >= 3 &&
            params[0].nativeName == "name" &&
            params[1].nativeName == "nick" &&
            params[2].nativeName == "blurb"

    /**
     * Newer versions of the GObject gir have param_spec `nick` and `blurb` parameters annotated as nullable
     * while older versions do not. Here we force them nullable even for older gir files.
     * https://github.com/GNOME/glib/commit/79c70d7a362f4b793363275cbe37d3c08f7ea884
     */
    private fun nickBlurbFix(param: ParameterBlueprint): ParameterBlueprint = when (param.nativeName) {
        "nick" -> param.copy(typeInfo = param.typeInfo.withNullable(true))
        "blurb" -> param.copy(typeInfo = param.typeInfo.withNullable(true))
        else -> param
    }
}
