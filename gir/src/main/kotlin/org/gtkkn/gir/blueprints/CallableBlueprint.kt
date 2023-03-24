package org.gtkkn.gir.blueprints

interface CallableBlueprint {
    val parameters: List<ParameterBlueprint>
    val returnTypeInfo: TypeInfo

    /**
     * Determine if this callable implementation needs to be wrapped in a memscoped block.
     */
    val needsMemscoped: Boolean
        get() = parameters.any { it.typeInfo is TypeInfo.StringList }
}
