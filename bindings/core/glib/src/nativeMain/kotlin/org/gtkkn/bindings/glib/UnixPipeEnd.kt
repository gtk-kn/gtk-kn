// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_80
import org.gtkkn.native.glib.GUnixPipeEnd

/**
 * Mnemonic constants for the ends of a Unix pipe.
 * @since 2.80
 */
@GLibVersion2_80
public enum class UnixPipeEnd(public val nativeValue: GUnixPipeEnd) {
    /**
     * The readable file descriptor 0
     */
    READ(GUnixPipeEnd.G_UNIX_PIPE_END_READ),

    /**
     * The writable file descriptor 1
     */
    WRITE(GUnixPipeEnd.G_UNIX_PIPE_END_WRITE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnixPipeEnd): UnixPipeEnd = when (nativeValue) {
            GUnixPipeEnd.G_UNIX_PIPE_END_READ -> READ
            GUnixPipeEnd.G_UNIX_PIPE_END_WRITE -> WRITE
            else -> error("invalid nativeValue")
        }
    }
}
