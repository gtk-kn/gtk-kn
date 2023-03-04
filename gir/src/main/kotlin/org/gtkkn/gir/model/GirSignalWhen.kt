package org.gtkkn.gir.model

enum class GirSignalWhen {
    First,
    Last,
    Cleanup;

    companion object {
        fun fromString(str: String): GirSignalWhen = when (str) {
            "first" -> First
            "last" -> Last
            "cleanup" -> Cleanup
            else -> throw IllegalArgumentException("String '$str' is not a valid SignalWhen value")
        }
    }
}
