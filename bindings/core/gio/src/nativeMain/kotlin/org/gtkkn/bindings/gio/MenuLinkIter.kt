// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GMenuLinkIter
import org.gtkkn.native.gio.g_menu_link_iter_get_name
import org.gtkkn.native.gio.g_menu_link_iter_get_type
import org.gtkkn.native.gio.g_menu_link_iter_get_value
import org.gtkkn.native.gio.g_menu_link_iter_next
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String

/**
 * #GMenuLinkIter is an opaque structure type.  You must access it using
 * the functions below.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_link`: out_link: Out parameter is not supported
 *
 * @since 2.32
 */
@GioVersion2_32
public abstract class MenuLinkIter(public val gioMenuLinkIterPointer: CPointer<GMenuLinkIter>) :
    Object(gioMenuLinkIterPointer.reinterpret()),
    KGTyped {
    /**
     * Gets the name of the link at the current iterator position.
     *
     * The iterator is not advanced.
     *
     * @return the type of the link
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getName(): String =
        g_menu_link_iter_get_name(gioMenuLinkIterPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the linked #GMenuModel at the current iterator position.
     *
     * The iterator is not advanced.
     *
     * @return the #GMenuModel that is linked to
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getValue(): MenuModel = g_menu_link_iter_get_value(gioMenuLinkIterPointer)!!.run {
        MenuModel.MenuModelImpl(this)
    }

    /**
     * Attempts to advance the iterator to the next (possibly first)
     * link.
     *
     * true is returned on success, or false if there are no more links.
     *
     * You must call this function when you first acquire the iterator to
     * advance it to the first link (and determine if the first link exists
     * at all).
     *
     * @return true on success, or false when there are no more links
     * @since 2.32
     */
    @GioVersion2_32
    public open fun next(): Boolean = g_menu_link_iter_next(gioMenuLinkIterPointer).asBoolean()

    /**
     * The MenuLinkIterImpl type represents a native instance of the abstract MenuLinkIter class.
     *
     * @constructor Creates a new instance of MenuLinkIter for the provided [CPointer].
     */
    public class MenuLinkIterImpl(pointer: CPointer<GMenuLinkIter>) : MenuLinkIter(pointer)

    public companion object : TypeCompanion<MenuLinkIter> {
        override val type: GeneratedClassKGType<MenuLinkIter> =
            GeneratedClassKGType(getTypeOrNull("g_menu_link_iter_get_type")!!) {
                MenuLinkIterImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of MenuLinkIter
         *
         * @return the GType
         */
        public fun getType(): GType = g_menu_link_iter_get_type()
    }
}
