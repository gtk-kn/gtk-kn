package org.gtkkn.common

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import native.gobject.GClosureNotify

/**
 * Helper function that can be used as a destroy_data handler
 * when connecting to a signal.
 *
 * This implementation assumes [data] is a pointer to a StableRef
 * and calls dispose on it.
 */
public val staticStableRefDestroy: GClosureNotify =
    staticCFunction { data: COpaquePointer?,
            _: COpaquePointer?, ->
        data?.asStableRef<Any>()?.dispose()
        Unit
    }.reinterpret()
