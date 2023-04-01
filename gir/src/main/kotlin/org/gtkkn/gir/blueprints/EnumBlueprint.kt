package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

data class EnumBlueprint(
    val kotlinName: String,
    val kotlinTypeName: ClassName,
    val nativeTypeName: ClassName,
    val nativeValueTypeName: TypeName,
    val memberBlueprints: List<EnumMemberBlueprint>,
    val functionBlueprints: List<FunctionBlueprint>,
    val errorDomain: String?,
    val version: String?,
    val kdoc: String?,
)
