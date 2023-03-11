package org.gtkkn.gir.model

/**
 * Direction of the parameter.
 */
enum class GirDirection {
    /**
     * Goes into the callable.
     */
    In,

    /**
     * For output parameters from the callable (reference in C++, var in Pascal, etc...).
     */
    Out,

    /**
     * For both (like a pre-allocated structure which will be filled-in by the callable).
     */
    InOut;

    companion object {
        fun fromString(str: String): GirDirection = when (str) {
            "in" -> In
            "out" -> Out
            "inout" -> InOut
            else -> error("String '$str' is not a valid Direction value")
        }
    }
}
