package org.gtkkn.gir.blueprints

data class ParameterBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val typeInfo: TypeInfo,
    val kdoc: String?,
    val side: Side = Side.BOTH, // TODO remove default
) {

    /**
     * The side this parameter applies to.
     */
    enum class Side {
        /**
         * The parameter is not present in the Kotlin signature.
         */
        NATIVE_ONLY,

        /**
         * The parameter is present in both the Kotlin and native signatures.
         */
        BOTH,
    }
}
