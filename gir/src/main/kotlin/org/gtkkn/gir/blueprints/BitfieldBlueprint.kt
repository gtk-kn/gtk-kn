package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

data class BitfieldBlueprint(
    val kotlinName: String,
    val kotlinTypeName: ClassName,
    val members: List<BitfieldMemberBlueprint>,
    val functionBlueprints: List<FunctionBlueprint>,
    val nativeValueTypeName: TypeName,
    val version: String?,
    val kdoc: String?,
)
