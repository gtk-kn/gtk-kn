// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupMemoryUse
import org.gtkkn.native.soup.soup_memory_use_get_type

/**
 * The lifetime of the memory being passed.
 */
public enum class MemoryUse(public val nativeValue: SoupMemoryUse) {
    /**
     * The memory is statically allocated and
     *   constant; libsoup can use the passed-in buffer directly and not
     *   need to worry about it being modified or freed.
     */
    STATIC(SoupMemoryUse.SOUP_MEMORY_STATIC),

    /**
     * The caller has allocated the memory and libsoup
     *   will assume ownership of it and free it with [func@GLib.free].
     */
    TAKE(SoupMemoryUse.SOUP_MEMORY_TAKE),

    /**
     * The passed-in data belongs to the caller and
     *   libsoup will copy it into new memory leaving the caller free
     *   to reuse the original memory.
     */
    COPY(SoupMemoryUse.SOUP_MEMORY_COPY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupMemoryUse): MemoryUse = when (nativeValue) {
            SoupMemoryUse.SOUP_MEMORY_STATIC -> STATIC
            SoupMemoryUse.SOUP_MEMORY_TAKE -> TAKE
            SoupMemoryUse.SOUP_MEMORY_COPY -> COPY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of MemoryUse
         *
         * @return the GType
         */
        public fun getType(): GType = soup_memory_use_get_type()
    }
}
