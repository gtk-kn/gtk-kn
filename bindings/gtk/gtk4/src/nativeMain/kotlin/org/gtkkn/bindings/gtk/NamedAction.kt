// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkNamedAction
import org.gtkkn.native.gtk.gtk_named_action_get_action_name
import org.gtkkn.native.gtk.gtk_named_action_get_type
import org.gtkkn.native.gtk.gtk_named_action_new
import kotlin.String

/**
 * A `GtkShortcutAction` that activates an action by name.
 */
public open class NamedAction(public val gtkNamedActionPointer: CPointer<GtkNamedAction>) :
    ShortcutAction(gtkNamedActionPointer.reinterpret()),
    KGTyped {
    /**
     * The name of the action to activate.
     */
    public open val actionName: String
        /**
         * Returns the name of the action that will be activated.
         *
         * @return the name of the action to activate
         */
        get() = gtk_named_action_get_action_name(gtkNamedActionPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Creates an action that when activated, activates
     * the named action on the widget.
     *
     * It also passes the given arguments to it.
     *
     * See [method@Gtk.Widget.insert_action_group] for
     * how to add actions to widgets.
     *
     * @param name the detailed name of the action
     * @return a new `GtkShortcutAction`
     */
    public constructor(name: String) : this(gtk_named_action_new(name)!!.reinterpret())

    public companion object : TypeCompanion<NamedAction> {
        override val type: GeneratedClassKGType<NamedAction> =
            GeneratedClassKGType(gtk_named_action_get_type()) { NamedAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of NamedAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_named_action_get_type()
    }
}
