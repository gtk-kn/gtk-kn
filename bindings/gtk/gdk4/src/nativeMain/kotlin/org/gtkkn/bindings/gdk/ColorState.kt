// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_16
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.native.gdk.GdkColorState
import org.gtkkn.native.gdk.gdk_color_state_create_cicp_params
import org.gtkkn.native.gdk.gdk_color_state_equal
import org.gtkkn.native.gdk.gdk_color_state_get_rec2100_linear
import org.gtkkn.native.gdk.gdk_color_state_get_rec2100_pq
import org.gtkkn.native.gdk.gdk_color_state_get_srgb
import org.gtkkn.native.gdk.gdk_color_state_get_srgb_linear
import org.gtkkn.native.gdk.gdk_color_state_get_type
import org.gtkkn.native.gdk.gdk_color_state_ref
import org.gtkkn.native.gdk.gdk_color_state_unref
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 * A `GdkColorState` object provides the information to interpret
 * colors and pixels in a variety of ways.
 *
 * They are also known as
 * [*color spaces*](https://en.wikipedia.org/wiki/Color_space).
 *
 * Crucially, GTK knows how to convert colors from one color
 * state to another.
 *
 * `GdkColorState` objects are immutable and therefore threadsafe.
 * @since 4.16
 */
@GdkVersion4_16
public class ColorState(public val gdkColorStatePointer: CPointer<GdkColorState>) :
    ProxyInstance(gdkColorStatePointer) {
    /**
     * Create a [class@Gdk.CicpParams] representing the colorstate.
     *
     * It is not guaranteed that every `GdkColorState` can be
     * represented with Cicp parameters. If that is the case,
     * this function returns `NULL`.
     *
     * @return A new [class@Gdk.CicpParams]
     * @since 4.16
     */
    @GdkVersion4_16
    public fun createCicpParams(): CicpParams? = gdk_color_state_create_cicp_params(gdkColorStatePointer)?.run {
        InstanceCache.get(this, true) { CicpParams(reinterpret()) }!!
    }

    /**
     * Compares two `GdkColorStates` for equality.
     *
     * Note that this function is not guaranteed to be perfect and two objects
     * describing the same color state may compare not equal. However, different
     * color states will never compare equal.
     *
     * @param other another `GdkColorStatee`
     * @return true if the two color states compare equal
     * @since 4.16
     */
    @GdkVersion4_16
    public fun equal(other: ColorState): Boolean =
        gdk_color_state_equal(gdkColorStatePointer, other.gdkColorStatePointer).asBoolean()

    /**
     * Increase the reference count of @self.
     *
     * @return the object that was passed in
     * @since 4.16
     */
    @GdkVersion4_16
    public fun ref(): ColorState = gdk_color_state_ref(gdkColorStatePointer)!!.run {
        ColorState(this)
    }

    /**
     * Decrease the reference count of @self.
     *
     * Unless @self is static, it will be freed
     * when the reference count reaches zero.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public fun unref(): Unit = gdk_color_state_unref(gdkColorStatePointer)

    public companion object {
        /**
         * Returns the color state object representing the linear rec2100 color space.
         *
         * This color state uses the primaries defined by BT.2020-2 and BT.2100-0 and a linear
         * transfer function.
         *
         * It is equivalent to the [Cicp](class.CicpParams.html) tuple 9/8/0/1.
         *
         * See e.g. [the CSS HDR Module](https://drafts.csswg.org/css-color-hdr/#valdef-color-rec2100-linear)
         * for details about this colorstate.
         *
         * @return the color state object for linearized rec2100
         * @since 4.16
         */
        @GdkVersion4_16
        public fun getRec2100Linear(): ColorState = gdk_color_state_get_rec2100_linear()!!.run {
            ColorState(this)
        }

        /**
         * Returns the color state object representing the rec2100-pq color space.
         *
         * This color state uses the primaries defined by BT.2020-2 and BT.2100-0 and the transfer
         * function defined by SMPTE ST 2084 and BT.2100-2.
         *
         * It is equivalent to the [Cicp](class.CicpParams.html) tuple 9/16/0/1.
         *
         * See e.g. [the CSS HDR Module](https://drafts.csswg.org/css-color-hdr/#valdef-color-rec2100-pq)
         * for details about this colorstate.
         *
         * @return the color state object for rec2100-pq
         * @since 4.16
         */
        @GdkVersion4_16
        public fun getRec2100Pq(): ColorState = gdk_color_state_get_rec2100_pq()!!.run {
            ColorState(this)
        }

        /**
         * Returns the color state object representing the sRGB color space.
         *
         * This color state uses the primaries defined by BT.709-6 and the transfer function
         * defined by IEC 61966-2-1.
         *
         * It is equivalent to the [Cicp](class.CicpParams.html) tuple 1/13/0/1.
         *
         * See e.g. [the CSS Color Module](https://www.w3.org/TR/css-color-4/#predefined-sRGB)
         * for details about this colorstate.
         *
         * @return the color state object for sRGB
         * @since 4.16
         */
        @GdkVersion4_16
        public fun getSrgb(): ColorState = gdk_color_state_get_srgb()!!.run {
            ColorState(this)
        }

        /**
         * Returns the color state object representing the linearized sRGB color space.
         *
         * This color state uses the primaries defined by BT.709-6 and a linear transfer function.
         *
         * It is equivalent to the [Cicp](class.CicpParams.html) tuple 1/8/0/1.
         *
         * See e.g. [the CSS Color Module](https://www.w3.org/TR/css-color-4/#predefined-sRGB-linear)
         * for details about this colorstate.
         *
         * @return the color state object for linearized sRGB
         * @since 4.16
         */
        @GdkVersion4_16
        public fun getSrgbLinear(): ColorState = gdk_color_state_get_srgb_linear()!!.run {
            ColorState(this)
        }

        /**
         * Get the GType of ColorState
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_color_state_get_type()
    }
}
