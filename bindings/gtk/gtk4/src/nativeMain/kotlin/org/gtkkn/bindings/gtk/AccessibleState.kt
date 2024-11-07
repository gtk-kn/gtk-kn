// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gtk.GtkAccessibleState
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
    BUSY(GtkAccessibleState.GTK_ACCESSIBLE_STATE_BUSY),

    /**
     * A “checked” state; indicates the current
     *   state of a [class@CheckButton]. Value type: [enum@AccessibleTristate]
     */
    CHECKED(GtkAccessibleState.GTK_ACCESSIBLE_STATE_CHECKED),

    /**
     * A “disabled” state; corresponds to the
     *   [property@Widget:sensitive] property. It indicates a UI element
     *   that is perceivable, but not editable or operable. Value type: boolean
     */
    DISABLED(GtkAccessibleState.GTK_ACCESSIBLE_STATE_DISABLED),

    /**
     * An “expanded” state; corresponds to the
     *   [property@Expander:expanded] property. Value type: boolean
     *   or undefined
     */
    EXPANDED(GtkAccessibleState.GTK_ACCESSIBLE_STATE_EXPANDED),

    /**
     * A “hidden” state; corresponds to the
     *   [property@Widget:visible] property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: %GTK_ACCESSIBLE_STATE_DISABLED
     */
    HIDDEN(GtkAccessibleState.GTK_ACCESSIBLE_STATE_HIDDEN),

    /**
     * An “invalid” state; set when a widget
     *   is showing an error. Value type: [enum@AccessibleInvalidState]
     */
    INVALID(GtkAccessibleState.GTK_ACCESSIBLE_STATE_INVALID),

    /**
     * A “pressed” state; indicates the current
     *   state of a [class@ToggleButton]. Value type: [enum@AccessibleTristate]
     *   enumeration
     */
    PRESSED(GtkAccessibleState.GTK_ACCESSIBLE_STATE_PRESSED),

    /**
     * A “selected” state; set when a widget
     *   is selected. Value type: boolean or undefined
     */
    SELECTED(GtkAccessibleState.GTK_ACCESSIBLE_STATE_SELECTED),

    /**
     * Indicates that a widget with the GTK_ACCESSIBLE_ROLE_LINK has been visited.
     * Value type: boolean.
     * @since 4.12
     */
    VISITED(GtkAccessibleState.GTK_ACCESSIBLE_STATE_VISITED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleState): AccessibleState =
            when (nativeValue) {
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_BUSY -> BUSY
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_CHECKED -> CHECKED
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_DISABLED -> DISABLED
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_EXPANDED -> EXPANDED
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_HIDDEN -> HIDDEN
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_INVALID -> INVALID
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_PRESSED -> PRESSED
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_SELECTED -> SELECTED
                GtkAccessibleState.GTK_ACCESSIBLE_STATE_VISITED -> VISITED
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
