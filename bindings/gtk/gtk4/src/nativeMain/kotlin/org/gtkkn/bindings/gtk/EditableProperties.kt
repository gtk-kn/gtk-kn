// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkEditableProperties
import org.gtkkn.native.gtk.gtk_editable_properties_get_type

/**
 * The identifiers for [iface@Gtk.Editable] properties.
 *
 * See [func@Gtk.Editable.install_properties] for details on how to
 * implement the `GtkEditable` interface.
 */
public enum class EditableProperties(public val nativeValue: GtkEditableProperties) {
    /**
     * the property id for [property@Gtk.Editable:text]
     */
    PROP_TEXT(GtkEditableProperties.GTK_EDITABLE_PROP_TEXT),

    /**
     * the property id for [property@Gtk.Editable:cursor-position]
     */
    PROP_CURSOR_POSITION(GtkEditableProperties.GTK_EDITABLE_PROP_CURSOR_POSITION),

    /**
     * the property id for [property@Gtk.Editable:selection-bound]
     */
    PROP_SELECTION_BOUND(GtkEditableProperties.GTK_EDITABLE_PROP_SELECTION_BOUND),

    /**
     * the property id for [property@Gtk.Editable:editable]
     */
    PROP_EDITABLE(GtkEditableProperties.GTK_EDITABLE_PROP_EDITABLE),

    /**
     * the property id for [property@Gtk.Editable:width-chars]
     */
    PROP_WIDTH_CHARS(GtkEditableProperties.GTK_EDITABLE_PROP_WIDTH_CHARS),

    /**
     * the property id for [property@Gtk.Editable:max-width-chars]
     */
    PROP_MAX_WIDTH_CHARS(GtkEditableProperties.GTK_EDITABLE_PROP_MAX_WIDTH_CHARS),

    /**
     * the property id for [property@Gtk.Editable:xalign]
     */
    PROP_XALIGN(GtkEditableProperties.GTK_EDITABLE_PROP_XALIGN),

    /**
     * the property id for [property@Gtk.Editable:enable-undo]
     */
    PROP_ENABLE_UNDO(GtkEditableProperties.GTK_EDITABLE_PROP_ENABLE_UNDO),

    /**
     * the number of properties
     */
    NUM_PROPERTIES(GtkEditableProperties.GTK_EDITABLE_NUM_PROPERTIES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkEditableProperties): EditableProperties = when (nativeValue) {
            GtkEditableProperties.GTK_EDITABLE_PROP_TEXT -> PROP_TEXT
            GtkEditableProperties.GTK_EDITABLE_PROP_CURSOR_POSITION -> PROP_CURSOR_POSITION
            GtkEditableProperties.GTK_EDITABLE_PROP_SELECTION_BOUND -> PROP_SELECTION_BOUND
            GtkEditableProperties.GTK_EDITABLE_PROP_EDITABLE -> PROP_EDITABLE
            GtkEditableProperties.GTK_EDITABLE_PROP_WIDTH_CHARS -> PROP_WIDTH_CHARS
            GtkEditableProperties.GTK_EDITABLE_PROP_MAX_WIDTH_CHARS -> PROP_MAX_WIDTH_CHARS
            GtkEditableProperties.GTK_EDITABLE_PROP_XALIGN -> PROP_XALIGN
            GtkEditableProperties.GTK_EDITABLE_PROP_ENABLE_UNDO -> PROP_ENABLE_UNDO
            GtkEditableProperties.GTK_EDITABLE_NUM_PROPERTIES -> NUM_PROPERTIES
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of EditableProperties
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_editable_properties_get_type()
    }
}
