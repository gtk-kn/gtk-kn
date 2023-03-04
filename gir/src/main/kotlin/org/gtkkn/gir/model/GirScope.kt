package org.gtkkn.gir.model

enum class GirScope {
    Notified,
    Async,
    Call,
    Forever;

    companion object {
        fun fromString(str: String): GirScope = when (str) {
            "notified" -> Notified
            "async" -> Async
            "call" -> Call
            "forever" -> Forever
            else -> throw IllegalArgumentException("String '$str' is not a valid Scope value")
        }
    }
}
