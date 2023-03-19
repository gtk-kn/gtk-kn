package org.gtkkn.gir.model

/**
 * Direction of the parameter.
 */
enum class GirDirection {
    /**
     * Goes into the callable.
     */
    IN,

    /**
     * For output parameters from the callable (reference in C++, var in Pascal, etc...).
     */
    OUT,

    /**
     * For both (like a pre-allocated structure which will be filled-in by the callable).
     */
    IN_OUT,
    ;

    companion object {
        fun fromString(str: String): GirDirection = when (str) {
            "in" -> IN
            "out" -> OUT
            "inout" -> IN_OUT
            else -> error("String '$str' is not a valid Direction value")
        }
    }
}
