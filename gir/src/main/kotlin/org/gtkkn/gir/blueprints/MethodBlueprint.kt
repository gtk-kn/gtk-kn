package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class MethodBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName, // not enum member, but the KP reference to the native function name
    val parameters: List<ParameterBlueprint>,
    val returnTypeInfo: TypeInfo,
    val isOverride: Boolean,
    val isOpen: Boolean,
    val kdoc: String?,
    val returnTypeKDoc: String?,
) {
    /**
     * Determine if this methods implementation needs to be wrapped in a memscoped block.
     */
    val needsMemscoped: Boolean get() {
        return parameters.any { it.typeInfo is TypeInfo.StringList }
    }
}
