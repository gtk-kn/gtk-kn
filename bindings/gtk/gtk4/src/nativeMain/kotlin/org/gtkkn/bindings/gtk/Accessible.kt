// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.gtk_accessible_announce
import org.gtkkn.native.gtk.gtk_accessible_get_accessible_parent
import org.gtkkn.native.gtk.gtk_accessible_get_accessible_role
import org.gtkkn.native.gtk.gtk_accessible_get_at_context
import org.gtkkn.native.gtk.gtk_accessible_get_first_accessible_child
import org.gtkkn.native.gtk.gtk_accessible_get_next_accessible_sibling
import org.gtkkn.native.gtk.gtk_accessible_get_platform_state
import org.gtkkn.native.gtk.gtk_accessible_get_type
import org.gtkkn.native.gtk.gtk_accessible_reset_property
import org.gtkkn.native.gtk.gtk_accessible_reset_relation
import org.gtkkn.native.gtk.gtk_accessible_reset_state
import org.gtkkn.native.gtk.gtk_accessible_set_accessible_parent
import org.gtkkn.native.gtk.gtk_accessible_update_next_accessible_sibling
import kotlin.Boolean
import kotlin.String
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
 * Every accessible implementation is part of a tree of accessible objects.
 * Normally, this tree corresponds to the widget tree, but can be customized
 * by reimplementing the [vfunc@Gtk.Accessible.get_accessible_parent],
 * [vfunc@Gtk.Accessible.get_first_accessible_child] and
 * [vfunc@Gtk.Accessible.get_next_accessible_sibling] virtual functions.
 * Note that you can not create a top-level accessible object as of now,
 * which means that you must always have a parent accessible object.
 * Also note that when an accessible object does not correspond to a widget,
 * and it has children, whose implementation you don't control,
 * it is necessary to ensure the correct shape of the a11y tree
 * by calling [method@Gtk.Accessible.set_accessible_parent] and
 * updating the sibling by [method@Gtk.Accessible.update_next_accessible_sibling].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `properties`: Array parameter of type AccessibleProperty is not supported
 * - parameter `relations`: Array parameter of type AccessibleRelation is not supported
 * - parameter `states`: Array parameter of type AccessibleState is not supported
 */
