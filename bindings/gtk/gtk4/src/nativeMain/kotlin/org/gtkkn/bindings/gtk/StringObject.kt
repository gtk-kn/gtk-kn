// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class StringObject(
    pointer: CPointer<GtkStringObject>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkStringObjectPointer: CPointer<GtkStringObject>
        get() = gPointer.reinterpret()

    /**
     * The string.
     */
    public open val string: String
        /**
         * Returns the string contained in a `GtkStringObject`.
         *
         * @return the string of @self
         */
        get() =
            gtk_string_object_get_string(gtkStringObjectPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Wraps a string in an object for use with `GListModel`.
     *
     * @param string The string to wrap
     * @return a new `GtkStringObject`
     */
    public constructor(string: String) : this(gtk_string_object_new(string)!!.reinterpret())

    /**
     * Returns the string contained in a `GtkStringObject`.
     *
     * @return the string of @self
     */
    public open fun getString(): String =
        gtk_string_object_get_string(gtkStringObjectPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public companion object : TypeCompanion<StringObject> {
        override val type: GeneratedClassKGType<StringObject> =
            GeneratedClassKGType(gtk_string_object_get_type()) { StringObject(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
