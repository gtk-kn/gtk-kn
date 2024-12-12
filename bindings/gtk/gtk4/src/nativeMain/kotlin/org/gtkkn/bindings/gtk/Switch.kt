// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkSwitch
import org.gtkkn.native.gtk.gtk_switch_get_active
import org.gtkkn.native.gtk.gtk_switch_get_state
import org.gtkkn.native.gtk.gtk_switch_get_type
import org.gtkkn.native.gtk.gtk_switch_new
import org.gtkkn.native.gtk.gtk_switch_set_active
import org.gtkkn.native.gtk.gtk_switch_set_state
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkSwitch` is a "light switch" that has two states: on or off.
 *
 * ![An example GtkSwitch](switch.png)
 *
 * The user can control which state should be active by clicking the
 * empty area, or by dragging the slider.
 *
 * `GtkSwitch` can also express situations where the underlying state changes
 * with a delay. In this case, the slider position indicates the user's recent
 * change (represented by the [property@Gtk.Switch:active] property), while the
 * trough color indicates the present underlying state (represented by the
 * [property@Gtk.Switch:state] property).
 *
 * ![GtkSwitch with delayed state change](switch-state.png)
 *
 * See [signal@Gtk.Switch::state-set] for details.
 *
 * # CSS nodes
 *
 * ```
 * switch
 * ├── image
 * ├── image
 * ╰── slider
 * ```
 *
 * `GtkSwitch` has four css nodes, the main node with the name switch and
 * subnodes for the slider and the on and off images. Neither of them is
 * using any style classes.
 *
 * # Accessibility
 *
 * `GtkSwitch` uses the %GTK_ACCESSIBLE_ROLE_SWITCH role.
 */
public open class Switch(pointer: CPointer<GtkSwitch>) :
    Widget(pointer.reinterpret()),
    Actionable,
    KGTyped {
    public val gtkSwitchPointer: CPointer<GtkSwitch>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the `GtkSwitch` widget is in its on or off state.
     */
    public open var active: Boolean
        /**
         * Gets whether the `GtkSwitch` is in its “on” or “off” state.
         *
         * @return true if the `GtkSwitch` is active, and false otherwise
         */
        get() = gtk_switch_get_active(gtkSwitchPointer.reinterpret()).asBoolean()

        /**
         * Changes the state of @self to the desired one.
         *
         * @param isActive true if @self should be active, and false otherwise
         */
        set(isActive) = gtk_switch_set_active(gtkSwitchPointer.reinterpret(), isActive.asGBoolean())

    /**
     * The backend state that is controlled by the switch.
     *
     * Applications should usually set the [property@Gtk.Switch:active] property,
     * except when indicating a change to the backend state which occurs
     * separately from the user's interaction.
     *
     * See [signal@Gtk.Switch::state-set] for details.
     */
    public open var state: Boolean
        /**
         * Gets the underlying state of the `GtkSwitch`.
         *
         * @return the underlying state
         */
        get() = gtk_switch_get_state(gtkSwitchPointer.reinterpret()).asBoolean()

        /**
         * Sets the underlying state of the `GtkSwitch`.
         *
         * This function is typically called from a [signal@Gtk.Switch::state-set]
         * signal handler in order to set up delayed state changes.
         *
         * See [signal@Gtk.Switch::state-set] for details.
         *
         * @param state the new state
         */
        set(state) = gtk_switch_set_state(gtkSwitchPointer.reinterpret(), state.asGBoolean())

    /**
     * Creates a new `GtkSwitch` widget.
     *
     * @return the newly created `GtkSwitch` instance
     */
    public constructor() : this(gtk_switch_new()!!.reinterpret())

    /**
     * Emitted to animate the switch.
     *
     * Applications should never connect to this signal,
     * but use the [property@Gtk.Switch:active] property.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to change the underlying state.
     *
     * The ::state-set signal is emitted when the user changes the switch
     * position. The default handler calls [method@Gtk.Switch.set_state] with the
     * value of @state.
     *
     * To implement delayed state change, applications can connect to this
     * signal, initiate the change of the underlying state, and call
     * [method@Gtk.Switch.set_state] when the underlying state change is
     * complete. The signal handler should return true to prevent the
     * default handler from running.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `state` the new state of the switch. Returns true to stop the signal emission
     */
    public fun connectStateSet(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (state: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "state-set",
        connectStateSetFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<Switch> {
        override val type: GeneratedClassKGType<Switch> =
            GeneratedClassKGType(gtk_switch_get_type()) { Switch(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Switch
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_switch_get_type()
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectStateSetFunc: CPointer<CFunction<(gboolean) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        state: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(state: Boolean) -> Boolean>().get().invoke(state.asBoolean()).asGBoolean()
}
    .reinterpret()
