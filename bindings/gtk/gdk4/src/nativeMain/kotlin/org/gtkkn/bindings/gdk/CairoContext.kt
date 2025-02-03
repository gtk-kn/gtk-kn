// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Context
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkCairoContext
import org.gtkkn.native.gdk.gdk_cairo_context_cairo_create
import org.gtkkn.native.gdk.gdk_cairo_context_get_type
import org.gtkkn.native.gobject.GType

/**
 * `GdkCairoContext` is an object representing the platform-specific
 * draw context.
 *
 * `GdkCairoContext`s are created for a surface using
 * [method@Gdk.Surface.create_cairo_context], and the context
 * can then be used to draw on that surface.
 */
public abstract class CairoContext(public val gdkCairoContextPointer: CPointer<GdkCairoContext>) :
    DrawContext(gdkCairoContextPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * Retrieves a Cairo context to be used to draw on the `GdkSurface`
     * of @context.
     *
     * A call to [method@Gdk.DrawContext.begin_frame] with this
     * @context must have been done or this function will return null.
     *
     * The returned context is guaranteed to be valid until
     * [method@Gdk.DrawContext.end_frame] is called.
     *
     * @return a Cairo context
     *   to draw on `GdkSurface
     */
    public open fun cairoCreate(): Context? = gdk_cairo_context_cairo_create(gdkCairoContextPointer)?.run {
        Context(this)
    }

    /**
     * The CairoContextImpl type represents a native instance of the abstract CairoContext class.
     *
     * @constructor Creates a new instance of CairoContext for the provided [CPointer].
     */
    public class CairoContextImpl(pointer: CPointer<GdkCairoContext>) : CairoContext(pointer)

    public companion object : TypeCompanion<CairoContext> {
        override val type: GeneratedClassKGType<CairoContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { CairoContextImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of CairoContext
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_cairo_context_get_type()

        /**
         * Gets the GType of from the symbol `gdk_cairo_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_cairo_context_get_type")
    }
}
