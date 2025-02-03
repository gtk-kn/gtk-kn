// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_device_destroy
import org.gtkkn.native.cairo.cairo_device_t
import org.gtkkn.native.cairo.cairo_gobject_device_get_type
import org.gtkkn.native.cairo.cairo_script_create
import org.gtkkn.native.cairo.cairo_script_from_recording_surface
import org.gtkkn.native.cairo.cairo_script_get_mode
import org.gtkkn.native.cairo.cairo_script_set_mode
import org.gtkkn.native.cairo.cairo_script_surface_create
import org.gtkkn.native.cairo.cairo_script_surface_create_for_target
import org.gtkkn.native.cairo.cairo_script_write_comment
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 *
 * @since 1.12
 */
@CairoVersion1_12
public open class Script(public val cairoScriptPointer: CPointer<cairo_device_t>) :
    Device(cairoScriptPointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public constructor(filename: String) : this(cairo_script_create(filename)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_device_destroy(it.reinterpret()) }
    }

    public open fun fromRecordingSurface(recordingSurface: RecordingSurface): Status =
        cairo_script_from_recording_surface(
            cairoScriptPointer,
            recordingSurface.cairoRecordingSurfacePointer.reinterpret()
        ).run {
            Status.fromNativeValue(this)
        }

    public open fun getMode(): ScriptMode = cairo_script_get_mode(cairoScriptPointer).run {
        ScriptMode.fromNativeValue(this)
    }

    public open fun setMode(mode: ScriptMode): Unit = cairo_script_set_mode(cairoScriptPointer, mode.nativeValue)

    public open fun createScriptSurface(content: Content, width: gdouble, height: gdouble): Surface =
        cairo_script_surface_create(cairoScriptPointer, content.nativeValue, width, height)!!.run {
            Surface(this)
        }

    public open fun createScriptSurfaceForTarget(target: Surface): Surface =
        cairo_script_surface_create_for_target(cairoScriptPointer, target.cairoSurfacePointer)!!.run {
            Surface(this)
        }

    public open fun writeComment(comment: String, length: gint): Unit =
        cairo_script_write_comment(cairoScriptPointer, comment, length)

    public companion object : TypeCompanion<Script> {
        override val type: GeneratedClassKGType<Script> =
            GeneratedClassKGType(getTypeOrNull()!!) { Script(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of Script
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_device_get_type()

        /**
         * Gets the GType of from the symbol `cairo_gobject_device_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("cairo_gobject_device_get_type")
    }
}
