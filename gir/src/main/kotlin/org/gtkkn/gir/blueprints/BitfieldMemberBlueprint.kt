package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class BitfieldMemberBlueprint(
    val kotlinName: String,
    val nativeValue: Long,
    val nativeMemberName: MemberName,
    val version: String?,
    val kdoc: String?,
)
