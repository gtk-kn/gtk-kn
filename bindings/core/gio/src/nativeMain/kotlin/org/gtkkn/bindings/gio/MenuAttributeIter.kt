// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GMenuAttributeIter
import org.gtkkn.native.gio.g_menu_attribute_iter_get_name
import org.gtkkn.native.gio.g_menu_attribute_iter_get_type
import org.gtkkn.native.gio.g_menu_attribute_iter_get_value
import org.gtkkn.native.gio.g_menu_attribute_iter_next
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String

/**
 * #GMenuAttributeIter is an opaque structure type.  You must access it
 * using the functions below.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_name`: out_name: Out parameter is not supported
 *
 * @since 2.32
 */
@GioVersion2_32
public abstract class MenuAttributeIter(public val gioMenuAttributeIterPointer: CPointer<GMenuAttributeIter>) :
    Object(gioMenuAttributeIterPointer.reinterpret()),
    KGTyped {
    /**
     * Gets the name of the attribute at the current iterator position, as
     * a string.
     *
     * The iterator is not advanced.
     *
     * @return the name of the attribute
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getName(): String =
        g_menu_attribute_iter_get_name(gioMenuAttributeIterPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the value of the attribute at the current iterator position.
     *
     * The iterator is not advanced.
     *
     * @return the value of the current attribute
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getValue(): Variant = g_menu_attribute_iter_get_value(gioMenuAttributeIterPointer)!!.run {
        Variant(this)
    }

    /**
     * Attempts to advance the iterator to the next (possibly first)
     * attribute.
     *
     * true is returned on success, or false if there are no more
     * attributes.
     *
     * You must call this function when you first acquire the iterator
     * to advance it to the first attribute (and determine if the first
     * attribute exists at all).
     *
     * @return true on success, or false when there are no more attributes
     * @since 2.32
     */
    @GioVersion2_32
    public open fun next(): Boolean = g_menu_attribute_iter_next(gioMenuAttributeIterPointer).asBoolean()

    /**
     * The MenuAttributeIterImpl type represents a native instance of the abstract MenuAttributeIter class.
     *
     * @constructor Creates a new instance of MenuAttributeIter for the provided [CPointer].
     */
    public class MenuAttributeIterImpl(pointer: CPointer<GMenuAttributeIter>) : MenuAttributeIter(pointer)

    public companion object : TypeCompanion<MenuAttributeIter> {
        override val type: GeneratedClassKGType<MenuAttributeIter> =
            GeneratedClassKGType(getTypeOrNull("g_menu_attribute_iter_get_type")!!) {
                MenuAttributeIterImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of MenuAttributeIter
         *
         * @return the GType
         */
        public fun getType(): GType = g_menu_attribute_iter_get_type()
    }
}
