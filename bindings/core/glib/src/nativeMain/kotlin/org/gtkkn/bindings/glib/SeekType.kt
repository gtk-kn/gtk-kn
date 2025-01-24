// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GSeekType

/**
 * An enumeration specifying the base position for a
 * g_io_channel_seek_position() operation.
 */
public enum class SeekType(public val nativeValue: GSeekType) {
    /**
     * the current position in the file.
     */
    CUR(GSeekType.G_SEEK_CUR),

    /**
     * the start of the file.
     */
    SET(GSeekType.G_SEEK_SET),

    /**
     * the end of the file.
     */
    END(GSeekType.G_SEEK_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSeekType): SeekType = when (nativeValue) {
            GSeekType.G_SEEK_CUR -> CUR
            GSeekType.G_SEEK_SET -> SET
            GSeekType.G_SEEK_END -> END
            else -> error("invalid nativeValue")
        }
    }
}
