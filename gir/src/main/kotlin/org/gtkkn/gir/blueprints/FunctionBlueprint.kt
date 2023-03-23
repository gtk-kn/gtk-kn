package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class FunctionBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName,
    val parameters: List<ParameterBlueprint>,
    val returnTypeInfo: TypeInfo,
    val kdoc: String?,
    val returnTypeKDoc: String?,
)
