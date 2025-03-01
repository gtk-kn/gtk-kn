// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleList
import org.gtkkn.native.gtk.gtk_accessible_list_get_objects
import org.gtkkn.native.gtk.gtk_accessible_list_get_type
import org.gtkkn.native.gtk.gtk_accessible_list_new_from_list

/**
 * A boxed type which wraps a list of references to GtkAccessible objects.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `accessibles`: Array parameter of type Accessible is not supported
 *
 * @since 4.14
 */
@GtkVersion4_14
public class AccessibleList(public val gtkAccessibleListPointer: CPointer<GtkAccessibleList>) :
    ProxyInstance(gtkAccessibleListPointer) {
    /**
     * Allocates a new `GtkAccessibleList`, doing a shallow copy of the
     * passed list of `GtkAccessible` instances.
     *
     * @param list a reference to a `GList` containing a list of accessible values
     * @return the list of accessible instances
     * @since 4.14
     */
    public constructor(list: List) : this(gtk_accessible_list_new_from_list(list.glibListPointer)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Gets the list of objects this boxed type holds
     *
     * @return a shallow copy of the objects
     * @since 4.14
     */
    @GtkVersion4_14
    public fun getObjects(): List = gtk_accessible_list_get_objects(gtkAccessibleListPointer)!!.run {
        List(this)
    }

    public companion object {
        /**
         * Get the GType of AccessibleList
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_list_get_type()
    }
}
