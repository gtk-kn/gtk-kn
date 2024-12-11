// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.gtk_actionable_get_action_name
import org.gtkkn.native.gtk.gtk_actionable_get_action_target_value
import org.gtkkn.native.gtk.gtk_actionable_get_type
import org.gtkkn.native.gtk.gtk_actionable_set_action_name
import org.gtkkn.native.gtk.gtk_actionable_set_action_target_value
import org.gtkkn.native.gtk.gtk_actionable_set_detailed_action_name
import kotlin.String
import kotlin.Unit

/**
 * The `GtkActionable` interface provides a convenient way of associating
 * widgets with actions.
 *
 * It primarily consists of two properties: [property@Gtk.Actionable:action-name]
 * and [property@Gtk.Actionable:action-target]. There are also some convenience
 * APIs for setting these properties.
 *
 * The action will be looked up in action groups that are found among
 * the widgets ancestors. Most commonly, these will be the actions with
 * the “win.” or “app.” prefix that are associated with the
 * `GtkApplicationWindow` or `GtkApplication`, but other action groups that
 * are added with [method@Gtk.Widget.insert_action_group] will be consulted
 * as well.
 *
 * ## Skipped during bindings generation
 *
 * - method `set_action_target`: Varargs parameter is not supported
 * - method `action-target`: Property has no getter nor setter
 */
public interface Actionable :
    Interface,
    KGTyped {
    public val gtkActionablePointer: CPointer<GtkActionable>

    public var actionName: String?
        /**
         * Gets the action name for @actionable.
         *
         * @return the action name
         */
        get() = gtk_actionable_get_action_name(gtkActionablePointer.reinterpret())?.toKString()

        /**
         * Specifies the name of the action with which this widget should be
         * associated.
         *
         * If @action_name is null then the widget will be unassociated from
         * any previous action.
         *
         * Usually this function is used when the widget is located (or will be
         * located) within the hierarchy of a `GtkApplicationWindow`.
         *
         * Names are of the form “win.save” or “app.quit” for actions on the
         * containing [class@ApplicationWindow] or its associated [class@Application],
         * respectively. This is the same form used for actions in the [class@Gio.Menu]
         * associated with the window.
         *
         * @param actionName an action name
         */
        set(actionName) = gtk_actionable_set_action_name(gtkActionablePointer.reinterpret(), actionName)

    /**
     * Gets the action name for @actionable.
     *
     * @return the action name
     */
    public fun getActionName(): String? =
        gtk_actionable_get_action_name(gtkActionablePointer.reinterpret())?.toKString()

    /**
     * Gets the current target value of @actionable.
     *
     * @return the current target value
     */
    public fun getActionTargetValue(): Variant? =
        gtk_actionable_get_action_target_value(gtkActionablePointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    /**
     * Specifies the name of the action with which this widget should be
     * associated.
     *
     * If @action_name is null then the widget will be unassociated from
     * any previous action.
     *
     * Usually this function is used when the widget is located (or will be
     * located) within the hierarchy of a `GtkApplicationWindow`.
     *
     * Names are of the form “win.save” or “app.quit” for actions on the
     * containing [class@ApplicationWindow] or its associated [class@Application],
     * respectively. This is the same form used for actions in the [class@Gio.Menu]
     * associated with the window.
     *
     * @param actionName an action name
     */
    public fun setActionName(actionName: String? = null): Unit =
        gtk_actionable_set_action_name(gtkActionablePointer.reinterpret(), actionName)

    /**
     * Sets the target value of an actionable widget.
     *
     * If @target_value is null then the target value is unset.
     *
     * The target value has two purposes. First, it is used as the parameter
     * to activation of the action associated with the `GtkActionable` widget.
     * Second, it is used to determine if the widget should be rendered as
     * “active” — the widget is active if the state is equal to the given target.
     *
     * Consider the example of associating a set of buttons with a [iface@Gio.Action]
     * with string state in a typical “radio button” situation. Each button
     * will be associated with the same action, but with a different target
     * value for that action. Clicking on a particular button will activate
     * the action with the target of that button, which will typically cause
     * the action’s state to change to that value. Since the action’s state
     * is now equal to the target value of the button, the button will now
     * be rendered as active (and the other buttons, with different targets,
     * rendered inactive).
     *
     * @param targetValue a [struct@GLib.Variant] to set as the target value
     */
    public fun setActionTargetValue(targetValue: Variant? = null): Unit = gtk_actionable_set_action_target_value(
        gtkActionablePointer.reinterpret(),
        targetValue?.glibVariantPointer?.reinterpret()
    )

    /**
     * Sets the action-name and associated string target value of an
     * actionable widget.
     *
     * @detailed_action_name is a string in the format accepted by
     * [func@Gio.Action.parse_detailed_name].
     *
     * @param detailedActionName the detailed action name
     */
    public fun setDetailedActionName(detailedActionName: String): Unit =
        gtk_actionable_set_detailed_action_name(gtkActionablePointer.reinterpret(), detailedActionName)

    private data class Wrapper(private val pointer: CPointer<GtkActionable>) : Actionable {
        override val gtkActionablePointer: CPointer<GtkActionable> = pointer
    }

    public companion object : TypeCompanion<Actionable> {
        override val type: GeneratedInterfaceKGType<Actionable> =
            GeneratedInterfaceKGType(gtk_actionable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkActionable>): Actionable = Wrapper(pointer)

        /**
         * Get the GType of Actionable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_actionable_get_type()
    }
}
