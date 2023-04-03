package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class FunctionBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName,
    override val parameters: List<ParameterBlueprint>,
    override val returnTypeInfo: TypeInfo,
    override val throws: Boolean,
    override val exceptionResolvingFunctionMember: MemberName,
    val version: String?,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) : CallableBlueprint
