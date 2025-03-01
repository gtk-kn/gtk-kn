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
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GCharsetConverter
import org.gtkkn.native.gio.GConverter
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_charset_converter_get_num_fallbacks
import org.gtkkn.native.gio.g_charset_converter_get_type
import org.gtkkn.native.gio.g_charset_converter_get_use_fallback
import org.gtkkn.native.gio.g_charset_converter_new
import org.gtkkn.native.gio.g_charset_converter_set_use_fallback
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Throws

/**
 * `GCharsetConverter` is an implementation of [iface@Gio.Converter] based on
 * [struct@GLib.IConv].
 *
 * ## Skipped during bindings generation
 *
 * - method `from-charset`: Property has no getter nor setter
 * - method `to-charset`: Property has no getter nor setter
 */
public open class CharsetConverter(public val gioCharsetConverterPointer: CPointer<GCharsetConverter>) :
    Object(gioCharsetConverterPointer.reinterpret()),
    Converter,
    Initable,
    KGTyped {
    init {
        Gio
    }

    override val gioConverterPointer: CPointer<GConverter>
        get() = handle.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = handle.reinterpret()

    /**
     * Use fallback (of form `\<hexval>`) for invalid bytes.
     *
     * @since 2.24
     */
    @GioVersion2_24
    public open var useFallback: Boolean
        /**
         * Gets the #GCharsetConverter:use-fallback property.
         *
         * @return true if fallbacks are used by @converter
         * @since 2.24
         */
        get() = g_charset_converter_get_use_fallback(gioCharsetConverterPointer).asBoolean()

        /**
         * Sets the #GCharsetConverter:use-fallback property.
         *
         * @param useFallback true to use fallbacks
         * @since 2.24
         */
        @GioVersion2_24
        set(useFallback) = g_charset_converter_set_use_fallback(gioCharsetConverterPointer, useFallback.asGBoolean())

    /**
     * Creates a new #GCharsetConverter.
     *
     * @param toCharset destination charset
     * @param fromCharset source charset
     * @return a new #GCharsetConverter or null on error.
     * @since 2.24
     */
    @Throws(GLibException::class)
    public constructor(toCharset: String, fromCharset: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_charset_converter_new(toCharset, fromCharset, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!
        }
    ) {
        InstanceCache.put(this)
    }

    /**
     * Gets the number of fallbacks that @converter has applied so far.
     *
     * @return the number of fallbacks that @converter has applied
     * @since 2.24
     */
    @GioVersion2_24
    public open fun getNumFallbacks(): guint = g_charset_converter_get_num_fallbacks(gioCharsetConverterPointer)

    public companion object : TypeCompanion<CharsetConverter> {
        override val type: GeneratedClassKGType<CharsetConverter> =
            GeneratedClassKGType(getTypeOrNull()!!) { CharsetConverter(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of CharsetConverter
         *
         * @return the GType
         */
        public fun getType(): GType = g_charset_converter_get_type()

        /**
         * Gets the GType of from the symbol `g_charset_converter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_charset_converter_get_type")
    }
}
