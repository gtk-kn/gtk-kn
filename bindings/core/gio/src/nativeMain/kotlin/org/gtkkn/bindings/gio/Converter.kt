// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.gio.annotations.GioVersion2_82
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GConverter
import org.gtkkn.native.gio.g_converter_convert_bytes
import org.gtkkn.native.gio.g_converter_get_type
import org.gtkkn.native.gio.g_converter_reset
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.Unit

/**
 * `GConverter` is an interface for streaming conversions.
 *
 * `GConverter` is implemented by objects that convert
 * binary data in various ways. The conversion can be
 * stateful and may fail at any place.
 *
 * Some example conversions are: character set conversion,
 * compression, decompression and regular expression
 * replace.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `inbuf`: Array parameter of type guint8 is not supported
 *
 * @since 2.24
 */
@GioVersion2_24
public interface Converter :
    Proxy,
    KGTyped {
    public val gioConverterPointer: CPointer<GConverter>

    /**
     * Applies @converter to the data in @bytes.
     *
     * @param bytes the data to convert
     * @return A newly-allocated
     *   `GBytes` with the converted data, or `NULL` if an error
     *   occurred
     * @since 2.82
     */
    @GioVersion2_82
    public fun convertBytes(bytes: Bytes): Result<Bytes> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_converter_convert_bytes(gioConverterPointer, bytes.glibBytesPointer, gError.ptr)?.run {
            Bytes(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Resets all internal state in the converter, making it behave
     * as if it was just created. If the converter has any internal
     * state that would produce output then that output is lost.
     *
     * @since 2.24
     */
    @GioVersion2_24
    public fun reset(): Unit = g_converter_reset(gioConverterPointer)

    /**
     * The ConverterImpl type represents a native instance of the Converter interface.
     *
     * @constructor Creates a new instance of Converter for the provided [CPointer].
     */
    public class ConverterImpl(gioConverterPointer: CPointer<GConverter>) :
        Object(gioConverterPointer.reinterpret()),
        Converter {
        init {
            Gio
        }

        override val gioConverterPointer: CPointer<GConverter> = gioConverterPointer
    }

    public companion object : TypeCompanion<Converter> {
        override val type: GeneratedInterfaceKGType<Converter> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { ConverterImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Converter
         *
         * @return the GType
         */
        public fun getType(): GType = g_converter_get_type()

        /**
         * Gets the GType of from the symbol `g_converter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_converter_get_type")
    }
}
