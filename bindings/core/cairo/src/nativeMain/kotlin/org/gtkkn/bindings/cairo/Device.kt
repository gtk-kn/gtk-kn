// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.bindings.gobject.TypeInstance
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public abstract class Device(public val cairoDevicePointer: CPointer<cairo_device_t>) :
    TypeInstance(cairoDevicePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    /**
     *
     *
     * @since 1.10
     */
    @CairoVersion1_10
    public open fun status(): Status = cairo_device_status(cairoDevicePointer).run {
        Status.fromNativeValue(this)
    }

    public open fun finish(): Unit = cairo_device_finish(cairoDevicePointer)

    public open fun flush(): Unit = cairo_device_flush(cairoDevicePointer)

    public open fun getDeviceType(): DeviceType = cairo_device_get_type(cairoDevicePointer).run {
        DeviceType.fromNativeValue(this)
    }

    public open fun acquire(): Status = cairo_device_acquire(cairoDevicePointer).run {
        Status.fromNativeValue(this)
    }

    public open fun release(): Unit = cairo_device_release(cairoDevicePointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerElapsed(): gdouble = cairo_device_observer_elapsed(cairoDevicePointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerFillElapsed(): gdouble = cairo_device_observer_fill_elapsed(cairoDevicePointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerGlyphsElapsed(): gdouble = cairo_device_observer_glyphs_elapsed(cairoDevicePointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerMaskElapsed(): gdouble = cairo_device_observer_mask_elapsed(cairoDevicePointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerPaintElapsed(): gdouble = cairo_device_observer_paint_elapsed(cairoDevicePointer)

    /**
     *
     *
     * @since 1.12
     */
    @CairoVersion1_12
    public open fun observerStrokeElapsed(): gdouble = cairo_device_observer_stroke_elapsed(cairoDevicePointer)

    /**
     * The DeviceImpl type represents a native instance of the abstract Device class.
     *
     * @constructor Creates a new instance of Device for the provided [CPointer].
     */
    public class DeviceImpl(pointer: CPointer<cairo_device_t>) : Device(pointer)

    public companion object : TypeCompanion<Device> {
        override val type: GeneratedClassKGType<Device> =
            GeneratedClassKGType(getTypeOrNull()!!) { DeviceImpl(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of Device
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
