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
    NOTIFIED,

    /**
     * Only valid for the duration of the first callback invocation (can only be called once).
     */
    ASYNC,

    /**
     * Only valid for the duration of the call, can be called multiple times during the call.
     */
    CALL,

    /**
     * Valid until the process terminates.
     */
    FOREVER,
    ;

    companion object {
        fun fromString(str: String): GirScope = when (str) {
            "notified" -> NOTIFIED
            "async" -> ASYNC
            "call" -> CALL
            "forever" -> FOREVER
            else -> error("String '$str' is not a valid Scope value")
        }
    }
}
