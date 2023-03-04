package org.gtkkn.gir.model

enum class GirDirection {
    In,
    Out,
    InOut;

    companion object {
        fun fromString(str: String): GirDirection = when (str) {
            "in" -> In
            "out" -> Out
            "inout" -> InOut
            else -> throw IllegalArgumentException("String '$str' is not a valid Direction value")
        }
    }
}
