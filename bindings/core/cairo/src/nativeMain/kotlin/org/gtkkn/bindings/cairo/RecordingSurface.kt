// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_recording_surface_create
import org.gtkkn.native.cairo.cairo_recording_surface_get_extents
import org.gtkkn.native.cairo.cairo_surface_destroy
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.gobject.GType

/**
 * ## Skipped during bindings generation
 *
 * - parameter `x0`: x0: Out parameter is not supported
 */
public open class RecordingSurface(
    public val cairoRecordingSurfacePointer: CPointer<cairo_surface_t>,
) : Surface(cairoRecordingSurfacePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    /**
     *
     *
     * @param content 
     * @param extents 
     * @since 1.10
     */
    public constructor(content: Content, extents: Rectangle) : this(cairo_recording_surface_create(content.nativeValue, extents.cairoRectanglePointer)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_surface_destroy(it.reinterpret()) }
    }

    /**
     *
     *
     * @param extents 
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun getExtents(extents: Rectangle): Boolean = cairo_recording_surface_get_extents(cairoRecordingSurfacePointer, extents.cairoRectanglePointer).asBoolean()

    public companion object : TypeCompanion<RecordingSurface> {
        override val type: GeneratedClassKGType<RecordingSurface> =
                GeneratedClassKGType(getTypeOrNull("cairo_gobject_surface_get_type")!!) { RecordingSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()}

        /**
         * Get the GType of RecordingSurface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
