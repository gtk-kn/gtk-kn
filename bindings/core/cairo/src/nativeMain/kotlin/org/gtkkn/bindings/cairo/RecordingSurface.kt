// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_recording_surface_create
import org.gtkkn.native.cairo.cairo_recording_surface_get_extents
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * ## Skipped during bindings generation
 *
 * - parameter `x0`: x0: Out parameter is not supported
 */
public open class RecordingSurface(public val cairoRecordingSurfacePointer: CPointer<cairo_surface_t>) :
    Surface(cairoRecordingSurfacePointer.reinterpret()),
    KGTyped {
    /**
     *
     *
     * @param extents
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun getExtents(extents: Rectangle): Boolean =
        cairo_recording_surface_get_extents(cairoRecordingSurfacePointer, extents.cairoRectanglePointer).asBoolean()

    public companion object : TypeCompanion<RecordingSurface> {
        override val type: GeneratedClassKGType<RecordingSurface> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { RecordingSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         *
         *
         * @param content
         * @param extents
         * @since 1.10
         */
        @CairoVersion1_10
        public fun create(content: Content, extents: Rectangle): RecordingSurface =
            cairo_recording_surface_create(content.nativeValue, extents.cairoRectanglePointer)!!.run {
                RecordingSurface(reinterpret())
            }

        /**
         * Get the GType of RecordingSurface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
