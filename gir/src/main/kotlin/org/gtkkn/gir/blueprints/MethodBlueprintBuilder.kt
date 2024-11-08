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
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirAnyTypeOrVarargs
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.ShadowedFunctionException
import org.gtkkn.gir.processor.UnresolvableTypeException

class MethodBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girMethod: GirMethod,
    private val superClasses: List<GirClass> = emptyList(),
    private val superInterfaces: List<GirInterface> = emptyList(),
    private val isOpen: Boolean = false,
) : CallableBlueprintBuilder<MethodBlueprint>(context, girNamespace) {
    override fun blueprintObjectType(): String = "method"

    override fun blueprintObjectName(): String = girMethod.name

    override fun buildInternal(): MethodBlueprint {
        checkSkippedMethod()

        val kotlinName = getFixedKotlinNameOrNull()
            ?: context.kotlinizeMethodName(girMethod.shadows ?: girMethod.name)

        // parameters
        girMethod.parameters?.let { addParameters(it) }

        // return value
        val returnValue = girMethod.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo: TypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable(), isReturnType = true)
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }.applyMissingReturnValueAnnotations()

        // check for overrides
        val superMethods = superClasses.flatMap { it.methods } + superInterfaces.flatMap { it.methods }
        val nameMatchingSuperMethods = superMethods
            .filterNot { it.info.introspectable == false }
            .filter { it.name == girMethod.name }

        val isOverride = nameMatchingSuperMethods.any {
            it.debugParameterSignature() == girMethod.debugParameterSignature()
        }
        if (isOverride) {
            logger.warn { "Detected method override: ${girMethod.name}" }
        }

        val isNameClash = nameMatchingSuperMethods.any {
            it.debugParameterSignature() != girMethod.debugParameterSignature()
        }

        // method name
        val nativeMethodName = girMethod.cIdentifier
            ?: throw UnresolvableTypeException("native method ${girMethod.name} does not have cIdentifier")

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return MethodBlueprint(
            kotlinName = if (isNameClash) {
                resolveNameClash(kotlinName)
            } else {
                kotlinName
            },
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            parameters = parameterBlueprints,
            returnTypeInfo = returnTypeInfo,
            isOverride = isOverride,
            isOpen = isOpen,
            throws = girMethod.throws,
            exceptionResolvingFunctionMember = exceptionResolvingFunction(),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girMethod.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girMethod.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girMethod.returnValue.docs.doc?.text),
        )
    }

    private fun resolveNameClash(originalName: String): String {
        val result = "${originalName}_"
        logger.error { "Name clash: renaming method $originalName to $result" }
        return result
    }

    private fun checkSkippedMethod() {
        if (girMethod.info.introspectable == false) {
            throw NotIntrospectableException(girMethod.cIdentifier ?: girMethod.name)
        }

        if (girMethod.shadowedBy != null) {
            throw ShadowedFunctionException(girMethod.cIdentifier ?: girMethod.name, girMethod.shadowedBy)
        }

        girMethod.cIdentifier?.let { context.checkIgnoredFunction(it) }

        if (girMethod.parameters == null) {
            throw UnresolvableTypeException("Method has no parameters object")
        }

        if (girMethod.parameters.instanceParameter == null) {
            throw UnresolvableTypeException("Method has no instance parameter")
        }
    }

    private fun TypeInfo.applyMissingReturnValueAnnotations(): TypeInfo = when (girMethod.cIdentifier) {
        // add missing nullable annotations for g_value in older gobject gir files
        // https://gitlab.gnome.org/GNOME/glib/-/merge_requests/3301
        "g_value_get_boxed" -> this.withNullable(true)
        "g_value_dup_boxed" -> this.withNullable(true)
        "g_value_get_string" -> this.withNullable(true)
        "g_value_dup_string" -> this.withNullable(true)
        "g_value_get_object" -> this.withNullable(true)
        "g_value_dup_object" -> this.withNullable(true)
        else -> this
    }

    /**
     * Some methods need special casing logic in order to avoid conflicting methods when multiple implementations
     * of a similar method name is inherited from interfaces or parent classes.
     *
     * For example classes extending Gtk.Widget and implementing Gio.ActionGroup will have a name clash on
     * `activateAction` since the Widget method `activate_action` is more commonly used, we rename the interface method
     *
     * This method applies the renames for those cases.
     *
     * @return the fixed kotlinName for the method or null if no special casing applies
     */
    private fun getFixedKotlinNameOrNull(): String? = when (girMethod.cIdentifier) {
        "g_action_group_activate_action" -> "activateAction_"
        "gtk_root_get_display" -> "getDisplay_"
        "gtk_native_realize" -> "realize_"
        "gtk_native_unrealize" -> "unrealize_"
        "gtk_font_chooser_get_font_map" -> "getFontMap_"
        "gtk_font_chooser_set_font_map" -> "setFontMap_"
        else -> null
    }
}

/**
 * A debug string containing parameter details for comparing methods for override purposes.
 */
private fun GirMethod.debugParameterSignature(): String {
    val paramsSignature = parameters?.parameters.orEmpty().map { it.debugSignature() }.joinToString(",")
    val returnSignature = checkNotNull(returnValue).type.debugSignature()
    return "$paramsSignature -> $returnSignature"
}

private fun GirParameter.debugSignature(): String = when (type) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> type.debugSignature() + if (this.isNullable()) "?" else ""
    GirVarArgs -> "varargs"
}

private fun GirAnyTypeOrVarargs.debugSignature(): String = when (this) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> this.cType ?: "unknown"
    GirVarArgs -> "varargs"
}
