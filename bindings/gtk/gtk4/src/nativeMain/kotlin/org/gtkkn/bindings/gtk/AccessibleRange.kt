// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.gtk_accessible_range_get_type

/**
 * This interface describes ranged controls, e.g. controls which have a single
 * value within an allowed range and that can optionally be changed by the user.
 *
 * This interface is expected to be implemented by controls using the following
 * roles:
 *
 * - `GTK_ACCESSIBLE_ROLE_METER`
 * - `GTK_ACCESSIBLE_ROLE_PROGRESS_BAR`
 * - `GTK_ACCESSIBLE_ROLE_SCROLLBAR`
 * - `GTK_ACCESSIBLE_ROLE_SLIDER`
 * - `GTK_ACCESSIBLE_ROLE_SPIN_BUTTON`
 *
 * If that is not the case, a warning will be issued at run time.
 *
 * In addition to this interface, its implementers are expected to provide the
 * correct values for the following properties:
 *
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_MAX`
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_MIN`
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_NOW`
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT`
 * @since 4.10
 */
public interface AccessibleRange : Interface, Accessible, KGTyped {
    public val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gtkAccessibleRangePointer.reinterpret()

    private data class Wrapper(
        private val pointer: CPointer<GtkAccessibleRange>,
    ) : AccessibleRange {
        override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange> = pointer
    }

    public companion object : TypeCompanion<AccessibleRange> {
        override val type: GeneratedInterfaceKGType<AccessibleRange> =
            GeneratedInterfaceKGType(gtk_accessible_range_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkAccessibleRange>): AccessibleRange = Wrapper(pointer)
    }
}
