// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_16
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkCicpParams
import org.gtkkn.native.gdk.gdk_cicp_params_build_color_state
import org.gtkkn.native.gdk.gdk_cicp_params_get_color_primaries
import org.gtkkn.native.gdk.gdk_cicp_params_get_matrix_coefficients
import org.gtkkn.native.gdk.gdk_cicp_params_get_range
import org.gtkkn.native.gdk.gdk_cicp_params_get_transfer_function
import org.gtkkn.native.gdk.gdk_cicp_params_get_type
import org.gtkkn.native.gdk.gdk_cicp_params_new
import org.gtkkn.native.gdk.gdk_cicp_params_set_color_primaries
import org.gtkkn.native.gdk.gdk_cicp_params_set_matrix_coefficients
import org.gtkkn.native.gdk.gdk_cicp_params_set_range
import org.gtkkn.native.gdk.gdk_cicp_params_set_transfer_function
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Result

/**
 * The `GdkCicpParams` struct contains the parameters that define
 * a colorstate according to the ITU-T H.273
 * [specification](https://www.itu.int/rec/T-REC-H.273/en).
 *
 * See the documentation of individual properties for supported values.
 *
 * The 'unspecified' value (2) is not treated in any special way, and
 * must be replaced by a different value before creating a color state.
 *
 * `GdkCicpParams` can be used as a builder object to construct a color
 * state from Cicp data with [method@Gdk.CicpParams.build_color_state].
 * The function will return an error if the given parameters are not
 * supported.
 *
 * You can obtain a `GdkCicpParams` object from a color state with
 * [method@Gdk.ColorState.create_cicp_params]. This can be used to
 * create a variant of a color state, by changing just one of the cicp
 * parameters, or just to obtain information about the color state.
 * @since 4.16
 */
@GdkVersion4_16
public open class CicpParams(public val gdkCicpParamsPointer: CPointer<GdkCicpParams>) :
    Object(gdkCicpParamsPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * The color primaries to use.
     *
     * Supported values:
     *
     * - 1: BT.709 / sRGB
     * - 2: unspecified
     * - 5: PAL
     * - 6,7: BT.601 / NTSC
     * - 9: BT.2020
     * - 12: Display P3
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var colorPrimaries: guint
        /**
         * Returns the value of the color-primaries property
         * of @self.
         *
         * @return the color-primaries value
         * @since 4.16
         */
        get() = gdk_cicp_params_get_color_primaries(gdkCicpParamsPointer)

        /**
         * Sets the color-primaries property of @self.
         *
         * @param colorPrimaries the new color primaries value
         * @since 4.16
         */
        @GdkVersion4_16
        set(colorPrimaries) = gdk_cicp_params_set_color_primaries(gdkCicpParamsPointer, colorPrimaries)

    /**
     * The matrix coefficients (for YUV to RGB conversion).
     *
     * Supported values:
     *
     * - 0: RGB
     * - 2: unspecified
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var matrixCoefficients: guint
        /**
         * Gets the matrix-coefficients property of @self.
         *
         * @return the matrix-coefficients value
         * @since 4.16
         */
        get() = gdk_cicp_params_get_matrix_coefficients(gdkCicpParamsPointer)

        /**
         * @self a `GdkCicpParams`
         * Sets the matrix-coefficients property of @self.
         *
         * @param matrixCoefficients the new matrix-coefficients value
         * @since 4.16
         */
        @GdkVersion4_16
        set(matrixCoefficients) = gdk_cicp_params_set_matrix_coefficients(gdkCicpParamsPointer, matrixCoefficients)

    /**
     * Whether the data is using the full range of values.
     *
     * The range of the data.
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var range: CicpRange
        /**
         * Gets the range property of @self.
         *
         * @return the range value
         * @since 4.16
         */
        get() = gdk_cicp_params_get_range(gdkCicpParamsPointer).run {
            CicpRange.fromNativeValue(this)
        }

        /**
         * Sets the range property of @self
         *
         * @param range the range value
         * @since 4.16
         */
        @GdkVersion4_16
        set(range) = gdk_cicp_params_set_range(gdkCicpParamsPointer, range.nativeValue)

    /**
     * The transfer function to use.
     *
     * Supported values:
     *
     * - 1,6,14,15: BT.709, BT.601, BT.2020
     * - 2: unspecified
     * - 4: gamma 2.2
     * - 5: gamma 2.8
     * - 8: linear
     * - 13: sRGB
     * - 16: BT.2100 PQ
     * - 18: BT.2100 HLG
     *
     * @since 4.16
     */
    @GdkVersion4_16
    public open var transferFunction: guint
        /**
         * Gets the transfer-function property of @self.
         *
         * @return the transfer-function value
         * @since 4.16
         */
        get() = gdk_cicp_params_get_transfer_function(gdkCicpParamsPointer)

        /**
         * Sets the transfer-function property of @self.
         *
         * @param transferFunction the new transfer-function value
         * @since 4.16
         */
        @GdkVersion4_16
        set(transferFunction) = gdk_cicp_params_set_transfer_function(gdkCicpParamsPointer, transferFunction)

    /**
     * Creates a new `GdkCicpParams` object.
     *
     * The initial values of the properties are the values for "undefined"
     * and need to be set before a color state object can be built.
     *
     * @return a new `GdkCicpParams`
     * @since 4.16
     */
    public constructor() : this(gdk_cicp_params_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new `GdkColorState` object for the cicp parameters in @self.
     *
     * Note that this may fail if the cicp parameters in @self are not
     * supported by GTK. In that case, `NULL` is returned, and @error is set
     * with an error message that can be presented to the user.
     *
     * @return A newly allocated `GdkColorState`
     * @since 4.16
     */
    @GdkVersion4_16
    public open fun buildColorState(): Result<ColorState?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_cicp_params_build_color_state(gdkCicpParamsPointer, gError.ptr)?.run {
            ColorState(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<CicpParams> {
        override val type: GeneratedClassKGType<CicpParams> =
            GeneratedClassKGType(getTypeOrNull()!!) { CicpParams(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of CicpParams
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_cicp_params_get_type()

        /**
         * Gets the GType of from the symbol `gdk_cicp_params_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_cicp_params_get_type")
    }
}
