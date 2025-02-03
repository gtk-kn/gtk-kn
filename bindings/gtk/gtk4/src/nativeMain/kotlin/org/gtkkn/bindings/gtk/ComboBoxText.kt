// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellEditable
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkComboBoxText
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_combo_box_text_append
import org.gtkkn.native.gtk.gtk_combo_box_text_append_text
import org.gtkkn.native.gtk.gtk_combo_box_text_get_active_text
import org.gtkkn.native.gtk.gtk_combo_box_text_get_type
import org.gtkkn.native.gtk.gtk_combo_box_text_insert
import org.gtkkn.native.gtk.gtk_combo_box_text_insert_text
import org.gtkkn.native.gtk.gtk_combo_box_text_new
import org.gtkkn.native.gtk.gtk_combo_box_text_new_with_entry
import org.gtkkn.native.gtk.gtk_combo_box_text_prepend
import org.gtkkn.native.gtk.gtk_combo_box_text_prepend_text
import org.gtkkn.native.gtk.gtk_combo_box_text_remove
import org.gtkkn.native.gtk.gtk_combo_box_text_remove_all
import kotlin.String
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * Use [class@Gtk.DropDown] with a [class@Gtk.StringList]
 *   instead
 * ---
 *
 * A `GtkComboBoxText` is a simple variant of `GtkComboBox` for text-only
 * use cases.
 *
 * ![An example GtkComboBoxText](combo-box-text.png)
 *
 * `GtkComboBoxText` hides the model-view complexity of `GtkComboBox`.
 *
 * To create a `GtkComboBoxText`, use [ctor@Gtk.ComboBoxText.new] or
 * [ctor@Gtk.ComboBoxText.new_with_entry].
 *
 * You can add items to a `GtkComboBoxText` with
 * [method@Gtk.ComboBoxText.append_text],
 * [method@Gtk.ComboBoxText.insert_text] or
 * [method@Gtk.ComboBoxText.prepend_text] and remove options with
 * [method@Gtk.ComboBoxText.remove].
 *
 * If the `GtkComboBoxText` contains an entry (via the
 * [property@Gtk.ComboBox:has-entry] property), its contents can be retrieved
 * using [method@Gtk.ComboBoxText.get_active_text].
 *
 * You should not call [method@Gtk.ComboBox.set_model] or attempt to pack more
 * cells into this combo box via its [iface@Gtk.CellLayout] interface.
 *
 * ## GtkComboBoxText as GtkBuildable
 *
 * The `GtkComboBoxText` implementation of the `GtkBuildable` interface supports
 * adding items directly using the `<items>` element and specifying `<item>`
 * elements for each item. Each `<item>` element can specify the “id”
 * corresponding to the appended text and also supports the regular
 * translation attributes “translatable”, “context” and “comments”.
 *
 * Here is a UI definition fragment specifying `GtkComboBoxText` items:
 * ```xml
 * <object class="GtkComboBoxText">
 *   <items>
 *     <item translatable="yes" id="factory">Factory</item>
 *     <item translatable="yes" id="home">Home</item>
 *     <item translatable="yes" id="subway">Subway</item>
 *   </items>
 * </object>
 * ```
 *
 * ## CSS nodes
 *
 * ```
 * combobox
 * ╰── box.linked
 *     ├── entry.combo
 *     ├── button.combo
 *     ╰── window.popup
 * ```
 *
 * `GtkComboBoxText` has a single CSS node with name combobox. It adds
 * the style class .combo to the main CSS nodes of its entry and button
 * children, and the .linked class to the node of its internal box.
 */
