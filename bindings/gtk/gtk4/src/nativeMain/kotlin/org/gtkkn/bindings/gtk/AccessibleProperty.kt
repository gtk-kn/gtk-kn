// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleProperty
import org.gtkkn.native.gtk.gtk_accessible_property_get_type
import org.gtkkn.native.gtk.gtk_accessible_property_init_value
import kotlin.Unit

/**
 * The possible accessible properties of a [iface@Accessible].
 */
public enum class AccessibleProperty(public val nativeValue: GtkAccessibleProperty) {
    /**
     * Indicates whether inputting text
     *    could trigger display of one or more predictions of the user's intended
     *    value for a combobox, searchbox, or textbox and specifies how predictions
     *    would be presented if they were made. Value type: [enum@AccessibleAutocomplete]
     */
    AUTOCOMPLETE(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE),

    /**
     * Defines a string value that describes
     *    or annotates the current element. Value type: string
     */
    DESCRIPTION(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_DESCRIPTION),

    /**
     * Indicates the availability and type of
     *    interactive popup element, such as menu or dialog, that can be triggered
     *    by an element.
     */
    HAS_POPUP(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_HAS_POPUP),

    /**
     * Indicates keyboard shortcuts that an
     *    author has implemented to activate or give focus to an element. Value type:
     *    string
     */
    KEY_SHORTCUTS(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS),

    /**
     * Defines a string value that labels the current
     *    element. Value type: string
     */
    LABEL(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LABEL),

    /**
     * Defines the hierarchical level of an element
     *    within a structure. Value type: integer
     */
    LEVEL(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LEVEL),

    /**
     * Indicates whether an element is modal when
     *    displayed. Value type: boolean
     */
    MODAL(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MODAL),

    /**
     * Indicates whether a text box accepts
     *    multiple lines of input or only a single line. Value type: boolean
     */
    MULTI_LINE(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_LINE),

    /**
     * Indicates that the user may select
     *    more than one item from the current selectable descendants. Value type:
     *    boolean
     */
    MULTI_SELECTABLE(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE),

    /**
     * Indicates whether the element's
     *    orientation is horizontal, vertical, or unknown/ambiguous. Value type:
     *    [enum@Orientation]
     */
    ORIENTATION(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ORIENTATION),

    /**
     * Defines a short hint (a word or short
     *    phrase) intended to aid the user with data entry when the control has no
     *    value. A hint could be a sample value or a brief description of the expected
     *    format. Value type: string
     */
    PLACEHOLDER(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER),

    /**
     * Indicates that the element is not editable,
     *    but is otherwise operable. Value type: boolean
     */
    READ_ONLY(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_READ_ONLY),

    /**
     * Indicates that user input is required on
     *    the element before a form may be submitted. Value type: boolean
     */
    REQUIRED(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_REQUIRED),

    /**
     * Defines a human-readable,
     *    author-localized description for the role of an element. Value type: string
     */
    ROLE_DESCRIPTION(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION),

    /**
     * Indicates if items in a table or grid are
     *    sorted in ascending or descending order. Value type: [enum@AccessibleSort]
     */
    SORT(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_SORT),

    /**
     * Defines the maximum allowed value for a
     *    range widget. Value type: double
     */
    VALUE_MAX(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MAX),

    /**
     * Defines the minimum allowed value for a
     *    range widget. Value type: double
     */
    VALUE_MIN(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MIN),

    /**
     * Defines the current value for a range widget.
     *    Value type: double
     */
    VALUE_NOW(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_NOW),

    /**
     * Defines the human readable text alternative
     *    of aria-valuenow for a range widget. Value type: string
     */
    VALUE_TEXT(GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleProperty): AccessibleProperty = when (nativeValue) {
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE -> AUTOCOMPLETE
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_DESCRIPTION -> DESCRIPTION
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_HAS_POPUP -> HAS_POPUP
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS -> KEY_SHORTCUTS
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LABEL -> LABEL
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LEVEL -> LEVEL
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MODAL -> MODAL
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_LINE -> MULTI_LINE
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE -> MULTI_SELECTABLE
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ORIENTATION -> ORIENTATION
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER -> PLACEHOLDER
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_READ_ONLY -> READ_ONLY
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_REQUIRED -> REQUIRED
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION -> ROLE_DESCRIPTION
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_SORT -> SORT
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MAX -> VALUE_MAX
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MIN -> VALUE_MIN
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_NOW -> VALUE_NOW
            GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT -> VALUE_TEXT
            else -> error("invalid nativeValue")
        }

        public fun initValue(`property`: AccessibleProperty, `value`: Value): Unit =
            gtk_accessible_property_init_value(`property`.nativeValue, `value`.gobjectValuePointer.reinterpret())

        /**
         * Get the GType of AccessibleProperty
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_property_get_type()
    }
}