public interface Accessible :
    Interface,
    KGTyped {
    public val gtkAccessiblePointer: CPointer<GtkAccessible>

    /**
     * The accessible role of the given `GtkAccessible` implementation.
     *
     * The accessible role cannot be changed once set.
     */
    public val accessibleRole: AccessibleRole
        /**
         * Retrieves the accessible role of an accessible object.
         *
         * @return the accessible role
         */
        get() = gtk_accessible_get_accessible_role(gtkAccessiblePointer.reinterpret()).run {
            AccessibleRole.fromNativeValue(this)
        }

    /**
     * Requests the user's screen reader to announce the given message.
     *
     * This kind of notification is useful for messages that
     * either have only a visual representation or that are not
     * exposed visually at all, e.g. a notification about a
     * successful operation.
     *
     * Also, by using this API, you can ensure that the message
     * does not interrupts the user's current screen reader output.
     *
     * @param message the string to announce
     * @param priority the priority of the announcement
     * @since 4.14
     */
    @GtkVersion4_14
    public fun announce(message: String, priority: AccessibleAnnouncementPriority): Unit =
        gtk_accessible_announce(gtkAccessiblePointer.reinterpret(), message, priority.nativeValue)

    /**
     * Retrieves the accessible parent for an accessible object.
     *
     * This function returns `NULL` for top level widgets.
     *
     * @return the accessible parent
     * @since 4.10
     */
    @GtkVersion4_10
    public fun getAccessibleParent(): Accessible? =
        gtk_accessible_get_accessible_parent(gtkAccessiblePointer.reinterpret())?.run {
            Accessible.wrap(reinterpret())
        }

    /**
     * Retrieves the accessible role of an accessible object.
     *
     * @return the accessible role
     */
    public fun getAccessibleRole(): AccessibleRole =
        gtk_accessible_get_accessible_role(gtkAccessiblePointer.reinterpret()).run {
            AccessibleRole.fromNativeValue(this)
        }

    /**
     * Retrieves the accessible implementation for the given `GtkAccessible`.
     *
     * @return the accessible implementation object
     * @since 4.10
     */
    @GtkVersion4_10
    public fun getAtContext(): AtContext = gtk_accessible_get_at_context(gtkAccessiblePointer.reinterpret())!!.run {
        AtContext(reinterpret())
    }

    /**
     * Retrieves the first accessible child of an accessible object.
     *
     * @return the first accessible child
     * @since 4.10
     */
    @GtkVersion4_10
    public fun getFirstAccessibleChild(): Accessible? =
        gtk_accessible_get_first_accessible_child(gtkAccessiblePointer.reinterpret())?.run {
            Accessible.wrap(reinterpret())
        }

    /**
     * Retrieves the next accessible sibling of an accessible object
     *
     * @return the next accessible sibling
     * @since 4.10
     */
    @GtkVersion4_10
    public fun getNextAccessibleSibling(): Accessible? =
        gtk_accessible_get_next_accessible_sibling(gtkAccessiblePointer.reinterpret())?.run {
            Accessible.wrap(reinterpret())
        }

    /**
     * Query a platform state, such as focus.
     *
     * See gtk_accessible_platform_changed().
     *
     * This functionality can be overridden by `GtkAccessible`
     * implementations, e.g. to get platform state from an ignored
     * child widget, as is the case for `GtkText` wrappers.
     *
     * @param state platform state to query
     * @return the value of @state for the accessible
     * @since 4.10
     */
    @GtkVersion4_10
    public fun getPlatformState(state: AccessiblePlatformState): Boolean =
        gtk_accessible_get_platform_state(gtkAccessiblePointer.reinterpret(), state.nativeValue).asBoolean()

    /**
     * Resets the accessible @property to its default value.
     *
     * @param property a `GtkAccessibleProperty`
     */
    public fun resetProperty(`property`: AccessibleProperty): Unit =
        gtk_accessible_reset_property(gtkAccessiblePointer.reinterpret(), `property`.nativeValue)

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

    /**
     * Sets the parent and sibling of an accessible object.
     *
     * This function is meant to be used by accessible implementations that are
     * not part of the widget hierarchy, and but act as a logical bridge between
     * widgets. For instance, if a widget creates an object that holds metadata
     * for each child, and you want that object to implement the `GtkAccessible`
     * interface, you will use this function to ensure that the parent of each
     * child widget is the metadata object, and the parent of each metadata
     * object is the container widget.
     *
     * @param parent the parent accessible object
     * @param nextSibling the sibling accessible object
     * @since 4.10
     */
    @GtkVersion4_10
    public fun setAccessibleParent(parent: Accessible? = null, nextSibling: Accessible? = null): Unit =
        gtk_accessible_set_accessible_parent(
            gtkAccessiblePointer.reinterpret(),
            parent?.gtkAccessiblePointer,
            nextSibling?.gtkAccessiblePointer
        )

    /**
     * Updates the next accessible sibling of @self.
     *
     * That might be useful when a new child of a custom `GtkAccessible`
     * is created, and it needs to be linked to a previous child.
     *
     * @param newSibling the new next accessible sibling to set
     * @since 4.10
     */
    @GtkVersion4_10
    public fun updateNextAccessibleSibling(newSibling: Accessible? = null): Unit =
        gtk_accessible_update_next_accessible_sibling(
            gtkAccessiblePointer.reinterpret(),
            newSibling?.gtkAccessiblePointer
        )

    private data class Wrapper(private val pointer: CPointer<GtkAccessible>) : Accessible {
        override val gtkAccessiblePointer: CPointer<GtkAccessible> = pointer
    }

    public companion object : TypeCompanion<Accessible> {
        override val type: GeneratedInterfaceKGType<Accessible> =
            GeneratedInterfaceKGType(gtk_accessible_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkAccessible>): Accessible = Wrapper(pointer)

        /**
         * Get the GType of Accessible
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_get_type()
    }
}
