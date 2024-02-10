// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GThreadError
import org.gtkkn.native.glib.GThreadError.G_THREAD_ERROR_AGAIN
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Possible errors of thread related functions.
 */
public enum class ThreadError(
    public val nativeValue: GThreadError,
) {
    /**
     * a thread couldn't be created due to resource
     *                        shortage. Try again later.
     */
    THREAD_ERROR_AGAIN(G_THREAD_ERROR_AGAIN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GThreadError): ThreadError =
            when (nativeValue) {
                G_THREAD_ERROR_AGAIN -> THREAD_ERROR_AGAIN
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g_thread_error")

        public fun fromErrorOrNull(error: Error): ThreadError? =
            if (error.domain != quark()) {
                null
            } else {
                ThreadError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
