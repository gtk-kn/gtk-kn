package org.gtkkn.gir.blueprints

interface CallableBlueprint {
    val parameters: List<ParameterBlueprint>
    val returnTypeInfo: TypeInfo
    val throws: Boolean

    /**
     * Determine if this callable implementation needs to be wrapped in a memscoped block.
     */
    val needsMemscoped: Boolean
        get() = throws || parameters.any { it.typeInfo is TypeInfo.StringList }

    val needsMemscopedReturnValue: Boolean
        get() = returnTypeInfo is TypeInfo.StringList
}
