package org.gtkkn.gir.model

/**
 * Indicates the lifetime of the call.
 *
 * For language bindings which want to know when the resources required to do the call can be freed.
 */
enum class GirScope {
    /**
     * Valid until a GDestroyNotify argument is called.
     */
    Notified,

    /**
     * Only valid for the duration of the first callback invocation (can only be called once).
     */
    Async,

    /**
     * Only valid for the duration of the call, can be called multiple times during the call.
     */
    Call,

    /**
     * Valid until the process terminates.
     */
    Forever;

    companion object {
        fun fromString(str: String): GirScope = when (str) {
            "notified" -> Notified
            "async" -> Async
            "call" -> Call
            "forever" -> Forever
            else -> error("String '$str' is not a valid Scope value")
        }
    }
}