public open class ComboBoxText(public val gtkComboBoxTextPointer: CPointer<GtkComboBoxText>) :
    ComboBox(gtkComboBoxTextPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkCellEditablePointer: CPointer<GtkCellEditable>
        get() = handle.reinterpret()

    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Creates a new `GtkComboBoxText`.
     *
     * @return A new `GtkComboBoxText`
     */
    public constructor() : this(gtk_combo_box_text_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Appends @text to the list of strings stored in @combo_box.
     *
     * If @id is non-null then it is used as the ID of the row.
     *
     * This is the same as calling [method@Gtk.ComboBoxText.insert]
     * with a position of -1.
     *
     * @param id a string ID for this value
     * @param text A string
     */
    public open fun append(id: String? = null, text: String): Unit =
        gtk_combo_box_text_append(gtkComboBoxTextPointer, id, text)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Appends @text to the list of strings stored in @combo_box.
     *
     * This is the same as calling [method@Gtk.ComboBoxText.insert_text]
     * with a position of -1.
     *
     * @param text A string
     */
    public open fun appendText(text: String): Unit = gtk_combo_box_text_append_text(gtkComboBoxTextPointer, text)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Returns the currently active string in @combo_box.
     *
     * If no row is currently selected, null is returned.
     * If @combo_box contains an entry, this function will
     * return its contents (which will not necessarily
     * be an item from the list).
     *
     * @return a newly allocated
     *   string containing the currently active text.
     *   Must be freed with g_free().
     */
    public open fun getActiveText(): String? = gtk_combo_box_text_get_active_text(gtkComboBoxTextPointer)?.toKString()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Inserts @text at @position in the list of strings stored in @combo_box.
     *
     * If @id is non-null then it is used as the ID of the row.
     * See [property@Gtk.ComboBox:id-column].
     *
     * If @position is negative then @text is appended.
     *
     * @param position An index to insert @text
     * @param id a string ID for this value
     * @param text A string to display
     */
    public open fun insert(position: gint, id: String? = null, text: String): Unit =
        gtk_combo_box_text_insert(gtkComboBoxTextPointer, position, id, text)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Inserts @text at @position in the list of strings stored in @combo_box.
     *
     * If @position is negative then @text is appended.
     *
     * This is the same as calling [method@Gtk.ComboBoxText.insert]
     * with a null ID string.
     *
     * @param position An index to insert @text
     * @param text A string
     */
    public open fun insertText(position: gint, text: String): Unit =
        gtk_combo_box_text_insert_text(gtkComboBoxTextPointer, position, text)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Prepends @text to the list of strings stored in @combo_box.
     *
     * If @id is non-null then it is used as the ID of the row.
     *
     * This is the same as calling [method@Gtk.ComboBoxText.insert]
     * with a position of 0.
     *
     * @param id a string ID for this value
     * @param text a string
     */
    public open fun prepend(id: String? = null, text: String): Unit =
        gtk_combo_box_text_prepend(gtkComboBoxTextPointer, id, text)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Prepends @text to the list of strings stored in @combo_box.
     *
     * This is the same as calling [method@Gtk.ComboBoxText.insert_text]
     * with a position of 0.
     *
     * @param text A string
     */
    public open fun prependText(text: String): Unit = gtk_combo_box_text_prepend_text(gtkComboBoxTextPointer, text)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Removes the string at @position from @combo_box.
     *
     * @param position Index of the item to remove
     */
    public open fun remove(position: gint): Unit = gtk_combo_box_text_remove(gtkComboBoxTextPointer, position)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.DropDown]
     * ---
     *
     * Removes all the text entries from the combo box.
     */
    public open fun removeAll(): Unit = gtk_combo_box_text_remove_all(gtkComboBoxTextPointer)

    public companion object : TypeCompanion<ComboBoxText> {
        override val type: GeneratedClassKGType<ComboBoxText> =
            GeneratedClassKGType(getTypeOrNull()!!) { ComboBoxText(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ComboBoxText
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_combo_box_text_get_type()

        /**
         * Gets the GType of from the symbol `gtk_combo_box_text_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_combo_box_text_get_type")

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.DropDown]
         * ---
         *
         * Creates a new `GtkComboBoxText` with an entry.
         *
         * @return a new `GtkComboBoxText`
         */
        public fun withEntry(): ComboBoxText = ComboBoxText(gtk_combo_box_text_new_with_entry()!!.reinterpret()).apply {
            InstanceCache.put(this)
        }
    }
}
