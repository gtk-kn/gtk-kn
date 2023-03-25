package org.gtkkn.common

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import native.glib.gpointer

/**
 * Helper function that can be used as a destroy_data handler
 * when connecting to a signal or when executing callbacks.
 *
 * This implementation assumes [data] is a pointer to a StableRef
 * and calls dispose on it.
 */
public val staticStableRefDestroy: CPointer<CFunction<(gpointer?, CPointer<CPointed>?) -> Unit>> =
    staticCFunction { data: COpaquePointer?,
            _: COpaquePointer?, ->
        data?.asStableRef<Any>()?.dispose()
        Unit
    }.reinterpret()
