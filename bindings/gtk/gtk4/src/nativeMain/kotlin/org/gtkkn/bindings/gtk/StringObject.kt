// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkStringObject
import org.gtkkn.native.gtk.gtk_string_object_get_string
import org.gtkkn.native.gtk.gtk_string_object_get_type
import org.gtkkn.native.gtk.gtk_string_object_new
import kotlin.String

/**
 * `GtkStringObject` is the type of items in a `GtkStringList`.
 *
 * A `GtkStringObject` is a wrapper around a `const char*`; it has
 * a [property@Gtk.StringObject:string] property that can be used
 * for property bindings and expressions.
 */
public open class StringObject(public val gtkStringObjectPointer: CPointer<GtkStringObject>) :
    Object(gtkStringObjectPointer.reinterpret()),
    KGTyped {
    /**
     * The string.
     */
    public open val string: String
        /**
         * Returns the string contained in a `GtkStringObject`.
         *
         * @return the string of @self
         */
        get() = gtk_string_object_get_string(gtkStringObjectPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Wraps a string in an object for use with `GListModel`.
     *
     * @param string The string to wrap
     * @return a new `GtkStringObject`
     */
    public constructor(string: String) : this(gtk_string_object_new(string)!!.reinterpret())

    public companion object : TypeCompanion<StringObject> {
        override val type: GeneratedClassKGType<StringObject> =
            GeneratedClassKGType(getTypeOrNull("gtk_string_object_get_type")!!) { StringObject(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StringObject
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_string_object_get_type()
    }
}
