// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.native.glib.GStrvBuilder
import org.gtkkn.native.glib.g_strv_builder_add
import org.gtkkn.native.glib.g_strv_builder_addv
import org.gtkkn.native.glib.g_strv_builder_end
import org.gtkkn.native.glib.g_strv_builder_new
import org.gtkkn.native.glib.g_strv_builder_ref
import org.gtkkn.native.glib.g_strv_builder_take
import org.gtkkn.native.glib.g_strv_builder_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_strv_builder_get_type
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GStrvBuilder` is a helper object to build a null-terminated string arrays.
 *
 * The following example shows how to build a two element array:
 *
 * ```c
 *   g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
 *   g_strv_builder_add (builder, "hello");
 *   g_strv_builder_add (builder, "world");
 *   g_auto(GStrv) array = g_strv_builder_end (builder);
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `add_many`: Varargs parameter is not supported
 *
 * @since 2.68
 */
@GLibVersion2_68
public class StrvBuilder(public val glibStrvBuilderPointer: CPointer<GStrvBuilder>) :
    ProxyInstance(glibStrvBuilderPointer) {
    /**
     * Add a string to the end of the array.
     *
     * Since 2.68
     *
     * @param value a string.
     */
    public fun add(`value`: String): Unit = g_strv_builder_add(glibStrvBuilderPointer, `value`)

    /**
     * Appends all the strings in the given vector to the builder.
     *
     * Since 2.70
     *
     * @param value the vector of strings to add
     */
    public fun addv(`value`: List<String>): Unit = memScoped {
        return g_strv_builder_addv(glibStrvBuilderPointer, `value`.toCStringList(this))
    }

    /**
     * Ends the builder process and returns the constructed NULL-terminated string
     * array. The returned value should be freed with g_strfreev() when no longer
     * needed.
     *
     * @return the constructed string array.
     *
     * Since 2.68
     */
    public fun end(): List<String> =
        g_strv_builder_end(glibStrvBuilderPointer)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Atomically increments the reference count of @builder by one.
     * This function is thread-safe and may be called from any thread.
     *
     * @return The passed in #GStrvBuilder
     * @since 2.68
     */
    @GLibVersion2_68
    public fun ref(): StrvBuilder = g_strv_builder_ref(glibStrvBuilderPointer)!!.run {
        StrvBuilder(this)
    }

    /**
     * Add a string to the end of the array. After @value belongs to the
     * #GStrvBuilder and may no longer be modified by the caller.
     *
     * Since 2.80
     *
     * @param value a string.
     *     Ownership of the string is transferred to the #GStrvBuilder
     */
    public fun take(`value`: String): Unit = g_strv_builder_take(glibStrvBuilderPointer, `value`.cstr)

    /**
     * Decreases the reference count on @builder.
     *
     * In the event that there are no more references, releases all memory
     * associated with the #GStrvBuilder.
     *
     * @since 2.68
     */
    @GLibVersion2_68
    public fun unref(): Unit = g_strv_builder_unref(glibStrvBuilderPointer)

    public companion object {
        /**
         * Creates a new #GStrvBuilder with a reference count of 1.
         * Use g_strv_builder_unref() on the returned value when no longer needed.
         *
         * @return the new #GStrvBuilder
         * @since 2.68
         */
        public fun new(): StrvBuilder = StrvBuilder(g_strv_builder_new()!!)

        /**
         * Get the GType of StrvBuilder
         *
         * @return the GType
         */
        public fun getType(): GType = g_strv_builder_get_type()
    }
}
