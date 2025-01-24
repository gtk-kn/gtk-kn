// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GIOStatus

/**
 * Statuses returned by most of the #GIOFuncs functions.
 */
public enum class IoStatus(public val nativeValue: GIOStatus) {
    /**
     * An error occurred.
     */
    ERROR(GIOStatus.G_IO_STATUS_ERROR),

    /**
     * Success.
     */
    NORMAL(GIOStatus.G_IO_STATUS_NORMAL),

    /**
     * End of file.
     */
    EOF(GIOStatus.G_IO_STATUS_EOF),

    /**
     * Resource temporarily unavailable.
     */
    AGAIN(GIOStatus.G_IO_STATUS_AGAIN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOStatus): IoStatus = when (nativeValue) {
            GIOStatus.G_IO_STATUS_ERROR -> ERROR
            GIOStatus.G_IO_STATUS_NORMAL -> NORMAL
            GIOStatus.G_IO_STATUS_EOF -> EOF
            GIOStatus.G_IO_STATUS_AGAIN -> AGAIN
            else -> error("invalid nativeValue")
        }
    }
}
