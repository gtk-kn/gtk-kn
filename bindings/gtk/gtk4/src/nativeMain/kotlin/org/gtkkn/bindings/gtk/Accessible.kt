// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.gtk_accessible_get_accessible_role
import org.gtkkn.native.gtk.gtk_accessible_get_type
import org.gtkkn.native.gtk.gtk_accessible_reset_property
import org.gtkkn.native.gtk.gtk_accessible_reset_relation
import org.gtkkn.native.gtk.gtk_accessible_reset_state
import kotlin.Unit

/**
 * `GtkAccessible` is an interface for describing UI elements for
 * Assistive Technologies.
 *
 * Every accessible implementation has:
 *
 *  - a “role”, represented by a value of the [enum@Gtk.AccessibleRole] enumeration
 *  - an “attribute”, represented by a set of [enum@Gtk.AccessibleState],
 *    [enum@Gtk.AccessibleProperty] and [enum@Gtk.AccessibleRelation] values
 *
 * The role cannot be changed after instantiating a `GtkAccessible`
 * implementation.
 *
 * The attributes are updated every time a UI element's state changes in
 * a way that should be reflected by assistive technologies. For instance,
 * if a `GtkWidget` visibility changes, the %GTK_ACCESSIBLE_STATE_HIDDEN
 * state will also change to reflect the [property@Gtk.Widget:visible] property.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `properties`: Array parameter of type AccessibleProperty is not supported
 * - parameter `relations`: Array parameter of type AccessibleRelation is not supported
 * - parameter `states`: Array parameter of type AccessibleState is not supported
 */
public interface Accessible : Interface, KGTyped {
    public val gtkAccessiblePointer: CPointer<GtkAccessible>

    /**
     * The accessible role of the given `GtkAccessible` implementation.
     *
     * The accessible role cannot be changed once set.
     */
    public val accessibleRole: AccessibleRole
        /**
         * Retrieves the `GtkAccessibleRole` for the given `GtkAccessible`.
         *
         * @return a `GtkAccessibleRole`
         */
        get() =
            gtk_accessible_get_accessible_role(gtkAccessiblePointer.reinterpret()).run {
                AccessibleRole.fromNativeValue(this)
            }

    /**
     * Retrieves the `GtkAccessibleRole` for the given `GtkAccessible`.
     *
     * @return a `GtkAccessibleRole`
     */
    public fun getAccessibleRole(): AccessibleRole =
        gtk_accessible_get_accessible_role(gtkAccessiblePointer.reinterpret()).run {
            AccessibleRole.fromNativeValue(this)
        }

    /**
     * Resets the accessible @property to its default value.
     *
     * @param property a `GtkAccessibleProperty`
     */
    public fun resetProperty(`property`: AccessibleProperty): Unit =
        gtk_accessible_reset_property(
            gtkAccessiblePointer.reinterpret(),
            `property`.nativeValue
        )

    /**
     * Resets the accessible @relation to its default value.
     *
     * @param relation a `GtkAccessibleRelation`
     */
    public fun resetRelation(relation: AccessibleRelation): Unit =
        gtk_accessible_reset_relation(gtkAccessiblePointer.reinterpret(), relation.nativeValue)

    /**
     * Resets the accessible @state to its default value.
     *
     * @param state a `GtkAccessibleState`
     */
    public fun resetState(state: AccessibleState): Unit =
        gtk_accessible_reset_state(gtkAccessiblePointer.reinterpret(), state.nativeValue)

    private data class Wrapper(
        private val pointer: CPointer<GtkAccessible>,
    ) : Accessible {
        override val gtkAccessiblePointer: CPointer<GtkAccessible> = pointer
    }

    public companion object : TypeCompanion<Accessible> {
        override val type: GeneratedInterfaceKGType<Accessible> =
            GeneratedInterfaceKGType(gtk_accessible_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkAccessible>): Accessible = Wrapper(pointer)
    }
}
