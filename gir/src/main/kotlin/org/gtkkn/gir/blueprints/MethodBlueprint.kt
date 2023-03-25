package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class MethodBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName, // not enum member, but the KP reference to the native function name
    override val parameters: List<ParameterBlueprint>,
    override val returnTypeInfo: TypeInfo,
    val isOverride: Boolean,
    val isOpen: Boolean,
    val version: String?,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) : CallableBlueprint
