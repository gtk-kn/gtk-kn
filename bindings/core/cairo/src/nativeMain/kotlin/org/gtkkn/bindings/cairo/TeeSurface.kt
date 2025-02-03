// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_surface_destroy
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.cairo.cairo_tee_surface_add
import org.gtkkn.native.cairo.cairo_tee_surface_create
import org.gtkkn.native.cairo.cairo_tee_surface_remove
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 *
 * @since 1.10
 */
@CairoVersion1_10
public open class TeeSurface(public val cairoTeeSurfacePointer: CPointer<cairo_surface_t>) :
    Surface(cairoTeeSurfacePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public constructor(primary: Surface) : this(cairo_tee_surface_create(primary.cairoSurfacePointer)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_surface_destroy(it.reinterpret()) }
    }

    public open fun add(target: Surface): Unit =
        cairo_tee_surface_add(cairoTeeSurfacePointer, target.cairoSurfacePointer)

    public open fun remove(target: Surface): Unit =
        cairo_tee_surface_remove(cairoTeeSurfacePointer, target.cairoSurfacePointer)

    public companion object : TypeCompanion<TeeSurface> {
        override val type: GeneratedClassKGType<TeeSurface> =
            GeneratedClassKGType(getTypeOrNull()!!) { TeeSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of TeeSurface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()

        /**
         * Gets the GType of from the symbol `cairo_gobject_surface_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("cairo_gobject_surface_get_type")
    }
}
