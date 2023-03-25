package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class EnumMemberBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeValue: Long,
    val nativeMemberName: MemberName,
    val version: String?,
    val kdoc: String?,
)
