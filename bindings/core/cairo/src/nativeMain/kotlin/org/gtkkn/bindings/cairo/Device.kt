// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_device_acquire
import org.gtkkn.native.cairo.cairo_device_finish
import org.gtkkn.native.cairo.cairo_device_flush
import org.gtkkn.native.cairo.cairo_device_get_type
import org.gtkkn.native.cairo.cairo_device_observer_elapsed
import org.gtkkn.native.cairo.cairo_device_observer_fill_elapsed
import org.gtkkn.native.cairo.cairo_device_observer_glyphs_elapsed
import org.gtkkn.native.cairo.cairo_device_observer_mask_elapsed
import org.gtkkn.native.cairo.cairo_device_observer_paint_elapsed
import org.gtkkn.native.cairo.cairo_device_observer_stroke_elapsed
import org.gtkkn.native.cairo.cairo_device_release
import org.gtkkn.native.cairo.cairo_device_status
import org.gtkkn.native.cairo.cairo_device_t
import org.gtkkn.native.cairo.cairo_gobject_device_get_type
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `closure`: Unsupported pointer to primitive type
 * - parameter `user_data`: Unsupported pointer to primitive type
 * - method `get_user_data`: Return type gpointer is not supported
 */
public open class Device(pointer: CPointer<cairo_device_t>) : KGTyped {
    public val gPointer: CPointer<cairo_device_t> = pointer

    /**
     *
     *
     * @since 1.10
     */
    @CairoVersion1_10
    public open fun status(): Status = cairo_device_status(gPointer).run {
        Status.fromNativeValue(this)
    }

    public open fun finish(): Unit = cairo_device_finish(gPointer)

    public open fun flush(): Unit = cairo_device_flush(gPointer)

    public open fun getDeviceType(): DeviceType = cairo_device_get_type(gPointer).run {
        DeviceType.fromNativeValue(this)
    }

    public open fun acquire(): Status = cairo_device_acquire(gPointer).run {
        Status.fromNativeValue(this)
    }

    public open fun release(): Unit = cairo_device_release(gPointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerElapsed(): gdouble = cairo_device_observer_elapsed(gPointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerFillElapsed(): gdouble = cairo_device_observer_fill_elapsed(gPointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerGlyphsElapsed(): gdouble = cairo_device_observer_glyphs_elapsed(gPointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerMaskElapsed(): gdouble = cairo_device_observer_mask_elapsed(gPointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerPaintElapsed(): gdouble = cairo_device_observer_paint_elapsed(gPointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerStrokeElapsed(): gdouble = cairo_device_observer_stroke_elapsed(gPointer)

    public companion object : TypeCompanion<Device> {
        override val type: GeneratedClassKGType<Device> =
            GeneratedClassKGType(cairo_gobject_device_get_type()) { Device(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of Device
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_device_get_type()
    }
}
