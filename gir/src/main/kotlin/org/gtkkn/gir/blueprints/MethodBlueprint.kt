package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class MethodBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName, // not enum member, but the KP reference to the native function name
    val parameterBlueprints: List<MethodParameterBlueprint>,
    val returnTypeInfo: TypeInfo,
    val isOverride: Boolean,
)
