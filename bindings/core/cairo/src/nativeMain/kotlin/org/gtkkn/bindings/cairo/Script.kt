// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class Script(pointer: CPointer<cairo_device_t>) :
    Device(pointer.reinterpret()),
    KGTyped {
    public val cairoScriptPointer: CPointer<cairo_device_t>
        get() = gPointer.reinterpret()

    public open fun fromRecordingSurface(recordingSurface: RecordingSurface): Status =
        cairo_script_from_recording_surface(
            cairoScriptPointer.reinterpret(),
            recordingSurface.cairoRecordingSurfacePointer.reinterpret()
        ).run {
            Status.fromNativeValue(this)
        }

    public open fun getMode(): ScriptMode = cairo_script_get_mode(cairoScriptPointer.reinterpret()).run {
        ScriptMode.fromNativeValue(this)
    }

    public open fun setMode(mode: ScriptMode): Unit =
        cairo_script_set_mode(cairoScriptPointer.reinterpret(), mode.nativeValue)

    public open fun createScriptSurface(content: Content, width: gdouble, height: gdouble): Surface =
        cairo_script_surface_create(cairoScriptPointer.reinterpret(), content.nativeValue, width, height)!!.run {
            Surface(reinterpret())
        }

    public open fun createScriptSurfaceForTarget(target: Surface): Surface =
        cairo_script_surface_create_for_target(cairoScriptPointer.reinterpret(), target.gPointer.reinterpret())!!.run {
            Surface(reinterpret())
        }

    public open fun writeComment(comment: String, length: gint): Unit =
        cairo_script_write_comment(cairoScriptPointer.reinterpret(), comment, length)

    public companion object : TypeCompanion<Script> {
        override val type: GeneratedClassKGType<Script> =
            GeneratedClassKGType(cairo_gobject_device_get_type()) { Script(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        public fun create(filename: String): Script = cairo_script_create(filename)!!.run {
            Script(reinterpret())
        }

        /**
         * Get the GType of Script
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_device_get_type()
    }
}
