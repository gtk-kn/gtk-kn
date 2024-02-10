// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkEditableProperties
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_NUM_PROPERTIES
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_CURSOR_POSITION
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_EDITABLE
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_ENABLE_UNDO
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_MAX_WIDTH_CHARS
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_SELECTION_BOUND
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_TEXT
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_WIDTH_CHARS
import org.gtkkn.native.gtk.GtkEditableProperties.GTK_EDITABLE_PROP_XALIGN

/**
 * The identifiers for [iface@Gtk.Editable] properties.
 *
 * See [func@Gtk.Editable.install_properties] for details on how to
 * implement the `GtkEditable` interface.
 */
public enum class EditableProperties(
    public val nativeValue: GtkEditableProperties,
) {
    /**
     * the property id for [property@Gtk.Editable:text]
     */
    PROP_TEXT(GTK_EDITABLE_PROP_TEXT),

    /**
     * the property id for [property@Gtk.Editable:cursor-position]
     */
    PROP_CURSOR_POSITION(GTK_EDITABLE_PROP_CURSOR_POSITION),

    /**
     * the property id for [property@Gtk.Editable:selection-bound]
     */
    PROP_SELECTION_BOUND(GTK_EDITABLE_PROP_SELECTION_BOUND),

    /**
     * the property id for [property@Gtk.Editable:editable]
     */
    PROP_EDITABLE(GTK_EDITABLE_PROP_EDITABLE),

    /**
     * the property id for [property@Gtk.Editable:width-chars]
     */
    PROP_WIDTH_CHARS(GTK_EDITABLE_PROP_WIDTH_CHARS),

    /**
     * the property id for [property@Gtk.Editable:max-width-chars]
     */
    PROP_MAX_WIDTH_CHARS(GTK_EDITABLE_PROP_MAX_WIDTH_CHARS),

    /**
     * the property id for [property@Gtk.Editable:xalign]
     */
    PROP_XALIGN(GTK_EDITABLE_PROP_XALIGN),

    /**
     * the property id for [property@Gtk.Editable:enable-undo]
     */
    PROP_ENABLE_UNDO(GTK_EDITABLE_PROP_ENABLE_UNDO),

    /**
     * the number of properties
     */
    NUM_PROPERTIES(GTK_EDITABLE_NUM_PROPERTIES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkEditableProperties): EditableProperties =
            when (nativeValue) {
                GTK_EDITABLE_PROP_TEXT -> PROP_TEXT
                GTK_EDITABLE_PROP_CURSOR_POSITION -> PROP_CURSOR_POSITION
                GTK_EDITABLE_PROP_SELECTION_BOUND -> PROP_SELECTION_BOUND
                GTK_EDITABLE_PROP_EDITABLE -> PROP_EDITABLE
                GTK_EDITABLE_PROP_WIDTH_CHARS -> PROP_WIDTH_CHARS
                GTK_EDITABLE_PROP_MAX_WIDTH_CHARS -> PROP_MAX_WIDTH_CHARS
                GTK_EDITABLE_PROP_XALIGN -> PROP_XALIGN
                GTK_EDITABLE_PROP_ENABLE_UNDO -> PROP_ENABLE_UNDO
                GTK_EDITABLE_NUM_PROPERTIES -> NUM_PROPERTIES
                else -> error("invalid nativeValue")
            }
    }
}
