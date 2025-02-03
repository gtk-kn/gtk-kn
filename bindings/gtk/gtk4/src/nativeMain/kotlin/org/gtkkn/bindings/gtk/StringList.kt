// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkStringList
import org.gtkkn.native.gtk.gtk_string_list_append
import org.gtkkn.native.gtk.gtk_string_list_get_string
import org.gtkkn.native.gtk.gtk_string_list_get_type
import org.gtkkn.native.gtk.gtk_string_list_new
import org.gtkkn.native.gtk.gtk_string_list_remove
import org.gtkkn.native.gtk.gtk_string_list_splice
import org.gtkkn.native.gtk.gtk_string_list_take
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GtkStringList` is a list model that wraps an array of strings.
 *
 * The objects in the model are of type [class@Gtk.StringObject] and have
 * a "string" property that can be used inside expressions.
 *
 * `GtkStringList` is well-suited for any place where you would
 * typically use a `char*[]`, but need a list model.
 *
 * ## GtkStringList as GtkBuildable
 *
 * The `GtkStringList` implementation of the `GtkBuildable` interface
 * supports adding items directly using the `<items>` element and
 * specifying `<item>` elements for each item. Each `<item>` element
 * supports the regular translation attributes “translatable”,
 * “context” and “comments”.
 *
 * Here is a UI definition fragment specifying a `GtkStringList`
 *
 * ```xml
 * <object class="GtkStringList">
 *   <items>
 *     <item translatable="yes">Factory</item>
 *     <item translatable="yes">Home</item>
 *     <item translatable="yes">Subway</item>
 *   </items>
 * </object>
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 * - method `strings`: Property has no getter nor setter
 */
public open class StringList(public val gtkStringListPointer: CPointer<GtkStringList>) :
    Object(gtkStringListPointer.reinterpret()),
    ListModel,
    Buildable,
    KGTyped {
    init {
        Gtk
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkStringList` with the given @strings.
     *
     * @param strings The strings to put in the model
     * @return a new `GtkStringList`
     */
    public constructor(strings: List<String>? = null) : this(
        memScoped {
            gtk_string_list_new(strings?.toCStringList(this))!!
        }
    ) {
        InstanceCache.put(this)
    }

    /**
     * Appends @string to @self.
     *
     * The @string will be copied. See
     * [method@Gtk.StringList.take] for a way to avoid that.
     *
     * @param string the string to insert
     */
    public open fun append(string: String): Unit = gtk_string_list_append(gtkStringListPointer, string)

    /**
     * Gets the string that is at @position in @self.
     *
     * If @self does not contain @position items, null is returned.
     *
     * This function returns the const char *. To get the
     * object wrapping it, use g_list_model_get_item().
     *
     * @param position the position to get the string for
     * @return the string at the given position
     */
    public open fun getString(position: guint): String? =
        gtk_string_list_get_string(gtkStringListPointer, position)?.toKString()

    /**
     * Removes the string at @position from @self.
     *
     * @position must be smaller than the current
     * length of the list.
     *
     * @param position the position of the string that is to be removed
     */
    public open fun remove(position: guint): Unit = gtk_string_list_remove(gtkStringListPointer, position)

    /**
     * Changes @self by removing @n_removals strings and adding @additions
     * to it.
     *
     * This function is more efficient than [method@Gtk.StringList.append]
     * and [method@Gtk.StringList.remove], because it only emits the
     * ::items-changed signal once for the change.
     *
     * This function copies the strings in @additions.
     *
     * The parameters @position and @n_removals must be correct (ie:
     * @position + @n_removals must be less than or equal to the length
     * of the list at the time this function is called).
     *
     * @param position the position at which to make the change
     * @param nRemovals the number of strings to remove
     * @param additions The strings to add
     */
    public open fun splice(position: guint, nRemovals: guint, additions: List<String>? = null): Unit = memScoped {
        return gtk_string_list_splice(gtkStringListPointer, position, nRemovals, additions?.toCStringList(this))
    }

    /**
     * Adds @string to self at the end, and takes
     * ownership of it.
     *
     * This variant of [method@Gtk.StringList.append]
     * is convenient for formatting strings:
     *
     * ```c
     * gtk_string_list_take (self, g_strdup_print ("%d dollars", lots));
     * ```
     *
     * @param string the string to insert
     */
    public open fun take(string: String): Unit = gtk_string_list_take(gtkStringListPointer, string.cstr)

    public companion object : TypeCompanion<StringList> {
        override val type: GeneratedClassKGType<StringList> =
            GeneratedClassKGType(getTypeOrNull()!!) { StringList(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StringList
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_string_list_get_type()

        /**
         * Gets the GType of from the symbol `gtk_string_list_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_string_list_get_type")
    }
}
