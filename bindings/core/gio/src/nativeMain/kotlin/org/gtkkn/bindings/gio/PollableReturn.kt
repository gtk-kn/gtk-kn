// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.native.gio.GPollableReturn
import org.gtkkn.native.gio.g_pollable_return_get_type
import org.gtkkn.native.gobject.GType

/**
 * Return value for various IO operations that signal errors via the
 * return value and not necessarily via a #GError.
 *
 * This enum exists to be able to return errors to callers without having to
 * allocate a #GError. Allocating #GErrors can be quite expensive for
 * regularly happening errors like %G_IO_ERROR_WOULD_BLOCK.
 *
 * In case of %G_POLLABLE_RETURN_FAILED a #GError should be set for the
 * operation to give details about the error that happened.
 * @since 2.60
 */
@GioVersion2_60
public enum class PollableReturn(public val nativeValue: GPollableReturn) {
    /**
     * Generic error condition for when an operation fails.
     */
    FAILED(GPollableReturn.G_POLLABLE_RETURN_FAILED),

    /**
     * The operation was successfully finished.
     */
    OK(GPollableReturn.G_POLLABLE_RETURN_OK),

    /**
     * The operation would block.
     */
    WOULD_BLOCK(GPollableReturn.G_POLLABLE_RETURN_WOULD_BLOCK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GPollableReturn): PollableReturn = when (nativeValue) {
            GPollableReturn.G_POLLABLE_RETURN_FAILED -> FAILED
            GPollableReturn.G_POLLABLE_RETURN_OK -> OK
            GPollableReturn.G_POLLABLE_RETURN_WOULD_BLOCK -> WOULD_BLOCK
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PollableReturn
         *
         * @return the GType
         */
        public fun getType(): GType = g_pollable_return_get_type()
    }
}
