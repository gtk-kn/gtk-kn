// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_PAINTABLE_STATIC_CONTENTS
import org.gtkkn.native.gdk.GDK_PAINTABLE_STATIC_SIZE
import org.gtkkn.native.gdk.GdkPaintableFlags
import org.gtkkn.native.gdk.gdk_paintable_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags about a paintable object.
 *
 * Implementations use these for optimizations such as caching.
 */
public class PaintableFlags(public val mask: GdkPaintableFlags) : Bitfield<PaintableFlags> {
    override infix fun or(other: PaintableFlags): PaintableFlags = PaintableFlags(mask or other.mask)

    public companion object {
        /**
         * The size is immutable.
         *   The [signal@Gdk.Paintable::invalidate-size] signal will never be
         *   emitted.
         */
        public val SIZE: PaintableFlags = PaintableFlags(GDK_PAINTABLE_STATIC_SIZE)

        /**
         * The content is immutable.
         *   The [signal@Gdk.Paintable::invalidate-contents] signal will never be
         *   emitted.
         */
        public val CONTENTS: PaintableFlags = PaintableFlags(GDK_PAINTABLE_STATIC_CONTENTS)

        /**
         * Get the GType of PaintableFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_paintable_flags_get_type()
    }
}
