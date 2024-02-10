// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gtk.GtkAccessibleState
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_BUSY
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_CHECKED
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_DISABLED
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_EXPANDED
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_HIDDEN
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_INVALID
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_PRESSED
import org.gtkkn.native.gtk.GtkAccessibleState.GTK_ACCESSIBLE_STATE_SELECTED
import org.gtkkn.native.gtk.gtk_accessible_state_init_value
import kotlin.Unit

/**
 * The possible accessible states of a [iface@Accessible].
 */
public enum class AccessibleState(
    public val nativeValue: GtkAccessibleState,
) {
    /**
     * A “busy” state. This state has boolean values
     */
    BUSY(GTK_ACCESSIBLE_STATE_BUSY),

    /**
     * A “checked” state; indicates the current
     *   state of a [class@CheckButton]. Value type: [enum@AccessibleTristate]
     */
    CHECKED(GTK_ACCESSIBLE_STATE_CHECKED),

    /**
     * A “disabled” state; corresponds to the
     *   [property@Widget:sensitive] property. It indicates a UI element
     *   that is perceivable, but not editable or operable. Value type: boolean
     */
    DISABLED(GTK_ACCESSIBLE_STATE_DISABLED),

    /**
     * An “expanded” state; corresponds to the
     *   [property@Expander:expanded] property. Value type: boolean
     *   or undefined
     */
    EXPANDED(GTK_ACCESSIBLE_STATE_EXPANDED),

    /**
     * A “hidden” state; corresponds to the
     *   [property@Widget:visible] property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: %GTK_ACCESSIBLE_STATE_DISABLED
     */
    HIDDEN(GTK_ACCESSIBLE_STATE_HIDDEN),

    /**
     * An “invalid” state; set when a widget
     *   is showing an error. Value type: [enum@AccessibleInvalidState]
     */
    INVALID(GTK_ACCESSIBLE_STATE_INVALID),

    /**
     * A “pressed” state; indicates the current
     *   state of a [class@ToggleButton]. Value type: [enum@AccessibleTristate]
     *   enumeration
     */
    PRESSED(GTK_ACCESSIBLE_STATE_PRESSED),

    /**
     * A “selected” state; set when a widget
     *   is selected. Value type: boolean or undefined
     */
    SELECTED(GTK_ACCESSIBLE_STATE_SELECTED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleState): AccessibleState =
            when (nativeValue) {
                GTK_ACCESSIBLE_STATE_BUSY -> BUSY
                GTK_ACCESSIBLE_STATE_CHECKED -> CHECKED
                GTK_ACCESSIBLE_STATE_DISABLED -> DISABLED
                GTK_ACCESSIBLE_STATE_EXPANDED -> EXPANDED
                GTK_ACCESSIBLE_STATE_HIDDEN -> HIDDEN
                GTK_ACCESSIBLE_STATE_INVALID -> INVALID
                GTK_ACCESSIBLE_STATE_PRESSED -> PRESSED
                GTK_ACCESSIBLE_STATE_SELECTED -> SELECTED
                else -> error("invalid nativeValue")
            }

        /**
         *
         *
         * @param state
         * @param value
         */
        public fun initValue(
            state: AccessibleState,
            `value`: Value,
        ): Unit = gtk_accessible_state_init_value(state.nativeValue, `value`.gobjectValuePointer)
    }
}
