// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Device
import org.gtkkn.bindings.gio.ActionGroup
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPadController
import org.gtkkn.native.gtk.gtk_pad_controller_get_type
import org.gtkkn.native.gtk.gtk_pad_controller_new
import org.gtkkn.native.gtk.gtk_pad_controller_set_action
import kotlin.String
import kotlin.Unit

/**
 * `GtkPadController` is an event controller for the pads found in drawing
 * tablets.
 *
 * Pads are the collection of buttons and tactile sensors often found around
 * the stylus-sensitive area.
 *
 * These buttons and sensors have no implicit meaning, and by default they
 * perform no action. `GtkPadController` is provided to map those to
 * [iface@Gio.Action] objects, thus letting the application give them a more
 * semantic meaning.
 *
 * Buttons and sensors are not constrained to triggering a single action,
 * some %GDK_SOURCE_TABLET_PAD devices feature multiple "modes". All these
 * input elements have one current mode, which may determine the final action
 * being triggered.
 *
 * Pad devices often divide buttons and sensors into groups. All elements
 * in a group share the same current mode, but different groups may have
 * different modes. See [method@Gdk.DevicePad.get_n_groups] and
 * [method@Gdk.DevicePad.get_group_n_modes].
 *
 * Each of the actions that a given button/strip/ring performs for a given mode
 * is defined by a [struct@Gtk.PadActionEntry]. It contains an action name that
 * will be looked up in the given [iface@Gio.ActionGroup] and activated whenever
 * the specified input element and mode are triggered.
 *
 * A simple example of `GtkPadController` usage: Assigning button 1 in all
 * modes and pad devices to an "invert-selection" action:
 *
 * ```c
 * GtkPadActionEntry *pad_actions[] = {
 *   { GTK_PAD_ACTION_BUTTON, 1, -1, "Invert selection", "pad-actions.invert-selection" },
 *   …
 * };
 *
 * …
 * action_group = g_simple_action_group_new ();
 * action = g_simple_action_new ("pad-actions.invert-selection", NULL);
 * g_signal_connect (action, "activate", on_invert_selection_activated, NULL);
 * g_action_map_add_action (G_ACTION_MAP (action_group), action);
 * …
 * pad_controller = gtk_pad_controller_new (action_group, NULL);
 * ```
 *
 * The actions belonging to rings/strips will be activated with a parameter
 * of type %G_VARIANT_TYPE_DOUBLE bearing the value of the given axis, it
 * is required that those are made stateful and accepting this `GVariantType`.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `entries`: Array parameter of type PadActionEntry is not supported
 * - method `action-group`: Property has no getter nor setter
 * - method `pad`: Property has no getter nor setter
 */
public open class PadController(pointer: CPointer<GtkPadController>) :
    EventController(pointer.reinterpret()),
    KGTyped {
    public val gtkPadControllerPointer: CPointer<GtkPadController>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkPadController` that will associate events from @pad to
     * actions.
     *
     * A null pad may be provided so the controller manages all pad devices
     * generically, it is discouraged to mix `GtkPadController` objects with
     * null and non-null @pad argument on the same toplevel window, as execution
     * order is not guaranteed.
     *
     * The `GtkPadController` is created with no mapped actions. In order to
     * map pad events to actions, use [method@Gtk.PadController.set_action_entries]
     * or [method@Gtk.PadController.set_action].
     *
     * Be aware that pad events will only be delivered to `GtkWindow`s, so adding
     * a pad controller to any other type of widget will not have an effect.
     *
     * @param group `GActionGroup` to trigger actions from
     * @param pad A %GDK_SOURCE_TABLET_PAD device, or null to handle all pads
     * @return A newly created `GtkPadController`
     */
    public constructor(
        group: ActionGroup,
        pad: Device? = null,
    ) : this(gtk_pad_controller_new(group.gioActionGroupPointer, pad?.gdkDevicePointer?.reinterpret())!!.reinterpret())

    /**
     * Adds an individual action to @controller.
     *
     * This action will only be activated if the given button/ring/strip number
     * in @index is interacted while the current mode is @mode. -1 may be used
     * for simple cases, so the action is triggered on all modes.
     *
     * The given @label should be considered user-visible, so internationalization
     * rules apply. Some windowing systems may be able to use those for user
     * feedback.
     *
     * @param type the type of pad feature that will trigger this action
     * @param index the 0-indexed button/ring/strip number that will trigger this action
     * @param mode the mode that will trigger this action, or -1 for all modes.
     * @param label Human readable description of this action, this string should
     *   be deemed user-visible.
     * @param actionName action name that will be activated in the `GActionGroup`
     */
    public open fun setAction(type: PadActionType, index: gint, mode: gint, label: String, actionName: String): Unit =
        gtk_pad_controller_set_action(
            gtkPadControllerPointer.reinterpret(),
            type.nativeValue,
            index,
            mode,
            label,
            actionName
        )

    public companion object : TypeCompanion<PadController> {
        override val type: GeneratedClassKGType<PadController> =
            GeneratedClassKGType(gtk_pad_controller_get_type()) { PadController(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PadController
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_pad_controller_get_type()
    }
}
